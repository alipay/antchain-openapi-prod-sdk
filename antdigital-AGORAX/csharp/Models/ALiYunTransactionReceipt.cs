// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云交易收据
    public class ALiYunTransactionReceipt : TeaModel {
        // data
        /// <summary>
        /// <b>Example:</b>
        /// <para>data</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // gas_used
        /// <summary>
        /// <b>Example:</b>
        /// <para>gas_used</para>
        /// </summary>
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public string GasUsed { get; set; }

        // result
        /// <summary>
        /// <b>Example:</b>
        /// <para>result</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public long? Result { get; set; }

        // logs
        /// <summary>
        /// <b>Example:</b>
        /// <para>logs</para>
        /// </summary>
        [NameInMap("logs")]
        [Validation(Required=false)]
        public List<string> Logs { get; set; }

    }

}
