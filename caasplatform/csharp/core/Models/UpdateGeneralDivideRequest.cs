// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class UpdateGeneralDivideRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 分账规则ID
        [NameInMap("rule_id")]
        [Validation(Required=true)]
        public string RuleId { get; set; }

        // 分账方用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 确认状态，0: 待确认；1:确认；2：拒绝
        [NameInMap("str_status")]
        [Validation(Required=true)]
        public string StrStatus { get; set; }

    }

}
