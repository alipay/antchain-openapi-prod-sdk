// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // trace span
    public class TraceSpan : TeaModel {
        // 组件类型
        [NameInMap("component")]
        [Validation(Required=false)]
        public string Component { get; set; }

        // 毫秒耗时
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 服务描述信息
        [NameInMap("info")]
        [Validation(Required=false)]
        public string Info { get; set; }

        // span kind, CLIENT SERVER PRODUCER CONSUMER
        [NameInMap("kind")]
        [Validation(Required=false)]
        public string Kind { get; set; }

        // local endpoint ip
        [NameInMap("local_ip")]
        [Validation(Required=false)]
        public string LocalIp { get; set; }

        // local endpoint service name
        [NameInMap("local_service_name")]
        [Validation(Required=false)]
        public string LocalServiceName { get; set; }

        // local idc name
        [NameInMap("local_idc_name")]
        [Validation(Required=false)]
        public string LocalIdcName { get; set; }

        // local cell name
        [NameInMap("local_cell_name")]
        [Validation(Required=false)]
        public string LocalCellName { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // parent_id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // remote endpoint ip
        [NameInMap("remote_ip")]
        [Validation(Required=false)]
        public string RemoteIp { get; set; }

        // remote endpoint service name
        [NameInMap("remote_service_name")]
        [Validation(Required=false)]
        public string RemoteServiceName { get; set; }

        // remote idc name
        [NameInMap("remote_idc_name")]
        [Validation(Required=false)]
        public string RemoteIdcName { get; set; }

        // remote cell name
        [NameInMap("remote_cell_name")]
        [Validation(Required=false)]
        public string RemoteCellName { get; set; }

        // span_id
        [NameInMap("span_id")]
        [Validation(Required=false)]
        public string SpanId { get; set; }

        // 开始时间, 毫秒时间戳
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 状态码
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // span tags, 是关于span的键值对
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeySet> Tags { get; set; }

        // trace id
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

    }

}
