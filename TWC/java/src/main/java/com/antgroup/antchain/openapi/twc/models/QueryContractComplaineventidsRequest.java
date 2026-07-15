// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractComplaineventidsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客诉单创建开始日期
    @NameInMap("complain_start_date")
    @Validation(required = true)
    public String complainStartDate;

    // 客诉单创建开始日期
    @NameInMap("complain_end_date")
    @Validation(required = true)
    public String complainEndDate;

    public static QueryContractComplaineventidsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryContractComplaineventidsRequest self = new QueryContractComplaineventidsRequest();
        return TeaModel.build(map, self);
    }

    public QueryContractComplaineventidsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryContractComplaineventidsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryContractComplaineventidsRequest setComplainStartDate(String complainStartDate) {
        this.complainStartDate = complainStartDate;
        return this;
    }
    public String getComplainStartDate() {
        return this.complainStartDate;
    }

    public QueryContractComplaineventidsRequest setComplainEndDate(String complainEndDate) {
        this.complainEndDate = complainEndDate;
        return this;
    }
    public String getComplainEndDate() {
        return this.complainEndDate;
    }

}
