// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RenderParam extends TeaModel {
    // 参数名
    @NameInMap("key")
    public String key;

    // 参数值，可能是一个常量或者表达式
    @NameInMap("value")
    public String value;

    // 参数值类型，CONST/EXPR
    @NameInMap("type")
    public String type;

    // 参数描述
    @NameInMap("desc")
    public String desc;

    // 数据保密级别，L1,L2,L3
    @NameInMap("data_level")
    public String dataLevel;

    // 参数渲染后的值
    @NameInMap("render_vals")
    public java.util.List<ParamVal> renderVals;

    public static RenderParam build(java.util.Map<String, ?> map) throws Exception {
        RenderParam self = new RenderParam();
        return TeaModel.build(map, self);
    }

    public RenderParam setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RenderParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public RenderParam setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RenderParam setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public RenderParam setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
        return this;
    }
    public String getDataLevel() {
        return this.dataLevel;
    }

    public RenderParam setRenderVals(java.util.List<ParamVal> renderVals) {
        this.renderVals = renderVals;
        return this;
    }
    public java.util.List<ParamVal> getRenderVals() {
        return this.renderVals;
    }

}
