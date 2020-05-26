module ru.ifmo.rain.common.bank {
    requires transitive info.kgeorgiy.java.advanced.base;
    requires java.rmi;
    requires junit;

    exports ru.ifmo.rain.common.bank;

    opens ru.ifmo.rain.common.bank to junit;
}