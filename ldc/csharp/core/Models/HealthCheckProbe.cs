// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 健康检查探针
    // 
    public class HealthCheckProbe : TeaModel {
        // 基于命令行类型的探针必填
        [NameInMap("exec_action")]
        [Validation(Required=false)]
        public ExecAction ExecAction { get; set; }

        // 探针运行失败阈值
        // 
        [NameInMap("failure_threshold")]
        [Validation(Required=true)]
        public long? FailureThreshold { get; set; }

        // 基于HTTP GET请求的探针必填
        // 
        [NameInMap("http_get_action")]
        [Validation(Required=false)]
        public HttpGetAction HttpGetAction { get; set; }

        // 探针初始运行延迟时间
        // 
        [NameInMap("initial_delay_seconds")]
        [Validation(Required=true)]
        public long? InitialDelaySeconds { get; set; }

        // 探针运行间隔时间
        // 
        [NameInMap("period_seconds")]
        [Validation(Required=true)]
        public long? PeriodSeconds { get; set; }

        // 探针运行成功阈值
        // 
        [NameInMap("success_threshold")]
        [Validation(Required=true)]
        public long? SuccessThreshold { get; set; }

        // 基于TCP连接的探针必填
        // 
        [NameInMap("tcp_socket_action")]
        [Validation(Required=false)]
        public TcpSocketAction TcpSocketAction { get; set; }

        // 探针运行超时时间
        // 
        [NameInMap("time_out_seconds")]
        [Validation(Required=true)]
        public long? TimeOutSeconds { get; set; }

    }

}
