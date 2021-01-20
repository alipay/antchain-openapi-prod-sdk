// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SlbExecutionProgress extends TeaModel {
    // 进度 ID
    @NameInMap("id")
    public String id;

    // 进度名称
    @NameInMap("name")
    public String name;

    // 状态
    @NameInMap("state")
    public String state;

    // 挂载权重
    @NameInMap("mount_weights")
    public java.util.List<Pair> mountWeights;

    public static SlbExecutionProgress build(java.util.Map<String, ?> map) throws Exception {
        SlbExecutionProgress self = new SlbExecutionProgress();
        return TeaModel.build(map, self);
    }

    public SlbExecutionProgress setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SlbExecutionProgress setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SlbExecutionProgress setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public SlbExecutionProgress setMountWeights(java.util.List<Pair> mountWeights) {
        this.mountWeights = mountWeights;
        return this;
    }
    public java.util.List<Pair> getMountWeights() {
        return this.mountWeights;
    }

}
