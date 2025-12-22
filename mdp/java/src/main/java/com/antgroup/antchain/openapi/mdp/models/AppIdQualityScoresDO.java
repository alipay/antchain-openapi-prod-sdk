// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class AppIdQualityScoresDO extends TeaModel {
    // 模型id
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("modelid")
    @Validation(required = true)
    public String modelid;

    // 分数
    /**
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("qualityscore")
    @Validation(required = true)
    public String qualityscore;

    public static AppIdQualityScoresDO build(java.util.Map<String, ?> map) throws Exception {
        AppIdQualityScoresDO self = new AppIdQualityScoresDO();
        return TeaModel.build(map, self);
    }

    public AppIdQualityScoresDO setModelid(String modelid) {
        this.modelid = modelid;
        return this;
    }
    public String getModelid() {
        return this.modelid;
    }

    public AppIdQualityScoresDO setQualityscore(String qualityscore) {
        this.qualityscore = qualityscore;
        return this;
    }
    public String getQualityscore() {
        return this.qualityscore;
    }

}
