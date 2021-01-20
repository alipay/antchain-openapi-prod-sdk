// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraceTopologyResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 拓扑节点
        [NameInMap("nodes")]
        [Validation(Required=false)]
        public TopologyNode Nodes { get; set; }

        // 拓扑边
        [NameInMap("edges")]
        [Validation(Required=false)]
        public TopologyEdge Edges { get; set; }

        // 节点性能指标
        [NameInMap("node_metrics")]
        [Validation(Required=false)]
        public TimeSeriesMetrics NodeMetrics { get; set; }

        // 边性能指标
        [NameInMap("edge_metrics")]
        [Validation(Required=false)]
        public TimeSeriesMetrics EdgeMetrics { get; set; }

    }

}
