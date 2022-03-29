// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UIOptionModel extends TeaModel {
    // 选项展示的中文描述
    @NameInMap("display")
    @Validation(required = true)
    public String display;

    // 选项的枚举值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static UIOptionModel build(java.util.Map<String, ?> map) throws Exception {
        UIOptionModel self = new UIOptionModel();
        return TeaModel.build(map, self);
    }

    public UIOptionModel setDisplay(String display) {
        this.display = display;
        return this;
    }
    public String getDisplay() {
        return this.display;
    }

    public UIOptionModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
