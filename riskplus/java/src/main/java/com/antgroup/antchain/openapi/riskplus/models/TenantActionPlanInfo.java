// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class TenantActionPlanInfo extends TeaModel {
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

    // 场景策略入参名
    @NameInMap("action_param_info")
    public java.util.List<String> actionParamInfo;

    // 参数查询是否完成
    @NameInMap("is_param_query_done")
    public Boolean isParamQueryDone;

    public static TenantActionPlanInfo build(java.util.Map<String, ?> map) throws Exception {
        TenantActionPlanInfo self = new TenantActionPlanInfo();
        return TeaModel.build(map, self);
    }

    public TenantActionPlanInfo setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public TenantActionPlanInfo setSceneStrategyName(String sceneStrategyName) {
        this.sceneStrategyName = sceneStrategyName;
        return this;
    }
    public String getSceneStrategyName() {
        return this.sceneStrategyName;
    }

    public TenantActionPlanInfo setSceneStrategyStatus(String sceneStrategyStatus) {
        this.sceneStrategyStatus = sceneStrategyStatus;
        return this;
    }
    public String getSceneStrategyStatus() {
        return this.sceneStrategyStatus;
    }

    public TenantActionPlanInfo setActionDriverCode(Long actionDriverCode) {
        this.actionDriverCode = actionDriverCode;
        return this;
    }
    public Long getActionDriverCode() {
        return this.actionDriverCode;
    }

    public TenantActionPlanInfo setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public TenantActionPlanInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TenantActionPlanInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TenantActionPlanInfo setActionParamInfo(java.util.List<String> actionParamInfo) {
        this.actionParamInfo = actionParamInfo;
        return this;
    }
    public java.util.List<String> getActionParamInfo() {
        return this.actionParamInfo;
    }

    public TenantActionPlanInfo setIsParamQueryDone(Boolean isParamQueryDone) {
        this.isParamQueryDone = isParamQueryDone;
        return this;
    }
    public Boolean getIsParamQueryDone() {
        return this.isParamQueryDone;
    }

}
