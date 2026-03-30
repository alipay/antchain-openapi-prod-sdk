// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRfcAiboundFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 获取圈客文件
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static QueryRfcAiboundFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRfcAiboundFileRequest self = new QueryRfcAiboundFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryRfcAiboundFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRfcAiboundFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRfcAiboundFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
