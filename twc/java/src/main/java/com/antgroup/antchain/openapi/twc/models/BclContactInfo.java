// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclContactInfo extends TeaModel {
    // 联系人名称，最大长度：128
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 联系人手机号
    // 最大长度：20
    // 示例：13812348888
    /**
     * <strong>example:</strong>
     * <p>138xxxx8888</p>
     */
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 联系人电话
    // 最大长度：20
    // 示例：0571-12345678
    /**
     * <strong>example:</strong>
     * <p>0571-12345678</p>
     */
    @NameInMap("phone")
    public String phone;

    public static BclContactInfo build(java.util.Map<String, ?> map) throws Exception {
        BclContactInfo self = new BclContactInfo();
        return TeaModel.build(map, self);
    }

    public BclContactInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BclContactInfo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public BclContactInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
