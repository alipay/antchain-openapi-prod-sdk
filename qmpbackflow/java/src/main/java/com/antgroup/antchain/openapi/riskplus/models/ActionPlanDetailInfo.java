// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ActionPlanDetailInfo extends TeaModel {
    // 场景策略id
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public Long sceneStrategyId;

    // 场景策略名称
    @NameInMap("scene_strategy_name")
    @Validation(required = true)
    public String sceneStrategyName;

    // 场景策略状态
    @NameInMap("scene_strategy_status")
    @Validation(required = true)
    public String sceneStrategyStatus;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 触达媒介参数信息
    @NameInMap("action_param_info")
    @Validation(required = true)
    public java.util.List<ActionParamInfo> actionParamInfo;

    public static ActionPlanDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        ActionPlanDetailInfo self = new ActionPlanDetailInfo();
        return TeaModel.build(map, self);
    }

    public ActionPlanDetailInfo setSceneStrategyId(Long sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public Long getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public ActionPlanDetailInfo setSceneStrategyName(String sceneStrategyName) {
        this.sceneStrategyName = sceneStrategyName;
        return this;
    }
    public String getSceneStrategyName() {
        return this.sceneStrategyName;
    }

    public ActionPlanDetailInfo setSceneStrategyStatus(String sceneStrategyStatus) {
        this.sceneStrategyStatus = sceneStrategyStatus;
        return this;
    }
    public String getSceneStrategyStatus() {
        return this.sceneStrategyStatus;
    }

    public ActionPlanDetailInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ActionPlanDetailInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ActionPlanDetailInfo setActionParamInfo(java.util.List<ActionParamInfo> actionParamInfo) {
        this.actionParamInfo = actionParamInfo;
        return this;
    }
    public java.util.List<ActionParamInfo> getActionParamInfo() {
        return this.actionParamInfo;
    }

}
