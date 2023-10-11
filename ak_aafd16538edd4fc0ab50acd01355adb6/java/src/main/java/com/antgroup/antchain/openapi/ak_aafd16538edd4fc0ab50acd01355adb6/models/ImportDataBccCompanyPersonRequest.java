// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_aafd16538edd4fc0ab50acd01355adb6.models;

import com.aliyun.tea.*;

public class ImportDataBccCompanyPersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("xm")
    public String xm;

    // 身份证号
    @NameInMap("sfzh")
    public String sfzh;

    // 数据更新时间
    @NameInMap("sjgxsj")
    public String sjgxsj;

    // 数据目录名称
    @NameInMap("sjmlmc")
    public String sjmlmc;

    // 数据所属部门
    @NameInMap("sjssbm")
    public String sjssbm;

    // 从业资格证号
    @NameInMap("cyzgzh")
    public String cyzgzh;

    // 从业类别
    @NameInMap("cylb")
    public String cylb;

    // 聘用单位
    @NameInMap("pydw")
    public String pydw;

    // 公告事由
    @NameInMap("ggsy")
    public String ggsy;

    // 公告日期起
    @NameInMap("ggrqq")
    public String ggrqq;

    // 公告日期止
    @NameInMap("ggrqz")
    public String ggrqz;

    // 企信链所需---企信链控制台数据管理列表页中每个数据的唯一码
    @NameInMap("data_name")
    public String dataName;

    public static ImportDataBccCompanyPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDataBccCompanyPersonRequest self = new ImportDataBccCompanyPersonRequest();
        return TeaModel.build(map, self);
    }

    public ImportDataBccCompanyPersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDataBccCompanyPersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportDataBccCompanyPersonRequest setXm(String xm) {
        this.xm = xm;
        return this;
    }
    public String getXm() {
        return this.xm;
    }

    public ImportDataBccCompanyPersonRequest setSfzh(String sfzh) {
        this.sfzh = sfzh;
        return this;
    }
    public String getSfzh() {
        return this.sfzh;
    }

    public ImportDataBccCompanyPersonRequest setSjgxsj(String sjgxsj) {
        this.sjgxsj = sjgxsj;
        return this;
    }
    public String getSjgxsj() {
        return this.sjgxsj;
    }

    public ImportDataBccCompanyPersonRequest setSjmlmc(String sjmlmc) {
        this.sjmlmc = sjmlmc;
        return this;
    }
    public String getSjmlmc() {
        return this.sjmlmc;
    }

    public ImportDataBccCompanyPersonRequest setSjssbm(String sjssbm) {
        this.sjssbm = sjssbm;
        return this;
    }
    public String getSjssbm() {
        return this.sjssbm;
    }

    public ImportDataBccCompanyPersonRequest setCyzgzh(String cyzgzh) {
        this.cyzgzh = cyzgzh;
        return this;
    }
    public String getCyzgzh() {
        return this.cyzgzh;
    }

    public ImportDataBccCompanyPersonRequest setCylb(String cylb) {
        this.cylb = cylb;
        return this;
    }
    public String getCylb() {
        return this.cylb;
    }

    public ImportDataBccCompanyPersonRequest setPydw(String pydw) {
        this.pydw = pydw;
        return this;
    }
    public String getPydw() {
        return this.pydw;
    }

    public ImportDataBccCompanyPersonRequest setGgsy(String ggsy) {
        this.ggsy = ggsy;
        return this;
    }
    public String getGgsy() {
        return this.ggsy;
    }

    public ImportDataBccCompanyPersonRequest setGgrqq(String ggrqq) {
        this.ggrqq = ggrqq;
        return this;
    }
    public String getGgrqq() {
        return this.ggrqq;
    }

    public ImportDataBccCompanyPersonRequest setGgrqz(String ggrqz) {
        this.ggrqz = ggrqz;
        return this;
    }
    public String getGgrqz() {
        return this.ggrqz;
    }

    public ImportDataBccCompanyPersonRequest setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

}
