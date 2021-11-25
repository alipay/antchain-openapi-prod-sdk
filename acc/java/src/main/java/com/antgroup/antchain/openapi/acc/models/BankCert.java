// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class BankCert extends TeaModel {
    // 银行账号
    // 
    // 
    @NameInMap("bank_account")
    @Validation(required = true)
    public String bankAccount;

    // 银行名称
    // 
    // 
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 文件信息，支持上传多个文件
    // 
    // 
    @NameInMap("file_defines")
    @Validation(required = true)
    public java.util.List<FileDefine> fileDefines;

    public static BankCert build(java.util.Map<String, ?> map) throws Exception {
        BankCert self = new BankCert();
        return TeaModel.build(map, self);
    }

    public BankCert setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

    public BankCert setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public BankCert setFileDefines(java.util.List<FileDefine> fileDefines) {
        this.fileDefines = fileDefines;
        return this;
    }
    public java.util.List<FileDefine> getFileDefines() {
        return this.fileDefines;
    }

}
