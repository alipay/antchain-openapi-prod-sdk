// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyDatatransmitstartRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发送者的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 数字资产的owner did
    @NameInMap("owner_did")
    public String ownerDid;

    // 具体调用Tapp的参数数组，json格式
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 数据处理tapp id
    @NameInMap("process_tapp_id")
    public String processTappId;

    // 处理tapp的function
    @NameInMap("process_tapp_method")
    public String processTappMethod;

    // 读取数据的tapp id
    @NameInMap("read_tapp_id")
    @Validation(required = true)
    public String readTappId;

    // 读取数据的Tapp中对应的Method
    @NameInMap("read_tapp_method")
    @Validation(required = true)
    public String readTappMethod;

    // 数据资产传输目标did
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 发起流程的唯一号，系统将更加这个唯一号保持幂等
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    public static StartMydidcommunAgencyDatatransmitstartRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyDatatransmitstartRequest self = new StartMydidcommunAgencyDatatransmitstartRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setOwnerDid(String ownerDid) {
        this.ownerDid = ownerDid;
        return this;
    }
    public String getOwnerDid() {
        return this.ownerDid;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setProcessTappId(String processTappId) {
        this.processTappId = processTappId;
        return this;
    }
    public String getProcessTappId() {
        return this.processTappId;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setProcessTappMethod(String processTappMethod) {
        this.processTappMethod = processTappMethod;
        return this;
    }
    public String getProcessTappMethod() {
        return this.processTappMethod;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setReadTappId(String readTappId) {
        this.readTappId = readTappId;
        return this;
    }
    public String getReadTappId() {
        return this.readTappId;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setReadTappMethod(String readTappMethod) {
        this.readTappMethod = readTappMethod;
        return this;
    }
    public String getReadTappMethod() {
        return this.readTappMethod;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

    public StartMydidcommunAgencyDatatransmitstartRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

}
