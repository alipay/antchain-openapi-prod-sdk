// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 枚举值：蚁盾版、智租版、旗舰版，蚁盾版代表仅调用蚁盾风控，智租版代表仅调用小程序云风控，旗舰版代表调用蚁盾+旗舰版风控接口
    @NameInMap("product_name")
    public String productName;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true, maxLength = 2000)
    public String userName;

    // 用户证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 用户手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 支付宝账户 UserId，智租版可选
    @NameInMap("alipay_user_id")
    @Validation(maxLength = 20)
    public String alipayUserId;

    // 下单渠道，智租版必选。枚举值：支付宝-ALIPAY；微信-WECHAT；独立APP-APP；抖音-DOUYIN；美团-MEITUAN；其他:-OTHER
    @NameInMap("source")
    @Validation(maxLength = 10)
    public String source;

    // 风险业务场景，智租版选填。默认值：PRE_RENT。
    // PRE_RENT - 3c租赁；PRE_RENT_3C - 3c租赁定制；PRE_RENT_PET - 宠物；PRE_RENT_EDU - 教培；PRE_RENT_BEAUTY - 美业；
    @NameInMap("risk_biz_scene")
    @Validation(maxLength = 100, minLength = 1)
    public String riskBizScene;

    // 商品详情，智租版可选
    @NameInMap("item_detail")
    public ItemDetail itemDetail;

    // 价格详情，智租版可选
    @NameInMap("price_detail")
    public PriceDetail priceDetail;

    // 物流信息，智租版可选
    @NameInMap("delivery_detail")
    public DeliveryDetail deliveryDetail;

    // 枚举值：3C_RENTAL、NE_RENTAL、OTHER_RENTAL、PETS、BEAUTY、EDUCATION、FITNESS、GENERAL_INDUSTRY_OTHER
    @NameInMap("industry")
    public String industry;

    // 枚举值：ZOLOZ_V2、ZOLOZ_V3、GENERAL_INDUSTRY、APPLET_RISK
    @NameInMap("model_version")
    public String modelVersion;

    public static QueryRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskRequest self = new QueryRiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public QueryRiskRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryRiskRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryRiskRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryRiskRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

    public QueryRiskRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryRiskRequest setRiskBizScene(String riskBizScene) {
        this.riskBizScene = riskBizScene;
        return this;
    }
    public String getRiskBizScene() {
        return this.riskBizScene;
    }

    public QueryRiskRequest setItemDetail(ItemDetail itemDetail) {
        this.itemDetail = itemDetail;
        return this;
    }
    public ItemDetail getItemDetail() {
        return this.itemDetail;
    }

    public QueryRiskRequest setPriceDetail(PriceDetail priceDetail) {
        this.priceDetail = priceDetail;
        return this;
    }
    public PriceDetail getPriceDetail() {
        return this.priceDetail;
    }

    public QueryRiskRequest setDeliveryDetail(DeliveryDetail deliveryDetail) {
        this.deliveryDetail = deliveryDetail;
        return this;
    }
    public DeliveryDetail getDeliveryDetail() {
        return this.deliveryDetail;
    }

    public QueryRiskRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public QueryRiskRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

}
