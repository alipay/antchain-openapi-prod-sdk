// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ToolOptionInfo extends TeaModel {
    // plugin = 工具；workflow = 工作流
    /**
     * <strong>example:</strong>
     * <p>plugin</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 对应的工具/工作流名称
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 对应的工具/工作流名称
    /**
     * <strong>example:</strong>
     * <p>对应的工具/工作流名称</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 对应的工具/工作流参数列表
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("params")
    @Validation(required = true)
    public java.util.List<ToolOptionParam> params;

    public static ToolOptionInfo build(java.util.Map<String, ?> map) throws Exception {
        ToolOptionInfo self = new ToolOptionInfo();
        return TeaModel.build(map, self);
    }

    public ToolOptionInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ToolOptionInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ToolOptionInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ToolOptionInfo setParams(java.util.List<ToolOptionParam> params) {
        this.params = params;
        return this;
    }
    public java.util.List<ToolOptionParam> getParams() {
        return this.params;
    }

}
