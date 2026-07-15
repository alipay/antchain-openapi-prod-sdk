// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链最新交易信息
    public class BlockchainBrowserLatestTransaction : TeaModel {
        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>createTime</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // from
        /// <summary>
        /// <b>Example:</b>
        /// <para>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // to
        /// <summary>
        /// <b>Example:</b>
        /// <para>e4386406265f8a0f7d3a84efec3afa3ea12d2f9a3c21e2928a7b4d6a4e70ba68</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // transactionV10Type
        /// <summary>
        /// <b>Example:</b>
        /// <para>TX_DEPOSIT_DATA</para>
        /// </summary>
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

    }

}
