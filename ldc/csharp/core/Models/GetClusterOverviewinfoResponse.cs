// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetClusterOverviewinfoResponse : TeaModel {
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

        // cpu
        [NameInMap("limited_cpu")]
        [Validation(Required=false)]
        public long? LimitedCpu { get; set; }

        // cpu unit
        [NameInMap("limited_cpu_unit")]
        [Validation(Required=false)]
        public string LimitedCpuUnit { get; set; }

        // memory
        [NameInMap("limited_memory")]
        [Validation(Required=false)]
        public long? LimitedMemory { get; set; }

        // memory unit
        [NameInMap("limited_memory_unit")]
        [Validation(Required=false)]
        public string LimitedMemoryUnit { get; set; }

        // pod overview info
        [NameInMap("pod_overview_info")]
        [Validation(Required=false)]
        public PodOverviewInfo PodOverviewInfo { get; set; }

        // total node number
        [NameInMap("total_node_num")]
        [Validation(Required=false)]
        public string TotalNodeNum { get; set; }

        // unhealthy node num
        [NameInMap("un_healthy_node_num")]
        [Validation(Required=false)]
        public string UnHealthyNodeNum { get; set; }

        // used cpu
        [NameInMap("used_cpu")]
        [Validation(Required=false)]
        public long? UsedCpu { get; set; }

        // used cpu unit
        [NameInMap("used_cpu_unit")]
        [Validation(Required=false)]
        public string UsedCpuUnit { get; set; }

        // used memory
        [NameInMap("used_memory")]
        [Validation(Required=false)]
        public long? UsedMemory { get; set; }

        // used memory unit
        [NameInMap("used_memory_unit")]
        [Validation(Required=false)]
        public string UsedMemoryUnit { get; set; }

    }

}
