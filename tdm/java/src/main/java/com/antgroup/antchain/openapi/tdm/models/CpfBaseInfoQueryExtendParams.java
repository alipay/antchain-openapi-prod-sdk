// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfBaseInfoQueryExtendParams extends TeaModel {
    // 住建部中心编码
    @NameInMap("zjbzxbm")
    @Validation(required = true)
    public String zjbzxbm;

    // 业务流水号
    @NameInMap("yhlsh")
    @Validation(required = true)
    public String yhlsh;

    // 姓名
    @NameInMap("xingming")
    @Validation(required = true)
    public String xingming;

    // 证件号码
    @NameInMap("zjhm")
    @Validation(required = true)
    public String zjhm;

    // 银行程序标志
    @NameInMap("appid")
    @Validation(required = true)
    public String appid;

    public static CpfBaseInfoQueryExtendParams build(java.util.Map<String, ?> map) throws Exception {
        CpfBaseInfoQueryExtendParams self = new CpfBaseInfoQueryExtendParams();
        return TeaModel.build(map, self);
    }

    public CpfBaseInfoQueryExtendParams setZjbzxbm(String zjbzxbm) {
        this.zjbzxbm = zjbzxbm;
        return this;
    }
    public String getZjbzxbm() {
        return this.zjbzxbm;
    }

    public CpfBaseInfoQueryExtendParams setYhlsh(String yhlsh) {
        this.yhlsh = yhlsh;
        return this;
    }
    public String getYhlsh() {
        return this.yhlsh;
    }

    public CpfBaseInfoQueryExtendParams setXingming(String xingming) {
        this.xingming = xingming;
        return this;
    }
    public String getXingming() {
        return this.xingming;
    }

    public CpfBaseInfoQueryExtendParams setZjhm(String zjhm) {
        this.zjhm = zjhm;
        return this;
    }
    public String getZjhm() {
        return this.zjhm;
    }

    public CpfBaseInfoQueryExtendParams setAppid(String appid) {
        this.appid = appid;
        return this;
    }
    public String getAppid() {
        return this.appid;
    }

}
