// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateLoadbalanceSpecRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 公网类型实例的付费方式。取值： PAY_BY_BANDWIDTH：按带宽计费。 PAY_BY_TRAFFIC：按流量计费（默认值）。
        [NameInMap("internet_charge_type")]
        [Validation(Required=true)]
        public string InternetChargeType { get; set; }

        // 若为按带宽计费类型需填写此字段
        [NameInMap("bandwidth")]
        [Validation(Required=false)]
        public long? Bandwidth { get; set; }

        // lb paas id
        [NameInMap("loadbalance_sequence")]
        [Validation(Required=true)]
        public string LoadbalanceSequence { get; set; }

    }

}
