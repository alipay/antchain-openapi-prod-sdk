// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class QueryPartnerSettleinRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户来源-用于租户隔离
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 入驻申请时，返回的申请id
        [NameInMap("apply_id")]
        [Validation(Required=true)]
        public long? ApplyId { get; set; }

    }

}
