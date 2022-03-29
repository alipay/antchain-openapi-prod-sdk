// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraceTopologyResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 拓扑节点
        [NameInMap("nodes")]
        [Validation(Required=false)]
        public List<TopologyNode> Nodes { get; set; }

        // 拓扑边
        [NameInMap("edges")]
        [Validation(Required=false)]
        public List<TopologyEdge> Edges { get; set; }

        // 节点性能指标
        [NameInMap("node_metrics")]
        [Validation(Required=false)]
        public List<TimeSeriesMetrics> NodeMetrics { get; set; }

        // 边性能指标
        [NameInMap("edge_metrics")]
        [Validation(Required=false)]
        public List<TimeSeriesMetrics> EdgeMetrics { get; set; }

    }

}
