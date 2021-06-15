// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetJusticeGetuploadfilepathRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件名称（最长128个字符）
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
    @NameInMap("client_token")
    public String clientToken;

    public static GetJusticeGetuploadfilepathRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJusticeGetuploadfilepathRequest self = new GetJusticeGetuploadfilepathRequest();
        return TeaModel.build(map, self);
    }

    public GetJusticeGetuploadfilepathRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetJusticeGetuploadfilepathRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetJusticeGetuploadfilepathRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetJusticeGetuploadfilepathRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
