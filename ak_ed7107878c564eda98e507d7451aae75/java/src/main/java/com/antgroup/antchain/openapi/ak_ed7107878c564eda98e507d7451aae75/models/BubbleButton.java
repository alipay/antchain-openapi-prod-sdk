// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class BubbleButton extends TeaModel {
    // 按钮文案
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 行动点执行动作值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 行动点执行动作类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static BubbleButton build(java.util.Map<String, ?> map) throws Exception {
        BubbleButton self = new BubbleButton();
        return TeaModel.build(map, self);
    }

    public BubbleButton setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public BubbleButton setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public BubbleButton setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
