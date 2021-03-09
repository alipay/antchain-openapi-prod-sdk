// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 监听器健康检查配置
    public class ListenerHealthMonitor : TeaModel {
        // check_type
        [NameInMap("check_type")]
        [Validation(Required=false)]
        public string CheckType { get; set; }

        // 默认 80
        [NameInMap("connect_port")]
        [Validation(Required=false)]
        public long? ConnectPort { get; set; }

        // 域名
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 健康阈值
        [NameInMap("healthy_threshold")]
        [Validation(Required=false)]
        public long? HealthyThreshold { get; set; }

        // health_check_http_code
        [NameInMap("health_check_http_code")]
        [Validation(Required=false)]
        public List<string> HealthCheckHttpCode { get; set; }

        // http_method
        [NameInMap("http_method")]
        [Validation(Required=false)]
        public string HttpMethod { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 监控检查间隔
        [NameInMap("interval")]
        [Validation(Required=true)]
        public long? Interval { get; set; }

        // 超时时间
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public long? Timeout { get; set; }

        // 不健康阈值
        [NameInMap("un_healthy_threshold")]
        [Validation(Required=false)]
        public long? UnHealthyThreshold { get; set; }

        // uri
        [NameInMap("uri")]
        [Validation(Required=false)]
        public string Uri { get; set; }

    }

}
