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
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("statement_tx_hash")]
        [Validation(Required=false)]
        public string StatementTxHash { get; set; }

        // 权利声明书文件ID（和statementFileId 二选一,如果都传使用statementFileHash）
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("statement_file_id")]
        [Validation(Required=false)]
        public string StatementFileId { get; set; }

        // 权利声明书文件HASH（和statementFileId 二选一,如果都传使用statementFileHash）
        /// <summary>
        /// <b>Example:</b>
        /// <para>c687c371eb1126d06ef688c97e4a85a38b92c232483600f45597daa233b16948</para>
        /// </summary>
        [NameInMap("statement_file_hash")]
        [Validation(Required=false)]
        public string StatementFileHash { get; set; }

    }

}
