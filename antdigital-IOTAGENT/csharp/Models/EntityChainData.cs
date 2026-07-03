// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 实体上链数据
    public class EntityChainData : TeaModel {
        // 实体ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456</para>
        /// </summary>
        [NameInMap("entity_id")]
        [Validation(Required=true)]
        public string EntityId { get; set; }

        // 数据原文
        /// <summary>
        /// <b>Example:</b>
        /// <para>content</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 数据原文对应的签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>1ac3dfe2</para>
        /// </summary>
        [NameInMap("sign")]
        [Validation(Required=true)]
        public string Sign { get; set; }

        // 数据原文上链哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>1f2a9ec2b</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
