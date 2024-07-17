// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 节点数据结构
    public class Node : TeaModel {
        // 节点的id
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点名称
        [NameInMap("node_name")]
        [Validation(Required=true)]
        public string NodeName { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 节点在画布的横向位置
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // 节点在画布的纵向位置
        [NameInMap("y")]
        [Validation(Required=true)]
        public long? Y { get; set; }

        // 节点配置信息
        [NameInMap("node_info")]
        [Validation(Required=true)]
        public NodeInfo NodeInfo { get; set; }

        // 交互节点的首问播报
        [NameInMap("node_outputs")]
        [Validation(Required=true)]
        public Output NodeOutputs { get; set; }

        // 交互节点的新的首问播报
        [NameInMap("first_outputs")]
        [Validation(Required=true)]
        public List<Output> FirstOutputs { get; set; }

        // 视频首句播报配置
        [NameInMap("node_video_output")]
        [Validation(Required=true)]
        public Output NodeVideoOutput { get; set; }

        // 视频结束配置
        [NameInMap("end_video_output")]
        [Validation(Required=true)]
        public OutputGroup EndVideoOutput { get; set; }

    }

}
