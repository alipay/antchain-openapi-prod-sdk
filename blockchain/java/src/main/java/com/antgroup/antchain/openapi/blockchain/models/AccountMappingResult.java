// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AccountMappingResult extends TeaModel {
    // 该账户在链上的唯一标示
    /**
     * <strong>example:</strong>
     * <p>1234:1234:123</p>
     */
    @NameInMap("baccount")
    @Validation(required = true)
    public String baccount;

    // 当前账户映射结果描述语句
    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 状态描述符
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 自有系统中该账户唯一标示
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    public static AccountMappingResult build(java.util.Map<String, ?> map) throws Exception {
        AccountMappingResult self = new AccountMappingResult();
        return TeaModel.build(map, self);
    }

    public AccountMappingResult setBaccount(String baccount) {
        this.baccount = baccount;
        return this;
    }
    public String getBaccount() {
        return this.baccount;
    }

    public AccountMappingResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AccountMappingResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AccountMappingResult setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
