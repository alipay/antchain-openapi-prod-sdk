// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ServiceStatus extends TeaModel {
    // 服务名称
    @NameInMap("service")
    @Validation(required = true)
    public String service;

    // 服务的开通与关闭状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static ServiceStatus build(java.util.Map<String, ?> map) throws Exception {
        ServiceStatus self = new ServiceStatus();
        return TeaModel.build(map, self);
    }

    public ServiceStatus setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ServiceStatus setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
