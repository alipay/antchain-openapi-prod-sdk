// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateQuotaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 从Query接口找到此ID
        [NameInMap("quota_id")]
        [Validation(Required=true)]
        public string QuotaId { get; set; }

        // 额度，不更新请保持原值，不要留空
        [NameInMap("hard_limit")]
        [Validation(Required=true)]
        public long? HardLimit { get; set; }

    }

}
