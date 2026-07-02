// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicCategoryIndustrySceneInfo extends TeaModel {
    // 行业
    /**
     * <strong>example:</strong>
     * <p>工业</p>
     */
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 场景
    /**
     * <strong>example:</strong>
     * <p>智能工业</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static IotbasicCategoryIndustrySceneInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicCategoryIndustrySceneInfo self = new IotbasicCategoryIndustrySceneInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicCategoryIndustrySceneInfo setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public IotbasicCategoryIndustrySceneInfo setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
