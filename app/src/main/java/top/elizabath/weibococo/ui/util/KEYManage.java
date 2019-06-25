package top.elizabath.weibococo.ui.util;

public class KEYManage {
    /**
     * ID :  搜索时使用的ID，猜测是分类ID
     *
     * 1: 综合  3: 用户  21: 文章  32: 主页  38: 话题  58: 问答  60: 热门  61: 实时  62: 关注  63: 图片  64: 视频
     */
    public static int SEARCH_CATEGORY_COMPREHENSIVE = 1;
    public static int SEARCH_CATEGORY_USER = 3;
    public static int SEARCH_CATEGORY_ARTICLE = 21;
    public static int SEARCH_CATEGORY_HOMEPAGE = 32;
    public static int SEARCH_CATEGORY_TOPIC = 38;
    public static int SEARCH_CATEGORY_QA = 58;
    public static int SEARCH_CATEGORY_POPULAR = 60;
    public static int SEARCH_CATEGORY_REALTIME = 61;
    public static int SEARCH_CATEGORY_ATTENTION = 62;
    public static int SEARCH_CATEGORY_PICTURE = 63;
    public static int SEARCH_CATEGORY_VIDEO = 64;

    /**
     * 投诉类型：
     * 1.垃圾营销 2.涉黄信息 5.不实信息 6.人身攻击 7.泄露我的隐私 8.有害信息 9.内容抄袭 10.冒充我 15.违法信息 22.诈骗信息
     */
    public static int COMPLAINT_CATEGORY_RUBBISH_MARKETING = 1;
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE = 2;
    public static int COMPLAINT_CATEGORY_RUMOR_MESSAGE = 5;
    public static int COMPLAINT_CATEGORY_PERSONAL_ATTACKS = 6;
    public static int COMPLAINT_CATEGORY_LEAK_MY_PRIVACY = 7;
    public static int COMPLAINT_CATEGORY_HARMFUL_MESSAGE = 8;
    public static int COMPLAINT_CATEGORY_CONTENT_PLAGIARISM = 9;
    public static int COMPLAINT_CATEGORY_PRETEND_ME = 10;
    public static int COMPLAINT_CATEGORY_ILLEGAL_MESSAGE = 15;
    public static int COMPLAINT_CATEGORY_FRAUD_MESSAGE = 22;

    /**
     * 投诉类型详细分类(垃圾营销)：
     * 101   投诉类型：1   说明：卖粉丝认证
     * 102   投诉类型：1   说明：广告信息 @ 我
     * 108   投诉类型：1   说明：其他广告
     */
    public static int COMPLAINT_CATEGORY_RUBBISH_MARKETING_TYPE_SELL_FANS = 101;
    public static int COMPLAINT_CATEGORY_RUBBISH_MARKETING_TYPE_REMIND_ME_AD = 102;
    public static int COMPLAINT_CATEGORY_RUBBISH_MARKETING_TYPE_OTHER_AD = 108;

    /**
     * 投诉类型详细分类(涉黄信息)：
     * 201   投诉类型：2   说明：售卖色情资源
     * 202   投诉类型：2   说明：低俗信息
     * 203   投诉类型：2   说明：招嫖信息
     * 204   投诉类型：2   说明：色情图文
     * 205   投诉类型：2   说明：侵害未成年人
     * 206   投诉类型：2   说明：色情视频
     */
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_SELL_YELLOW_RESOURCES = 201;
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_VULGAR_INFORMATION = 202;
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_TRICK_INFORMATION = 203;
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_YELLOW_PICTURE_OR_TEXT = 204;
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_INFRINGEMENT_OF_MINORS = 205;
    public static int COMPLAINT_CATEGORY_YELLOW_MESSAGE_TYPE_YELLOW_VIDEO = 206;

    /**
     * 投诉类型详细分类(不实信息)：
     * 501   投诉类型：5   说明：社会时事
     * 502   投诉类型：5   说明：食品安全
     * 503   投诉类型：5   说明：不在以上分类
     */
    public static int COMPLAINT_CATEGORY_RUMOR_MESSAGE_TYPE_SOCIAL_CURRENT_AFFAIRS = 501;
    public static int COMPLAINT_CATEGORY_RUMOR_MESSAGE_TYPE_FOOD_SAFETY = 502;
    public static int COMPLAINT_CATEGORY_RUMOR_MESSAGE_TYPE_OTHERS = 503;

    /**
     * 投诉类型详细分类(人身攻击)：
     * 601   投诉类型：6   说明：人身攻击我
     */
    public static int COMPLAINT_CATEGORY_PERSONAL_ATTACKS_TYPE_PERSONAL_ATTACK_ON_ME = 601;


    /**
     * 投诉类型详细分类(泄露我的隐私)：
     * 701   投诉类型：7   说明：泄露我的隐私
     */
    public static int COMPLAINT_CATEGORY_LEAK_MY_PRIVACY_TYPE_LEAK_MY_PRIVACY = 701;


    /**
     * 投诉类型详细分类(有害信息)：
     * 801   投诉类型：8   说明：暴恐血腥
     * 802   投诉类型：8   说明：宗教民族问题
     * 803   投诉类型：8   说明：侮辱英烈
     * 804   投诉类型：8   说明：其他有害信息
     */
    public static int COMPLAINT_CATEGORY_HARMFUL_MESSAGE_TYPE_RIOT_BLOODY = 801;
    public static int COMPLAINT_CATEGORY_HARMFUL_MESSAGE_TYPE_RELIGIOUS_NATIONAL_PROBLEM = 802;
    public static int COMPLAINT_CATEGORY_HARMFUL_MESSAGE_TYPE_INSULTING_HEROES = 803;
    public static int COMPLAINT_CATEGORY_HARMFUL_MESSAGE_TYPE_OTHER_HARMFUL_INFORMATION = 804;

    /**
     * 投诉类型详细分类(内容抄袭)：
     * 901   投诉类型：9   说明：抄袭我的内容
     * 902   投诉类型：9   说明：盗用我的原发图
     * 903   投诉类型：9   说明：盗用我的视频
     */
    public static int COMPLAINT_CATEGORY_CONTENT_PLAGIARISM_TYPE_PLAGIARIZE_MY_CONTENT = 901;
    public static int COMPLAINT_CATEGORY_CONTENT_PLAGIARISM_TYPE_STEAL_MY_ORIGINAL_MAP = 902;
    public static int COMPLAINT_CATEGORY_CONTENT_PLAGIARISM_TYPE_STEAL_MY_VIDEO = 903;

    /**
     * 投诉类型详细分类(冒充我)：
     * 1001   投诉类型：10   说明：冒充我
     */
    public static int COMPLAINT_CATEGORY_PRETEND_ME_TYPE_PRETEND_TO_BE_ME = 1001;

    /**
     * 投诉类型详细分类(违法信息)：
     * 1501   投诉类型：15   说明：涉枪爆刀
     * 1502   投诉类型：15   说明：毒品
     * 1503   投诉类型：15   说明：赌博
     * 1504   投诉类型：15   说明：假证
     * 1505   投诉类型：15   说明：其他违禁品
     */
    public static int COMPLAINT_CATEGORY_ILLEGAL_MESSAGE_TYPE_ABOUT_GUN = 1501;
    public static int COMPLAINT_CATEGORY_ILLEGAL_MESSAGE_TYPE_DRUG = 1502;
    public static int COMPLAINT_CATEGORY_ILLEGAL_MESSAGE_TYPE_GAMBLING = 1503;
    public static int COMPLAINT_CATEGORY_ILLEGAL_MESSAGE_TYPE_FALSE_CERTIFICATE = 1504;
    public static int COMPLAINT_CATEGORY_ILLEGAL_MESSAGE_TYPE_OTHER_CONTRABAND = 1505;

    /**
     * 投诉类型详细分类(诈骗信息)：
     * 2202   投诉类型：22   说明：网络兼职诈骗
     * 2203   投诉类型：22   说明：票务诈骗
     * 2205   投诉类型：22   说明：虚假链接诈骗
     * 2206   投诉类型：22   说明：投注返钱诈骗
     * 2207   投诉类型：22   说明：不在以上类型
     */
    public static int COMPLAINT_CATEGORY_FRAUD_MESSAGE_TYPE_NETWORK_PARTTIME_FRAUD = 2202;
    public static int COMPLAINT_CATEGORY_FRAUD_MESSAGE_TYPE_TICKET_FRAUD = 2203;
    public static int COMPLAINT_CATEGORY_FRAUD_MESSAGE_TYPE_FALSE_LINK_FRAUD = 2205;
    public static int COMPLAINT_CATEGORY_FRAUD_MESSAGE_TYPE_BETTING_MONEY_BACK_FRAUD = 2206;
    public static int COMPLAINT_CATEGORY_FRAUD_MESSAGE_TYPE_OTHERS = 2207;

    public static String WEIBO_REPORT_URL = "https://service.account.weibo.com/aj/reportspamobile?__rnd=";
}
