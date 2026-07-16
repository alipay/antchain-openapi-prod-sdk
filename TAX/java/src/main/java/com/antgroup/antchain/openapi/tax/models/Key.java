// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class Key extends TeaModel {
    // 名称（key的中文名称）
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // id
    /**
     * <strong>example:</strong>
     * <p>123232423</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // input, // 普通输入框
    // dropdownSelect, // 下拉选择
    // cardSelect, // 平铺选择
    // password, // 密码输入框，这个类型会包含忘记密码按钮
    // smsCode, // 手机验证码
    // qrcodeLogin, // 二维码登录
    // hiddenField,// 隐藏字段，页面上不显示，但是值会提交给后端
    /**
     * <strong>example:</strong>
     * <p>cardSelect</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 字段名称 例如：密码
    /**
     * <strong>example:</strong>
     * <p>dd</p>
     */
    @NameInMap("label")
    @Validation(required = true)
    public String label;

    // 输入框的值类型，字符串还是数字，默认 string/number/paassword
    /**
     * <strong>example:</strong>
     * <p>number</p>
     */
    @NameInMap("input_type")
    @Validation(required = true)
    public String inputType;

    // 字段的初始值，类型要和前端提交的类型保持一致，且是可被 JSON 序列化的
    /**
     * <strong>example:</strong>
     * <p>ddd</p>
     */
    @NameInMap("initial_value")
    @Validation(required = true)
    public String initialValue;

    // 占位符，比如”请输入密码“
    /**
     * <strong>example:</strong>
     * <p>请输入密码</p>
     */
    @NameInMap("placeholder")
    @Validation(required = true)
    public String placeholder;

    // 是否为禁用状态，true 表示禁用，默认 false
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("disabled")
    @Validation(required = true)
    public Boolean disabled;

    // 表示输入框是否为只读状态（只读和禁用都不能输入，但是样式不一样，所以要注意区分，不要同时声明 disabled 和 readOnly，否则以 disabled 优先）
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("read_only")
    @Validation(required = true)
    public String readOnly;

    // 这个字段的提示说明文案
    /**
     * <strong>example:</strong>
     * <p>这个字段的提示说明文案，点击字段名称右侧的 icon 时显示</p>
     */
    @NameInMap("tooltip")
    @Validation(required = true)
    public String tooltip;

    // 校验规则
    /**
     * <strong>example:</strong>
     * <p>校验规则</p>
     */
    @NameInMap("rules")
    @Validation(required = true)
    public java.util.List<Rule> rules;

    // 逻辑列表
    @NameInMap("logics")
    @Validation(required = true)
    public java.util.List<Logic> logics;

    // 选择列表的可选值，只有 type 是 dropdownSelect、cardSelect 时才需要
    @NameInMap("select_options")
    @Validation(required = true)
    public java.util.List<SelectOption> selectOptions;

    // 忘记密码元素
    @NameInMap("forget_meta")
    @Validation(required = true)
    public ForgetMeta forgetMeta;

    public static Key build(java.util.Map<String, ?> map) throws Exception {
        Key self = new Key();
        return TeaModel.build(map, self);
    }

    public Key setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public Key setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Key setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Key setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public Key setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public Key setInitialValue(String initialValue) {
        this.initialValue = initialValue;
        return this;
    }
    public String getInitialValue() {
        return this.initialValue;
    }

    public Key setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }
    public String getPlaceholder() {
        return this.placeholder;
    }

    public Key setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

    public Key setReadOnly(String readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public String getReadOnly() {
        return this.readOnly;
    }

    public Key setTooltip(String tooltip) {
        this.tooltip = tooltip;
        return this;
    }
    public String getTooltip() {
        return this.tooltip;
    }

    public Key setRules(java.util.List<Rule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<Rule> getRules() {
        return this.rules;
    }

    public Key setLogics(java.util.List<Logic> logics) {
        this.logics = logics;
        return this;
    }
    public java.util.List<Logic> getLogics() {
        return this.logics;
    }

    public Key setSelectOptions(java.util.List<SelectOption> selectOptions) {
        this.selectOptions = selectOptions;
        return this;
    }
    public java.util.List<SelectOption> getSelectOptions() {
        return this.selectOptions;
    }

    public Key setForgetMeta(ForgetMeta forgetMeta) {
        this.forgetMeta = forgetMeta;
        return this;
    }
    public ForgetMeta getForgetMeta() {
        return this.forgetMeta;
    }

}
