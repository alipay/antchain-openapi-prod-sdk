// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PbcInfo extends TeaModel {
    // 支行名称
    @NameInMap("branch_name")
    @Validation(required = true)
    public String branchName;

    // 联行号数据
    @NameInMap("bank_code")
    @Validation(required = true)
    public String bankCode;

    public static PbcInfo build(java.util.Map<String, ?> map) throws Exception {
        PbcInfo self = new PbcInfo();
        return TeaModel.build(map, self);
    }

    public PbcInfo setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public PbcInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

}
