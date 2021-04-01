// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunTaskGetdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要获取的数据ID
    @NameInMap("data_did")
    @Validation(required = true)
    public String dataDid;

    // 申请获得的数据的用户DID，将用该DID公钥加密原始数据
    @NameInMap("target_did")
    @Validation(required = true)
    public String targetDid;

    // 授权数据申请方读取该数据的VC
    @NameInMap("vc")
    @Validation(required = true)
    public String vc;

    // 请求发起人的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static StartMydidcommunTaskGetdataRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunTaskGetdataRequest self = new StartMydidcommunTaskGetdataRequest();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunTaskGetdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartMydidcommunTaskGetdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartMydidcommunTaskGetdataRequest setDataDid(String dataDid) {
        this.dataDid = dataDid;
        return this;
    }
    public String getDataDid() {
        return this.dataDid;
    }

    public StartMydidcommunTaskGetdataRequest setTargetDid(String targetDid) {
        this.targetDid = targetDid;
        return this;
    }
    public String getTargetDid() {
        return this.targetDid;
    }

    public StartMydidcommunTaskGetdataRequest setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

    public StartMydidcommunTaskGetdataRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
