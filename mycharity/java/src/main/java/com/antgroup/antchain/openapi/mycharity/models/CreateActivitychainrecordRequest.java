// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateActivitychainrecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部活动ID
    @NameInMap("activity_id")
    @Validation(required = true, maxLength = 50)
    public String activityId;

    // 支付宝用户UID：,固定16位长度
    @NameInMap("alipay_user_id")
    @Validation(required = true, maxLength = 16, minLength = 16)
    public String alipayUserId;

    // 支付宝用户昵称(脱敏)
    @NameInMap("alipay_user_nick_name")
    @Validation(maxLength = 50)
    public String alipayUserNickName;

    // 捐赠记录ID：(同一租户下需要做幂等)
    @NameInMap("activity_record_id")
    @Validation(required = true, maxLength = 50)
    public String activityRecordId;

    // 捐赠类型：固定为【point/money】,point为积分兑换捐赠类型，money为购买商品捐钱类型
    @NameInMap("donate_type")
    @Validation(required = true)
    public String donateType;

    // 捐赠数量：积分个数、金额数量，若为金额(单位为分)
    @NameInMap("amount")
    @Validation(required = true, maximum = 999999999, minimum = 1)
    public Long amount;

    // 捐赠流水号
    @NameInMap("proof_data")
    @Validation(maxLength = 50)
    public String proofData;

    // 捐赠描述（积分,钱等等）
    @NameInMap("donate_goods_name")
    @Validation(required = true, maxLength = 200)
    public String donateGoodsName;

    // 商品名称，如：维他奶
    @NameInMap("goods_name")
    @Validation(maxLength = 100)
    public String goodsName;

    // 单位：个、CNY
    @NameInMap("unit")
    @Validation(maxLength = 50)
    public String unit;

    // 支付方式：【wechat/alipay/bank/exchangePoint】
    @NameInMap("pay_type")
    @Validation(required = true)
    public String payType;

    // 固定13位数字
    @NameInMap("donate_time")
    @Validation(required = true)
    public Long donateTime;

    public static CreateActivitychainrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActivitychainrecordRequest self = new CreateActivitychainrecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateActivitychainrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateActivitychainrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateActivitychainrecordRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public CreateActivitychainrecordRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public CreateActivitychainrecordRequest setAlipayUserNickName(String alipayUserNickName) {
        this.alipayUserNickName = alipayUserNickName;
        return this;
    }
    public String getAlipayUserNickName() {
        return this.alipayUserNickName;
    }

    public CreateActivitychainrecordRequest setActivityRecordId(String activityRecordId) {
        this.activityRecordId = activityRecordId;
        return this;
    }
    public String getActivityRecordId() {
        return this.activityRecordId;
    }

    public CreateActivitychainrecordRequest setDonateType(String donateType) {
        this.donateType = donateType;
        return this;
    }
    public String getDonateType() {
        return this.donateType;
    }

    public CreateActivitychainrecordRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public CreateActivitychainrecordRequest setProofData(String proofData) {
        this.proofData = proofData;
        return this;
    }
    public String getProofData() {
        return this.proofData;
    }

    public CreateActivitychainrecordRequest setDonateGoodsName(String donateGoodsName) {
        this.donateGoodsName = donateGoodsName;
        return this;
    }
    public String getDonateGoodsName() {
        return this.donateGoodsName;
    }

    public CreateActivitychainrecordRequest setGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }
    public String getGoodsName() {
        return this.goodsName;
    }

    public CreateActivitychainrecordRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public CreateActivitychainrecordRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateActivitychainrecordRequest setDonateTime(Long donateTime) {
        this.donateTime = donateTime;
        return this;
    }
    public Long getDonateTime() {
        return this.donateTime;
    }

}
