// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class UIKeyVauleTemplate extends TeaModel {
    // 中文，描述这个UI元素的key
    @NameInMap("display")
    @Validation(required = true)
    public String display;

    // 对应ui元素的key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 对应UI元素的值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 该配置是否对 用户 可见。
    @NameInMap("visible")
    @Validation(required = true)
    public Boolean visible;

    public static UIKeyVauleTemplate build(java.util.Map<String, ?> map) throws Exception {
        UIKeyVauleTemplate self = new UIKeyVauleTemplate();
        return TeaModel.build(map, self);
    }

    public UIKeyVauleTemplate setDisplay(String display) {
        this.display = display;
        return this;
    }
    public String getDisplay() {
        return this.display;
    }

    public UIKeyVauleTemplate setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UIKeyVauleTemplate setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UIKeyVauleTemplate setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

}
