// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfYddkjczmQueryExtendParams extends TeaModel {
    // 住建部中心编码
    @NameInMap("zjbzxbm")
    @Validation(required = true)
    public String zjbzxbm;

    // 姓名
    @NameInMap("xingming")
    @Validation(required = true)
    public String xingming;

    // 证件号码
    @NameInMap("zjhm")
    @Validation(required = true)
    public String zjhm;

    public static CpfYddkjczmQueryExtendParams build(java.util.Map<String, ?> map) throws Exception {
        CpfYddkjczmQueryExtendParams self = new CpfYddkjczmQueryExtendParams();
        return TeaModel.build(map, self);
    }

    public CpfYddkjczmQueryExtendParams setZjbzxbm(String zjbzxbm) {
        this.zjbzxbm = zjbzxbm;
        return this;
    }
    public String getZjbzxbm() {
        return this.zjbzxbm;
    }

    public CpfYddkjczmQueryExtendParams setXingming(String xingming) {
        this.xingming = xingming;
        return this;
    }
    public String getXingming() {
        return this.xingming;
    }

    public CpfYddkjczmQueryExtendParams setZjhm(String zjhm) {
        this.zjhm = zjhm;
        return this;
    }
    public String getZjhm() {
        return this.zjhm;
    }

}
