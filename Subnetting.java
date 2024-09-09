import java.util.Scanner;

public class Subnetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IP address : ");
        String ipAddress = scanner.nextLine();

        System.out.print("Enter the number of subnet bits: ");
        int subnetBits = scanner.nextInt();

        String subnetMask = calculateSubnetMask(subnetBits);
        String networkAddress = calculateNetworkAddress(ipAddress, subnetMask);
        String broadcastAddress = calculateBroadcastAddress(networkAddress, subnetMask);
        String firstNetworkAddress = calculateFirstNetworkAddress(networkAddress);
        String lastNetworkAddress = calculateLastNetworkAddress(broadcastAddress);

        System.out.println("Subnet Mask: " + subnetMask);
        System.out.println("Subnet Mask (Binary): " + toBinary(subnetMask));
        System.out.println("Network Address: " + networkAddress);
        System.out.println("Network Address (Binary): " + toBinary(networkAddress));
        System.out.println("Broadcast Address: " + broadcastAddress);
        System.out.println("Broadcast Address (Binary): " + toBinary(broadcastAddress));
        System.out.println("First Usable Address: " + firstNetworkAddress);
        System.out.println("First Usable Address (Binary): " + toBinary(firstNetworkAddress));
        System.out.println("Last Usable Address: " + lastNetworkAddress);
        System.out.println("Last Usable Address (Binary): " + toBinary(lastNetworkAddress));

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

    public static String calculateFirstNetworkAddress(String networkAddress) {
        String[] parts = networkAddress.split("\\.");
        parts[3] = String.valueOf(Integer.parseInt(parts[3]) + 1);
        return String.join(".", parts);
    }

    public static String calculateLastNetworkAddress(String broadcastAddress) {
        String[] parts = broadcastAddress.split("\\.");
        parts[3] = String.valueOf(Integer.parseInt(parts[3]) - 1);
        return String.join(".", parts);
    }

    public static String toBinary(String ipAddress) {
        String[] parts = ipAddress.split("\\.");
        StringBuilder binary = new StringBuilder();
        for (String part : parts) {
            String binaryPart = String.format("%8s", Integer.toBinaryString(Integer.parseInt(part))).replace(' ', '0');
            binary.append(binaryPart).append(".");
        }
        return binary.substring(0, binary.length() - 1);
    }
}