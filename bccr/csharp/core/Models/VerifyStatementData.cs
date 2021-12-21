// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 权利声明核验信息
    public class VerifyStatementData : TeaModel {
        // 权利声明书存证交易HASH
        [NameInMap("statement_tx_hash")]
        [Validation(Required=false)]
        public string StatementTxHash { get; set; }

        // 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
        [NameInMap("statement_file_id")]
        [Validation(Required=false)]
        public string StatementFileId { get; set; }

        // 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
        [NameInMap("statement_file_hash")]
        [Validation(Required=false)]
        public string StatementFileHash { get; set; }

    }

}
