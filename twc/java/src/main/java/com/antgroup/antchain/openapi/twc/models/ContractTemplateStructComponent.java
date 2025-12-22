// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractTemplateStructComponent extends TeaModel {
    // 填充字体,默认1，1-宋体，2-新宋体,4-黑体，5-楷体
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("font")
    public Long font;

    // 填充字体大小,默认12
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("font_size")
    public String fontSize;

    // 输入项组件高度
    /**
     * <strong>example:</strong>
     * <p>11.11</p>
     */
    @NameInMap("height")
    public String height;

    // 输入项组件id，使用时可用id填充，为空时表示添加，不为空时表示修改
    /**
     * <strong>example:</strong>
     * <p>45dd9420690b460c9e5ed55b40d7d0f8</p>
     */
    @NameInMap("id")
    public String id;

    // 模板下输入项组件唯一标识，使用模板时也可用根据key值填充
    /**
     * <strong>example:</strong>
     * <p>key001</p>
     */
    @NameInMap("key")
    public String key;

    // 输入项组件显示名称
    /**
     * <strong>example:</strong>
     * <p>身份证号码</p>
     */
    @NameInMap("label")
    public String label;

    // 输入项组件type=2,type=3时填充格式校验规则;数字格式如：#,#00.0# 日期格式如： yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("limit")
    public String limit;

    // 页码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    // 是否必填，默认true
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("required")
    public Boolean required;

    // 字体颜色，默认#000000黑色
    /**
     * <strong>example:</strong>
     * <p>#000000</p>
     */
    @NameInMap("text_color")
    public String textColor;

    // 输入项组件类型，1-文本，2-数字,3-日期，6-签约区
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("type")
    public Long type;

    // 输入项组件宽度
    /**
     * <strong>example:</strong>
     * <p>11.11</p>
     */
    @NameInMap("width")
    public String width;

    // x轴坐标，左下角为原点
    /**
     * <strong>example:</strong>
     * <p>11.11</p>
     */
    @NameInMap("x")
    public String x;

    // y轴坐标，左下角为原点
    /**
     * <strong>example:</strong>
     * <p>11.11</p>
     */
    @NameInMap("y")
    public String y;

    public static ContractTemplateStructComponent build(java.util.Map<String, ?> map) throws Exception {
        ContractTemplateStructComponent self = new ContractTemplateStructComponent();
        return TeaModel.build(map, self);
    }

    public ContractTemplateStructComponent setFont(Long font) {
        this.font = font;
        return this;
    }
    public Long getFont() {
        return this.font;
    }

    public ContractTemplateStructComponent setFontSize(String fontSize) {
        this.fontSize = fontSize;
        return this;
    }
    public String getFontSize() {
        return this.fontSize;
    }

    public ContractTemplateStructComponent setHeight(String height) {
        this.height = height;
        return this;
    }
    public String getHeight() {
        return this.height;
    }

    public ContractTemplateStructComponent setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ContractTemplateStructComponent setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ContractTemplateStructComponent setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ContractTemplateStructComponent setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public ContractTemplateStructComponent setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ContractTemplateStructComponent setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ContractTemplateStructComponent setTextColor(String textColor) {
        this.textColor = textColor;
        return this;
    }
    public String getTextColor() {
        return this.textColor;
    }

    public ContractTemplateStructComponent setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public ContractTemplateStructComponent setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public ContractTemplateStructComponent setX(String x) {
        this.x = x;
        return this;
    }
    public String getX() {
        return this.x;
    }

    public ContractTemplateStructComponent setY(String y) {
        this.y = y;
        return this;
    }
    public String getY() {
        return this.y;
    }

}
