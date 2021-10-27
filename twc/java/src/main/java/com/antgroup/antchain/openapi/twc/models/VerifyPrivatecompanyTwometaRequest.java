// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyPrivatecompanyTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 私有云实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 企业信息
    @NameInMap("company_two_meta_info")
    @Validation(required = true)
    public CompanyTwoMetaInfo companyTwoMetaInfo;

    public static VerifyPrivatecompanyTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPrivatecompanyTwometaRequest self = new VerifyPrivatecompanyTwometaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPrivatecompanyTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyPrivatecompanyTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyPrivatecompanyTwometaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyPrivatecompanyTwometaRequest setCompanyTwoMetaInfo(CompanyTwoMetaInfo companyTwoMetaInfo) {
        this.companyTwoMetaInfo = companyTwoMetaInfo;
        return this;
    }
    public CompanyTwoMetaInfo getCompanyTwoMetaInfo() {
        return this.companyTwoMetaInfo;
    }

}
