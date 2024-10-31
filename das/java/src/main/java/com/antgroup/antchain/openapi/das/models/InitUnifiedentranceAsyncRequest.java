// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class InitUnifiedentranceAsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权协议索引
    @NameInMap("file_index")
    public String fileIndex;

    // 整个需求的入参，map json
    @NameInMap("params")
    @Validation(required = true)
    public String params;

    // 是否授权
    @NameInMap("user_authed")
    public String userAuthed;

    // 数据集服务id
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    public static InitUnifiedentranceAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        InitUnifiedentranceAsyncRequest self = new InitUnifiedentranceAsyncRequest();
        return TeaModel.build(map, self);
    }

    public InitUnifiedentranceAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitUnifiedentranceAsyncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitUnifiedentranceAsyncRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public InitUnifiedentranceAsyncRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public InitUnifiedentranceAsyncRequest setUserAuthed(String userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public String getUserAuthed() {
        return this.userAuthed;
    }

    public InitUnifiedentranceAsyncRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

}
