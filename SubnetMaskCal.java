import java.util.Scanner;

public class SubnetMaskCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address (e.g., 192.168.1.0): ");
        String ipAddress = scanner.nextLine();

        System.out.print("Enter the number of subnet bits: ");
        int subnetBits = scanner.nextInt();

        String subnetMask = calculateSubnetMask(subnetBits);
        String networkAddress = calculateNetworkAddress(ipAddress, subnetMask);
        String broadcastAddress = calculateBroadcastAddress(networkAddress, subnetMask);

        System.out.println("Subnet Mask: " + subnetMask);
        System.out.println("Network Address: " + networkAddress);
        System.out.println("Broadcast Address: " + broadcastAddress);

        scanner.close();
    }

    public static String calculateSubnetMask(int subnetBits) {
        int mask = 0xffffffff << (32 - subnetBits);
        return String.format("%d.%d.%d.%d",
                (mask >> 24) & 0xff,
                (mask >> 16) & 0xff,
                (mask >> 8) & 0xff,
                mask & 0xff);
    }

    public static String calculateNetworkAddress(String ipAddress, String subnetMask) {
        String[] ipParts = ipAddress.split("\\.");
        String[] maskParts = subnetMask.split("\\.");
        int[] networkParts = new int[4];

        for (int i = 0; i < 4; i++) {
            networkParts[i] = Integer.parseInt(ipParts[i]) & Integer.parseInt(maskParts[i]);
        }

        return String.format("%d.%d.%d.%d", networkParts[0], networkParts[1], networkParts[2], networkParts[3]);
    }

    public static String calculateBroadcastAddress(String networkAddress, String subnetMask) {
        String[] networkParts = networkAddress.split("\\.");
        String[] maskParts = subnetMask.split("\\.");
        int[] broadcastParts = new int[4];

        for (int i = 0; i < 4; i++) {
            broadcastParts[i] = Integer.parseInt(networkParts[i]) | (~Integer.parseInt(maskParts[i]) & 0xff);
        }

        return String.format("%d.%d.%d.%d", broadcastParts[0], broadcastParts[1], broadcastParts[2], broadcastParts[3]);
    }
}