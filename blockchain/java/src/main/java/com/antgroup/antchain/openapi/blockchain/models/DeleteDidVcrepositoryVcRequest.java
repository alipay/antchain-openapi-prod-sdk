// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteDidVcrepositoryVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要删除的vc owner
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 带删除的VC列表
    @NameInMap("vc_list")
    @Validation(required = true)
    public java.util.List<String> vcList;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static DeleteDidVcrepositoryVcRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDidVcrepositoryVcRequest self = new DeleteDidVcrepositoryVcRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDidVcrepositoryVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDidVcrepositoryVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDidVcrepositoryVcRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public DeleteDidVcrepositoryVcRequest setVcList(java.util.List<String> vcList) {
        this.vcList = vcList;
        return this;
    }
    public java.util.List<String> getVcList() {
        return this.vcList;
    }

    public DeleteDidVcrepositoryVcRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
