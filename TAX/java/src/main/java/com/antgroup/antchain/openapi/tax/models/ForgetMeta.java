// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ForgetMeta extends TeaModel {
    // 字段名称
    /**
     * <strong>example:</strong>
     * <p>字段名称 例如：密码</p>
     */
    @NameInMap("label")
    @Validation(required = true)
    public String label;

    // 忘记密码的链接地址，供重置用
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.baidu.com">www.baidu.com</a></p>
     */
    @NameInMap("link")
    @Validation(required = true)
    public String link;

    public static ForgetMeta build(java.util.Map<String, ?> map) throws Exception {
        ForgetMeta self = new ForgetMeta();
        return TeaModel.build(map, self);
    }

    public ForgetMeta setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ForgetMeta setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

}
