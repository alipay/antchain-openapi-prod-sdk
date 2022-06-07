// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class QueryMerchantAgreementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 签约时的请求单据号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务来源场景码，由中台分配给业务方
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 渠道场景码, 由中台分配给业务方
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

    }

}
