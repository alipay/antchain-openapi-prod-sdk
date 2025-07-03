// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SmsTemplate extends TeaModel {
    // 场景策略ID
    /**
     * <strong>example:</strong>
     * <p>5617</p>
     */
    @NameInMap("scene_strategy_id")
    @Validation(required = true)
    public String sceneStrategyId;

    // 计划名称
    /**
     * <strong>example:</strong>
     * <p>测试计划名称</p>
     */
    @NameInMap("scene_strategy_name")
    @Validation(required = true)
    public String sceneStrategyName;

    // 模板内容
    /**
     * <strong>example:</strong>
     * <p>测试模版内容</p>
     */
    @NameInMap("template_content")
    @Validation(required = true)
    public String templateContent;

    public static SmsTemplate build(java.util.Map<String, ?> map) throws Exception {
        SmsTemplate self = new SmsTemplate();
        return TeaModel.build(map, self);
    }

    public SmsTemplate setSceneStrategyId(String sceneStrategyId) {
        this.sceneStrategyId = sceneStrategyId;
        return this;
    }
    public String getSceneStrategyId() {
        return this.sceneStrategyId;
    }

    public SmsTemplate setSceneStrategyName(String sceneStrategyName) {
        this.sceneStrategyName = sceneStrategyName;
        return this;
    }
    public String getSceneStrategyName() {
        return this.sceneStrategyName;
    }

    public SmsTemplate setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

}
