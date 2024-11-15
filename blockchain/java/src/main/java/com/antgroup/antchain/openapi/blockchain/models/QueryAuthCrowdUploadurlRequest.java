// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCrowdUploadurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 问件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 业务类型：survey_1（排除问卷三个月人群）；survey_2（排除问卷六个月人群）；recruit_1（排除招募三个月人群）recruit_2（排除招募任务六个月人群）
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    public static QueryAuthCrowdUploadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCrowdUploadurlRequest self = new QueryAuthCrowdUploadurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthCrowdUploadurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthCrowdUploadurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthCrowdUploadurlRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public QueryAuthCrowdUploadurlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
