// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f0f16236ed254bd499e3fe0f9600e0d5.models;

import com.aliyun.tea.*;

public class QueryMaxCopilotFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户问题
    @NameInMap("question")
    @Validation(required = true)
    public String question;

    // 报告类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 文件id列表
    @NameInMap("file_ids")
    public java.util.List<String> fileIds;

    // 网页地址列表
    @NameInMap("urls")
    public java.util.List<String> urls;

    public static QueryMaxCopilotFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMaxCopilotFileRequest self = new QueryMaxCopilotFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryMaxCopilotFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMaxCopilotFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMaxCopilotFileRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryMaxCopilotFileRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public QueryMaxCopilotFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public QueryMaxCopilotFileRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public QueryMaxCopilotFileRequest setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

}
