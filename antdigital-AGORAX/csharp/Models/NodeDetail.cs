// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权流程节点详细信息
    public class NodeDetail : TeaModel {
        // 节点审批意见
        /// <summary>
        /// <b>Example:</b>
        /// <para>agree comment</para>
        /// </summary>
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 节点ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>Bob</para>
        /// </summary>
        [NameInMap("node_name")]
        [Validation(Required=true)]
        public string NodeName { get; set; }

        // 节点状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>Agree</para>
        /// </summary>
        [NameInMap("node_status")]
        [Validation(Required=true)]
        public string NodeStatus { get; set; }

        // 节点审批时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592883002497</para>
        /// </summary>
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public long? OperateTime { get; set; }

        // 扩展参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

    }

}
