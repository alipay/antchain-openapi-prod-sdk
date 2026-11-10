// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SceneObservation extends TeaModel {
    // 场景候选标签，无法确定可缺失
    /**
     * <strong>example:</strong>
     * <p>code_review</p>
     */
    @NameInMap("label")
    public String label;

    // 场景简短说明
    /**
     * <strong>example:</strong>
     * <p>代码检查</p>
     */
    @NameInMap("description")
    public String description;

    public static SceneObservation build(java.util.Map<String, ?> map) throws Exception {
        SceneObservation self = new SceneObservation();
        return TeaModel.build(map, self);
    }

    public SceneObservation setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SceneObservation setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
