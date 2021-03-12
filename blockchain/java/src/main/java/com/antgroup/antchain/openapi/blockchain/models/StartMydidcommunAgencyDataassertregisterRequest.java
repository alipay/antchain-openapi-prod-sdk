// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyDataassertregisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批流程节点
    @NameInMap("approvers")
    @Validation(required = true)
    public java.util.List<String> approvers;

    // 数据资产的Owner
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 数据资产id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static StartMydidcommunAgencyDataassertregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyDataassertregisterRequest self = new StartMydidcommunAgencyDataassertregisterRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyDataassertregisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyDataassertregisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyDataassertregisterRequest setApprovers(java.util.List<String> approvers) {
        this.approvers = approvers;
        return this;
    }
    public java.util.List<String> getApprovers() {
        return this.approvers;
    }

    public StartMydidcommunAgencyDataassertregisterRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyDataassertregisterRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
