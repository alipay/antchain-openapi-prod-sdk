// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class TenantActionTouchPlanInfo extends TeaModel {
    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 营销名称
    @NameInMap("scene_strategy_name")
    @Validation(required = true)
    public String sceneStrategyName;

    // 营销状态
    @NameInMap("scene_strategy_status")
    @Validation(required = true)
    public String sceneStrategyStatus;

    // 渠道id
    @NameInMap("action_driver_code")
    @Validation(required = true)
    public Long actionDriverCode;

    // 渠道类型
    @NameInMap("channel_code")
    @Validation(required = true)
    public String channelCode;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static TenantActionTouchPlanInfo build(java.util.Map<String, ?> map) throws Exception {
        TenantActionTouchPlanInfo self = new TenantActionTouchPlanInfo();
        return TeaModel.build(map, self);
    }

    public TenantActionTouchPlanInfo setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public TenantActionTouchPlanInfo setSceneStrategyName(String sceneStrategyName) {
        this.sceneStrategyName = sceneStrategyName;
        return this;
    }
    public String getSceneStrategyName() {
        return this.sceneStrategyName;
    }

    public TenantActionTouchPlanInfo setSceneStrategyStatus(String sceneStrategyStatus) {
        this.sceneStrategyStatus = sceneStrategyStatus;
        return this;
    }
    public String getSceneStrategyStatus() {
        return this.sceneStrategyStatus;
    }

    public TenantActionTouchPlanInfo setActionDriverCode(Long actionDriverCode) {
        this.actionDriverCode = actionDriverCode;
        return this;
    }
    public Long getActionDriverCode() {
        return this.actionDriverCode;
    }

    public TenantActionTouchPlanInfo setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public TenantActionTouchPlanInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TenantActionTouchPlanInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
