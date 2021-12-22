// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddAlertStrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 场景码
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
