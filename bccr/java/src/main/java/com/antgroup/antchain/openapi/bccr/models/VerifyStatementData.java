// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyStatementData extends TeaModel {
    // 权利声明书存证交易HASH
    @NameInMap("statement_tx_hash")
    public String statementTxHash;

    // 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
    @NameInMap("statement_file_id")
    public String statementFileId;

    // 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
    @NameInMap("statement_file_hash")
    public String statementFileHash;

    public static VerifyStatementData build(java.util.Map<String, ?> map) throws Exception {
        VerifyStatementData self = new VerifyStatementData();
        return TeaModel.build(map, self);
    }

    public VerifyStatementData setStatementTxHash(String statementTxHash) {
        this.statementTxHash = statementTxHash;
        return this;
    }
    public String getStatementTxHash() {
        return this.statementTxHash;
    }

    public VerifyStatementData setStatementFileId(String statementFileId) {
        this.statementFileId = statementFileId;
        return this;
    }
    public String getStatementFileId() {
        return this.statementFileId;
    }

    public VerifyStatementData setStatementFileHash(String statementFileHash) {
        this.statementFileHash = statementFileHash;
        return this;
    }
    public String getStatementFileHash() {
        return this.statementFileHash;
    }

}
