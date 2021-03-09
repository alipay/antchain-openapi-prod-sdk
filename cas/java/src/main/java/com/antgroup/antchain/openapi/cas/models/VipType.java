// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VipType extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // vip_address_type
    @NameInMap("vip_address_type")
    @Validation(required = true)
    public String vipAddressType;

    // vip_type
    @NameInMap("vip_type")
    @Validation(required = true)
    public String vipType;

    public static VipType build(java.util.Map<String, ?> map) throws Exception {
        VipType self = new VipType();
        return TeaModel.build(map, self);
    }

    public VipType setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VipType setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public VipType setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

}
