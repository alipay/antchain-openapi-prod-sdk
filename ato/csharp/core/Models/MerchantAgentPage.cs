// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 进件分页对象
    public class MerchantAgentPage : TeaModel {
        // 进件id
        [NameInMap("pay_expand_id")]
        [Validation(Required=true)]
        public string PayExpandId { get; set; }

        // 	
        // 代理企业名称
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 租户8位id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 进件审核状态 枚举
        [NameInMap("pay_expand_status")]
        [Validation(Required=true)]
        public string PayExpandStatus { get; set; }

    }

}
