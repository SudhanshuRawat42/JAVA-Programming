package exercise2;

class FullTimeGameTester extends GameTester {

    public FullTimeGameTester(String name) {
        super(name, true, false);  // Full-time status is true, part-time is false
    }

    @Override
    public double determineSalary() {
        return 3000;
    }
}
