// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 链路详情的拓扑节点
    public class TraceDetailTopologyItem : TeaModel {
        // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public string TreeId { get; set; }

        // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
        [NameInMap("tree_parent_id")]
        [Validation(Required=false)]
        public string TreeParentId { get; set; }

        // 应用名
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // 应用ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 客户端是否经过mesh
        [NameInMap("has_client_mesh")]
        [Validation(Required=false)]
        public bool? HasClientMesh { get; set; }

        // 服务端是否经过mesh
        [NameInMap("has_server_mesh")]
        [Validation(Required=false)]
        public bool? HasServerMesh { get; set; }

        // 数据中心
        [NameInMap("idc_name")]
        [Validation(Required=false)]
        public string IdcName { get; set; }

        // 单元名
        [NameInMap("cell_name")]
        [Validation(Required=false)]
        public string CellName { get; set; }

        // 方法名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 客户端开始时间, 毫秒时间戳
        [NameInMap("client_start_time")]
        [Validation(Required=false)]
        public long? ClientStartTime { get; set; }

        // 服务端开始时间, 毫秒时间戳
        [NameInMap("server_start_time")]
        [Validation(Required=false)]
        public long? ServerStartTime { get; set; }

        // 客户端毫秒耗时
        [NameInMap("client_duration")]
        [Validation(Required=false)]
        public long? ClientDuration { get; set; }

        // 服务端毫秒耗时
        [NameInMap("server_duration")]
        [Validation(Required=false)]
        public long? ServerDuration { get; set; }

        // 客户端状态码
        [NameInMap("client_status")]
        [Validation(Required=false)]
        public string ClientStatus { get; set; }

        // 服务端状态码
        [NameInMap("server_status")]
        [Validation(Required=false)]
        public string ServerStatus { get; set; }

        // 客户端组件类型
        [NameInMap("client_component")]
        [Validation(Required=false)]
        public string ClientComponent { get; set; }

        // 服务端组件类型
        [NameInMap("server_component")]
        [Validation(Required=false)]
        public string ServerComponent { get; set; }

        // 整体状态码
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 健康度耗时配置
        [NameInMap("apdex_threshold")]
        [Validation(Required=false)]
        public string ApdexThreshold { get; set; }

        // 健康度
        [NameInMap("apdex_status")]
        [Validation(Required=false)]
        public string ApdexStatus { get; set; }

        // 健康度数值
        [NameInMap("apdex_value")]
        [Validation(Required=false)]
        public string ApdexValue { get; set; }

    }

}
