// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarComponentInfo extends TeaModel {
    // 组件标题
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 组件编码
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 组件值
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static AvatarComponentInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarComponentInfo self = new AvatarComponentInfo();
        return TeaModel.build(map, self);
    }

    public AvatarComponentInfo setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AvatarComponentInfo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AvatarComponentInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
