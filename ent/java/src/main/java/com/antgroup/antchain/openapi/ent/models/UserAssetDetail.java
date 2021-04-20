// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class UserAssetDetail extends TeaModel {
    // 粉丝粒变化数量，带符号整数，单位分个。
    @NameInMap("asset")
    @Validation(required = true)
    public Long asset;

    // 资产类型：PRE_ALLOCATION（待发放），RELEASED（已到账），CANCELLED（已取消），REDEEMING（兑现中），REDEEMED（已兑现）
    @NameInMap("asset_type")
    @Validation(required = true)
    public String assetType;

    // 业务单号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 事件时间，时区GMT+8，精确到毫秒。
    @NameInMap("event_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String eventTime;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 收益变化额度，单位为分。
    @NameInMap("revenue")
    @Validation(required = true)
    public Revenue revenue;

    public static UserAssetDetail build(java.util.Map<String, ?> map) throws Exception {
        UserAssetDetail self = new UserAssetDetail();
        return TeaModel.build(map, self);
    }

    public UserAssetDetail setAsset(Long asset) {
        this.asset = asset;
        return this;
    }
    public Long getAsset() {
        return this.asset;
    }

    public UserAssetDetail setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public UserAssetDetail setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public UserAssetDetail setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public UserAssetDetail setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public UserAssetDetail setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UserAssetDetail setRevenue(Revenue revenue) {
        this.revenue = revenue;
        return this;
    }
    public Revenue getRevenue() {
        return this.revenue;
    }

}
