// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerFundmngpendingeventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 事件id
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 处理动作 
        // REJECT 拒绝，
        // CONFIRM 确认
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

    }

}
