// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class InvoiceItem extends TeaModel {
    // 税收分类编码	
    @NameInMap("spbm")
    @Validation(required = true)
    public String spbm;

    // 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
    @NameInMap("mc")
    @Validation(required = true)
    public String mc;

    // 单位
    @NameInMap("jldw")
    public String jldw;

    // 数量
    @NameInMap("shul")
    public String shul;

    // 含税金额,2位小数
    @NameInMap("je")
    @Validation(required = true)
    public String je;

    // 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
    @NameInMap("sl")
    public String sl;

    // 税额,当fplx!=51or53时，必填
    @NameInMap("se")
    public String se;

    // 明细序号,从1开始递增
    @NameInMap("mxxh")
    @Validation(required = true)
    public String mxxh;

    // 单价
    @NameInMap("dj")
    @Validation(required = true)
    public String dj;

    // 规格型号
    @NameInMap("ggxh")
    public String ggxh;

    public static InvoiceItem build(java.util.Map<String, ?> map) throws Exception {
        InvoiceItem self = new InvoiceItem();
        return TeaModel.build(map, self);
    }

    public InvoiceItem setSpbm(String spbm) {
        this.spbm = spbm;
        return this;
    }
    public String getSpbm() {
        return this.spbm;
    }

    public InvoiceItem setMc(String mc) {
        this.mc = mc;
        return this;
    }
    public String getMc() {
        return this.mc;
    }

    public InvoiceItem setJldw(String jldw) {
        this.jldw = jldw;
        return this;
    }
    public String getJldw() {
        return this.jldw;
    }

    public InvoiceItem setShul(String shul) {
        this.shul = shul;
        return this;
    }
    public String getShul() {
        return this.shul;
    }

    public InvoiceItem setJe(String je) {
        this.je = je;
        return this;
    }
    public String getJe() {
        return this.je;
    }

    public InvoiceItem setSl(String sl) {
        this.sl = sl;
        return this;
    }
    public String getSl() {
        return this.sl;
    }

    public InvoiceItem setSe(String se) {
        this.se = se;
        return this;
    }
    public String getSe() {
        return this.se;
    }

    public InvoiceItem setMxxh(String mxxh) {
        this.mxxh = mxxh;
        return this;
    }
    public String getMxxh() {
        return this.mxxh;
    }

    public InvoiceItem setDj(String dj) {
        this.dj = dj;
        return this;
    }
    public String getDj() {
        return this.dj;
    }

    public InvoiceItem setGgxh(String ggxh) {
        this.ggxh = ggxh;
        return this;
    }
    public String getGgxh() {
        return this.ggxh;
    }

}
