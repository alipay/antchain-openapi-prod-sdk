// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6a478ae611a14c888f20ef7d446e3fd8.models;

import com.aliyun.tea.*;

public class QueryRiskplusRfcAiboundFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 获取圈客文件
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static QueryRiskplusRfcAiboundFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskplusRfcAiboundFileRequest self = new QueryRiskplusRfcAiboundFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskplusRfcAiboundFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskplusRfcAiboundFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskplusRfcAiboundFileRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
