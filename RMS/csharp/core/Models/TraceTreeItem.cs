// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 单链路树状图树节点
    public class TraceTreeItem : TeaModel {
        // 应用名
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 组件类型
        [NameInMap("component")]
        [Validation(Required=false)]
        public string Component { get; set; }

        // 耗时, 毫秒
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // 机房信息
        [NameInMap("idc")]
        [Validation(Required=false)]
        public string Idc { get; set; }

        // 描述信息
        [NameInMap("info")]
        [Validation(Required=false)]
        public string Info { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 对应的span的类型 枚举类型 CLIENT SERVER CONSUMER PRODUCER
        [NameInMap("kind")]
        [Validation(Required=false)]
        public string Kind { get; set; }

        // parent span id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // 请求体字节大小, 如果取不到就为-1
        [NameInMap("request_size")]
        [Validation(Required=false)]
        public long? RequestSize { get; set; }

        // 响应体大小, 如果取不到就为-1
        [NameInMap("response_size")]
        [Validation(Required=false)]
        public long? ResponseSize { get; set; }

        // span id
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

        // 键值对
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeySet> Tags { get; set; }

        // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public long? TreeId { get; set; }

        // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
        [NameInMap("tree_parent_id")]
        [Validation(Required=false)]
        public long? TreeParentId { get; set; }

        // 单元化信息
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

    }

}
