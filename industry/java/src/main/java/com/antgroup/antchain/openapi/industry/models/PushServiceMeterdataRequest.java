// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class PushServiceMeterdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 业务唯一单据号，最大64
    @NameInMap("biz_no")
    @Validation(required = true, maxLength = 64)
    public String bizNo;

    // 来源场景码, 由中台分配给业务方
    @NameInMap("source")
    @Validation(required = true, maxLength = 32)
    public String source;

    // 行业渠道码(由经支中台分配给业务方)
    @NameInMap("channel")
    @Validation(required = true, maxLength = 32)
    public String channel;

    // 业务发生时间
    @NameInMap("gmt_service")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtService;

    // 服务唯一标识码
    @NameInMap("service_code")
    @Validation(required = true, maxLength = 32)
    public String serviceCode;

    // 如果是金额，请填写分；如果是次数，请填写整数
    @NameInMap("service_amount")
    @Validation(required = true, maxLength = 32)
    public String serviceAmount;

    // 服务量单位，如果是金额，请填写币种value(exp:156),如果是次数/个,填写UU
    @NameInMap("service_unit")
    @Validation(required = true, maxLength = 16)
    public String serviceUnit;

    // 业务标题
    @NameInMap("service_subject")
    @Validation(required = true, maxLength = 128)
    public String serviceSubject;

    // 业务详细内容
    @NameInMap("service_body")
    @Validation(maxLength = 512)
    public String serviceBody;

    // 会员id;如果是商户，那么是商户uid,如果是用户，那么是会员id
    @NameInMap("user_id")
    @Validation(required = true, maxLength = 32)
    public String userId;

    // 基本与user_id保持一致
    @NameInMap("buyer_id")
    @Validation(required = true, maxLength = 32)
    public String buyerId;

    // 卖家id,用于代收付场景
    @NameInMap("seller_id")
    @Validation(maxLength = 32)
    public String sellerId;

    // 扩展属性字段
    @NameInMap("properties")
    @Validation(required = true, maxLength = 512)
    public String properties;

    public static PushServiceMeterdataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushServiceMeterdataRequest self = new PushServiceMeterdataRequest();
        return TeaModel.build(map, self);
    }

    public PushServiceMeterdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushServiceMeterdataRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public PushServiceMeterdataRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PushServiceMeterdataRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public PushServiceMeterdataRequest setGmtService(String gmtService) {
        this.gmtService = gmtService;
        return this;
    }
    public String getGmtService() {
        return this.gmtService;
    }

    public PushServiceMeterdataRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public PushServiceMeterdataRequest setServiceAmount(String serviceAmount) {
        this.serviceAmount = serviceAmount;
        return this;
    }
    public String getServiceAmount() {
        return this.serviceAmount;
    }

    public PushServiceMeterdataRequest setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit;
        return this;
    }
    public String getServiceUnit() {
        return this.serviceUnit;
    }

    public PushServiceMeterdataRequest setServiceSubject(String serviceSubject) {
        this.serviceSubject = serviceSubject;
        return this;
    }
    public String getServiceSubject() {
        return this.serviceSubject;
    }

    public PushServiceMeterdataRequest setServiceBody(String serviceBody) {
        this.serviceBody = serviceBody;
        return this;
    }
    public String getServiceBody() {
        return this.serviceBody;
    }

    public PushServiceMeterdataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushServiceMeterdataRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public PushServiceMeterdataRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public PushServiceMeterdataRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
