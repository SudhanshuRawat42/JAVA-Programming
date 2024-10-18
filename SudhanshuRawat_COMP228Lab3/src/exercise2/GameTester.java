package exercise2;

abstract class GameTester {
    protected String name;
    protected boolean isFullTime;
    protected boolean isPartTime;

    public GameTester(String name, boolean isFullTime, boolean isPartTime) {
        this.name = name;
        this.isFullTime = isFullTime;
        this.isPartTime = isPartTime;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isPartTime() {
        return isPartTime;
    }

    public abstract double determineSalary();
}
