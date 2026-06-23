// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudTradeComboOptionsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 套餐版本唯一版本号，有值则优先使用
        [NameInMap("vid")]
        [Validation(Required=true)]
        public string Vid { get; set; }

        // 销售主体（如ZL6、ZL7）
        [NameInMap("ou")]
        [Validation(Required=false)]
        public string Ou { get; set; }

        // 购买租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 售卖市场
        [NameInMap("market_type")]
        [Validation(Required=false)]
        public string MarketType { get; set; }

    }

}
