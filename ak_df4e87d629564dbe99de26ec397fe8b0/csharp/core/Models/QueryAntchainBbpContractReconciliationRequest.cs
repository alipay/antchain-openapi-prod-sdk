// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_df4e87d629564dbe99de26ec397fe8b0.Models
{
    public class QueryAntchainBbpContractReconciliationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 供应商code
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 月份
        [NameInMap("score_dates")]
        [Validation(Required=true)]
        public List<string> ScoreDates { get; set; }

    }

}
