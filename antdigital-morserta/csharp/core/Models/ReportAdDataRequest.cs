// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class ReportAdDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 广告主账号Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 报表级别level
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        // 回传数据，json array
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
