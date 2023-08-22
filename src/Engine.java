// The Engine interface (Product)
public interface Engine {
    double EnginePrice();
    String TypeofEngine();
}

// Concrete implementations of the Engine
class CC1300 implements Engine {
    @Override
    public String TypeofEngine() {
        return "CC1300";
    }

    @Override
    public double EnginePrice() {
        return 15000;
    }
}

class CC1700 implements Engine {
    @Override
    public String TypeofEngine() {
        return "CC1700";
    }

    @Override
    public double EnginePrice() {
        return 30000;
    }
}

class CC1800 implements Engine {
    @Override
    public String TypeofEngine() {
        return "CC1800";
    }

    @Override
    public double EnginePrice() {
        return 45000;
    }
}

class CC2100 implements Engine {
    @Override
    public String TypeofEngine() {
        return "CC2100";
    }

    @Override
    public double EnginePrice() {
        return 60000;
    }
}

// Concrete factories
class CC1300Factory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new CC1300();
    }
}

class CC1700Factory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new CC1700();
    }
}

class CC1800Factory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new CC1800();
    }
}

class CC2100Factory implements EngineFactory {
    @Override
    public Engine createEngine() {
        return new CC2100();
    }
}


