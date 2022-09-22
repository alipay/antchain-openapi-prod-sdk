// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 摘流配置
    public class TrafficConfig : TeaModel {
        // 是否摘除注册中心流量
        [NameInMap("registry_managed")]
        [Validation(Required=false)]
        public bool? RegistryManaged { get; set; }

        // 摘流等待时间
        [NameInMap("registry_traffic_off_wait_sec")]
        [Validation(Required=false)]
        public long? RegistryTrafficOffWaitSec { get; set; }

    }

}
