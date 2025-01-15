// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AwardingQueryModel extends TeaModel {
    // 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
    @NameInMap("opposing_userid")
    @Validation(maxLength = 128, minLength = 1)
    public String opposingUserid;

    // 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
    @NameInMap("opposing_open_id")
    @Validation(maxLength = 128, minLength = 1)
    public String opposingOpenId;

    // 服务二级分类
    @NameInMap("service_category")
    @Validation(maxLength = 128, minLength = 1)
    public String serviceCategory;

    // 服务商 pid
    @NameInMap("isv_pid")
    @Validation(maxLength = 128, minLength = 1)
    public String isvPid;

    // 银行卡号
    @NameInMap("bank_card_no")
    @Validation(maxLength = 128, minLength = 1)
    public String bankCardNo;

    // 手机序列号
    @NameInMap("imei")
    @Validation(maxLength = 128, minLength = 1)
    public String imei;

    // 国际移动用户识别码
    @NameInMap("imsi")
    @Validation(maxLength = 128, minLength = 1)
    public String imsi;

    // 金额，用户购买或使用服务时产生的具体金额，单位：分
    @NameInMap("sales_amount")
    @Validation(maximum = 10000000, minimum = 1)
    public Long salesAmount;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(maxLength = 128, minLength = 1)
    public String userName;

    // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
    @NameInMap("store_mcc_desc")
    @Validation(maxLength = 30, minLength = 1)
    public String storeMccDesc;

    // 消费者 id，外部会员账号
    @NameInMap("customer_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String customerId;

    // 填入想要咨询风控的二维码值，需为唯一值
    @NameInMap("qr_code")
    @Validation(maxLength = 256, minLength = 1)
    public String qrCode;

    public static AwardingQueryModel build(java.util.Map<String, ?> map) throws Exception {
        AwardingQueryModel self = new AwardingQueryModel();
        return TeaModel.build(map, self);
    }

    public AwardingQueryModel setOpposingUserid(String opposingUserid) {
        this.opposingUserid = opposingUserid;
        return this;
    }
    public String getOpposingUserid() {
        return this.opposingUserid;
    }

    public AwardingQueryModel setOpposingOpenId(String opposingOpenId) {
        this.opposingOpenId = opposingOpenId;
        return this;
    }
    public String getOpposingOpenId() {
        return this.opposingOpenId;
    }

    public AwardingQueryModel setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
        return this;
    }
    public String getServiceCategory() {
        return this.serviceCategory;
    }

    public AwardingQueryModel setIsvPid(String isvPid) {
        this.isvPid = isvPid;
        return this;
    }
    public String getIsvPid() {
        return this.isvPid;
    }

    public AwardingQueryModel setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public AwardingQueryModel setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public AwardingQueryModel setImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }
    public String getImsi() {
        return this.imsi;
    }

    public AwardingQueryModel setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
        return this;
    }
    public Long getSalesAmount() {
        return this.salesAmount;
    }

    public AwardingQueryModel setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public AwardingQueryModel setStoreMccDesc(String storeMccDesc) {
        this.storeMccDesc = storeMccDesc;
        return this;
    }
    public String getStoreMccDesc() {
        return this.storeMccDesc;
    }

    public AwardingQueryModel setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public AwardingQueryModel setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
