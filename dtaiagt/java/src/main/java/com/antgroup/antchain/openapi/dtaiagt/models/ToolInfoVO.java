// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ToolInfoVO extends TeaModel {
    // 工具名称
    /**
     * <strong>example:</strong>
     * <p>工具名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 工具描述
    /**
     * <strong>example:</strong>
     * <p>工具描述</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 工具入参的json schema
    @NameInMap("input_schema")
    @Validation(required = true)
    public JsonSchema inputSchema;

    public static ToolInfoVO build(java.util.Map<String, ?> map) throws Exception {
        ToolInfoVO self = new ToolInfoVO();
        return TeaModel.build(map, self);
    }

    public ToolInfoVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ToolInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ToolInfoVO setInputSchema(JsonSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }
    public JsonSchema getInputSchema() {
        return this.inputSchema;
    }

}
