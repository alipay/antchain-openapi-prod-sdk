// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_af85f9fd5e88491296f8c6ff584ff090.Models
{
    public class ExecAntchainBbpContractReconciliationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 供应商
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 结算时间
        [NameInMap("score_date")]
        [Validation(Required=true)]
        public string ScoreDate { get; set; }

    }

}
