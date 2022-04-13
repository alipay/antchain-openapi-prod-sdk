// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // service端口映射
    public class ServicePort : TeaModel {
        // 此端口映射名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // service端口映射在k8s层面的协议名，包括"TCP", "UDP", and "SCTP".
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // service端口映射前端端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // service分配到的节点端口
        [NameInMap("node_port")]
        [Validation(Required=false)]
        public long? NodePort { get; set; }

        // 后端端口，这里仅支持整数类型
        [NameInMap("target_port")]
        [Validation(Required=false)]
        public long? TargetPort { get; set; }

    }

}
