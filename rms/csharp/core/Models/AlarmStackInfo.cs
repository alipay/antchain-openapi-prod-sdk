// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 技术栈信息，用于查询告警规则、历史。
    public class AlarmStackInfo : TeaModel {
        // 是应用监控，还是自定义监控
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

        // 数据源
        [NameInMap("datasource")]
        [Validation(Required=false)]
        public string Datasource { get; set; }

        // 应用类型
        [NameInMap("alarm_target_type")]
        [Validation(Required=false)]
        public string AlarmTargetType { get; set; }

        // 应用名称
        [NameInMap("alarm_target_identify")]
        [Validation(Required=false)]
        public string AlarmTargetIdentify { get; set; }

    }

}
