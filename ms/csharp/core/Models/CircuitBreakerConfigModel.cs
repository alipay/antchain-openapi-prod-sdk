// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 配置信息
    public class CircuitBreakerConfigModel : TeaModel {
        // 熔断错误比率条件
        [NameInMap("error_percent_threshold")]
        [Validation(Required=false)]
        public long? ErrorPercentThreshold { get; set; }

        // 请求超时时间
        [NameInMap("provider_timeout")]
        [Validation(Required=false)]
        public long? ProviderTimeout { get; set; }

        // 发生熔断的总请求数
        [NameInMap("request_volume_threshold")]
        [Validation(Required=false)]
        public long? RequestVolumeThreshold { get; set; }

        // 熔断之后时间窗口
        [NameInMap("sleep_window")]
        [Validation(Required=true)]
        public long? SleepWindow { get; set; }

        // metric窗口
        [NameInMap("total_metric_window")]
        [Validation(Required=true)]
        public long? TotalMetricWindow { get; set; }

        // rpc超时时间>0
        [NameInMap("rpc_timeout")]
        [Validation(Required=false)]
        public long? RpcTimeout { get; set; }

        // 平均RT阈值>0
        [NameInMap("average_rt_threshold")]
        [Validation(Required=false)]
        public long? AverageRtThreshold { get; set; }

    }

}
