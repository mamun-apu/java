package Java_06_OOPDesignPattern;

public class Java_06_05_adapterPattern {
    public static void main(String[] args) {
        // Old Micro-USB Charger
        MicroUsbCharger oldCharger = new MicroUsbCharger();

        // Using Adapter to charge a USB-C phone
        UsbCPhone phone = new MicroUsbToUsbCAdapter(oldCharger);

        // Charging the phone
        phone.chargeWithUsbC();
    }
}
// Target interface (USB-C Phone)
interface UsbCPhone {
    void chargeWithUsbC();
}

// Adaptee (Old Micro-USB Charger)
class MicroUsbCharger {
    public void chargeWithMicroUsb() {
        System.out.println("Charging with Micro-USB...");
    }
}

// Adapter (Converts Micro-USB to USB-C)
class MicroUsbToUsbCAdapter implements UsbCPhone {
    private MicroUsbCharger microUsbCharger;

    public MicroUsbToUsbCAdapter(MicroUsbCharger microUsbCharger) {
        this.microUsbCharger = microUsbCharger;
    }

    @Override
    public void chargeWithUsbC() {
        System.out.println("Adapter converts USB-C request to Micro-USB...");
        microUsbCharger.chargeWithMicroUsb();
    }
}


