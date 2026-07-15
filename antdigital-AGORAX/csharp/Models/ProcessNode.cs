// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 数据授权服务审批流程节点结构体
    public class ProcessNode : TeaModel {
        // 审批节点ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=true, MaxLength=100)]
        public string NodeId { get; set; }

        // 节点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>Bob</para>
        /// </summary>
        [NameInMap("node_name")]
        [Validation(Required=true, MaxLength=64)]
        public string NodeName { get; set; }

        // 节点序号，从1开始编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("node_num")]
        [Validation(Required=true)]
        public long? NodeNum { get; set; }

    }

}
