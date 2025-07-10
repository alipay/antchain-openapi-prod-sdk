// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdpapi.models;

import com.aliyun.tea.*;

public class AppIdQualityScoresDONew extends TeaModel {
    // modelId
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("modelid")
    @Validation(required = true)
    public String modelid;

    // qualityscore
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("qualityscore")
    @Validation(required = true)
    public String qualityscore;

    public static AppIdQualityScoresDONew build(java.util.Map<String, ?> map) throws Exception {
        AppIdQualityScoresDONew self = new AppIdQualityScoresDONew();
        return TeaModel.build(map, self);
    }

    public AppIdQualityScoresDONew setModelid(String modelid) {
        this.modelid = modelid;
        return this;
    }
    public String getModelid() {
        return this.modelid;
    }

    public AppIdQualityScoresDONew setQualityscore(String qualityscore) {
        this.qualityscore = qualityscore;
        return this;
    }
    public String getQualityscore() {
        return this.qualityscore;
    }

}
