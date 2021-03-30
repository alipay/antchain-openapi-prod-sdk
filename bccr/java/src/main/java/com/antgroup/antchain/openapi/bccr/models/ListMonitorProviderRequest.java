// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ListMonitorProviderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需监测文件类型
    @NameInMap("monitor_types")
    @Validation(required = true)
    public java.util.List<MonitorType> monitorTypes;

    public static ListMonitorProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorProviderRequest self = new ListMonitorProviderRequest();
        return TeaModel.build(map, self);
    }

    public ListMonitorProviderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListMonitorProviderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListMonitorProviderRequest setMonitorTypes(java.util.List<MonitorType> monitorTypes) {
        this.monitorTypes = monitorTypes;
        return this;
    }
    public java.util.List<MonitorType> getMonitorTypes() {
        return this.monitorTypes;
    }

}
