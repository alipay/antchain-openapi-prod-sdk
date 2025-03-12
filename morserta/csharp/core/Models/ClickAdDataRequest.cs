// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class ClickAdDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 广告主id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public long? AccountId { get; set; }

        // 渠道，支持TENCENT
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 点击明细json string
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
