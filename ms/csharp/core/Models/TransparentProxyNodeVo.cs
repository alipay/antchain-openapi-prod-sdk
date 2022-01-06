// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持应用的节点展示结构
    public class TransparentProxyNodeVo : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 节点 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 应用实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // IP 地址
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // mosn 版本
        [NameInMap("mosn_version")]
        [Validation(Required=true)]
        public string MosnVersion { get; set; }

        // 节点状态
        [NameInMap("node_status")]
        [Validation(Required=true)]
        public string NodeStatus { get; set; }

        // 节点集群类型
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 节点是否在运行透明劫持
        [NameInMap("real_run")]
        [Validation(Required=true)]
        public string RealRun { get; set; }

        // Sidecar 状态
        [NameInMap("sidecar_status")]
        [Validation(Required=true)]
        public string SidecarStatus { get; set; }

        // 透明劫持开关
        [NameInMap("transparent_proxy_switch")]
        [Validation(Required=true)]
        public long? TransparentProxySwitch { get; set; }

    }

}
