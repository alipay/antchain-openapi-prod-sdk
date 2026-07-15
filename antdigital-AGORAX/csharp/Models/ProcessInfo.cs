// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权服务流程信息
    public class ProcessInfo : TeaModel {
        // 当前处理节点
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("current_node")]
        [Validation(Required=true)]
        public long? CurrentNode { get; set; }

        // 扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a</para>
        /// </summary>
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 节点列表
        [NameInMap("nodes")]
        [Validation(Required=true)]
        public List<NodeDetail> Nodes { get; set; }

        // 流程ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a</para>
        /// </summary>
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 流程状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>processing</para>
        /// </summary>
        [NameInMap("process_status")]
        [Validation(Required=true)]
        public string ProcessStatus { get; set; }

        // 流程节点总数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 数据对象ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

    }

}
