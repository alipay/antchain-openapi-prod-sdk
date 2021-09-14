// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VerifyDasAuthresultRequest extends TeaModel {
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

    // 授权企业统一社会信用码
    @NameInMap("auth_person_enterprise_credit_num")
    @Validation(required = true)
    public String authPersonEnterpriseCreditNum;

    public static VerifyDasAuthresultRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDasAuthresultRequest self = new VerifyDasAuthresultRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDasAuthresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDasAuthresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDasAuthresultRequest setDataSourceBizUuids(java.util.List<String> dataSourceBizUuids) {
        this.dataSourceBizUuids = dataSourceBizUuids;
        return this;
    }
    public java.util.List<String> getDataSourceBizUuids() {
        return this.dataSourceBizUuids;
    }

    public VerifyDasAuthresultRequest setBeAuthedPersonAppName(String beAuthedPersonAppName) {
        this.beAuthedPersonAppName = beAuthedPersonAppName;
        return this;
    }
    public String getBeAuthedPersonAppName() {
        return this.beAuthedPersonAppName;
    }

    public VerifyDasAuthresultRequest setAuthPersonEnterpriseCreditNum(String authPersonEnterpriseCreditNum) {
        this.authPersonEnterpriseCreditNum = authPersonEnterpriseCreditNum;
        return this;
    }
    public String getAuthPersonEnterpriseCreditNum() {
        return this.authPersonEnterpriseCreditNum;
    }

}
