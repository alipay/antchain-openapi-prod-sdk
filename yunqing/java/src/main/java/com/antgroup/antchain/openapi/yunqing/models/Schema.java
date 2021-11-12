// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Schema extends TeaModel {
    // schema所属的数据库实例信息。
    @NameInMap("database")
    public Database database;

    // schema名称。
    @NameInMap("name")
    public String name;

    // 资源所属的资源池id。
    @NameInMap("resource_pool_id")
    public String resourcePoolId;

    public static Schema build(java.util.Map<String, ?> map) throws Exception {
        Schema self = new Schema();
        return TeaModel.build(map, self);
    }

    public Schema setDatabase(Database database) {
        this.database = database;
        return this;
    }
    public Database getDatabase() {
        return this.database;
    }

    public Schema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Schema setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

}
