// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RiskStrategy extends TeaModel {
    // 策略ID
    /**
     * <strong>example:</strong>
     * <p>策略ID</p>
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

    // 策略决策结果
    /**
     * <strong>example:</strong>
     * <p>策略决策结果</p>
     */
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // 风险场景编码
    /**
     * <strong>example:</strong>
     * <p>风险场景编码</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static RiskStrategy build(java.util.Map<String, ?> map) throws Exception {
        RiskStrategy self = new RiskStrategy();
        return TeaModel.build(map, self);
    }

    public RiskStrategy setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RiskStrategy setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RiskStrategy setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public RiskStrategy setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
