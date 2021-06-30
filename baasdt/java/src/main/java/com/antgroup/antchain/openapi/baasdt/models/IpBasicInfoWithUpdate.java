// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IpBasicInfoWithUpdate extends TeaModel {
    // 基础信息
    @NameInMap("ip_basic_info")
    @Validation(required = true)
    public IpBasicInfo ipBasicInfo;

    // 是否有更新
    @NameInMap("is_update")
    @Validation(required = true)
    public Boolean isUpdate;

    public static IpBasicInfoWithUpdate build(java.util.Map<String, ?> map) throws Exception {
        IpBasicInfoWithUpdate self = new IpBasicInfoWithUpdate();
        return TeaModel.build(map, self);
    }

    public IpBasicInfoWithUpdate setIpBasicInfo(IpBasicInfo ipBasicInfo) {
        this.ipBasicInfo = ipBasicInfo;
        return this;
    }
    public IpBasicInfo getIpBasicInfo() {
        return this.ipBasicInfo;
    }

    public IpBasicInfoWithUpdate setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate;
        return this;
    }
    public Boolean getIsUpdate() {
        return this.isUpdate;
    }

}
