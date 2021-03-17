// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class FinishRcpNingboRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务号，银行抵押登记申请接口中生成并传递给不动产的业务号
    @NameInMap("ywh")
    @Validation(required = true)
    public String ywh;

    // 不动产单元号，如14-2-1802
    @NameInMap("bdcdyh")
    @Validation(required = true)
    public String bdcdyh;

    // 不动产登记证明号
    @NameInMap("bdcdjzmh")
    @Validation(required = true)
    public String bdcdjzmh;

    // 证明权利或事项
    @NameInMap("zmqlhsx")
    @Validation(required = true)
    public String zmqlhsx;

    // 权利人
    @NameInMap("qlr")
    @Validation(required = true)
    public String qlr;

    // 义务人
    @NameInMap("ywr")
    @Validation(required = true)
    public String ywr;

    // 坐落
    @NameInMap("zl")
    @Validation(required = true)
    public String zl;

    // 其他
    @NameInMap("qt")
    public String qt;

    // 附记
    @NameInMap("fj")
    @Validation(required = true)
    public String fj;

    // 发证工本号
    @NameInMap("fzgbh")
    @Validation(required = true)
    public String fzgbh;

    // 缮证人
    @NameInMap("szr")
    @Validation(required = true)
    public String szr;

    // 缮证时间
    @NameInMap("szsj")
    @Validation(required = true)
    public String szsj;

    // 发证人
    @NameInMap("fzr")
    @Validation(required = true)
    public String fzr;

    // 发证时间
    @NameInMap("fzsj")
    @Validation(required = true)
    public String fzsj;

    // 发证机关
    @NameInMap("fzjg")
    @Validation(required = true)
    public String fzjg;

    // 区县代码
    @NameInMap("qxdm")
    @Validation(required = true)
    public Long qxdm;

    // 省编号
    @NameInMap("sbh")
    @Validation(required = true)
    public String sbh;

    // 登记证明种类
    @NameInMap("djzmzl")
    @Validation(required = true)
    public String djzmzl;

    // 电子版文件字符串
    @NameInMap("djzmfile")
    @Validation(required = true)
    public String djzmfile;

    // 债权数额，单位:万元
    @NameInMap("zqse")
    @Validation(required = true)
    public String zqse;

    // 抵押权起始日期，格式：“yyyy-MM-dd”
    @NameInMap("qlqssj")
    @Validation(required = true)
    public String qlqssj;

    // 抵押权结束日期，格式：“yyyy-MM-dd”
    @NameInMap("qljssj")
    @Validation(required = true)
    public String qljssj;

    // 抵押方式
    @NameInMap("dyfs")
    @Validation(required = true)
    public String dyfs;

    public static FinishRcpNingboRequest build(java.util.Map<String, ?> map) throws Exception {
        FinishRcpNingboRequest self = new FinishRcpNingboRequest();
        return TeaModel.build(map, self);
    }

    public FinishRcpNingboRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FinishRcpNingboRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FinishRcpNingboRequest setYwh(String ywh) {
        this.ywh = ywh;
        return this;
    }
    public String getYwh() {
        return this.ywh;
    }

    public FinishRcpNingboRequest setBdcdyh(String bdcdyh) {
        this.bdcdyh = bdcdyh;
        return this;
    }
    public String getBdcdyh() {
        return this.bdcdyh;
    }

    public FinishRcpNingboRequest setBdcdjzmh(String bdcdjzmh) {
        this.bdcdjzmh = bdcdjzmh;
        return this;
    }
    public String getBdcdjzmh() {
        return this.bdcdjzmh;
    }

    public FinishRcpNingboRequest setZmqlhsx(String zmqlhsx) {
        this.zmqlhsx = zmqlhsx;
        return this;
    }
    public String getZmqlhsx() {
        return this.zmqlhsx;
    }

    public FinishRcpNingboRequest setQlr(String qlr) {
        this.qlr = qlr;
        return this;
    }
    public String getQlr() {
        return this.qlr;
    }

    public FinishRcpNingboRequest setYwr(String ywr) {
        this.ywr = ywr;
        return this;
    }
    public String getYwr() {
        return this.ywr;
    }

    public FinishRcpNingboRequest setZl(String zl) {
        this.zl = zl;
        return this;
    }
    public String getZl() {
        return this.zl;
    }

    public FinishRcpNingboRequest setQt(String qt) {
        this.qt = qt;
        return this;
    }
    public String getQt() {
        return this.qt;
    }

    public FinishRcpNingboRequest setFj(String fj) {
        this.fj = fj;
        return this;
    }
    public String getFj() {
        return this.fj;
    }

    public FinishRcpNingboRequest setFzgbh(String fzgbh) {
        this.fzgbh = fzgbh;
        return this;
    }
    public String getFzgbh() {
        return this.fzgbh;
    }

    public FinishRcpNingboRequest setSzr(String szr) {
        this.szr = szr;
        return this;
    }
    public String getSzr() {
        return this.szr;
    }

    public FinishRcpNingboRequest setSzsj(String szsj) {
        this.szsj = szsj;
        return this;
    }
    public String getSzsj() {
        return this.szsj;
    }

    public FinishRcpNingboRequest setFzr(String fzr) {
        this.fzr = fzr;
        return this;
    }
    public String getFzr() {
        return this.fzr;
    }

    public FinishRcpNingboRequest setFzsj(String fzsj) {
        this.fzsj = fzsj;
        return this;
    }
    public String getFzsj() {
        return this.fzsj;
    }

    public FinishRcpNingboRequest setFzjg(String fzjg) {
        this.fzjg = fzjg;
        return this;
    }
    public String getFzjg() {
        return this.fzjg;
    }

    public FinishRcpNingboRequest setQxdm(Long qxdm) {
        this.qxdm = qxdm;
        return this;
    }
    public Long getQxdm() {
        return this.qxdm;
    }

    public FinishRcpNingboRequest setSbh(String sbh) {
        this.sbh = sbh;
        return this;
    }
    public String getSbh() {
        return this.sbh;
    }

    public FinishRcpNingboRequest setDjzmzl(String djzmzl) {
        this.djzmzl = djzmzl;
        return this;
    }
    public String getDjzmzl() {
        return this.djzmzl;
    }

    public FinishRcpNingboRequest setDjzmfile(String djzmfile) {
        this.djzmfile = djzmfile;
        return this;
    }
    public String getDjzmfile() {
        return this.djzmfile;
    }

    public FinishRcpNingboRequest setZqse(String zqse) {
        this.zqse = zqse;
        return this;
    }
    public String getZqse() {
        return this.zqse;
    }

    public FinishRcpNingboRequest setQlqssj(String qlqssj) {
        this.qlqssj = qlqssj;
        return this;
    }
    public String getQlqssj() {
        return this.qlqssj;
    }

    public FinishRcpNingboRequest setQljssj(String qljssj) {
        this.qljssj = qljssj;
        return this;
    }
    public String getQljssj() {
        return this.qljssj;
    }

    public FinishRcpNingboRequest setDyfs(String dyfs) {
        this.dyfs = dyfs;
        return this;
    }
    public String getDyfs() {
        return this.dyfs;
    }

}
