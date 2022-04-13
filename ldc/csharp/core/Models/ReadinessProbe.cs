// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器健康检查-ReadinessProbe。
    public class ReadinessProbe : TeaModel {
        // 命令行方式的健康监测配置。
        [NameInMap("exec_action")]
        [Validation(Required=false)]
        public ExecAction ExecAction { get; set; }

        // 不健康阈值。
        [NameInMap("failure_threshold")]
        [Validation(Required=true)]
        public long? FailureThreshold { get; set; }

        // http方式的健康监测配置。
        [NameInMap("http_get_action")]
        [Validation(Required=false)]
        public HttpGetAction HttpGetAction { get; set; }

        // 首次检查延时。
        [NameInMap("initial_delay_seconds")]
        [Validation(Required=true)]
        public long? InitialDelaySeconds { get; set; }

        // 不健康阈值。
        [NameInMap("period_seconds")]
        [Validation(Required=true)]
        public long? PeriodSeconds { get; set; }

        // 健康阈值。
        [NameInMap("success_threshold")]
        [Validation(Required=true)]
        public long? SuccessThreshold { get; set; }

        // tcp方式的健康监测配置。
        [NameInMap("tcp_socket_action")]
        [Validation(Required=false)]
        public TcpSocketAction TcpSocketAction { get; set; }

        // 检查超时。
        [NameInMap("timeout_seconds")]
        [Validation(Required=true)]
        public long? TimeoutSeconds { get; set; }

    }

}
