// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CheckSecurityRdsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 输入大字段，具体见接入文档
    @NameInMap("rds_content")
    @Validation(required = true)
    public String rdsContent;

    public static CheckSecurityRdsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityRdsRequest self = new CheckSecurityRdsRequest();
        return TeaModel.build(map, self);
    }

    public CheckSecurityRdsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSecurityRdsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSecurityRdsRequest setRdsContent(String rdsContent) {
        this.rdsContent = rdsContent;
        return this;
    }
    public String getRdsContent() {
        return this.rdsContent;
    }

}
