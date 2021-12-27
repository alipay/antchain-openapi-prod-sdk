// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCompanyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公司ID集合
    @NameInMap("company_ids")
    @Validation(required = true)
    public java.util.List<String> companyIds;

    // 数据同步到公有云时间(业务上赋值当天)
    @NameInMap("update_date")
    @Validation(required = true)
    public String updateDate;

    public static QueryRtopCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCompanyRequest self = new QueryRtopCompanyRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtopCompanyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRtopCompanyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRtopCompanyRequest setCompanyIds(java.util.List<String> companyIds) {
        this.companyIds = companyIds;
        return this;
    }
    public java.util.List<String> getCompanyIds() {
        return this.companyIds;
    }

    public QueryRtopCompanyRequest setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }
    public String getUpdateDate() {
        return this.updateDate;
    }

}
