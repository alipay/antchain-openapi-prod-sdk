// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpBasicInfoWithChannelInfo extends TeaModel {
    // ip的基础信息
    @NameInMap("ip_basic_info")
    @Validation(required = true)
    public IpBasicInfo ipBasicInfo;

    // ip的渠道信息和sku信息
    @NameInMap("ip_channal_infos")
    @Validation(required = true)
    public java.util.List<IpChannelWithSku> ipChannalInfos;

    public static IpBasicInfoWithChannelInfo build(java.util.Map<String, ?> map) throws Exception {
        IpBasicInfoWithChannelInfo self = new IpBasicInfoWithChannelInfo();
        return TeaModel.build(map, self);
    }

    public IpBasicInfoWithChannelInfo setIpBasicInfo(IpBasicInfo ipBasicInfo) {
        this.ipBasicInfo = ipBasicInfo;
        return this;
    }
    public IpBasicInfo getIpBasicInfo() {
        return this.ipBasicInfo;
    }

    public IpBasicInfoWithChannelInfo setIpChannalInfos(java.util.List<IpChannelWithSku> ipChannalInfos) {
        this.ipChannalInfos = ipChannalInfos;
        return this;
    }
    public java.util.List<IpChannelWithSku> getIpChannalInfos() {
        return this.ipChannalInfos;
    }

}
