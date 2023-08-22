public interface Chesis {
    public String TypeofChesis();
    public int PriceofChesis();
}

class Tabular implements Chesis{
    @Override
    public String TypeofChesis() {
        return "Tabular";
    }

    @Override
    public int PriceofChesis() {
        return 1000;
    }
}

class Backbone implements Chesis{

    @Override
    public String TypeofChesis() {
        return "Backbone";
    }

    @Override
    public int PriceofChesis() {
        return 2000;
    }
}

class LadderFrame implements Chesis{

    @Override
    public String TypeofChesis() {
        return "Ladder Frame";
    }

    @Override
    public int PriceofChesis() {
        return 3000;
    }
}
