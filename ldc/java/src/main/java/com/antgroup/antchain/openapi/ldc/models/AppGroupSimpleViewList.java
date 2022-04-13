// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppGroupSimpleViewList extends TeaModel {
    // 应用分组列表
    @NameInMap("app_group_list")
    @Validation(required = true)
    public java.util.List<AppGroupSimpleView> appGroupList;

    public static AppGroupSimpleViewList build(java.util.Map<String, ?> map) throws Exception {
        AppGroupSimpleViewList self = new AppGroupSimpleViewList();
        return TeaModel.build(map, self);
    }

    public AppGroupSimpleViewList setAppGroupList(java.util.List<AppGroupSimpleView> appGroupList) {
        this.appGroupList = appGroupList;
        return this;
    }
    public java.util.List<AppGroupSimpleView> getAppGroupList() {
        return this.appGroupList;
    }

}
