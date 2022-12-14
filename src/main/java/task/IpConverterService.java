package task;

public class IpConverterService {
    public int ipToNum(String ip) {

        String[] octets = ip.split("\\.");

        int[] octetsNum = new int[]{
                Integer.parseInt(octets[0]),
                Integer.parseInt(octets[1]),
                Integer.parseInt(octets[2]),
                Integer.parseInt(octets[3])
        };

        return (octetsNum[0] * (int) Math.pow(256, 3))
                + (octetsNum[1] * (int) Math.pow(256, 2))
                + (octetsNum[2] * 256) + (octetsNum[3]);
    }

    public String numToIp(long ipNum) {
        return ((ipNum >> 24) & 0xFF)
                + "." + ((ipNum >> 16) & 0xFF)
                + "." + ((ipNum >> 8) & 0xFF)
                + "." + (ipNum & 0xFF);
    }
}
