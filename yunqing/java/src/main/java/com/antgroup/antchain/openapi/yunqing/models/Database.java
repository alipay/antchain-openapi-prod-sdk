// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Database extends TeaModel {
    // acgotonecore_db_-4784849131397729849。
    @NameInMap("name")
    public String name;

    // 数据库访问端口。
    @NameInMap("port")
    public Long port;

    // 数据库类型。MYSQL  |  OCEANBASE。
    @NameInMap("provider")
    public String provider;

    // 实例id。
    @NameInMap("resource_id")
    public String resourceId;

    // 资源池id。
    @NameInMap("resource_pool_id")
    public String resourcePoolId;

    // 数据库访问地址。
    @NameInMap("url")
    public String url;

    public static Database build(java.util.Map<String, ?> map) throws Exception {
        Database self = new Database();
        return TeaModel.build(map, self);
    }

    public Database setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Database setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public Database setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Database setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public Database setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

    public Database setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
