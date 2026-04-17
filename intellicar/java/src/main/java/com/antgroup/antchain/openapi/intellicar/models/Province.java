// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class Province extends TeaModel {
    // 省份id
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("pid")
    @Validation(required = true)
    public String pid;

    // 省份名
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pname")
    @Validation(required = true)
    public String pname;

    public static Province build(java.util.Map<String, ?> map) throws Exception {
        Province self = new Province();
        return TeaModel.build(map, self);
    }

    public Province setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public Province setPname(String pname) {
        this.pname = pname;
        return this;
    }
    public String getPname() {
        return this.pname;
    }

}
