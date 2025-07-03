// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StrategyDetails extends TeaModel {
    // 策略id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 策略名称
    /**
     * <strong>example:</strong>
     * <p>策略名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 决策结果
    /**
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // 场景码
    /**
     * <strong>example:</strong>
     * <p>scene_code</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static StrategyDetails build(java.util.Map<String, ?> map) throws Exception {
        StrategyDetails self = new StrategyDetails();
        return TeaModel.build(map, self);
    }

    public StrategyDetails setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StrategyDetails setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StrategyDetails setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public StrategyDetails setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
