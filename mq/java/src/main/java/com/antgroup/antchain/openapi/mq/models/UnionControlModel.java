// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UnionControlModel extends TeaModel {
    // 具体的联动 控件模型
    @NameInMap("control")
    @Validation(required = true)
    public UIControlModel control;

    // 本联动控件对应的父控件的名称，例如本联动控件是input，父控件是select，想要做到select选择某个特定选项后展示input控件，那么本字段就是 select控件的name。
    @NameInMap("union_control")
    @Validation(required = true)
    public String unionControl;

    // 对应父控件的value为本字段的值时，本联动控件会展示出来。例如：当topicConfig这个select控件的值是 customized时，本联动控件input就能展示了。
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UnionControlModel build(java.util.Map<String, ?> map) throws Exception {
        UnionControlModel self = new UnionControlModel();
        return TeaModel.build(map, self);
    }

    public UnionControlModel setControl(UIControlModel control) {
        this.control = control;
        return this;
    }
    public UIControlModel getControl() {
        return this.control;
    }

    public UnionControlModel setUnionControl(String unionControl) {
        this.unionControl = unionControl;
        return this;
    }
    public String getUnionControl() {
        return this.unionControl;
    }

    public UnionControlModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
