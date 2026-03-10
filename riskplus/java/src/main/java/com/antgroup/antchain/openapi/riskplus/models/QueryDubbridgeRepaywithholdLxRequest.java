// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepaywithholdLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代扣请求流水号
    @NameInMap("withhold_serial_no")
    @Validation(required = true)
    public String withholdSerialNo;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    public static QueryDubbridgeRepaywithholdLxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepaywithholdLxRequest self = new QueryDubbridgeRepaywithholdLxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepaywithholdLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDubbridgeRepaywithholdLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDubbridgeRepaywithholdLxRequest setWithholdSerialNo(String withholdSerialNo) {
        this.withholdSerialNo = withholdSerialNo;
        return this;
    }
    public String getWithholdSerialNo() {
        return this.withholdSerialNo;
    }

    public QueryDubbridgeRepaywithholdLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

}
