package net.allusive.allusiveco.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum FurryVariant {
    FURRY1(0),
    FURRY2(1),
    FURRY3(2),
    FURRY4(3),
    FURRY5(4),
    FURRY6(5),
    FURRY7(6),
    FURRY8(7),
    FURRY9(8),
    FURRY10(9),
    FURRY11(10),
    FURRY12(11),
    FURRY13(12),
    FURRY14(13),
    FURRY15(14),
    FURRY16(15),
    FURRY17(16),
    FURRY18(17),
    FURRY19(18),
    FURRY20(19),
    FURRY21(20),
    FURRY22(21),
    FURRY23(22),
    FURRY24(23),
    FURRY25(24),
    FURRY26(25),
    FURRY27(26),
    FURRY28(27),
    FURRY29(28),
    FURRY30(29),
    FURRY31(30),
    FURRY32(31),
    FURRY33(32),
    FURRY34(33),
    FURRY35(34),
    FURRY36(35),
    FURRY37(36),
    FURRY38(37),
    FURRY39(38),
    FURRY40(39),
    FURRY41(40),
    FURRY42(41),
    FURRY43(42),
    FURRY44(43),
    FURRY45(44),
    FURRY46(45),
    FURRY47(46),
    FURRY48(47),
    FURRY49(48),
    FURRY50(49);

    private static final FurryVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(FurryVariant::getId)).toArray(FurryVariant[]::new);
    private final int id;

    FurryVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static FurryVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}