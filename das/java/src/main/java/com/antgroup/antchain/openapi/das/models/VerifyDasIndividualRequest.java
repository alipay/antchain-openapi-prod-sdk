// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VerifyDasIndividualRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权实例biz_uuid
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

    // 授权人个人信息
    @NameInMap("auth_person_individual_info")
    @Validation(required = true)
    public AuthPersonIndividualInfo authPersonIndividualInfo;

    // 需要访问的数据源信息列表
    @NameInMap("data_source_info")
    @Validation(required = true)
    public java.util.List<DataSource> dataSourceInfo;

    public static VerifyDasIndividualRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDasIndividualRequest self = new VerifyDasIndividualRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDasIndividualRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDasIndividualRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDasIndividualRequest setAuthInstanceBizUuid(String authInstanceBizUuid) {
        this.authInstanceBizUuid = authInstanceBizUuid;
        return this;
    }
    public String getAuthInstanceBizUuid() {
        return this.authInstanceBizUuid;
    }

    public VerifyDasIndividualRequest setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

    public VerifyDasIndividualRequest setBeAuthedPersonInfo(BeAuthedPersonInfo beAuthedPersonInfo) {
        this.beAuthedPersonInfo = beAuthedPersonInfo;
        return this;
    }
    public BeAuthedPersonInfo getBeAuthedPersonInfo() {
        return this.beAuthedPersonInfo;
    }

    public VerifyDasIndividualRequest setAuthPersonIndividualInfo(AuthPersonIndividualInfo authPersonIndividualInfo) {
        this.authPersonIndividualInfo = authPersonIndividualInfo;
        return this;
    }
    public AuthPersonIndividualInfo getAuthPersonIndividualInfo() {
        return this.authPersonIndividualInfo;
    }

    public VerifyDasIndividualRequest setDataSourceInfo(java.util.List<DataSource> dataSourceInfo) {
        this.dataSourceInfo = dataSourceInfo;
        return this;
    }
    public java.util.List<DataSource> getDataSourceInfo() {
        return this.dataSourceInfo;
    }

}
