// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class PreviewEcarOffsetdatumRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 碳普惠项目编码
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    public static PreviewEcarOffsetdatumRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewEcarOffsetdatumRequest self = new PreviewEcarOffsetdatumRequest();
        return TeaModel.build(map, self);
    }

    public PreviewEcarOffsetdatumRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewEcarOffsetdatumRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewEcarOffsetdatumRequest setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

}
