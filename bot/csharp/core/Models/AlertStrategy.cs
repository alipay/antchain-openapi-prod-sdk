// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 告警策略
    public class AlertStrategy : TeaModel {
        // 主键ID 
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 场景码
        // 
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
        [NameInMap("strategy_type")]
        [Validation(Required=true)]
        public string StrategyType { get; set; }

        // 策略详情，json格式
        [NameInMap("strategy_detail")]
        [Validation(Required=true)]
        public string StrategyDetail { get; set; }

        // 是否启用，默认false
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
