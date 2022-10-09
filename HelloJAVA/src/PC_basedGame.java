
public class PC_basedGame extends Game {
  private double minMegaBytesOfRAM;
  private double numMegaByteOnHardDrive;
  private double minGHzPerformanceOfCPU;

  public PC_basedGame() {
  }

  public PC_basedGame(String newDescription, double minMegaBytesOfRAM, double numMegaByteOnHardDrive,
      double minGHzPerformanceOfCPU) {
    super(newDescription);
    this.minMegaBytesOfRAM = minMegaBytesOfRAM;
    this.numMegaByteOnHardDrive = numMegaByteOnHardDrive;
    this.minGHzPerformanceOfCPU = minGHzPerformanceOfCPU;
  }

  public double getNumMegaByteOnHardDrive() {
    return numMegaByteOnHardDrive;
  }

  public double getMinMegaBytesOfRAM() {
    return minMegaBytesOfRAM;
  }

  public double getMinGHzPerformanceOfCPU() {
    return minGHzPerformanceOfCPU;
  }

  public void setNumMegaByteOnHardDrive(double numMegaByteOnHardDrive) {
    this.numMegaByteOnHardDrive = numMegaByteOnHardDrive;
  }

  public void setMinMegaBytesOfRAM(double minMegaBytesOfRAM) {
    this.minMegaBytesOfRAM = minMegaBytesOfRAM;
  }

  public void setMinGHzPerformanceOfCPU(double minGHzPerformanceOfCPU) {
    this.minGHzPerformanceOfCPU = minGHzPerformanceOfCPU;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString() + " Minimum megabytes of RAM : " + this.getMinMegaBytesOfRAM() + "\nNumber on Hard drive : "
        + this.numMegaByteOnHardDrive + "\nMinimum GHz performance of CPU : " + this.minGHzPerformanceOfCPU;
  }

  public static void main(String[] args) {
    Game hieu = new PC_basedGame("hello", 10, 10, 10);
    System.out.println(hieu);
  }
}