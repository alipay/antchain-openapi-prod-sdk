// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryPayresultfileurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对账日期
    @NameInMap("bill_date")
    @Validation(required = true)
    public String billDate;

    // 交易类型
    @NameInMap("bill_type")
    @Validation(required = true)
    public String billType;

    public static QueryPayresultfileurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPayresultfileurlRequest self = new QueryPayresultfileurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryPayresultfileurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPayresultfileurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPayresultfileurlRequest setBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }
    public String getBillDate() {
        return this.billDate;
    }

    public QueryPayresultfileurlRequest setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

}
