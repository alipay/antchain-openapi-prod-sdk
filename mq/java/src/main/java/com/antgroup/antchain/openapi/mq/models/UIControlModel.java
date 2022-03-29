// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UIControlModel extends TeaModel {
    // 展示给用户查看的描述。
    @NameInMap("display")
    @Validation(required = true)
    public String display;

    // 提示信息，参照Tooltip
    @NameInMap("hint")
    public String hint;

    // 控件名称，也是控件绑定的数据 key
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 如果本控件是 select 或者 radio 选择框类型，本数组是 所有 选项的具体信息。
    @NameInMap("options")
    public java.util.List<UIOptionModel> options;

    // input控件独有字段，代表输入框的place holder
    @NameInMap("place_holder")
    public String placeHolder;

    // 该控件的value是否是必须的
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 本控件的值必须满足的规则，例如input，那么可能输入的文本必须满足全英文等；以正则表达式的形式。
    @NameInMap("rule")
    public String rule;

    // 当 用户输入的 值与 rule不符合时，提醒用户出错的备注。
    @NameInMap("rule_remark")
    public String ruleRemark;

    // 控件的类型；支持 Select、Radio、Input、DatePicking
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 本控件是否未联动控件，联动控件是否展示 与 union_control和union_value 相关，当联动的父控件union_control的值为union_value时，本控件才可见。
    @NameInMap("union")
    @Validation(required = true)
    public Boolean union;

    // 联动的控件名称，即name
    @NameInMap("union_control")
    public String unionControl;

    // 当联动空间union_control的值是本字段的值时，本联动控件可以展示。
    @NameInMap("union_value")
    public String unionValue;

    // 本控件对应的值；如果是input，那么就是输入的值；如果是select/radio，那就是选项的值；如果是option，那么就是自己本身的枚举值。
    @NameInMap("value")
    public String value;

    // 该控件的值是否可以修改
    @NameInMap("immutable")
    @Validation(required = true)
    public Boolean immutable;

    public static UIControlModel build(java.util.Map<String, ?> map) throws Exception {
        UIControlModel self = new UIControlModel();
        return TeaModel.build(map, self);
    }

    public UIControlModel setDisplay(String display) {
        this.display = display;
        return this;
    }
    public String getDisplay() {
        return this.display;
    }

    public UIControlModel setHint(String hint) {
        this.hint = hint;
        return this;
    }
    public String getHint() {
        return this.hint;
    }

    public UIControlModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UIControlModel setOptions(java.util.List<UIOptionModel> options) {
        this.options = options;
        return this;
    }
    public java.util.List<UIOptionModel> getOptions() {
        return this.options;
    }

    public UIControlModel setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
        return this;
    }
    public String getPlaceHolder() {
        return this.placeHolder;
    }

    public UIControlModel setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public UIControlModel setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UIControlModel setRuleRemark(String ruleRemark) {
        this.ruleRemark = ruleRemark;
        return this;
    }
    public String getRuleRemark() {
        return this.ruleRemark;
    }

    public UIControlModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UIControlModel setUnion(Boolean union) {
        this.union = union;
        return this;
    }
    public Boolean getUnion() {
        return this.union;
    }

    public UIControlModel setUnionControl(String unionControl) {
        this.unionControl = unionControl;
        return this;
    }
    public String getUnionControl() {
        return this.unionControl;
    }

    public UIControlModel setUnionValue(String unionValue) {
        this.unionValue = unionValue;
        return this;
    }
    public String getUnionValue() {
        return this.unionValue;
    }

    public UIControlModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UIControlModel setImmutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }
    public Boolean getImmutable() {
        return this.immutable;
    }

}
