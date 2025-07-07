// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationCreateResp extends TeaModel {
    // 应用标识
    /**
     * <strong>example:</strong>
     * <p>app20230725115808679d4f</p>
     */
    @NameInMap("application_id")
    public String applicationId;

    public static ApplicationCreateResp build(java.util.Map<String, ?> map) throws Exception {
        ApplicationCreateResp self = new ApplicationCreateResp();
        return TeaModel.build(map, self);
    }

    public ApplicationCreateResp setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
