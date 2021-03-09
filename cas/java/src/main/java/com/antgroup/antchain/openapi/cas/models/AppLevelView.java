// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppLevelView extends TeaModel {
    // 应用等级基类
    @NameInMap("base_app_level")
    public AppLevel baseAppLevel;

    // 应用数量
    @NameInMap("app_count")
    public Long appCount;

    // 创建者名称
    @NameInMap("creator_name")
    public String creatorName;

    public static AppLevelView build(java.util.Map<String, ?> map) throws Exception {
        AppLevelView self = new AppLevelView();
        return TeaModel.build(map, self);
    }

    public AppLevelView setBaseAppLevel(AppLevel baseAppLevel) {
        this.baseAppLevel = baseAppLevel;
        return this;
    }
    public AppLevel getBaseAppLevel() {
        return this.baseAppLevel;
    }

    public AppLevelView setAppCount(Long appCount) {
        this.appCount = appCount;
        return this;
    }
    public Long getAppCount() {
        return this.appCount;
    }

    public AppLevelView setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

}
