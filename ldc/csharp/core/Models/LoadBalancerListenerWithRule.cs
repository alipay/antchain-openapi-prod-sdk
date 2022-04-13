// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入listener需要配置转发规则。
    public class LoadBalancerListenerWithRule : TeaModel {
        // 统一接入域名。
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // 负载均衡监听。
        [NameInMap("listener")]
        [Validation(Required=true)]
        public LoadBalancerListener Listener { get; set; }

        // 转发路径。
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 权重。
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
