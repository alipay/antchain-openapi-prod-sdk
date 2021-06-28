// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfYdgjjdkxxQueryExtendParams extends TeaModel {
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

    // 贷款合同编号
    @NameInMap("dkhtbh")
    @Validation(required = true)
    public String dkhtbh;

    public static CpfYdgjjdkxxQueryExtendParams build(java.util.Map<String, ?> map) throws Exception {
        CpfYdgjjdkxxQueryExtendParams self = new CpfYdgjjdkxxQueryExtendParams();
        return TeaModel.build(map, self);
    }

    public CpfYdgjjdkxxQueryExtendParams setZjbzxbm(String zjbzxbm) {
        this.zjbzxbm = zjbzxbm;
        return this;
    }
    public String getZjbzxbm() {
        return this.zjbzxbm;
    }

    public CpfYdgjjdkxxQueryExtendParams setXingming(String xingming) {
        this.xingming = xingming;
        return this;
    }
    public String getXingming() {
        return this.xingming;
    }

    public CpfYdgjjdkxxQueryExtendParams setZjhm(String zjhm) {
        this.zjhm = zjhm;
        return this;
    }
    public String getZjhm() {
        return this.zjhm;
    }

    public CpfYdgjjdkxxQueryExtendParams setDkhtbh(String dkhtbh) {
        this.dkhtbh = dkhtbh;
        return this;
    }
    public String getDkhtbh() {
        return this.dkhtbh;
    }

}
