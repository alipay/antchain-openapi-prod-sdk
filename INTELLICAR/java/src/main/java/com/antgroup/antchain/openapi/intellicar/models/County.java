// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class County extends TeaModel {
    // 城市id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("cid")
    @Validation(required = true)
    public String cid;

    // 区县id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("countyid")
    @Validation(required = true)
    public String countyid;

    // 区县名
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("countyname")
    @Validation(required = true)
    public String countyname;

    public static County build(java.util.Map<String, ?> map) throws Exception {
        County self = new County();
        return TeaModel.build(map, self);
    }

    public County setCid(String cid) {
        this.cid = cid;
        return this;
    }
    public String getCid() {
        return this.cid;
    }

    public County setCountyid(String countyid) {
        this.countyid = countyid;
        return this;
    }
    public String getCountyid() {
        return this.countyid;
    }

    public County setCountyname(String countyname) {
        this.countyname = countyname;
        return this;
    }
    public String getCountyname() {
        return this.countyname;
    }

}
