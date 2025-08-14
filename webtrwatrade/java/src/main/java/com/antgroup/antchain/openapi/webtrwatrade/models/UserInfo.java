// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class UserInfo extends TeaModel {
    // 钱包地址
    /**
     * <strong>example:</strong>
     * <p>0x111111111</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static UserInfo build(java.util.Map<String, ?> map) throws Exception {
        UserInfo self = new UserInfo();
        return TeaModel.build(map, self);
    }

    public UserInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
