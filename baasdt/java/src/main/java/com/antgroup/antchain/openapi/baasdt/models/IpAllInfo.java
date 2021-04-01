// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpAllInfo extends TeaModel {
    // ip的基础信息
    @NameInMap("ip_basic_info")
    @Validation(required = true)
    public IpBasicInfo ipBasicInfo;

    // ip的渠道信息带上sku信息
    @NameInMap("ip_channal_info")
    @Validation(required = true)
    public java.util.List<IpChannelWithSku> ipChannalInfo;

    // 是否有更新数据
    @NameInMap("is_update")
    @Validation(required = true)
    public Boolean isUpdate;

    public static IpAllInfo build(java.util.Map<String, ?> map) throws Exception {
        IpAllInfo self = new IpAllInfo();
        return TeaModel.build(map, self);
    }

    public IpAllInfo setIpBasicInfo(IpBasicInfo ipBasicInfo) {
        this.ipBasicInfo = ipBasicInfo;
        return this;
    }
    public IpBasicInfo getIpBasicInfo() {
        return this.ipBasicInfo;
    }

    public IpAllInfo setIpChannalInfo(java.util.List<IpChannelWithSku> ipChannalInfo) {
        this.ipChannalInfo = ipChannalInfo;
        return this;
    }
    public java.util.List<IpChannelWithSku> getIpChannalInfo() {
        return this.ipChannalInfo;
    }

    public IpAllInfo setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate;
        return this;
    }
    public Boolean getIsUpdate() {
        return this.isUpdate;
    }

}
