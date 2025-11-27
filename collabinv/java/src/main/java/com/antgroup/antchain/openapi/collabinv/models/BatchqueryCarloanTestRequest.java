// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class BatchqueryCarloanTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 日期
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 查询条数
    @NameInMap("data_num")
    @Validation(required = true)
    public String dataNum;

    public static BatchqueryCarloanTestRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCarloanTestRequest self = new BatchqueryCarloanTestRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryCarloanTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryCarloanTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryCarloanTestRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public BatchqueryCarloanTestRequest setDataNum(String dataNum) {
        this.dataNum = dataNum;
        return this;
    }
    public String getDataNum() {
        return this.dataNum;
    }

}
