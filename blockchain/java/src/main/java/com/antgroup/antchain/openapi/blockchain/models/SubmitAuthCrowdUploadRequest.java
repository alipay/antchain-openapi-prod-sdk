// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SubmitAuthCrowdUploadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传文件地址
    @NameInMap("upload_url")
    @Validation(required = true)
    public String uploadUrl;

    // 人群类型 （1，三个月的问卷人群，2，六个月的问卷人群，3，三个月的招募人群，4，六个月的招募人群）
    @NameInMap("crowd_type")
    @Validation(required = true)
    public String crowdType;

    // 备注信息
    @NameInMap("remark")
    public String remark;

    public static SubmitAuthCrowdUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuthCrowdUploadRequest self = new SubmitAuthCrowdUploadRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuthCrowdUploadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuthCrowdUploadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuthCrowdUploadRequest setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public SubmitAuthCrowdUploadRequest setCrowdType(String crowdType) {
        this.crowdType = crowdType;
        return this;
    }
    public String getCrowdType() {
        return this.crowdType;
    }

    public SubmitAuthCrowdUploadRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
