// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthDasAuthresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源biz_uuid列表
    @NameInMap("data_source_biz_uuids")
    @Validation(required = true)
    public java.util.List<String> dataSourceBizUuids;

    // 被授权企业接入应用名称
    @NameInMap("be_authed_person_app_name")
    @Validation(required = true)
    public String beAuthedPersonAppName;

    // 授权企业信息
    @NameInMap("auth_person_enterprise_info")
    public AuthPersonEnterpriseInfo authPersonEnterpriseInfo;

    // 授权人信息
    @NameInMap("auth_person_individual_info")
    public AuthPersonIndividualInfo authPersonIndividualInfo;

    public static AuthDasAuthresultRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthDasAuthresultRequest self = new AuthDasAuthresultRequest();
        return TeaModel.build(map, self);
    }

    public AuthDasAuthresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthDasAuthresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthDasAuthresultRequest setDataSourceBizUuids(java.util.List<String> dataSourceBizUuids) {
        this.dataSourceBizUuids = dataSourceBizUuids;
        return this;
    }
    public java.util.List<String> getDataSourceBizUuids() {
        return this.dataSourceBizUuids;
    }

    public AuthDasAuthresultRequest setBeAuthedPersonAppName(String beAuthedPersonAppName) {
        this.beAuthedPersonAppName = beAuthedPersonAppName;
        return this;
    }
    public String getBeAuthedPersonAppName() {
        return this.beAuthedPersonAppName;
    }

    public AuthDasAuthresultRequest setAuthPersonEnterpriseInfo(AuthPersonEnterpriseInfo authPersonEnterpriseInfo) {
        this.authPersonEnterpriseInfo = authPersonEnterpriseInfo;
        return this;
    }
    public AuthPersonEnterpriseInfo getAuthPersonEnterpriseInfo() {
        return this.authPersonEnterpriseInfo;
    }

    public AuthDasAuthresultRequest setAuthPersonIndividualInfo(AuthPersonIndividualInfo authPersonIndividualInfo) {
        this.authPersonIndividualInfo = authPersonIndividualInfo;
        return this;
    }
    public AuthPersonIndividualInfo getAuthPersonIndividualInfo() {
        return this.authPersonIndividualInfo;
    }

}
