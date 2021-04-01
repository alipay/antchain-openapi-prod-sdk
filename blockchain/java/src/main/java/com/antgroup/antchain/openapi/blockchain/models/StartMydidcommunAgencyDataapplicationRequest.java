// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyDataapplicationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 申请的数据ID，该字段由两部分组成ownerdid#service-id(did doc中表示对应数据资产的serviceid)
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 主动发起申请数据流程的请求者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 申请数据时增加的说明，比如说明本次申请数据的原因，等描述
    @NameInMap("message")
    public String message;

    // 申请者在申请数据的时候，申明自己将使用那种方式处理申请到的数据。如果该字段为0表示要得到原始数据。
    // 该字段形式与dataId类似
    @NameInMap("process_data_id")
    public String processDataId;

    // 发起申请的申请id，系统将基于该id保持幂等
    @NameInMap("process_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String processId;

    // 数据申请到之后最终发送给谁的did
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    public static StartMydidcommunAgencyDataapplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyDataapplicationRequest self = new StartMydidcommunAgencyDataapplicationRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyDataapplicationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunAgencyDataapplicationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunAgencyDataapplicationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public StartMydidcommunAgencyDataapplicationRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartMydidcommunAgencyDataapplicationRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartMydidcommunAgencyDataapplicationRequest setProcessDataId(String processDataId) {
        this.processDataId = processDataId;
        return this;
    }
    public String getProcessDataId() {
        return this.processDataId;
    }

    public StartMydidcommunAgencyDataapplicationRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public StartMydidcommunAgencyDataapplicationRequest setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

}
