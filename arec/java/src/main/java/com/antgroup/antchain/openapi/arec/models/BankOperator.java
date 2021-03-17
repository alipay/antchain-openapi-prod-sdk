// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class BankOperator extends TeaModel {
    // 网办操作员工号
    @NameInMap("op_no")
    public String opNo;

    // 姓名
    @NameInMap("name")
    public String name;

    // 证件类型
    @NameInMap("cert_type")
    public String certType;

    // 证件号
    @NameInMap("cert_no")
    public String certNo;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    public static BankOperator build(java.util.Map<String, ?> map) throws Exception {
        BankOperator self = new BankOperator();
        return TeaModel.build(map, self);
    }

    public BankOperator setOpNo(String opNo) {
        this.opNo = opNo;
        return this;
    }
    public String getOpNo() {
        return this.opNo;
    }

    public BankOperator setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BankOperator setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public BankOperator setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public BankOperator setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
