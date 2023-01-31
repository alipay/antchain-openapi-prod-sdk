// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class UpdatePdcpAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权记录编码
    @NameInMap("authentication_no")
    @Validation(required = true)
    public String authenticationNo;

    // 授权状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static UpdatePdcpAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdcpAuthRequest self = new UpdatePdcpAuthRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePdcpAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdatePdcpAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdatePdcpAuthRequest setAuthenticationNo(String authenticationNo) {
        this.authenticationNo = authenticationNo;
        return this;
    }
    public String getAuthenticationNo() {
        return this.authenticationNo;
    }

    public UpdatePdcpAuthRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
