// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // 阿里云数字权证服务信息结构体
    public class AliYunDigitalServiceInfo : TeaModel {
        // 项目总数
        [NameInMap("project_count")]
        [Validation(Required=false)]
        public long? ProjectCount { get; set; }

        // 项目上限
        [NameInMap("project_limit")]
        [Validation(Required=false)]
        public long? ProjectLimit { get; set; }

        // 资源存储使用量
        [NameInMap("storage_used")]
        [Validation(Required=false)]
        public long? StorageUsed { get; set; }

        // 资源存储容量上限
        [NameInMap("storage_limit")]
        [Validation(Required=false)]
        public long? StorageLimit { get; set; }

        // 日访问流量
        [NameInMap("traffic_daily_used")]
        [Validation(Required=false)]
        public long? TrafficDailyUsed { get; set; }

        // 日流量上限
        [NameInMap("traffic_daily_limit")]
        [Validation(Required=false)]
        public long? TrafficDailyLimit { get; set; }

    }

}
