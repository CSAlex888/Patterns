package AbstractFactory;

abstract class Yaoi {
    public abstract String getType();
}

abstract class Yori {
    public abstract String getType();
}

abstract class Get {
    public abstract String getType();
}

// Молодые
class YoungYaoi extends Yaoi {
    @Override
    public String getType() {
        return "YoungYaoi";
    }
}

class YoungYori extends Yori {
    @Override
    public String getType() {
        return "YoungYori";
    }
}

class YoungGet extends Get {
    @Override
    public String getType() {
        return "YoungGet";
    }
}

// Старички
class OldYaoi extends Yaoi {
    @Override
    public String getType() {
        return "OldYaoi";
    }
}

class OldYori extends Yori {
    @Override
    public String getType() {
        return "OldYori";
    }
}

class OldGet extends Get {
    @Override
    public String getType() {
        return "OldGet";
    }
}

// Сасены
class SasenYaoi extends Yaoi {
    @Override
    public String getType() {
        return "SasenYaoi";
    }
}

class SasenYori extends Yori {
    @Override
    public String getType() {
        return "SasenYori";
    }
}

class SasenGet extends Get {
    @Override
    public String getType() {
        return "SasenGet";
    }
}

interface FanFactory {
    Yaoi createYaoi();
    Yori createYori();
    Get createGet();
}

class YoungFanFactory implements FanFactory {
    @Override
    public Yaoi createYaoi() {
        return new YoungYaoi();
    }

    @Override
    public Yori createYori() {
        return new YoungYori();
    }

    @Override
    public Get createGet() {
        return new YoungGet();
    }
}

class OldFanFactory implements FanFactory {
    @Override
    public Yaoi createYaoi() {
        return new OldYaoi();
    }

    @Override
    public Yori createYori() {
        return new OldYori();
    }

    @Override
    public Get createGet() {
        return new OldGet();
    }
}

class SasenFanFactory implements FanFactory {
    @Override
    public Yaoi createYaoi() {
        return new SasenYaoi();
    }

    @Override
    public Yori createYori() {
        return new SasenYori();
    }

    @Override
    public Get createGet() {
        return new SasenGet();
    }
}