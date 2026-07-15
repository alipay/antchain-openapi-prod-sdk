// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云最新交易信息
    public class ALiYunLatestTransaction : TeaModel {
        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // transaction_v10_type
        /// <summary>
        /// <b>Example:</b>
        /// <para>transaction_v10_type</para>
        /// </summary>
        [NameInMap("transaction_v10_type")]
        [Validation(Required=false)]
        public string TransactionV10Type { get; set; }

        // trans_type_v6
        /// <summary>
        /// <b>Example:</b>
        /// <para>trans_type_v6</para>
        /// </summary>
        [NameInMap("trans_type_v6")]
        [Validation(Required=false)]
        public string TransTypeV6 { get; set; }

        // from
        /// <summary>
        /// <b>Example:</b>
        /// <para>from</para>
        /// </summary>
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // to
        /// <summary>
        /// <b>Example:</b>
        /// <para>to</para>
        /// </summary>
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231231231</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

    }

}
