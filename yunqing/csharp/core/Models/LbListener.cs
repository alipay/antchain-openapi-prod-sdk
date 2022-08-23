// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // lb实例监听器
    public class LbListener : TeaModel {
        // lb监听器协议：HTTP、TCP
        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

        // 监听器端口
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // 监听器后端端口
        [NameInMap("backend_server_port")]
        [Validation(Required=true)]
        public long? BackendServerPort { get; set; }

        // 后端转发端口
        [NameInMap("backend_server_forward_port")]
        [Validation(Required=true)]
        public long? BackendServerForwardPort { get; set; }

        // 健康检查开关
        [NameInMap("health_monitor")]
        [Validation(Required=true)]
        public bool? HealthMonitor { get; set; }

        // 健康检查端口
        [NameInMap("health_check_port")]
        [Validation(Required=true)]
        public long? HealthCheckPort { get; set; }

        // 健康检查阈值
        [NameInMap("health_check_threadhold")]
        [Validation(Required=true)]
        public long? HealthCheckThreadhold { get; set; }

        // 健康检查uri
        [NameInMap("health_check_uri")]
        [Validation(Required=false)]
        public string HealthCheckUri { get; set; }

        // 健康检查间隔
        [NameInMap("health_check_interval")]
        [Validation(Required=true)]
        public long? HealthCheckInterval { get; set; }

        // 健康检查http方法
        [NameInMap("http_method")]
        [Validation(Required=true)]
        public string HttpMethod { get; set; }

        // 健康检查期望返回的http code
        [NameInMap("expect_codes")]
        [Validation(Required=false)]
        public string ExpectCodes { get; set; }

    }

}
