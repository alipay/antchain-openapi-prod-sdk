// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 内部建链信息查询
    public class CreateBlockchainInfo : TeaModel {
        // 链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>141a48c42f1e47b085a4502dab442553</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 链的状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOMAL</para>
        /// </summary>
        [NameInMap("blockchain_status")]
        [Validation(Required=true)]
        public string BlockchainStatus { get; set; }

        // 链的类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PROD、TEST</para>
        /// </summary>
        [NameInMap("blockchain_type")]
        [Validation(Required=true)]
        public string BlockchainType { get; set; }

        // 链的名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>区块链</para>
        /// </summary>
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // 节点数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("blockchan_node_num")]
        [Validation(Required=true)]
        public long? BlockchanNodeNum { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1609731134000</para>
        /// </summary>
        [NameInMap("blockchain_create_time")]
        [Validation(Required=true)]
        public long? BlockchainCreateTime { get; set; }

    }

}
