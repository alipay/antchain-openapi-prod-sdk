// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class IndentityState extends TeaModel {
    // 纳税人识别号
    @NameInMap("nsrshb")
    @Validation(required = true)
    public String nsrshb;

    // 纳税人名称
    @NameInMap("nsrmc")
    @Validation(required = true)
    public String nsrmc;

    // 税务机构名称
    @NameInMap("swjgmc")
    @Validation(required = true)
    public String swjgmc;

    // 纳税人识别号状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 查询时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    public static IndentityState build(java.util.Map<String, ?> map) throws Exception {
        IndentityState self = new IndentityState();
        return TeaModel.build(map, self);
    }

    public IndentityState setNsrshb(String nsrshb) {
        this.nsrshb = nsrshb;
        return this;
    }
    public String getNsrshb() {
        return this.nsrshb;
    }

    public IndentityState setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
        return this;
    }
    public String getNsrmc() {
        return this.nsrmc;
    }

    public IndentityState setSwjgmc(String swjgmc) {
        this.swjgmc = swjgmc;
        return this;
    }
    public String getSwjgmc() {
        return this.swjgmc;
    }

    public IndentityState setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public IndentityState setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

}
