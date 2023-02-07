// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppGroupList extends TeaModel {
    // 应用分组id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用分组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static AppPortraitAppGroupList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppGroupList self = new AppPortraitAppGroupList();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppGroupList setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppPortraitAppGroupList setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
