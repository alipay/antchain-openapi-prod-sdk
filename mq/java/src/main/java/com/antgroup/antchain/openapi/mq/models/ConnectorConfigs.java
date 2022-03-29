// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConnectorConfigs extends TeaModel {
    // 前端控件类型
    @NameInMap("control")
    @Validation(required = true)
    public String control;

    // 控件描述：中文、展示给用户
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 配置项名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 选项控件的所有选项
    @NameInMap("select_options")
    public java.util.List<String> selectOptions;

    // radio控件的所有选项
    @NameInMap("radio_options")
    public java.util.List<String> radioOptions;

    // 描述本配置的子配置名称，如果本配置是 选项类型，那么如果本选项被选中后，子控件才可见。
    @NameInMap("child")
    public String child;

    // 本配置是否可见，也即控件是否被用户可见
    @NameInMap("visible")
    @Validation(required = true)
    public Boolean visible;

    // 代表 本配置 的 父配置名称，便于做 控件间联动
    @NameInMap("parent")
    public String parent;

    public static ConnectorConfigs build(java.util.Map<String, ?> map) throws Exception {
        ConnectorConfigs self = new ConnectorConfigs();
        return TeaModel.build(map, self);
    }

    public ConnectorConfigs setControl(String control) {
        this.control = control;
        return this;
    }
    public String getControl() {
        return this.control;
    }

    public ConnectorConfigs setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConnectorConfigs setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConnectorConfigs setSelectOptions(java.util.List<String> selectOptions) {
        this.selectOptions = selectOptions;
        return this;
    }
    public java.util.List<String> getSelectOptions() {
        return this.selectOptions;
    }

    public ConnectorConfigs setRadioOptions(java.util.List<String> radioOptions) {
        this.radioOptions = radioOptions;
        return this;
    }
    public java.util.List<String> getRadioOptions() {
        return this.radioOptions;
    }

    public ConnectorConfigs setChild(String child) {
        this.child = child;
        return this;
    }
    public String getChild() {
        return this.child;
    }

    public ConnectorConfigs setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

    public ConnectorConfigs setParent(String parent) {
        this.parent = parent;
        return this;
    }
    public String getParent() {
        return this.parent;
    }

}
