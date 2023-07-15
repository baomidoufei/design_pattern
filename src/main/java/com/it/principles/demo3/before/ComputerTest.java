package com.it.principles.demo3.before;

public class ComputerTest {
    public static void main(String[] args) {
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        KingstonMemory kingstonMemory = new KingstonMemory();
        IntelCpu intelCpu = new IntelCpu();

        Computer computer = new Computer();
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);
        computer.setXiJieHardDisk(xiJieHardDisk);
        computer.run();
    }
}
