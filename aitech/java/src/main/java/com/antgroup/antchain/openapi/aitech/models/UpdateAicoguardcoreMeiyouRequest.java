// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class UpdateAicoguardcoreMeiyouRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 更新信息
    @NameInMap("result_info")
    @Validation(required = true)
    public String resultInfo;

    public static UpdateAicoguardcoreMeiyouRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAicoguardcoreMeiyouRequest self = new UpdateAicoguardcoreMeiyouRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAicoguardcoreMeiyouRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAicoguardcoreMeiyouRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAicoguardcoreMeiyouRequest setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }
    public String getResultInfo() {
        return this.resultInfo;
    }

}
