// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tftus.models;

import com.aliyun.tea.*;

public class UploadSpdbWtpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求幂等字段
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 上传对象名称
    @NameInMap("upload_name")
    @Validation(required = true)
    public String uploadName;

    // 上传信息内容
    @NameInMap("upload_msg")
    @Validation(required = true)
    public String uploadMsg;

    public static UploadSpdbWtpRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSpdbWtpRequest self = new UploadSpdbWtpRequest();
        return TeaModel.build(map, self);
    }

    public UploadSpdbWtpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSpdbWtpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSpdbWtpRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadSpdbWtpRequest setUploadName(String uploadName) {
        this.uploadName = uploadName;
        return this;
    }
    public String getUploadName() {
        return this.uploadName;
    }

    public UploadSpdbWtpRequest setUploadMsg(String uploadMsg) {
        this.uploadMsg = uploadMsg;
        return this;
    }
    public String getUploadMsg() {
        return this.uploadMsg;
    }

}
