// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TemplateComponent extends TeaModel {
    // 模板编码
    /**
     * <strong>example:</strong>
     * <p>T20240805190830044214</p>
     */
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 组件（文本域）id
    /**
     * <strong>example:</strong>
     * <p>CP20240521161730006569</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 组件（文本域）名称
    /**
     * <strong>example:</strong>
     * <p>companyName</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 组件（文本域）的唯一标识
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("uk")
    public String uk;

    // 占位符，组件（文本域）的展示样式值
    /**
     * <strong>example:</strong>
     * <p>【companyName】</p>
     */
    @NameInMap("placeholder")
    public String placeholder;

    // 组件（文本域）是否可以编辑。取值：Y/N
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("enable_edit")
    public String enableEdit;

    // 是否必填，取值：Y/N
    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("required")
    public String required;

    // 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
    /**
     * <strong>example:</strong>
     * <p>INPUT</p>
     */
    @NameInMap("type")
    public String type;

    // 组件（文本域）值
    /**
     * <strong>example:</strong>
     * <p>xx公司</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static TemplateComponent build(java.util.Map<String, ?> map) throws Exception {
        TemplateComponent self = new TemplateComponent();
        return TeaModel.build(map, self);
    }

    public TemplateComponent setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public TemplateComponent setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TemplateComponent setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TemplateComponent setUk(String uk) {
        this.uk = uk;
        return this;
    }
    public String getUk() {
        return this.uk;
    }

    public TemplateComponent setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    public String getPlaceholder() {
        return this.placeholder;
    }

    public TemplateComponent setEnableEdit(String enableEdit) {
        this.enableEdit = enableEdit;
        return this;
    }
    public String getEnableEdit() {
        return this.enableEdit;
    }

    public TemplateComponent setRequired(String required) {
        this.required = required;
        return this;
    }
    public String getRequired() {
        return this.required;
    }

    public TemplateComponent setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public TemplateComponent setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
