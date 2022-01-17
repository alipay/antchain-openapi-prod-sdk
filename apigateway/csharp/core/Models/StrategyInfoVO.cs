// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 策略管理
    public class StrategyInfoVO : TeaModel {
        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 策略唯一标识
        [NameInMap("strategy_id")]
        [Validation(Required=false)]
        public string StrategyId { get; set; }

        // 策略名称
        [NameInMap("strategy_name")]
        [Validation(Required=false)]
        public string StrategyName { get; set; }

        // 策略状态
        [NameInMap("strategy_status")]
        [Validation(Required=false)]
        public string StrategyStatus { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 	
        // API数量
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 策略描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 策略类型
        [NameInMap("strategy_type")]
        [Validation(Required=false)]
        public string StrategyType { get; set; }

        // 名单集合
        [NameInMap("host")]
        [Validation(Required=false)]
        public List<string> Host { get; set; }

        // true, false
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

    }

}
