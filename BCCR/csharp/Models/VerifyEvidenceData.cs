// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 核验取证信息
    public class VerifyEvidenceData : TeaModel {
        // 操作日志交易HASH
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("process_log_tx_hash")]
        [Validation(Required=false)]
        public string ProcessLogTxHash { get; set; }

        // 自清洁日志交易HASH
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("check_log_tx_hash")]
        [Validation(Required=false)]
        public string CheckLogTxHash { get; set; }

    }

}
