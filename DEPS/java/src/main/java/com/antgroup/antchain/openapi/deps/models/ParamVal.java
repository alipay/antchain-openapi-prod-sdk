// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ParamVal extends TeaModel {
    // 参数渲染后的值
    @NameInMap("render_val")
    public String renderVal;

    // 某个 scope_id
    @NameInMap("scope_id")
    public String scopeId;

    // scope 类型
    @NameInMap("scope")
    public String scope;

    public static ParamVal build(java.util.Map<String, ?> map) throws Exception {
        ParamVal self = new ParamVal();
        return TeaModel.build(map, self);
    }

    public ParamVal setRenderVal(String renderVal) {
        this.renderVal = renderVal;
        return this;
    }
    public String getRenderVal() {
        return this.renderVal;
    }

    public ParamVal setScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    public String getScopeId() {
        return this.scopeId;
    }

    public ParamVal setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
