// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddPdcpAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权记录的唯一标记
    @NameInMap("authentication_no")
    @Validation(required = true)
    public String authenticationNo;

    // 授权方did
    @NameInMap("authorizer_did")
    @Validation(required = true)
    public String authorizerDid;

    // 被授权方did
    @NameInMap("authorized_did")
    @Validation(required = true)
    public String authorizedDid;

    // 数据协作类型
    @NameInMap("data_transfer_type")
    @Validation(required = true)
    public String dataTransferType;

    // 授权详情
    @NameInMap("authentication_detail")
    @Validation(required = true)
    public String authenticationDetail;

    // 授权状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static AddPdcpAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPdcpAuthRequest self = new AddPdcpAuthRequest();
        return TeaModel.build(map, self);
    }

    public AddPdcpAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddPdcpAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddPdcpAuthRequest setAuthenticationNo(String authenticationNo) {
        this.authenticationNo = authenticationNo;
        return this;
    }
    public String getAuthenticationNo() {
        return this.authenticationNo;
    }

    public AddPdcpAuthRequest setAuthorizerDid(String authorizerDid) {
        this.authorizerDid = authorizerDid;
        return this;
    }
    public String getAuthorizerDid() {
        return this.authorizerDid;
    }

    public AddPdcpAuthRequest setAuthorizedDid(String authorizedDid) {
        this.authorizedDid = authorizedDid;
        return this;
    }
    public String getAuthorizedDid() {
        return this.authorizedDid;
    }

    public AddPdcpAuthRequest setDataTransferType(String dataTransferType) {
        this.dataTransferType = dataTransferType;
        return this;
    }
    public String getDataTransferType() {
        return this.dataTransferType;
    }

    public AddPdcpAuthRequest setAuthenticationDetail(String authenticationDetail) {
        this.authenticationDetail = authenticationDetail;
        return this;
    }
    public String getAuthenticationDetail() {
        return this.authenticationDetail;
    }

    public AddPdcpAuthRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
