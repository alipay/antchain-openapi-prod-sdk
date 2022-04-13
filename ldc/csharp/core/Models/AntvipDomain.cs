// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 添加antvipdomain请求
    public class AntvipDomain : TeaModel {
        // 应用名称
        [NameInMap("application")]
        [Validation(Required=true)]
        public string Application { get; set; }

        // 部署单元cell名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 健康检查端口，非必填项
        [NameInMap("health_check_default_port")]
        [Validation(Required=false)]
        public long? HealthCheckDefaultPort { get; set; }

        // 健康检查类型，默认为TCP
        [NameInMap("health_check_type")]
        [Validation(Required=false)]
        public string HealthCheckType { get; set; }

    }

}
