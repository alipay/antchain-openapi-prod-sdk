// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppNodeList extends TeaModel {
    // 返回ecs节点数据
    @NameInMap("ecs")
    public java.util.List<AppPortraitAppNodeEcsList> ecs;

    // 返回slb节点数据
    @NameInMap("slb")
    public AppPortraitAppNodeEcsList slb;

    // 返回rds节点数据
    @NameInMap("rds")
    public AppPortraitAppNodeEcsList rds;

    // 返回pod节点数据
    @NameInMap("pod")
    public AppPortraitAppNodeEcsList pod;

    public static AppPortraitAppNodeList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppNodeList self = new AppPortraitAppNodeList();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppNodeList setEcs(java.util.List<AppPortraitAppNodeEcsList> ecs) {
        this.ecs = ecs;
        return this;
    }
    public java.util.List<AppPortraitAppNodeEcsList> getEcs() {
        return this.ecs;
    }

    public AppPortraitAppNodeList setSlb(AppPortraitAppNodeEcsList slb) {
        this.slb = slb;
        return this;
    }
    public AppPortraitAppNodeEcsList getSlb() {
        return this.slb;
    }

    public AppPortraitAppNodeList setRds(AppPortraitAppNodeEcsList rds) {
        this.rds = rds;
        return this;
    }
    public AppPortraitAppNodeEcsList getRds() {
        return this.rds;
    }

    public AppPortraitAppNodeList setPod(AppPortraitAppNodeEcsList pod) {
        this.pod = pod;
        return this;
    }
    public AppPortraitAppNodeEcsList getPod() {
        return this.pod;
    }

}
