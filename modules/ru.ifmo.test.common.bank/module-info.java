module ru.ifmo.test.common.bank {
    requires transitive info.kgeorgiy.java.advanced.base;
    requires java.rmi;
    requires junit;

    exports ru.ifmo.test.common.bank;

    opens ru.ifmo.test.common.bank to junit;
}