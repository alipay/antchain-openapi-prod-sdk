// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ServiceWeight extends TeaModel {
    // 统一接入名称
    @NameInMap("ingress_name")
    @Validation(required = true)
    public String ingressName;

    // 蓝区流量权重，取值0-100
    @NameInMap("blue")
    @Validation(required = true)
    public Long blue;

    // 绿区流量权重，取值0-100
    @NameInMap("green")
    @Validation(required = true)
    public Long green;

    // 状态：succeed、updating、fail
    @NameInMap("status")
    public String status;

    // 错误信息
    @NameInMap("message")
    public String message;

    public static ServiceWeight build(java.util.Map<String, ?> map) throws Exception {
        ServiceWeight self = new ServiceWeight();
        return TeaModel.build(map, self);
    }

    public ServiceWeight setIngressName(String ingressName) {
        this.ingressName = ingressName;
        return this;
    }
    public String getIngressName() {
        return this.ingressName;
    }

    public ServiceWeight setBlue(Long blue) {
        this.blue = blue;
        return this;
    }
    public Long getBlue() {
        return this.blue;
    }

    public ServiceWeight setGreen(Long green) {
        this.green = green;
        return this;
    }
    public Long getGreen() {
        return this.green;
    }

    public ServiceWeight setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ServiceWeight setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
