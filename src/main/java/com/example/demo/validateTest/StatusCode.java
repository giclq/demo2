package com.example.demo.validateTest;

/**
 * <pre>
 *  created by shaoh on 2017/12/28,11:19
 *  package name:com.dpzx.dcw.common.pojo
 *     file name:StatusCode
 *  project name:dpzx_dcw
 * </pre>
 *
 * @author shaoh
 * @version 0.1
 * @date 2017/12/28,11:19
 * @description
 */
@SuppressWarnings("all")
public enum StatusCode {

    SUCCESS("操作成功", "0"),

    //region 一般通用错误 10000 起 by shaosh 2017/12/28 11:31
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    ER_PAGE_NOT_FOUND("访问的资源不存在", "404"),
    ER_JSON_FORMAT("参数格式错误，不是有效的JSON", "1000"),
    ER_PARAMETER_FORMAT("参数格式错误", "1001"),
    ER_DATA_INVALID("无效的数据", "1002"),
    ER_SMS_FLOW("短信流水号错误", "1003"),//
    ER_SMS_ALIDAYU_MOBILE_NUMBER("手机号码错误", "1004"),
    ER_SMS_ALIDAYU_LIMIT_CONTROL("操作过于频繁", "1005"),//
    ER_LOGIN_REPEAT("已在其他地方登录，请重新登录", "1006"),
    ER_LOGIN_EXPIRED("登录超时，请重新登录","1007"),
    ER_REGISTER_AREA("省市区无效","1008"),
    ER_ACTION_REPEAT("请不要重复操作","1009"),
    ER_CUSTOMER_LOCK("用户已禁用", "1010"),
    ER_CUSTOMER_LOGIN("未登录，请先登录", "1011"),
    ER_CUSTOMER_AUTH_REQ_PROCESSING("您的认证请求正在处理中，请耐心等待", "1012"),
    ER_CUSTOMER_AUTH_REQ_FAIL("您的认证请求未通过，请重新提交", "1013"),
    ER_CUSTOMER_AUTH_REQ_NORMAL("请先提交认证", "1014"),
    ER_CUSTOMER_TOKEN_EXPIRED("会话已过期，请重新登入", "1015"),

    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    //endregion


    //region 商城端-商户类错误 20000 起 by shaosh 2017/12/28 11:25
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    ER_CUSTOMER_UNEXIST("手机号未注册", "10002"),//
    ER_CUSTOMER_LOGIN_PWD("密码错误", "10003"),
    ER_CUSTOMER_REG_EXIST("手机号已注册", "10004"),//
    ER_CUSTOMER_VCODE_WRONG("验证码错误", "10005"),//
    ER_CUSTOMER_VCODE_LIMIT("验证码获取次数已超限", "10006"),//
    ER_CUSTOMER_VCODE_EXPIRED("验证码已失效", "10007"),//
    ER_CUSTOMER_PHONE_BIND_STEP1("原手机号验证失败", "10013"),//
    ER_CUSTOMER_PHONE_BIND_STEP2("手机号已被占用", "10014"),//
    ER_CUSTOMER_POINT_UNENOUGH("积分不足","10015"),//
    ER_CUSTOMER_AUTH_REQ_REG_REPEAT("已有认证中的请求，请不要重复提交","10016"),//
    ER_CUSTOMER_AUTH_REQ_REG_PASS("你已认证通过，不需要提交认证请求","10017"),//
    ER_CUSTOMER_AUTH_REG_REPEAT("已是注册认证的用户","10024"),
    ER_CUSTOMER_UNEXIST_AUTH_REQUEST("没有提交认证请求","10025"),
    ER_CUSTOMER_UNEXIST_SELL_MASTER("不是地推主管的手机号，不能用于认证哦！","10026"),
    ER_CUSTOMER_PWD_REPEAT("重置密码不能和原来的密码相同","10027"),

    ER_RED_PACKET_RECEIVED("红包已领取,不能重复领取","10101"),//
    ER_RED_PACKET_EMPTY("红包已领完","10102"),//
    ER_RED_PACKET_USE("无法使用该红包","10103"),//



//    ER_CUMULATIVE_ACTIVITY_RULE_RECEIVED("进货活动坎级奖励已领取，不能重复领取",""),
//    ER_CUMULATIVE_ACTIVITY_RULE_UNREACH("进货奖励活动坎级未达到，不能领取",""),
//    ER_CUMULATIVE_ACTIVITY_GIFT_UNENOUGHT("进货奖励赠品已被领完",""),
    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    //endregion



    //region 商城端-销售订单类错误 20000 by shaosh 2017/12/28 11:27
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    ER_SALE_ORDER_CANCEL("不能取消订单","20000"),
    ER_SALE_ORDER_FLOW("订单流程错误","20001"),
    ER_SALE_ORDER_PAY_SIGN("生成支付签名错误","20002"),
    ER_SALE_ORDER_PAY_PASSWORD("支付密码错误","20003"),
    ER_SALE_ORDER_PAY_PROCCESS("订单支付处理中","20004"),
    ER_SALE_ORDER_REFUND_PROCESS("订单退款处理中","20005"),
    ER_SALE_ORDER_PAY_SIGN_VALIDATE("支付回调验签失败","20006"),
    ER_SALE_ORDER_PAY_BALANCE_UNENOUGH("余额不足","20007"),
    ER_SALE_ORDER_PAY_FAIL("订单支付失败","20008"),
    ER_SALE_ORDER_REFUND_FAIL("销售订单退款失败","20009"),
    ER_SALE_ORDER_PAY_QRCODE_FAIL("二维码支付出错","20010"),
    ER_SALE_ORDER_PAY_NOTIFY_FAIL("二维码支付通知出错","20011"),
    ER_SALE_ORDER_GOODS_DETAIL_STATE("不能查看该商品","20012"),
    ER_SALE_ORDER_BIND_SIGN("生成绑卡签名错误","20013"),
    ER_SALE_ORDER_BIND_SIGN_VALIDATE("绑卡回调验签失败","20014"),
    ER_SALE_ORDER_PAY_VALIDATE_CODE("发送验证码失败","20015"),


    ER_SALE_ORDER_STOCK_NO_ENOUGH("购买商品数量大于库存数量","20020"),
    ER_SALE_ORDER_NUM_MORE_THAN＿LIMIT("购买商品数量大于库存数量","20020"),
    ER_NO_FIND_DELIVERFEE_CONFIG("收货地址未匹配到相关配送费设置","20021"),
    ER_SALE_ORDER_NEW_FULL_GIFT("存在新的满赠活动，请重新刷新页面","20022"),
    ER_SALE_ORDER_FULL_GIFT_NUM_NO_EQUAL("页面满赠赠品数量与后台不一致，请重新刷新页面","20023"),
    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    //endregion





    //region 其他通用错误 by shaosh 2017/12/28 11:24
    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    ER_MSG_ALERT("自定义消息和弹窗", "99991"),
    ER_FORMAT_JSON("JSON解析错误", "99992"),
    ER_CONNECTION_TIMEOUT("连接超时", "99993"),
    ER_MISS_REQUEST_PARAM("请求的接口缺少参数", "99994"),
    ER_UNSUPPORT_REQUEST_METHOD("请求的方法不支持", "99995"),
    ER_SQL("数据库错误", "99996"),
    ER_MEDIA_TYPE_NOT_SUPPORT("不支持的数据提交方式", "99997"),
    ER_MISS_REQUEST_BODY("缺少request body", "99998"),
    ER_OTHER("网络错误", "99999");
    //↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    //endregion

    private String value;

    private String code;

    private StatusCode(String value) {
        this.value = value;
    }

    private StatusCode(String value, String code) {
        this.value = value;
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
