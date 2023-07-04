// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppDeployInitOption extends TeaModel {
    // 应用name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 产品内应用的依赖关系，决定应用的执行顺序
    @NameInMap("release_order")
    @Validation(required = true)
    public Long releaseOrder;

    // 分组策略：
    //     TWO_GROUP("TWO_GROUP", "分两组"),
    //     ALL_ONE("ALL_ONE", "共分一组"),
    //     EACH_ONE("EACH_ONE", "每台一组"),
    //     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐")
    @NameInMap("group_strategy")
    @Validation(required = true)
    public String groupStrategy;

    // 分组是否需要手动确认，默认false
    @NameInMap("need_confirm")
    @Validation(required = true)
    public Boolean needConfirm;

    public static AppDeployInitOption build(java.util.Map<String, ?> map) throws Exception {
        AppDeployInitOption self = new AppDeployInitOption();
        return TeaModel.build(map, self);
    }

    public AppDeployInitOption setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppDeployInitOption setReleaseOrder(Long releaseOrder) {
        this.releaseOrder = releaseOrder;
        return this;
    }
    public Long getReleaseOrder() {
        return this.releaseOrder;
    }

    public AppDeployInitOption setGroupStrategy(String groupStrategy) {
        this.groupStrategy = groupStrategy;
        return this;
    }
    public String getGroupStrategy() {
        return this.groupStrategy;
    }

    public AppDeployInitOption setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

}
