package Java_06_OOPDesignPattern;

public class Java_01_02_builderMethodPattern {
    public static void main(String[] args){
        ComputerDirector director = new ComputerDirector();

        // Create a gaming PC
        Computer.ComputerBuilder gamingPCBuilder = new Computer.ComputerBuilder();
        director.constructGamingPc(gamingPCBuilder);
        Computer gamingPC = gamingPCBuilder.build();

        // Create an office PC
        Computer.ComputerBuilder officePCBuilder = new Computer.ComputerBuilder();
        director.constructOfficePc(officePCBuilder);
        Computer officePC = officePCBuilder.build();

        // Create a server PC
        Computer.ComputerBuilder serverPCBuilder = new Computer.ComputerBuilder();
        director.constructServerPc(serverPCBuilder);

        Computer serverPC = serverPCBuilder.build();

        System.out.println(gamingPC);
        System.out.println(officePC);
        System.out.println(serverPC);
    }
}
class Computer{
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String gpu;

    private Computer(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
    }

    public String getCpu(){
        return cpu;
    }
    public String getRam(){
        return ram;
    }
    public String getStorage(){
        return storage;
    }
    public String getGpu(){
        return gpu;
    }

    @Override
    public String toString() {
        return "Computer { " +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", Storage='" + storage + '\'' +
                ", GPU='" + (gpu != null ? gpu : "None") + '\'' +
                " }";
    }


    public static class ComputerBuilder{
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;

        public ComputerBuilder addCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder addRam(String ram){
            this.ram = ram;
            return this;
        }
        public ComputerBuilder addStorage(String storage){
            this.storage = storage;
            return this;
        }
        public ComputerBuilder addGpu(String gpu){
            this.gpu = gpu;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}


class ComputerDirector{
    public void constructGamingPc(Computer.ComputerBuilder builder){
        builder.addCpu("Intel i9")
                .addRam("16 gb")
                .addStorage("2 TeraByte")
                .addGpu("NVIDIA RTX 3090");
    }
    public void constructOfficePc(Computer.ComputerBuilder builder){
        builder.addCpu("Intel i5")
                .addRam("8 GB")
                .addStorage("1 TeraByte")
                .addGpu("Nvidia 100");
    }
    public void constructServerPc(Computer.ComputerBuilder builder){
        builder.addCpu("AMD EPYC 7742")
                .addRam("8 gb")
                .addStorage("200 terabyte");
    }
}
