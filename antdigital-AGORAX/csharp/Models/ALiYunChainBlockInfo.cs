// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云最新区块列表查询的单元信息
    public class ALiYunChainBlockInfo : TeaModel {
        // alias
        /// <summary>
        /// <b>Example:</b>
        /// <para>alias</para>
        /// </summary>
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // block_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>block_hash</para>
        /// </summary>
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // root_tx_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>root_tx_hash</para>
        /// </summary>
        [NameInMap("root_tx_hash")]
        [Validation(Required=false)]
        public string RootTxHash { get; set; }

        // height
        /// <summary>
        /// <b>Example:</b>
        /// <para>120</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // previous_hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>previous_hash</para>
        /// </summary>
        [NameInMap("previous_hash")]
        [Validation(Required=false)]
        public string PreviousHash { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>12312312312</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // biz_data
        /// <summary>
        /// <b>Example:</b>
        /// <para>biz_data</para>
        /// </summary>
        [NameInMap("biz_data")]
        [Validation(Required=false)]
        public string BizData { get; set; }

        // transaction_size
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("transaction_size")]
        [Validation(Required=false)]
        public long? TransactionSize { get; set; }

        // version
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // size
        /// <summary>
        /// <b>Example:</b>
        /// <para>size</para>
        /// </summary>
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

    }

}
