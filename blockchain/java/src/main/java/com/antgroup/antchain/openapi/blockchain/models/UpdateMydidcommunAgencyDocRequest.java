// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateMydidcommunAgencyDocRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻时候生成的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 对参数进行构造签名
    @NameInMap("operation_sign")
    @Validation(required = true)
    public String operationSign;

    // doc当前版本
    @NameInMap("pre_version")
    @Validation(required = true)
    public Long preVersion;

    // doc中服务信息列表
    @NameInMap("service_list")
    @Validation(required = true)
    public java.util.List<DisServicesInfo> serviceList;

    public static UpdateMydidcommunAgencyDocRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMydidcommunAgencyDocRequest self = new UpdateMydidcommunAgencyDocRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMydidcommunAgencyDocRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMydidcommunAgencyDocRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMydidcommunAgencyDocRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateMydidcommunAgencyDocRequest setOperationSign(String operationSign) {
        this.operationSign = operationSign;
        return this;
    }
    public String getOperationSign() {
        return this.operationSign;
    }

    public UpdateMydidcommunAgencyDocRequest setPreVersion(Long preVersion) {
        this.preVersion = preVersion;
        return this;
    }
    public Long getPreVersion() {
        return this.preVersion;
    }

    public UpdateMydidcommunAgencyDocRequest setServiceList(java.util.List<DisServicesInfo> serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public java.util.List<DisServicesInfo> getServiceList() {
        return this.serviceList;
    }

}
