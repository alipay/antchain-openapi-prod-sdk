// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链浏览器交易收据信息
    public class BlockchainBrowserTransactionReceipt : TeaModel {
        // data
        /// <summary>
        /// <b>Example:</b>
        /// <para>data</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // gas_used
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public long? GasUsed { get; set; }

        // logs
        /// <summary>
        /// <b>Example:</b>
        /// <para>awdawd</para>
        /// </summary>
        [NameInMap("logs")]
        [Validation(Required=true)]
        public List<string> Logs { get; set; }

        // result
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=true)]
        public long? Result { get; set; }

    }

}
