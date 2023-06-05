// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ADOM.Models
{
    public class QueryAppmarketPrivacytestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 记录id
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public string RecordId { get; set; }

        // 实例id
        [NameInMap("inst_id")]
        [Validation(Required=true)]
        public string InstId { get; set; }

    }

}
