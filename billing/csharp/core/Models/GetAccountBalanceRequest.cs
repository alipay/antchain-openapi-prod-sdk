// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BILLING.Models
{
    public class GetAccountBalanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 渠道来源： DEFAULT 官网 ANT_OPEN_SERVICE_MARKET 开放平-服务市场台 
        [NameInMap("from_channel")]
        [Validation(Required=true)]
        public string FromChannel { get; set; }

        // 租户id,外部用户唯一id，如蚂蚁通行证id
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
