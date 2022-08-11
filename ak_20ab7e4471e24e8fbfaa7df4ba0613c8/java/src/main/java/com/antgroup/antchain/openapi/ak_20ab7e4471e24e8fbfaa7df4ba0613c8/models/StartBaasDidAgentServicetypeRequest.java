// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class StartBaasDidAgentServicetypeRequest extends TeaModel {
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

    public static StartBaasDidAgentServicetypeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBaasDidAgentServicetypeRequest self = new StartBaasDidAgentServicetypeRequest();
        return TeaModel.build(map, self);
    }

    public StartBaasDidAgentServicetypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartBaasDidAgentServicetypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartBaasDidAgentServicetypeRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public StartBaasDidAgentServicetypeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StartBaasDidAgentServicetypeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartBaasDidAgentServicetypeRequest setServiceInput(String serviceInput) {
        this.serviceInput = serviceInput;
        return this;
    }
    public String getServiceInput() {
        return this.serviceInput;
    }

    public StartBaasDidAgentServicetypeRequest setServiceOutput(String serviceOutput) {
        this.serviceOutput = serviceOutput;
        return this;
    }
    public String getServiceOutput() {
        return this.serviceOutput;
    }

    public StartBaasDidAgentServicetypeRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public StartBaasDidAgentServicetypeRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
