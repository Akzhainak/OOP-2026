package week4;

public class task2 {

    public enum PowerState {
        OFF, ON, SLEEP, HIBERNATE
    }

    private static int networkDeviceCount = 0;

    private final String macAddress;

    private String pcName;
    private PowerState currentState;
    private int ramSizeGB;

    {
        networkDeviceCount++;
        this.currentState = PowerState.OFF; 
    }

    public task2(String macAddress, String pcName, int ramSizeGB) {
        this.macAddress = macAddress;
        this.pcName = pcName;
        this.ramSizeGB = ramSizeGB;
    }

    public task2(String macAddress, String pcName) {
        this(macAddress, pcName, 16); 
    }

    public void bootUp() {
        this.currentState = PowerState.ON;
        System.out.println(pcName + " is now booting...");
    }

    public void bootUp(String bootMode) {
        this.currentState = PowerState.ON;
        System.out.println(pcName + " is booting in " + bootMode + " mode.");
    }

    public static int getNetworkDeviceCount() {
        return networkDeviceCount;
    }

    public String getMacAddress() {
        return macAddress;
    }
}