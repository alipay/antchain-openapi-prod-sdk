// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidAgentServicetypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 枚举类型，描述访问服务的方式
    @NameInMap("access_mode")
    public String accessMode;

    // 对服务的文字描述，<1000个字符
    @NameInMap("description")
    public String description;

    // 服务类型创建者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // {
    //   "item1":"",
    //   "item2":"",
    //   ...
    // }
    @NameInMap("service_input")
    public String serviceInput;

    // {
    //    "item1":""
    //    "item2":""
    //    ...
    // }
    @NameInMap("service_output")
    public String serviceOutput;

    // 自定义服务类型，字符数16～32个
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static StartDidAgentServicetypeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDidAgentServicetypeRequest self = new StartDidAgentServicetypeRequest();
        return TeaModel.build(map, self);
    }

    public StartDidAgentServicetypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDidAgentServicetypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDidAgentServicetypeRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public StartDidAgentServicetypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartDidAgentServicetypeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartDidAgentServicetypeRequest setServiceInput(String serviceInput) {
        this.serviceInput = serviceInput;
        return this;
    }
    public String getServiceInput() {
        return this.serviceInput;
    }

    public StartDidAgentServicetypeRequest setServiceOutput(String serviceOutput) {
        this.serviceOutput = serviceOutput;
        return this;
    }
    public String getServiceOutput() {
        return this.serviceOutput;
    }

    public StartDidAgentServicetypeRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public StartDidAgentServicetypeRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
