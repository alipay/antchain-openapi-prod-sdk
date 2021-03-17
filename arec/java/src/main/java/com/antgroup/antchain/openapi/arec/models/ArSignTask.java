// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class ArSignTask extends TeaModel {
    // 证件号
    @NameInMap("cert_no")
    public String certNo;

    // 证件类型，比如：ID_CARD=身份证
    @NameInMap("cert_type")
    public String certType;

    // 客户编号
    @NameInMap("cm_no")
    public String cmNo;

    // 姓名
    @NameInMap("name")
    public String name;

    // 签署流程编号
    @NameInMap("proc_no")
    public String procNo;

    // 合同签署地址
    @NameInMap("sign_url")
    public String signUrl;

    // 签署状态 ，比如：INIT=待签署
    @NameInMap("status")
    public String status;

    // 智慧合同签署账号id
    @NameInMap("myc_account_id")
    public String mycAccountId;

    public static ArSignTask build(java.util.Map<String, ?> map) throws Exception {
        ArSignTask self = new ArSignTask();
        return TeaModel.build(map, self);
    }

    public ArSignTask setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public ArSignTask setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public ArSignTask setCmNo(String cmNo) {
        this.cmNo = cmNo;
        return this;
    }
    public String getCmNo() {
        return this.cmNo;
    }

    public ArSignTask setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ArSignTask setProcNo(String procNo) {
        this.procNo = procNo;
        return this;
    }
    public String getProcNo() {
        return this.procNo;
    }

    public ArSignTask setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public ArSignTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ArSignTask setMycAccountId(String mycAccountId) {
        this.mycAccountId = mycAccountId;
        return this;
    }
    public String getMycAccountId() {
        return this.mycAccountId;
    }

}
