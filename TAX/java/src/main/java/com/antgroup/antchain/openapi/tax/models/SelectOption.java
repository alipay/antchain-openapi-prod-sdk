// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class SelectOption extends TeaModel {
    // 选项名称
    /**
     * <strong>example:</strong>
     * <p>选项名称</p>
     */
    @NameInMap("lable")
    @Validation(required = true)
    public String lable;

    // 选项的值，一般是 id 之类的唯一标识符，给后端传这个
    /**
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static SelectOption build(java.util.Map<String, ?> map) throws Exception {
        SelectOption self = new SelectOption();
        return TeaModel.build(map, self);
    }

    public SelectOption setLable(String lable) {
        this.lable = lable;
        return this;
    }
    public String getLable() {
        return this.lable;
    }

    public SelectOption setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
