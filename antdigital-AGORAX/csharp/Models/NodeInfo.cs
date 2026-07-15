// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 链节点信息
    public class NodeInfo : TeaModel {
        // 链的区块高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("blockheight")]
        [Validation(Required=false)]
        public long? Blockheight { get; set; }

        // 节点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>名字</para>
        /// </summary>
        [NameInMap("nodename")]
        [Validation(Required=false)]
        public string Nodename { get; set; }

        // 节点健康状况
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // 节点版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.10</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
