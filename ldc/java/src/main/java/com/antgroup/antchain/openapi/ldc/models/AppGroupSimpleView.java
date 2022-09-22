// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AppGroupSimpleView extends TeaModel {
    // 应用id列表
    @NameInMap("app_id_list")
    @Validation(required = true)
    public java.util.List<String> appIdList;

    // 服务分组id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 蓝绿发布专用
    @NameInMap("bg_cell_name")
    public String bgCellName;

    // 蓝绿发布专用，traffic或release
    @NameInMap("bg_group_type")
    public String bgGroupType;

    public static AppGroupSimpleView build(java.util.Map<String, ?> map) throws Exception {
        AppGroupSimpleView self = new AppGroupSimpleView();
        return TeaModel.build(map, self);
    }

    public AppGroupSimpleView setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public AppGroupSimpleView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppGroupSimpleView setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppGroupSimpleView setBgCellName(String bgCellName) {
        this.bgCellName = bgCellName;
        return this;
    }
    public String getBgCellName() {
        return this.bgCellName;
    }

    public AppGroupSimpleView setBgGroupType(String bgGroupType) {
        this.bgGroupType = bgGroupType;
        return this;
    }
    public String getBgGroupType() {
        return this.bgGroupType;
    }

}
