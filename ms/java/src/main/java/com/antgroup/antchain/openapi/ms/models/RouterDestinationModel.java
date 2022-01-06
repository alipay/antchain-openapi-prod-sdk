// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RouterDestinationModel extends TeaModel {
    // 路由目标集合
    @NameInMap("destination")
    public java.util.List<BaseConditionModel> destination;

    // 权重
    @NameInMap("weight")
    public Long weight;

    public static RouterDestinationModel build(java.util.Map<String, ?> map) throws Exception {
        RouterDestinationModel self = new RouterDestinationModel();
        return TeaModel.build(map, self);
    }

    public RouterDestinationModel setDestination(java.util.List<BaseConditionModel> destination) {
        this.destination = destination;
        return this;
    }
    public java.util.List<BaseConditionModel> getDestination() {
        return this.destination;
    }

    public RouterDestinationModel setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
