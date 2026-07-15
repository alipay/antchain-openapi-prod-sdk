// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyPrivatecompanyFourmetaRequest extends TeaModel {
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
    @NameInMap("company_four_meta_info")
    @Validation(required = true)
    public CompanyFourMetaInfo companyFourMetaInfo;

    public static VerifyPrivatecompanyFourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPrivatecompanyFourmetaRequest self = new VerifyPrivatecompanyFourmetaRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPrivatecompanyFourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyPrivatecompanyFourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyPrivatecompanyFourmetaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyPrivatecompanyFourmetaRequest setCompanyFourMetaInfo(CompanyFourMetaInfo companyFourMetaInfo) {
        this.companyFourMetaInfo = companyFourMetaInfo;
        return this;
    }
    public CompanyFourMetaInfo getCompanyFourMetaInfo() {
        return this.companyFourMetaInfo;
    }

}
