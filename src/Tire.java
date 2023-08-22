public interface Tire {
    int tirePrice();
    String tireType();
}

class Snow implements Tire {
    @Override
    public int tirePrice() {
        return 1000;
    }

    @Override
    public String tireType() {
        return "Snow";
    }
}

class Spare implements Tire {
    @Override
    public int tirePrice() {
        return 2000;
    }

    @Override
    public String tireType() {
        return "Spare";
    }
}

class Whitewall implements Tire {
    @Override
    public int tirePrice() {
        return 3000;
    }

    @Override
    public String tireType() {
        return "Whitewall";
    }
}

class Slick implements Tire {
    @Override
    public int tirePrice() {
        return 4000;
    }

    @Override
    public String tireType() {
        return "Slick";
    }
}