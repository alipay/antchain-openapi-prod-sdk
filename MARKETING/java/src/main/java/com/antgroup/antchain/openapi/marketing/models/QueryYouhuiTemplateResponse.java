// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryYouhuiTemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模板类型:APPLY, NORMAL
    @NameInMap("t_type")
    public String tType;

    // 币种
    @NameInMap("currency")
    public String currency;

    // 模板ID
    @NameInMap("id")
    public Long id;

    // 模板名称
    @NameInMap("t_name")
    public String tName;

    // 使用场景
    @NameInMap("t_use_scene")
    public String tUseScene;

    // 模板开始时间
    @NameInMap("t_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tStartTime;

    // 模板有效结束时间
    @NameInMap("t_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tEndTime;

    // 优惠券允许发放的总数量
    @NameInMap("yh_max_release")
    public String yhMaxRelease;

    // 券类型
    @NameInMap("yh_type")
    public String yhType;

    // 满减条件金额(单位:元)， 如满200
    @NameInMap("yh_certain_money")
    public String yhCertainMoney;

    // 生成券的面额(单位:元)
    @NameInMap("yh_amount")
    public String yhAmount;

    // 折扣， 如: 0.75 取值范围(0, 1)
    @NameInMap("yh_discount_rate")
    public String yhDiscountRate;

    // 优惠券使用次数 , 0表示无限制
    @NameInMap("yh_usage_count")
    public String yhUsageCount;

    // 相对时间，绝对时间ABSOLUTE/RELATIVE
    @NameInMap("yh_validity_type")
    public String yhValidityType;

    // 优惠券开始时间 yhValidityType=ABSOLUTE 不能为空, 精确到秒
    @NameInMap("yh_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String yhStartTime;

    // 有效期结束时间， yhValidityType=ABSOLUTE 不能为空, 精确到秒
    @NameInMap("yh_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String yhEndTime;

    // 有效时间——相对（单位秒），如果start_time为空，优惠券的有效期从生成的当天开始计算， 如果start_time不为空，优惠关的有效期从start_time开始算
    @NameInMap("yh_relative_second")
    public Long yhRelativeSecond;

    // 每人限领数量
    @NameInMap("yh_per_limit_num")
    public Long yhPerLimitNum;

    // 优惠券通用类型，UNIVERSAL通用券；NONUNIVERSAL非通用券
    @NameInMap("yh_universal_type")
    public String yhUniversalType;

    // 模板状态 APPROVED审批通过，生效中
    @NameInMap("t_status")
    public String tStatus;

    // 优惠券发券总额、总数量控制
    @NameInMap("yh_control_type")
    public String yhControlType;

    // 申请原因
    @NameInMap("t_reason")
    public String tReason;

    // 优惠条件备注，显示用
    @NameInMap("yh_description")
    public String yhDescription;

    // 创建人, 系统操作为 应用名, 员工操作设置为工号
    @NameInMap("t_creator")
    public String tCreator;

    // 最后修改人, 系统操作为 应用名, 员工操作设置为工号
    @NameInMap("t_modifier")
    public String tModifier;

    // 创建时间
    @NameInMap("t_gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tGmtCreate;

    // 最后修改时间
    @NameInMap("t_gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tGmtModified;

    // 商品规格CODE。 限定商品类型时， 适用的商品集合， 通用券( yhUniversalType=NONUNIVERSAL)不能为空
    @NameInMap("item_code_set")
    public java.util.List<String> itemCodeSet;

    public static QueryYouhuiTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryYouhuiTemplateResponse self = new QueryYouhuiTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryYouhuiTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryYouhuiTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryYouhuiTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryYouhuiTemplateResponse setTType(String tType) {
        this.tType = tType;
        return this;
    }
    public String getTType() {
        return this.tType;
    }

    public QueryYouhuiTemplateResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public QueryYouhuiTemplateResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryYouhuiTemplateResponse setTName(String tName) {
        this.tName = tName;
        return this;
    }
    public String getTName() {
        return this.tName;
    }

    public QueryYouhuiTemplateResponse setTUseScene(String tUseScene) {
        this.tUseScene = tUseScene;
        return this;
    }
    public String getTUseScene() {
        return this.tUseScene;
    }

    public QueryYouhuiTemplateResponse setTStartTime(String tStartTime) {
        this.tStartTime = tStartTime;
        return this;
    }
    public String getTStartTime() {
        return this.tStartTime;
    }

    public QueryYouhuiTemplateResponse setTEndTime(String tEndTime) {
        this.tEndTime = tEndTime;
        return this;
    }
    public String getTEndTime() {
        return this.tEndTime;
    }

    public QueryYouhuiTemplateResponse setYhMaxRelease(String yhMaxRelease) {
        this.yhMaxRelease = yhMaxRelease;
        return this;
    }
    public String getYhMaxRelease() {
        return this.yhMaxRelease;
    }

    public QueryYouhuiTemplateResponse setYhType(String yhType) {
        this.yhType = yhType;
        return this;
    }
    public String getYhType() {
        return this.yhType;
    }

    public QueryYouhuiTemplateResponse setYhCertainMoney(String yhCertainMoney) {
        this.yhCertainMoney = yhCertainMoney;
        return this;
    }
    public String getYhCertainMoney() {
        return this.yhCertainMoney;
    }

    public QueryYouhuiTemplateResponse setYhAmount(String yhAmount) {
        this.yhAmount = yhAmount;
        return this;
    }
    public String getYhAmount() {
        return this.yhAmount;
    }

    public QueryYouhuiTemplateResponse setYhDiscountRate(String yhDiscountRate) {
        this.yhDiscountRate = yhDiscountRate;
        return this;
    }
    public String getYhDiscountRate() {
        return this.yhDiscountRate;
    }

    public QueryYouhuiTemplateResponse setYhUsageCount(String yhUsageCount) {
        this.yhUsageCount = yhUsageCount;
        return this;
    }
    public String getYhUsageCount() {
        return this.yhUsageCount;
    }

    public QueryYouhuiTemplateResponse setYhValidityType(String yhValidityType) {
        this.yhValidityType = yhValidityType;
        return this;
    }
    public String getYhValidityType() {
        return this.yhValidityType;
    }

    public QueryYouhuiTemplateResponse setYhStartTime(String yhStartTime) {
        this.yhStartTime = yhStartTime;
        return this;
    }
    public String getYhStartTime() {
        return this.yhStartTime;
    }

    public QueryYouhuiTemplateResponse setYhEndTime(String yhEndTime) {
        this.yhEndTime = yhEndTime;
        return this;
    }
    public String getYhEndTime() {
        return this.yhEndTime;
    }

    public QueryYouhuiTemplateResponse setYhRelativeSecond(Long yhRelativeSecond) {
        this.yhRelativeSecond = yhRelativeSecond;
        return this;
    }
    public Long getYhRelativeSecond() {
        return this.yhRelativeSecond;
    }

    public QueryYouhuiTemplateResponse setYhPerLimitNum(Long yhPerLimitNum) {
        this.yhPerLimitNum = yhPerLimitNum;
        return this;
    }
    public Long getYhPerLimitNum() {
        return this.yhPerLimitNum;
    }

    public QueryYouhuiTemplateResponse setYhUniversalType(String yhUniversalType) {
        this.yhUniversalType = yhUniversalType;
        return this;
    }
    public String getYhUniversalType() {
        return this.yhUniversalType;
    }

    public QueryYouhuiTemplateResponse setTStatus(String tStatus) {
        this.tStatus = tStatus;
        return this;
    }
    public String getTStatus() {
        return this.tStatus;
    }

    public QueryYouhuiTemplateResponse setYhControlType(String yhControlType) {
        this.yhControlType = yhControlType;
        return this;
    }
    public String getYhControlType() {
        return this.yhControlType;
    }

    public QueryYouhuiTemplateResponse setTReason(String tReason) {
        this.tReason = tReason;
        return this;
    }
    public String getTReason() {
        return this.tReason;
    }

    public QueryYouhuiTemplateResponse setYhDescription(String yhDescription) {
        this.yhDescription = yhDescription;
        return this;
    }
    public String getYhDescription() {
        return this.yhDescription;
    }

    public QueryYouhuiTemplateResponse setTCreator(String tCreator) {
        this.tCreator = tCreator;
        return this;
    }
    public String getTCreator() {
        return this.tCreator;
    }

    public QueryYouhuiTemplateResponse setTModifier(String tModifier) {
        this.tModifier = tModifier;
        return this;
    }
    public String getTModifier() {
        return this.tModifier;
    }

    public QueryYouhuiTemplateResponse setTGmtCreate(String tGmtCreate) {
        this.tGmtCreate = tGmtCreate;
        return this;
    }
    public String getTGmtCreate() {
        return this.tGmtCreate;
    }

    public QueryYouhuiTemplateResponse setTGmtModified(String tGmtModified) {
        this.tGmtModified = tGmtModified;
        return this;
    }
    public String getTGmtModified() {
        return this.tGmtModified;
    }

    public QueryYouhuiTemplateResponse setItemCodeSet(java.util.List<String> itemCodeSet) {
        this.itemCodeSet = itemCodeSet;
        return this;
    }
    public java.util.List<String> getItemCodeSet() {
        return this.itemCodeSet;
    }

}
