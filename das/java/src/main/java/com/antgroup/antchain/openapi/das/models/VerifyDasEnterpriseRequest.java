// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VerifyDasEnterpriseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权企业接入应用ID
    @NameInMap("auth_instance_biz_uuid")
    @Validation(required = true)
    public String authInstanceBizUuid;

    // VC完整内容
    @NameInMap("vc")
    @Validation(required = true)
    public String vc;

    // 被授权企业信息
    @NameInMap("be_authed_person_info")
    @Validation(required = true)
    public BeAuthedPersonInfo beAuthedPersonInfo;

    // 授权人企业信息
    @NameInMap("auth_person_enterprise_info")
    @Validation(required = true)
    public AuthPersonEnterpriseInfo authPersonEnterpriseInfo;

    // 需要访问的数据源信息列表
    @NameInMap("data_source_info")
    @Validation(required = true)
    public java.util.List<DataSource> dataSourceInfo;

    public static VerifyDasEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDasEnterpriseRequest self = new VerifyDasEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDasEnterpriseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDasEnterpriseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDasEnterpriseRequest setAuthInstanceBizUuid(String authInstanceBizUuid) {
        this.authInstanceBizUuid = authInstanceBizUuid;
        return this;
    }
    public String getAuthInstanceBizUuid() {
        return this.authInstanceBizUuid;
    }

    public VerifyDasEnterpriseRequest setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

    public VerifyDasEnterpriseRequest setBeAuthedPersonInfo(BeAuthedPersonInfo beAuthedPersonInfo) {
        this.beAuthedPersonInfo = beAuthedPersonInfo;
        return this;
    }
    public BeAuthedPersonInfo getBeAuthedPersonInfo() {
        return this.beAuthedPersonInfo;
    }

    public VerifyDasEnterpriseRequest setAuthPersonEnterpriseInfo(AuthPersonEnterpriseInfo authPersonEnterpriseInfo) {
        this.authPersonEnterpriseInfo = authPersonEnterpriseInfo;
        return this;
    }
    public AuthPersonEnterpriseInfo getAuthPersonEnterpriseInfo() {
        return this.authPersonEnterpriseInfo;
    }

    public VerifyDasEnterpriseRequest setDataSourceInfo(java.util.List<DataSource> dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }
    public java.util.List<DataSource> getDataSourceInfo() {
        return this.dataSourceInfo;
    }

}
