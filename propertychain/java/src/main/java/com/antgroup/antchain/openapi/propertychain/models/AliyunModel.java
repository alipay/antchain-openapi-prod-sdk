// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AliyunModel extends TeaModel {
    // 物模型类目名
    @NameInMap("name")
    public String name;

    // 物模型类目Id
    @NameInMap("id")
    public String id;

    public static AliyunModel build(java.util.Map<String, ?> map) throws Exception {
        AliyunModel self = new AliyunModel();
        return TeaModel.build(map, self);
    }

    public AliyunModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AliyunModel setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
