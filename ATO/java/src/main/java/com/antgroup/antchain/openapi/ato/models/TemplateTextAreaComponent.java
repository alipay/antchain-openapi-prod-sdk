// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TemplateTextAreaComponent extends TeaModel {
    // 模板编码
    /**
     * <strong>example:</strong>
     * <p>T20240505151148001384</p>
     */
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 模版版本号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
    /**
     * <strong>example:</strong>
     * <p>INPUT</p>
     */
    @NameInMap("component_type")
    @Validation(required = true)
    public String componentType;

    // 组件名称（占位符）
    /**
     * <strong>example:</strong>
     * <p>公司名称</p>
     */
    @NameInMap("component_name")
    @Validation(required = true)
    public String componentName;

    // 是否必填
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 预估文本行数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("line")
    public Long line;

    // 多行文本域名称
    /**
     * <strong>example:</strong>
     * <p>公司地址</p>
     */
    @NameInMap("multi_name")
    @Validation(required = true)
    public String multiName;

    // 前端传入的文本域映射字段
    /**
     * <strong>example:</strong>
     * <p>CP20250721172015013576</p>
     */
    @NameInMap("pre_element_code")
    @Validation(required = true)
    public String preElementCode;

    public static TemplateTextAreaComponent build(java.util.Map<String, ?> map) throws Exception {
        TemplateTextAreaComponent self = new TemplateTextAreaComponent();
        return TeaModel.build(map, self);
    }

    public TemplateTextAreaComponent setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public TemplateTextAreaComponent setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public TemplateTextAreaComponent setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public TemplateTextAreaComponent setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public TemplateTextAreaComponent setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public TemplateTextAreaComponent setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public TemplateTextAreaComponent setMultiName(String multiName) {
        this.multiName = multiName;
        return this;
    }
    public String getMultiName() {
        return this.multiName;
    }

    public TemplateTextAreaComponent setPreElementCode(String preElementCode) {
        this.preElementCode = preElementCode;
        return this;
    }
    public String getPreElementCode() {
        return this.preElementCode;
    }

}
