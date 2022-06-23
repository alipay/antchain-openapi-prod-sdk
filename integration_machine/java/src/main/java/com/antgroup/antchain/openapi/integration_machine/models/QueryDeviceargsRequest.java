// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class QueryDeviceargsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SN
    @NameInMap("serial_no")
    @Validation(required = true)
    public String serialNo;

    // 设备厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    public static QueryDeviceargsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceargsRequest self = new QueryDeviceargsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceargsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceargsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceargsRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public QueryDeviceargsRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
