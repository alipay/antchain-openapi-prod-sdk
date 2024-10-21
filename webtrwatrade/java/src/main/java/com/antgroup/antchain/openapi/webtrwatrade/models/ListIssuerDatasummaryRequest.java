// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerDatasummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 币种（目前支持USD、HKD）
    @NameInMap("currency")
    public String currency;

    // 开始时间(格式：YYYY-MM-DD)
    @NameInMap("begin_date")
    public String beginDate;

    // 截止时间(格式：YYYY-MM-DD)
    @NameInMap("end_date")
    public String endDate;

    public static ListIssuerDatasummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerDatasummaryRequest self = new ListIssuerDatasummaryRequest();
        return TeaModel.build(map, self);
    }

    public ListIssuerDatasummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIssuerDatasummaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIssuerDatasummaryRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ListIssuerDatasummaryRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public ListIssuerDatasummaryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
