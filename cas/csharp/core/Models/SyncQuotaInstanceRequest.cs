// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class SyncQuotaInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // quota_instance_ids，从quota.instance.query返回
        [NameInMap("quota_instance_ids")]
        [Validation(Required=true)]
        public List<string> QuotaInstanceIds { get; set; }

    }

}
