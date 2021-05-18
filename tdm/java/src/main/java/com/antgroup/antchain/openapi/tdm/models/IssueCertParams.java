// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class IssueCertParams extends TeaModel {
    // 贷款合同编号
    @NameInMap("dkhtbh")
    public String dkhtbh;

    // 公积金中心个人账户
    @NameInMap("grzh")
    public String grzh;

    // 查询开始日期
    @NameInMap("ksrq")
    public String ksrq;

    // 查询结束日期
    @NameInMap("jsrq")
    public String jsrq;

    // 公积金贷款中心
    @NameInMap("gjjdkzx")
    public String gjjdkzx;

    public static IssueCertParams build(java.util.Map<String, ?> map) throws Exception {
        IssueCertParams self = new IssueCertParams();
        return TeaModel.build(map, self);
    }

    public IssueCertParams setDkhtbh(String dkhtbh) {
        this.dkhtbh = dkhtbh;
        return this;
    }
    public String getDkhtbh() {
        return this.dkhtbh;
    }

    public IssueCertParams setGrzh(String grzh) {
        this.grzh = grzh;
        return this;
    }
    public String getGrzh() {
        return this.grzh;
    }

    public IssueCertParams setKsrq(String ksrq) {
        this.ksrq = ksrq;
        return this;
    }
    public String getKsrq() {
        return this.ksrq;
    }

    public IssueCertParams setJsrq(String jsrq) {
        this.jsrq = jsrq;
        return this;
    }
    public String getJsrq() {
        return this.jsrq;
    }

    public IssueCertParams setGjjdkzx(String gjjdkzx) {
        this.gjjdkzx = gjjdkzx;
        return this;
    }
    public String getGjjdkzx() {
        return this.gjjdkzx;
    }

}
