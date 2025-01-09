package Factory;

abstract class Fan {
    abstract String getType();
}

class Young extends Fan {
    @Override
    public String getType() {
        return "Young";
    }
}

class Old extends Fan {
    @Override
    public String getType() {
        return "Old";
    }
}

class Ship extends Fan {
    @Override
    public String getType() {
        return "Ship";
    }
}

class Sasen extends Fan {
    @Override
    public String getType() {
        return "Sasen";
    }
}

enum FanType {
    YOUONG, OLD, SHIP, SASEN
}
class FanFactory {
    public static Fan createFan(FanType fanType) {
        if (fanType == null) {
            return null;
        }
        switch (fanType) {
            case YOUONG:
                return new Young();
            case OLD:
                return new Old();
            case SHIP:
                return new Ship();
            case SASEN:
                return new Sasen();
            default:
                return null;
        }
    }
}
