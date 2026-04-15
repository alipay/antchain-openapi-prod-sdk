// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Host extends TeaModel {
    // test_2e1ae924805f
    /**
     * <strong>example:</strong>
     * <p>test_2e1ae924805f</p>
     */
    @NameInMap("system_name")
    @Validation(required = true)
    public String systemName;

    // 地址
    /**
     * <strong>example:</strong>
     * <p>test_941f18a4013b</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static Host build(java.util.Map<String, ?> map) throws Exception {
        Host self = new Host();
        return TeaModel.build(map, self);
    }

    public Host setSystemName(String systemName) {
        this.systemName = systemName;
        return this;
    }
    public String getSystemName() {
        return this.systemName;
    }

    public Host setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
