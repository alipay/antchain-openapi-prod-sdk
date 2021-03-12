// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyDatatransmitcontinueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用tapp时传输的参数
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 之前触发主动发送数据流程返回的taskid
    @NameInMap("task_id")
    @Validation(required = true)
    public String taskId;

    // 发送者的did声明
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static StartMydidcommunAgencyDatatransmitcontinueRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyDatatransmitcontinueRequest self = new StartMydidcommunAgencyDatatransmitcontinueRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyDatatransmitcontinueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyDatatransmitcontinueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyDatatransmitcontinueRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public StartMydidcommunAgencyDatatransmitcontinueRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartMydidcommunAgencyDatatransmitcontinueRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
