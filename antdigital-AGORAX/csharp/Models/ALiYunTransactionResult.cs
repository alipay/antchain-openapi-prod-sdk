// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云交易查询结果
    public class ALiYunTransactionResult : TeaModel {
        // block_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>block_hash</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // block_height
        /// <summary>
        /// <b>Example:</b>
        /// <para>123131</para>
        /// </summary>
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // block_version
        /// <summary>
        /// <b>Example:</b>
        /// <para>block_version</para>
        /// </summary>
        [NameInMap("block_version")]
        [Validation(Required=false)]
        public string BlockVersion { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>213213</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // Transaction
        /// <summary>
        /// <b>Example:</b>
        /// <para>Transaction</para>
        /// </summary>
        [NameInMap("transaction")]
        [Validation(Required=false)]
        public ALiYunTransaction Transaction { get; set; }

    }

}
