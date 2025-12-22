// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSignField extends TeaModel {
    // 电子合同用户ID
    /**
     * <strong>example:</strong>
     * <p>faea8237c61a4fdea864ee8d7621e14f</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 电子合同文档ID
    /**
     * <strong>example:</strong>
     * <p>fe7df2f477d649c18ebcfdfffeba253d</p>
     */
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 电子合同签署区id
    /**
     * <strong>example:</strong>
     * <p>b76b69d5b48d4f689cae997e42809ac4</p>
     */
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
