// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class City extends TeaModel {
    // 省份id
    /**
     * <strong>example:</strong>
     * <p>省份id</p>
     */
    @NameInMap("pid")
    @Validation(required = true)
    public String pid;

    // 城市id
    /**
     * <strong>example:</strong>
     * <p>城市id</p>
     */
    @NameInMap("cid")
    @Validation(required = true)
    public String cid;

    // 城市名
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("cname")
    @Validation(required = true)
    public String cname;

    public static City build(java.util.Map<String, ?> map) throws Exception {
        City self = new City();
        return TeaModel.build(map, self);
    }

    public City setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public City setCid(String cid) {
        this.cid = cid;
        return this;
    }
    public String getCid() {
        return this.cid;
    }

    public City setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

}
