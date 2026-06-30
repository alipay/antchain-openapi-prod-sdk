// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class Contact extends TeaModel {
    // 联系人类型
    // 1配偶
    // 2父母
    // 3子女
    // 4兄弟
    // 5姐妹
    // 6朋友
    // 7其他
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("kind")
    @Validation(required = true)
    public String kind;

    // 联系人姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联系人手机号
    /**
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    public static Contact build(java.util.Map<String, ?> map) throws Exception {
        Contact self = new Contact();
        return TeaModel.build(map, self);
    }

    public Contact setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Contact setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
