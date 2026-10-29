// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class AccessScopeItem extends TeaModel {
    // 场景码。范围项归属的业务场景，同一请求内可以出现多个不同场景的范围项。
    /**
     * <strong>example:</strong>
     * <p>SCENE_001</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 访问目标 ID 清单
    /**
     * <strong>example:</strong>
     * <p>[&quot;dev-8801&quot;,&quot;dev-8802&quot;]</p>
     */
    @NameInMap("targets")
    @Validation(required = true)
    public java.util.List<String> targets;

    public static AccessScopeItem build(java.util.Map<String, ?> map) throws Exception {
        AccessScopeItem self = new AccessScopeItem();
        return TeaModel.build(map, self);
    }

    public AccessScopeItem setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AccessScopeItem setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

}
