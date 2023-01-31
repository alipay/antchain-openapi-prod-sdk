// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AuthenticationInfoVO extends TeaModel {
    // 授权记录编码
    @NameInMap("authentication_no")
    @Validation(required = true)
    public String authenticationNo;

    // 收取方did
    @NameInMap("authorizer_did")
    @Validation(required = true)
    public String authorizerDid;

    // 授权方名称
    @NameInMap("authorizer_name")
    @Validation(required = true)
    public String authorizerName;

    // 被授权方did
    @NameInMap("authorized_did")
    @Validation(required = true)
    public String authorizedDid;

    // 被授权方名称
    @NameInMap("authorized_name")
    @Validation(required = true)
    public String authorizedName;

    // 数据协作类型
    @NameInMap("data_transfer_type")
    @Validation(required = true)
    public String dataTransferType;

    // 授权详情
    @NameInMap("authentication_deetail")
    @Validation(required = true)
    public String authenticationDeetail;

    // 授权状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static AuthenticationInfoVO build(java.util.Map<String, ?> map) throws Exception {
        AuthenticationInfoVO self = new AuthenticationInfoVO();
        return TeaModel.build(map, self);
    }

    public AuthenticationInfoVO setAuthenticationNo(String authenticationNo) {
        this.authenticationNo = authenticationNo;
        return this;
    }
    public String getAuthenticationNo() {
        return this.authenticationNo;
    }

    public AuthenticationInfoVO setAuthorizerDid(String authorizerDid) {
        this.authorizerDid = authorizerDid;
        return this;
    }
    public String getAuthorizerDid() {
        return this.authorizerDid;
    }

    public AuthenticationInfoVO setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
        return this;
    }
    public String getAuthorizerName() {
        return this.authorizerName;
    }

    public AuthenticationInfoVO setAuthorizedDid(String authorizedDid) {
        this.authorizedDid = authorizedDid;
        return this;
    }
    public String getAuthorizedDid() {
        return this.authorizedDid;
    }

    public AuthenticationInfoVO setAuthorizedName(String authorizedName) {
        this.authorizedName = authorizedName;
        return this;
    }
    public String getAuthorizedName() {
        return this.authorizedName;
    }

    public AuthenticationInfoVO setDataTransferType(String dataTransferType) {
        this.dataTransferType = dataTransferType;
        return this;
    }
    public String getDataTransferType() {
        return this.dataTransferType;
    }

    public AuthenticationInfoVO setAuthenticationDeetail(String authenticationDeetail) {
        this.authenticationDeetail = authenticationDeetail;
        return this;
    }
    public String getAuthenticationDeetail() {
        return this.authenticationDeetail;
    }

    public AuthenticationInfoVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
