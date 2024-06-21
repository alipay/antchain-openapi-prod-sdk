// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ProjectBase extends TeaModel {
    // 项目记录ID
    @NameInMap("id")
    public String id;

    // 项目可读编码
    @NameInMap("project_code")
    public String projectCode;

    // 项目名称
    @NameInMap("title")
    public String title;

    // 项目来源：蚂蚁、阿里云、合作伙伴 ProjectSource.getKey() ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"), PARTNER("PARTNER", "合作伙伴");
    @NameInMap("source")
    public String source;

    // 签约方（总包方）。蚂蚁、阿里云 ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"),
    @NameInMap("contractor")
    public String contractor;

    // 项目所在阶段
    @NameInMap("stage")
    public String stage;

    // 项目状态
    @NameInMap("status")
    public String status;

    // 预计签约日期
    @NameInMap("expect_con_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expectConDate;

    // 预估签约金额
    @NameInMap("expect_con_amt")
    public String expectConAmt;

    // 是否需要交付。1需要，0不需要
    @NameInMap("need_pm")
    public String needPm;

    // 是否需要提前”进场“。1需要，0不需要。
    @NameInMap("need_ad_entry")
    public String needAdEntry;

    // 合作伙伴Id
    @NameInMap("partner_id")
    public String partnerId;

    // partnerName
    @NameInMap("partner_name")
    public String partnerName;

    // 阿里云Bpid
    @NameInMap("aliyun_bpid")
    public String aliyunBpid;

    // 客户ID
    @NameInMap("customer_id")
    public String customerId;

    // 客户名称
    @NameInMap("customer_name")
    public String customerName;

    // BD
    @NameInMap("bd_work_no")
    public String bdWorkNo;

    // PM
    @NameInMap("pm_work_nos")
    public java.util.List<String> pmWorkNos;

    //  
    @NameInMap("tam_list")
    public java.util.List<String> tamList;

    //  
    @NameInMap("bd_list")
    public java.util.List<String> bdList;

    //  
    @NameInMap("tm_list")
    public java.util.List<String> tmList;

    //  
    @NameInMap("pm_list")
    public java.util.List<String> pmList;

    public static ProjectBase build(java.util.Map<String, ?> map) throws Exception {
        ProjectBase self = new ProjectBase();
        return TeaModel.build(map, self);
    }

    public ProjectBase setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ProjectBase setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public ProjectBase setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ProjectBase setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ProjectBase setContractor(String contractor) {
        this.contractor = contractor;
        return this;
    }
    public String getContractor() {
        return this.contractor;
    }

    public ProjectBase setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public ProjectBase setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ProjectBase setExpectConDate(String expectConDate) {
        this.expectConDate = expectConDate;
        return this;
    }
    public String getExpectConDate() {
        return this.expectConDate;
    }

    public ProjectBase setExpectConAmt(String expectConAmt) {
        this.expectConAmt = expectConAmt;
        return this;
    }
    public String getExpectConAmt() {
        return this.expectConAmt;
    }

    public ProjectBase setNeedPm(String needPm) {
        this.needPm = needPm;
        return this;
    }
    public String getNeedPm() {
        return this.needPm;
    }

    public ProjectBase setNeedAdEntry(String needAdEntry) {
        this.needAdEntry = needAdEntry;
        return this;
    }
    public String getNeedAdEntry() {
        return this.needAdEntry;
    }

    public ProjectBase setPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public String getPartnerId() {
        return this.partnerId;
    }

    public ProjectBase setPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }
    public String getPartnerName() {
        return this.partnerName;
    }

    public ProjectBase setAliyunBpid(String aliyunBpid) {
        this.aliyunBpid = aliyunBpid;
        return this;
    }
    public String getAliyunBpid() {
        return this.aliyunBpid;
    }

    public ProjectBase setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ProjectBase setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public ProjectBase setBdWorkNo(String bdWorkNo) {
        this.bdWorkNo = bdWorkNo;
        return this;
    }
    public String getBdWorkNo() {
        return this.bdWorkNo;
    }

    public ProjectBase setPmWorkNos(java.util.List<String> pmWorkNos) {
        this.pmWorkNos = pmWorkNos;
        return this;
    }
    public java.util.List<String> getPmWorkNos() {
        return this.pmWorkNos;
    }

    public ProjectBase setTamList(java.util.List<String> tamList) {
        this.tamList = tamList;
        return this;
    }
    public java.util.List<String> getTamList() {
        return this.tamList;
    }

    public ProjectBase setBdList(java.util.List<String> bdList) {
        this.bdList = bdList;
        return this;
    }
    public java.util.List<String> getBdList() {
        return this.bdList;
    }

    public ProjectBase setTmList(java.util.List<String> tmList) {
        this.tmList = tmList;
        return this;
    }
    public java.util.List<String> getTmList() {
        return this.tmList;
    }

    public ProjectBase setPmList(java.util.List<String> pmList) {
        this.pmList = pmList;
        return this;
    }
    public java.util.List<String> getPmList() {
        return this.pmList;
    }

}
