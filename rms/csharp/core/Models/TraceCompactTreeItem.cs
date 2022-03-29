// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 单链路紧凑树状图树节点
    public class TraceCompactTreeItem : TeaModel {
        // 方法名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 节点的id, 没有业务语义, 用于帮助前端还原树状结构
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public string TreeId { get; set; }

        // 父节点的id, 如果为0表示这是一个顶级节点, 没有业务语义, 用于帮助前端还原树状结构
        [NameInMap("tree_parent_id")]
        [Validation(Required=false)]
        public string TreeParentId { get; set; }

        // 客户端span是否缺失
        [NameInMap("client_missing")]
        [Validation(Required=false)]
        public bool? ClientMissing { get; set; }

        // 服务端span是否缺失
        [NameInMap("server_missing")]
        [Validation(Required=false)]
        public bool? ServerMissing { get; set; }

        // 客户端是否经过mesh
        [NameInMap("has_client_mesh")]
        [Validation(Required=false)]
        public bool? HasClientMesh { get; set; }

        // 服务端是否经过mesh
        [NameInMap("has_server_mesh")]
        [Validation(Required=false)]
        public bool? HasServerMesh { get; set; }

        // 是否包含子节点
        [NameInMap("has_children")]
        [Validation(Required=false)]
        public bool? HasChildren { get; set; }

        // 客户端应用名
        [NameInMap("client_app")]
        [Validation(Required=false)]
        public string ClientApp { get; set; }

        // 服务端应用名
        [NameInMap("server_app")]
        [Validation(Required=false)]
        public string ServerApp { get; set; }

        // 客户端 ip
        [NameInMap("client_ip")]
        [Validation(Required=false)]
        public string ClientIp { get; set; }

        // 服务端 ip
        [NameInMap("server_ip")]
        [Validation(Required=false)]
        public string ServerIp { get; set; }

        // 客户端 idc
        [NameInMap("client_idc_name")]
        [Validation(Required=false)]
        public string ClientIdcName { get; set; }

        // 服务端 idc
        [NameInMap("server_idc_name")]
        [Validation(Required=false)]
        public string ServerIdcName { get; set; }

        // 客户端 cell
        [NameInMap("client_cell_name")]
        [Validation(Required=false)]
        public string ClientCellName { get; set; }

        // 服务端 cell
        [NameInMap("server_cell_name")]
        [Validation(Required=false)]
        public string ServerCellName { get; set; }

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

        // 客户端span
        [NameInMap("client_span")]
        [Validation(Required=false)]
        public TraceSpan ClientSpan { get; set; }

        // 服务端span
        [NameInMap("server_span")]
        [Validation(Required=false)]
        public TraceSpan ServerSpan { get; set; }

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

    }

}
