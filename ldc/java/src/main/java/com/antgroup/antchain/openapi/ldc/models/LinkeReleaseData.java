// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LinkeReleaseData extends TeaModel {
    // Linke release ID
    @NameInMap("release_id")
    @Validation(required = true)
    public String releaseId;

    public static LinkeReleaseData build(java.util.Map<String, ?> map) throws Exception {
        LinkeReleaseData self = new LinkeReleaseData();
        return TeaModel.build(map, self);
    }

    public LinkeReleaseData setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
