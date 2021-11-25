// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ContractSignField extends TeaModel {
    // account_id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // file_id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // signfield_id
    @NameInMap("signfield_id")
    @Validation(required = true)
    public String signfieldId;

    public static ContractSignField build(java.util.Map<String, ?> map) throws Exception {
        ContractSignField self = new ContractSignField();
        return TeaModel.build(map, self);
    }

    public ContractSignField setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public ContractSignField setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractSignField setSignfieldId(String signfieldId) {
        this.signfieldId = signfieldId;
        return this;
    }
    public String getSignfieldId() {
        return this.signfieldId;
    }

}
