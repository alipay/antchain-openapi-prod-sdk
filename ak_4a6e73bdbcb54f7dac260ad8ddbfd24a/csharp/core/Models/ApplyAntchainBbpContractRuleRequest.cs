// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4a6e73bdbcb54f7dac260ad8ddbfd24a.Models
{
    public class ApplyAntchainBbpContractRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务提供商
        [NameInMap("sp_provider")]
        [Validation(Required=true)]
        public SpProvider SpProvider { get; set; }

        // 明细
        [NameInMap("rule_details")]
        [Validation(Required=true)]
        public List<RuleDetail> RuleDetails { get; set; }

        // confirmer
        [NameInMap("confirmer")]
        [Validation(Required=true)]
        public string Confirmer { get; set; }

        // 确认时间
        [NameInMap("confirm_date")]
        [Validation(Required=true)]
        public string ConfirmDate { get; set; }

        // confirm_status
        [NameInMap("confirm_status")]
        [Validation(Required=true)]
        public string ConfirmStatus { get; set; }

    }

}
