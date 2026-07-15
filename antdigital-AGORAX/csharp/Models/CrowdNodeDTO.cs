// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 人群配置
    public class CrowdNodeDTO : TeaModel {
        // 节点id
        /// <summary>
        /// <b>Example:</b>
        /// <para>c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>GROUP</para>
        /// </summary>
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public CrowdNodeTypeEnum NodeType { get; set; }

        // 是否排除
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("exclude")]
        [Validation(Required=true)]
        public bool? Exclude { get; set; }

        // 节点配置
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;nodeConfig&quot;: {   &quot;tagCode&quot;: &quot;P0010GC6&quot;,   &quot;valueList&quot;: [     {       &quot;selectedValues&quot;: [         &quot;18&quot;,         &quot;30&quot;       ],       &quot;operator&quot;: &quot;BT&quot;     }   ],   &quot;tagType&quot;: &quot;BASE&quot; }</para>
        /// </summary>
        [NameInMap("node_config")]
        [Validation(Required=true)]
        public string NodeConfig { get; set; }

    }

}
