// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class UnitInstanceInfo extends TeaModel {
    // 部署单元内服务实例列表
    @NameInMap("app_services")
    @Validation(required = true)
    public java.util.List<AppServiceInfo> appServices;

    public static UnitInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        UnitInstanceInfo self = new UnitInstanceInfo();
        return TeaModel.build(map, self);
    }

    public UnitInstanceInfo setAppServices(java.util.List<AppServiceInfo> appServices) {
        this.appServices = appServices;
        return this;
    }
    public java.util.List<AppServiceInfo> getAppServices() {
        return this.appServices;
    }

}
