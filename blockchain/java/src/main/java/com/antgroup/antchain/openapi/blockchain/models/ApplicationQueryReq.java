// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationQueryReq extends TeaModel {
    // 应用程序ID
    /**
     * <strong>example:</strong>
     * <p>app20230725115808679d4f</p>
     */
    @NameInMap("application_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String applicationId;

    public static ApplicationQueryReq build(java.util.Map<String, ?> map) throws Exception {
        ApplicationQueryReq self = new ApplicationQueryReq();
        return TeaModel.build(map, self);
    }

    public ApplicationQueryReq setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
