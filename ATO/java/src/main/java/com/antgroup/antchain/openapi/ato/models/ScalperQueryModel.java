// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ScalperQueryModel extends TeaModel {
    // 注册手机号，填写咨询对象所关联的注册手机号
    /**
     * <strong>example:</strong>
     * <p>123xxxxxx56</p>
     */
    @NameInMap("registration_phone")
    @Validation(maxLength = 20, minLength = 1)
    public String registrationPhone;

    // 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
    /**
     * <strong>example:</strong>
     * <p>2099-12-30 23:59:59</p>
     */
    @NameInMap("certificate_date")
    @Validation(maxLength = 20, minLength = 1)
    public String certificateDate;

    // 登录手机号，填写风险咨询对象关联账号的登录手机号
    /**
     * <strong>example:</strong>
     * <p>123xxxxxx56</p>
     */
    @NameInMap("login_phone")
    @Validation(maxLength = 20, minLength = 1)
    public String loginPhone;

    // 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
    /**
     * <strong>example:</strong>
     * <p>123xxxxxxxxxx55</p>
     */
    @NameInMap("registration_cert")
    @Validation(maxLength = 30, minLength = 1)
    public String registrationCert;

    // 登录账号身份证，登录账号的身份证号码
    /**
     * <strong>example:</strong>
     * <p>230109xxxxxxxx3000</p>
     */
    @NameInMap("login_cert")
    @Validation(maxLength = 30, minLength = 1)
    public String loginCert;

    // 注册时间，填写风险咨询对象所关联的账号的注册时间
    /**
     * <strong>example:</strong>
     * <p>2099-12-30 23:59:59</p>
     */
    @NameInMap("registration_date")
    @Validation(maxLength = 20, minLength = 1)
    public String registrationDate;

    // 证件类型；枚举值：1 - 身份证；2 - 护照
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cert_type")
    @Validation(maximum = 2, minimum = 1)
    public Long certType;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>223940194399993xxxx</p>
     */
    @NameInMap("bank_card_no")
    @Validation(maxLength = 50, minLength = 1)
    public String bankCardNo;

    // 用户邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:zhifubaoxxxx@163.com">zhifubaoxxxx@163.com</a></p>
     */
    @NameInMap("email_address")
    @Validation(maxLength = 35, minLength = 1)
    public String emailAddress;

    // 手机序列号
    /**
     * <strong>example:</strong>
     * <p>86573603141xxxx</p>
     */
    @NameInMap("imei")
    @Validation(maxLength = 100, minLength = 1)
    public String imei;

    // 国际移动用户识别码
    /**
     * <strong>example:</strong>
     * <p>46000123456xxxx</p>
     */
    @NameInMap("imsi")
    @Validation(maxLength = 100, minLength = 1)
    public String imsi;

    // mac 地址或设备唯一标识
    /**
     * <strong>example:</strong>
     * <p>42.118.71.72</p>
     */
    @NameInMap("mac_address")
    @Validation(maxLength = 30, minLength = 1)
    public String macAddress;

    // 设备号，设备唯一号码
    /**
     * <strong>example:</strong>
     * <p>qtedxaxxxxxxxx</p>
     */
    @NameInMap("apdid")
    @Validation(maxLength = 128, minLength = 1)
    public String apdid;

    // 支付宝外部交易号
    /**
     * <strong>example:</strong>
     * <p>123xxxxxxxxxx55</p>
     */
    @NameInMap("out_order_no")
    @Validation(maxLength = 128, minLength = 1)
    public String outOrderNo;

    // 所咨询的唯一支付宝交易号
    /**
     * <strong>example:</strong>
     * <p>202304262200141025xxxxxx0000</p>
     */
    @NameInMap("order_no")
    @Validation(maxLength = 128, minLength = 1)
    public String orderNo;

    // 用户购买或使用服务时产生的具体金额总数，单位：分
    /**
     * <strong>example:</strong>
     * <p>3354</p>
     */
    @NameInMap("sales_amount")
    @Validation(maximum = 1000000, minimum = 1)
    public Long salesAmount;

    // 用户姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_name")
    @Validation(maxLength = 50, minLength = 1)
    public String userName;

    // 收货手机号，用于区分 mobile_no 所填的手机号
    /**
     * <strong>example:</strong>
     * <p>1380095xxxx</p>
     */
    @NameInMap("mailing_phone")
    @Validation(maxLength = 20, minLength = 1)
    public String mailingPhone;

    // 收货地址
    /**
     * <strong>example:</strong>
     * <p>西溪路</p>
     */
    @NameInMap("mailing_address")
    @Validation(maxLength = 128, minLength = 1)
    public String mailingAddress;

    // 是否为员工账号，枚举值：1 - 是
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_employee")
    @Validation(maxLength = 10, minLength = 1)
    public String isEmployee;

    // 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
    /**
     * <strong>example:</strong>
     * <p>alipay</p>
     */
    @NameInMap("channel")
    @Validation(maxLength = 10, minLength = 1)
    public String channel;

    // 服务商 pid
    /**
     * <strong>example:</strong>
     * <p>208850162456xxxx</p>
     */
    @NameInMap("isv_pid")
    @Validation(maxLength = 128, minLength = 1)
    public String isvPid;

    // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
    /**
     * <strong>example:</strong>
     * <p>CATERING</p>
     */
    @NameInMap("store_mcc_desc")
    @Validation(maxLength = 20, minLength = 1)
    public String storeMccDesc;

    // 消费者 id，外部会员账号
    /**
     * <strong>example:</strong>
     * <p>12321123</p>
     */
    @NameInMap("customer_id")
    @Validation(maxLength = 128, minLength = 1)
    public String customerId;

    // 订单所有商品信息列表
    @NameInMap("order_items_info_list")
    public java.util.List<ScalperQueryOrderItem> orderItemsInfoList;

    public static ScalperQueryModel build(java.util.Map<String, ?> map) throws Exception {
        ScalperQueryModel self = new ScalperQueryModel();
        return TeaModel.build(map, self);
    }

    public ScalperQueryModel setRegistrationPhone(String registrationPhone) {
        this.registrationPhone = registrationPhone;
        return this;
    }
    public String getRegistrationPhone() {
        return this.registrationPhone;
    }

    public ScalperQueryModel setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
        return this;
    }
    public String getCertificateDate() {
        return this.certificateDate;
    }

    public ScalperQueryModel setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
        return this;
    }
    public String getLoginPhone() {
        return this.loginPhone;
    }

    public ScalperQueryModel setRegistrationCert(String registrationCert) {
        this.registrationCert = registrationCert;
        return this;
    }
    public String getRegistrationCert() {
        return this.registrationCert;
    }

    public ScalperQueryModel setLoginCert(String loginCert) {
        this.loginCert = loginCert;
        return this;
    }
    public String getLoginCert() {
        return this.loginCert;
    }

    public ScalperQueryModel setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }
    public String getRegistrationDate() {
        return this.registrationDate;
    }

    public ScalperQueryModel setCertType(Long certType) {
        this.certType = certType;
        return this;
    }
    public Long getCertType() {
        return this.certType;
    }

    public ScalperQueryModel setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public ScalperQueryModel setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public ScalperQueryModel setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public ScalperQueryModel setImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }
    public String getImsi() {
        return this.imsi;
    }

    public ScalperQueryModel setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public ScalperQueryModel setApdid(String apdid) {
        this.apdid = apdid;
        return this;
    }
    public String getApdid() {
        return this.apdid;
    }

    public ScalperQueryModel setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public ScalperQueryModel setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ScalperQueryModel setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
        return this;
    }
    public Long getSalesAmount() {
        return this.salesAmount;
    }

    public ScalperQueryModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ScalperQueryModel setMailingPhone(String mailingPhone) {
        this.mailingPhone = mailingPhone;
        return this;
    }
    public String getMailingPhone() {
        return this.mailingPhone;
    }

    public ScalperQueryModel setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
        return this;
    }
    public String getMailingAddress() {
        return this.mailingAddress;
    }

    public ScalperQueryModel setIsEmployee(String isEmployee) {
        this.isEmployee = isEmployee;
        return this;
    }
    public String getIsEmployee() {
        return this.isEmployee;
    }

    public ScalperQueryModel setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public ScalperQueryModel setIsvPid(String isvPid) {
        this.isvPid = isvPid;
        return this;
    }
    public String getIsvPid() {
        return this.isvPid;
    }

    public ScalperQueryModel setStoreMccDesc(String storeMccDesc) {
        this.storeMccDesc = storeMccDesc;
        return this;
    }
    public String getStoreMccDesc() {
        return this.storeMccDesc;
    }

    public ScalperQueryModel setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ScalperQueryModel setOrderItemsInfoList(java.util.List<ScalperQueryOrderItem> orderItemsInfoList) {
        this.orderItemsInfoList = orderItemsInfoList;
        return this;
    }
    public java.util.List<ScalperQueryOrderItem> getOrderItemsInfoList() {
        return this.orderItemsInfoList;
    }

}
