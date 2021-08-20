// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDasIndividualvcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权实例ID
    @NameInMap("auth_instance_id")
    @Validation(required = true)
    public String authInstanceId;

    // 授权人个人信息
    @NameInMap("authed_person_individual_info")
    @Validation(required = true)
    public AuthPersonIndividualInfo authedPersonIndividualInfo;

    public static GetDasIndividualvcRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDasIndividualvcRequest self = new GetDasIndividualvcRequest();
        return TeaModel.build(map, self);
    }

    public GetDasIndividualvcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDasIndividualvcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDasIndividualvcRequest setAuthInstanceId(String authInstanceId) {
        this.authInstanceId = authInstanceId;
        return this;
    }
    public String getAuthInstanceId() {
        return this.authInstanceId;
    }

    public GetDasIndividualvcRequest setAuthedPersonIndividualInfo(AuthPersonIndividualInfo authedPersonIndividualInfo) {
        this.authedPersonIndividualInfo = authedPersonIndividualInfo;
        return this;
    }
    public AuthPersonIndividualInfo getAuthedPersonIndividualInfo() {
        return this.authedPersonIndividualInfo;
    }

}
