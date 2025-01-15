// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRiskGoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 风险类型。枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
    @NameInMap("risk_type")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String riskType;

    // 调用行业，枚举值：
    // insurance 保险；retail 零售；finance 金融行业；logistics 物流行业；city_services 城市服务；medical 医疗服务；digital_media 数媒行业；recycle 回收行业；payment 缴费行业；vehicle 汽车；travel 旅游；air_travel 航旅行业；FMCG 快消零售；education 教育行业；fashion_retail 时尚零售；game_industry 文体行业；rental 租赁；advertisement 广告行业；restaurants 餐饮行业；ticket 票务行业；complexes 综合体行业
    @NameInMap("business_code")
    @Validation(required = true, maxLength = 30, minLength = 1)
    public String businessCode;

    // 风险咨询对应的自身业务场景/环节，枚举值：
    // register 注册；order 下单；payment 支付；login 登录；offline_query 离线查询；inquery 查询；reserve 预约；invitation 邀请；other 其他
    @NameInMap("scene")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String scene;

    // 支付宝用户 2088 账号
    @NameInMap("user_id")
    @Validation(maxLength = 50, minLength = 1)
    public String userId;

    // 支付宝用户 open_id 账号。需要注意，user_id 和 open_id 不可同时为空，同时传入时，以 user_id 为准
    @NameInMap("open_id")
    @Validation(maxLength = 128, minLength = 1)
    public String openId;

    // 支付宝商家 pid，如果风险咨询对象是支付宝商家，则填写pid
    @NameInMap("mer_pid")
    @Validation(maxLength = 50, minLength = 1)
    public String merPid;

    // 手机号码，用于直接输入风险咨询对象的手机号码
    @NameInMap("mobile_no")
    @Validation(maxLength = 50, minLength = 1)
    public String mobileNo;

    // 身份证号码
    @NameInMap("cert_no")
    @Validation(maxLength = 50, minLength = 1)
    public String certNo;

    // 账户登录 ip
    @NameInMap("ip")
    @Validation(maxLength = 32, minLength = 1)
    public String ip;

    // 地理位置，用于输入用户产生交易时的地理位置信息
    @NameInMap("lbs")
    @Validation(maxLength = 50, minLength = 1)
    public String lbs;

    // 咨询方类型，填写风险咨询中对应的商户或服务商对于蚂蚁的类型。枚举值：direct_isv 直连服务商；indirect_isv 间连服务商；unconn_isv 无关服务商；direct_mer 直连商户；indirect_mer 间连商户；unconn_mer 无关联商户；unknown 其他
    @NameInMap("role")
    @Validation(maxLength = 128, minLength = 1)
    public String role;

    // 可填入活动id唯一值，或其他活动信息
    @NameInMap("activity_info")
    @Validation(maxLength = 100, minLength = 1)
    public String activityInfo;

    // 营销抢购风险识别入参模型
    @NameInMap("purchase_query_model")
    public PurchaseQueryModel purchaseQueryModel;

    // 行业黄牛风险识别入参模型
    @NameInMap("scalper_query_model")
    public ScalperQueryModel scalperQueryModel;

    // 营销发奖风险识别入参模型
    @NameInMap("awarding_query_model")
    public AwardingQueryModel awardingQueryModel;

    // 行业刷单风险识别入参模型
    @NameInMap("farming_query_model")
    public FarmingQueryModel farmingQueryModel;

    // 行业履约风险识别入参模型
    @NameInMap("baddebt_query_model")
    public BaddebtQueryModel baddebtQueryModel;

    public static QueryRiskGoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskGoRequest self = new QueryRiskGoRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskGoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskGoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskGoRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public QueryRiskGoRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryRiskGoRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryRiskGoRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryRiskGoRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryRiskGoRequest setMerPid(String merPid) {
        this.merPid = merPid;
        return this;
    }
    public String getMerPid() {
        return this.merPid;
    }

    public QueryRiskGoRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public QueryRiskGoRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryRiskGoRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryRiskGoRequest setLbs(String lbs) {
        this.lbs = lbs;
        return this;
    }
    public String getLbs() {
        return this.lbs;
    }

    public QueryRiskGoRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public QueryRiskGoRequest setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo;
        return this;
    }
    public String getActivityInfo() {
        return this.activityInfo;
    }

    public QueryRiskGoRequest setPurchaseQueryModel(PurchaseQueryModel purchaseQueryModel) {
        this.purchaseQueryModel = purchaseQueryModel;
        return this;
    }
    public PurchaseQueryModel getPurchaseQueryModel() {
        return this.purchaseQueryModel;
    }

    public QueryRiskGoRequest setScalperQueryModel(ScalperQueryModel scalperQueryModel) {
        this.scalperQueryModel = scalperQueryModel;
        return this;
    }
    public ScalperQueryModel getScalperQueryModel() {
        return this.scalperQueryModel;
    }

    public QueryRiskGoRequest setAwardingQueryModel(AwardingQueryModel awardingQueryModel) {
        this.awardingQueryModel = awardingQueryModel;
        return this;
    }
    public AwardingQueryModel getAwardingQueryModel() {
        return this.awardingQueryModel;
    }

    public QueryRiskGoRequest setFarmingQueryModel(FarmingQueryModel farmingQueryModel) {
        this.farmingQueryModel = farmingQueryModel;
        return this;
    }
    public FarmingQueryModel getFarmingQueryModel() {
        return this.farmingQueryModel;
    }

    public QueryRiskGoRequest setBaddebtQueryModel(BaddebtQueryModel baddebtQueryModel) {
        this.baddebtQueryModel = baddebtQueryModel;
        return this;
    }
    public BaddebtQueryModel getBaddebtQueryModel() {
        return this.baddebtQueryModel;
    }

}
