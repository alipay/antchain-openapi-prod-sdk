// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_20ab7e4471e24e8fbfaa7df4ba0613c8.models;

import com.aliyun.tea.*;

public class UpdateBaasDidServicesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 新增的服务信息
    @NameInMap("add_sevices")
    public java.util.List<DidDocServicesInfo> addSevices;

    // 要删除的服务id列表
    @NameInMap("del_services")
    public java.util.List<String> delServices;

    // 指定要更新的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // did类型，个人|企业|设备(IOT)
    @NameInMap("did_type")
    @Validation(required = true)
    public String didType;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    // 更新后的did doc
    @NameInMap("did_doc")
    public String didDoc;

    public static UpdateBaasDidServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasDidServicesRequest self = new UpdateBaasDidServicesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasDidServicesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasDidServicesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasDidServicesRequest setAddSevices(java.util.List<DidDocServicesInfo> addSevices) {
        this.addSevices = addSevices;
        return this;
    }
    public java.util.List<DidDocServicesInfo> getAddSevices() {
        return this.addSevices;
    }

    public UpdateBaasDidServicesRequest setDelServices(java.util.List<String> delServices) {
        this.delServices = delServices;
        return this;
    }
    public java.util.List<String> getDelServices() {
        return this.delServices;
    }

    public UpdateBaasDidServicesRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateBaasDidServicesRequest setDidType(String didType) {
        this.didType = didType;
        return this;
    }
    public String getDidType() {
        return this.didType;
    }

    public UpdateBaasDidServicesRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UpdateBaasDidServicesRequest setDidDoc(String didDoc) {
        this.didDoc = didDoc;
        return this;
    }
    public String getDidDoc() {
        return this.didDoc;
    }

}
