// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class Invoice extends TeaModel {
    // 备注
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("bz")
    public String bz;

    // 复核人
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("fhr")
    public String fhr;

    // 发票代码, 发票代码+发票号码唯一
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("fpdm")
    @Validation(required = true)
    public String fpdm;

    // 发票号码,发票代码+发票号码唯一
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("fphm")
    @Validation(required = true)
    public String fphm;

    // 发票类型代码,
    // 默认填:20:广东电子普通发票
    // 01：增值税专用发票
    // 04：增值税普通发票
    // 10：增值税电子普通发票
    // 51：重庆通用机打一联发票76
    // 53：重庆通用机打三联发票210
    // 90：重庆通用机打三联发票190
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("fplx")
    @Validation(required = true)
    public String fplx;

    // 发票明细集合
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("fpxxmxs")
    public java.util.List<InvoiceItem> fpxxmxs;

    // 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("fpztdm")
    @Validation(required = true)
    public String fpztdm;

    // 购买方地址、电话
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("gfdzdh")
    public String gfdzdh;

    // 购买方名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("gfmc")
    @Validation(required = true)
    public String gfmc;

    // 购买方纳税人识别号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("gfsh")
    public String gfsh;

    // 购买方银行账号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("gfyhzh")
    public String gfyhzh;

    // 购买方类型,1企业 2个人 3其他
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("gmflx")
    public String gmflx;

    // 金额
    /**
     * <strong>example:</strong>
     * <p>20.11</p>
     */
    @NameInMap("je")
    @Validation(required = true)
    public String je;

    // 价税合计	， 单位：元（2 位小数）
    /**
     * <strong>example:</strong>
     * <p>10.11</p>
     */
    @NameInMap("jshj")
    @Validation(required = true)
    public String jshj;

    // 开票类型,0-蓝字发票；1-红字发票；
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("kplx")
    @Validation(required = true)
    public String kplx;

    // 开票人
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("kpr")
    @Validation(required = true)
    public String kpr;

    // 开票日期
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("kprq")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String kprq;

    // 清单标志,00:无清单 01:有清单
    /**
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("qdbz")
    public String qdbz;

    // 认证状态
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("rzdklbdjgdm")
    public String rzdklbdjgdm;

    // 认证日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("rzdklbdrq")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String rzdklbdrq;

    // 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
    /**
     * <strong>example:</strong>
     * <p>10.11</p>
     */
    @NameInMap("se")
    public String se;

    // 收款人
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("skr")
    public String skr;

    // 税率标识,0不含税税率；1含税税率
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("slbz")
    @Validation(required = true)
    public String slbz;

    // 所属税务机关代码:
    // 山东省343
    // 重庆市350
    // 广东省347
    /**
     * <strong>example:</strong>
     * <p>343</p>
     */
    @NameInMap("ssdq")
    @Validation(required = true)
    public String ssdq;

    // 销售方地址、电话
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("xfdzdh")
    public String xfdzdh;

    // 销售方名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("xfmc")
    @Validation(required = true)
    public String xfmc;

    // 销售方纳税人识别号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("xfsh")
    @Validation(required = true)
    public String xfsh;

    // 销售方银行账号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("xfyhzh")
    public String xfyhzh;

    // 原发票代码, kplx开票类型为1时必填
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("yfpdm")
    public String yfpdm;

    // 原发票号码,kplx开票类型为1时必填
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("yfphm")
    public String yfphm;

    // 作废标志,0:未作废，1作废
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("zfbz")
    @Validation(required = true)
    public String zfbz;

    // 作废时间
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("zfsj")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String zfsj;

    // 扩展字段
    /**
     * <strong>example:</strong>
     * <p>{abc:123,def:456}</p>
     */
    @NameInMap("ext_filed")
    @Validation(required = true)
    public String extFiled;

    public static Invoice build(java.util.Map<String, ?> map) throws Exception {
        Invoice self = new Invoice();
        return TeaModel.build(map, self);
    }

    public Invoice setBz(String bz) {
        this.bz = bz;
        return this;
    }
    public String getBz() {
        return this.bz;
    }

    public Invoice setFhr(String fhr) {
        this.fhr = fhr;
        return this;
    }
    public String getFhr() {
        return this.fhr;
    }

    public Invoice setFpdm(String fpdm) {
        this.fpdm = fpdm;
        return this;
    }
    public String getFpdm() {
        return this.fpdm;
    }

    public Invoice setFphm(String fphm) {
        this.fphm = fphm;
        return this;
    }
    public String getFphm() {
        return this.fphm;
    }

    public Invoice setFplx(String fplx) {
        this.fplx = fplx;
        return this;
    }
    public String getFplx() {
        return this.fplx;
    }

    public Invoice setFpxxmxs(java.util.List<InvoiceItem> fpxxmxs) {
        this.fpxxmxs = fpxxmxs;
        return this;
    }
    public java.util.List<InvoiceItem> getFpxxmxs() {
        return this.fpxxmxs;
    }

    public Invoice setFpztdm(String fpztdm) {
        this.fpztdm = fpztdm;
        return this;
    }
    public String getFpztdm() {
        return this.fpztdm;
    }

    public Invoice setGfdzdh(String gfdzdh) {
        this.gfdzdh = gfdzdh;
        return this;
    }
    public String getGfdzdh() {
        return this.gfdzdh;
    }

    public Invoice setGfmc(String gfmc) {
        this.gfmc = gfmc;
        return this;
    }
    public String getGfmc() {
        return this.gfmc;
    }

    public Invoice setGfsh(String gfsh) {
        this.gfsh = gfsh;
        return this;
    }
    public String getGfsh() {
        return this.gfsh;
    }

    public Invoice setGfyhzh(String gfyhzh) {
        this.gfyhzh = gfyhzh;
        return this;
    }
    public String getGfyhzh() {
        return this.gfyhzh;
    }

    public Invoice setGmflx(String gmflx) {
        this.gmflx = gmflx;
        return this;
    }
    public String getGmflx() {
        return this.gmflx;
    }

    public Invoice setJe(String je) {
        this.je = je;
        return this;
    }
    public String getJe() {
        return this.je;
    }

    public Invoice setJshj(String jshj) {
        this.jshj = jshj;
        return this;
    }
    public String getJshj() {
        return this.jshj;
    }

    public Invoice setKplx(String kplx) {
        this.kplx = kplx;
        return this;
    }
    public String getKplx() {
        return this.kplx;
    }

    public Invoice setKpr(String kpr) {
        this.kpr = kpr;
        return this;
    }
    public String getKpr() {
        return this.kpr;
    }

    public Invoice setKprq(String kprq) {
        this.kprq = kprq;
        return this;
    }
    public String getKprq() {
        return this.kprq;
    }

    public Invoice setQdbz(String qdbz) {
        this.qdbz = qdbz;
        return this;
    }
    public String getQdbz() {
        return this.qdbz;
    }

    public Invoice setRzdklbdjgdm(String rzdklbdjgdm) {
        this.rzdklbdjgdm = rzdklbdjgdm;
        return this;
    }
    public String getRzdklbdjgdm() {
        return this.rzdklbdjgdm;
    }

    public Invoice setRzdklbdrq(String rzdklbdrq) {
        this.rzdklbdrq = rzdklbdrq;
        return this;
    }
    public String getRzdklbdrq() {
        return this.rzdklbdrq;
    }

    public Invoice setSe(String se) {
        this.se = se;
        return this;
    }
    public String getSe() {
        return this.se;
    }

    public Invoice setSkr(String skr) {
        this.skr = skr;
        return this;
    }
    public String getSkr() {
        return this.skr;
    }

    public Invoice setSlbz(String slbz) {
        this.slbz = slbz;
        return this;
    }
    public String getSlbz() {
        return this.slbz;
    }

    public Invoice setSsdq(String ssdq) {
        this.ssdq = ssdq;
        return this;
    }
    public String getSsdq() {
        return this.ssdq;
    }

    public Invoice setXfdzdh(String xfdzdh) {
        this.xfdzdh = xfdzdh;
        return this;
    }
    public String getXfdzdh() {
        return this.xfdzdh;
    }

    public Invoice setXfmc(String xfmc) {
        this.xfmc = xfmc;
        return this;
    }
    public String getXfmc() {
        return this.xfmc;
    }

    public Invoice setXfsh(String xfsh) {
        this.xfsh = xfsh;
        return this;
    }
    public String getXfsh() {
        return this.xfsh;
    }

    public Invoice setXfyhzh(String xfyhzh) {
        this.xfyhzh = xfyhzh;
        return this;
    }
    public String getXfyhzh() {
        return this.xfyhzh;
    }

    public Invoice setYfpdm(String yfpdm) {
        this.yfpdm = yfpdm;
        return this;
    }
    public String getYfpdm() {
        return this.yfpdm;
    }

    public Invoice setYfphm(String yfphm) {
        this.yfphm = yfphm;
        return this;
    }
    public String getYfphm() {
        return this.yfphm;
    }

    public Invoice setZfbz(String zfbz) {
        this.zfbz = zfbz;
        return this;
    }
    public String getZfbz() {
        return this.zfbz;
    }

    public Invoice setZfsj(String zfsj) {
        this.zfsj = zfsj;
        return this;
    }
    public String getZfsj() {
        return this.zfsj;
    }

    public Invoice setExtFiled(String extFiled) {
        this.extFiled = extFiled;
        return this;
    }
    public String getExtFiled() {
        return this.extFiled;
    }

}
