// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FederatedDeploymentStatusTopologies extends TeaModel {
    // message
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // time
    @NameInMap("time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String time;

    public static FederatedDeploymentStatusTopologies build(java.util.Map<String, ?> map) throws Exception {
        FederatedDeploymentStatusTopologies self = new FederatedDeploymentStatusTopologies();
        return TeaModel.build(map, self);
    }

    public FederatedDeploymentStatusTopologies setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FederatedDeploymentStatusTopologies setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FederatedDeploymentStatusTopologies setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public FederatedDeploymentStatusTopologies setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
