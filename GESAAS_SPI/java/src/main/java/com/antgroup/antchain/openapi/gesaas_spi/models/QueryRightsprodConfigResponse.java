// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class QueryRightsprodConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 供应权益编码
    @NameInMap("supply_rights_code")
    public String supplyRightsCode;

    // 权益名称
    @NameInMap("rights_name")
    public String rightsName;

    // 权益类型
    // 满减券:FULL_REDUCTION_COUPON 
    // 每满减券:EVERY_FULL_REDUCTION_COUPON
    // 折扣券:DISCOUNT_COUPON
    @NameInMap("rights_type")
    public String rightsType;

    // 待发布:INIT
    // 已上线:ONLINE
    // 已暂停:PAUSED
    // 已下线:OFFLINE
    @NameInMap("status")
    public String status;

    // 权益创建时间格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("create_time")
    public String createTime;

    // 权益发放开始时间
    @NameInMap("grant_start_time")
    public String grantStartTime;

    // 权益发放截止时间
    @NameInMap("grant_end_time")
    public String grantEndTime;

    // 生效时间类型 固定时间:1;领券后:0
    @NameInMap("validity_time_type")
    public String validityTimeType;

    // 生效时间 格式为yyyy-MM-dd HH:mm:ss
    // 生效时间类型为 1 固定时间是必传
    @NameInMap("voucher_start_time")
    public String voucherStartTime;

    // 过期时间 格式为yyyy-MM-dd HH:mm:ss
    // 生效时间类型为 1 固定时间是必传
    @NameInMap("voucher_end_time")
    public String voucherEndTime;

    // 生效时间类型：DAY/HOUR
    // 当生效时间类型为0时 必传
    @NameInMap("validity_time_format")
    public String validityTimeFormat;

    // 生效时间数
    // 生效时间类型 0时 必传
    @NameInMap("validity_time")
    public Long validityTime;

    // 权益面额 单位：元
    @NameInMap("face_amount")
    public String faceAmount;

    // 门槛金额单位：元
    @NameInMap("sill_amount")
    public String sillAmount;

    // 折扣数 88折 对应为8.8
    @NameInMap("discount")
    public String discount;

    // 最大优惠金额
    @NameInMap("max_discount_amount")
    public String maxDiscountAmount;

    // 券原始库存（最大发券数）
    @NameInMap("rights_num")
    public Long rightsNum;

    // 总预算金额
    @NameInMap("total_budget")
    public String totalBudget;

    // 使用描述
    @NameInMap("description")
    public String description;

    public static QueryRightsprodConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodConfigResponse self = new QueryRightsprodConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRightsprodConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRightsprodConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRightsprodConfigResponse setSupplyRightsCode(String supplyRightsCode) {
        this.supplyRightsCode = supplyRightsCode;
        return this;
    }
    public String getSupplyRightsCode() {
        return this.supplyRightsCode;
    }

    public QueryRightsprodConfigResponse setRightsName(String rightsName) {
        this.rightsName = rightsName;
        return this;
    }
    public String getRightsName() {
        return this.rightsName;
    }

    public QueryRightsprodConfigResponse setRightsType(String rightsType) {
        this.rightsType = rightsType;
        return this;
    }
    public String getRightsType() {
        return this.rightsType;
    }

    public QueryRightsprodConfigResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRightsprodConfigResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryRightsprodConfigResponse setGrantStartTime(String grantStartTime) {
        this.grantStartTime = grantStartTime;
        return this;
    }
    public String getGrantStartTime() {
        return this.grantStartTime;
    }

    public QueryRightsprodConfigResponse setGrantEndTime(String grantEndTime) {
        this.grantEndTime = grantEndTime;
        return this;
    }
    public String getGrantEndTime() {
        return this.grantEndTime;
    }

    public QueryRightsprodConfigResponse setValidityTimeType(String validityTimeType) {
        this.validityTimeType = validityTimeType;
        return this;
    }
    public String getValidityTimeType() {
        return this.validityTimeType;
    }

    public QueryRightsprodConfigResponse setVoucherStartTime(String voucherStartTime) {
        this.voucherStartTime = voucherStartTime;
        return this;
    }
    public String getVoucherStartTime() {
        return this.voucherStartTime;
    }

    public QueryRightsprodConfigResponse setVoucherEndTime(String voucherEndTime) {
        this.voucherEndTime = voucherEndTime;
        return this;
    }
    public String getVoucherEndTime() {
        return this.voucherEndTime;
    }

    public QueryRightsprodConfigResponse setValidityTimeFormat(String validityTimeFormat) {
        this.validityTimeFormat = validityTimeFormat;
        return this;
    }
    public String getValidityTimeFormat() {
        return this.validityTimeFormat;
    }

    public QueryRightsprodConfigResponse setValidityTime(Long validityTime) {
        this.validityTime = validityTime;
        return this;
    }
    public Long getValidityTime() {
        return this.validityTime;
    }

    public QueryRightsprodConfigResponse setFaceAmount(String faceAmount) {
        this.faceAmount = faceAmount;
        return this;
    }
    public String getFaceAmount() {
        return this.faceAmount;
    }

    public QueryRightsprodConfigResponse setSillAmount(String sillAmount) {
        this.sillAmount = sillAmount;
        return this;
    }
    public String getSillAmount() {
        return this.sillAmount;
    }

    public QueryRightsprodConfigResponse setDiscount(String discount) {
        this.discount = discount;
        return this;
    }
    public String getDiscount() {
        return this.discount;
    }

    public QueryRightsprodConfigResponse setMaxDiscountAmount(String maxDiscountAmount) {
        this.maxDiscountAmount = maxDiscountAmount;
        return this;
    }
    public String getMaxDiscountAmount() {
        return this.maxDiscountAmount;
    }

    public QueryRightsprodConfigResponse setRightsNum(Long rightsNum) {
        this.rightsNum = rightsNum;
        return this;
    }
    public Long getRightsNum() {
        return this.rightsNum;
    }

    public QueryRightsprodConfigResponse setTotalBudget(String totalBudget) {
        this.totalBudget = totalBudget;
        return this;
    }
    public String getTotalBudget() {
        return this.totalBudget;
    }

    public QueryRightsprodConfigResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
