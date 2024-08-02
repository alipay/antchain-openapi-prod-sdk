// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class BatchqueryScenedataTaskresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_no")
    @Validation(required = true, maxLength = 64)
    public String batchNo;

    // 游标，上一次的最后一条
    @NameInMap("cursor")
    @Validation(maxLength = 256)
    public String cursor;

    // 本次同步数量
    @NameInMap("sync_num")
    @Validation(maximum = 100)
    public Long syncNum;

    public static BatchqueryScenedataTaskresultRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryScenedataTaskresultRequest self = new BatchqueryScenedataTaskresultRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryScenedataTaskresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryScenedataTaskresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryScenedataTaskresultRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public BatchqueryScenedataTaskresultRequest setCursor(String cursor) {
        this.cursor = cursor;
        return this;
    }
    public String getCursor() {
        return this.cursor;
    }

    public BatchqueryScenedataTaskresultRequest setSyncNum(Long syncNum) {
        this.syncNum = syncNum;
        return this;
    }
    public Long getSyncNum() {
        return this.syncNum;
    }

}
