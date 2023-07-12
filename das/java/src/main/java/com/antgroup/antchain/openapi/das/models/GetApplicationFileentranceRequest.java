// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetApplicationFileentranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集ID
    @NameInMap("dataset_id")
    @Validation(required = true)
    public String datasetId;

    // 用户是否授权
    @NameInMap("user_authed")
    public Boolean userAuthed;

    // 授权文件ID
    @NameInMap("file_index")
    public String fileIndex;

    public static GetApplicationFileentranceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationFileentranceRequest self = new GetApplicationFileentranceRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationFileentranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetApplicationFileentranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetApplicationFileentranceRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public GetApplicationFileentranceRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public GetApplicationFileentranceRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

}
