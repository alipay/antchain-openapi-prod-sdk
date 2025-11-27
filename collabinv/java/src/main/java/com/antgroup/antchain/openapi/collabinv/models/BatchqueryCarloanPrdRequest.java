// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class BatchqueryCarloanPrdRequest extends TeaModel {
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

    public static BatchqueryCarloanPrdRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryCarloanPrdRequest self = new BatchqueryCarloanPrdRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryCarloanPrdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryCarloanPrdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryCarloanPrdRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public BatchqueryCarloanPrdRequest setDataNum(String dataNum) {
        this.dataNum = dataNum;
        return this;
    }
    public String getDataNum() {
        return this.dataNum;
    }

}
