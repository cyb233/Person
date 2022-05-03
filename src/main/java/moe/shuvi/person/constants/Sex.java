package moe.shuvi.person.constants;

/**
 * 性别,仅限生物学定义(性染色体及其形象的性征)
 * 本页统计数据原文来自维基百科
 * <p>
 * 该枚举类应该需要规范一下
 * <p>
 * Y染色体的SRY基因会影响性别表征
 * 它的作用是促进睾丸发育和抑制卵巢存在
 *
 * @author schwi
 * @date 2022/05/03 21:43
 */
public enum Sex {
    // 女性
    XX,
    // 男性
    XY,
    // XY,但SRY基因只发挥了一半作用,即双性人
    //
    XY_INTERSEX,
    // 男性假两性畸形
    //
    XY_FEMALE,
    // 女性假两性畸形
    //
    XX_MALE,
    // 三体综合征(超雌综合征)
    // 约每1,000个女婴出生时会发现一位病例
    XXX,
    // 克兰费尔特综合症
    // 克氏综合征是一种常见的染色体异常疾病,在新生男童中的发生率介于1/500到1/1000之间
    XXY,
    // 三体综合征(超雄综合征)
    // 此病在各种性染色体疾病中比较常见,在男性新生婴儿的发病率是1/500到1/1000
    XYY,
    // 特纳综合征
    // 产妇生出罹患特纳氏综合征女童的几率大约介于1/2,000到1/5,000
    X,
    // XXYY综合征
    // It affects an estimated one in every 18,000–40,000 male births.
    XXYY,
    // 四体X
    // Tetrasomy X is estimated to occur in around 1 in 50,000 females.
    XXXX,
    // XXXXY综合征
    // 是一种极为罕见的非整倍染色体异常,男性中发病率约为1/100,000至1/85,000
    XXXXY,
}
