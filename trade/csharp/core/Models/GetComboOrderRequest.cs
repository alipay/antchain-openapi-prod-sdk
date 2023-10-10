// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class GetComboOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 套餐订单ID
        [NameInMap("combo_order_id")]
        [Validation(Required=true)]
        public string ComboOrderId { get; set; }

        // 是否包含履约信息
        [NameInMap("include_fulfill_info")]
        [Validation(Required=true)]
        public bool? IncludeFulfillInfo { get; set; }

    }

}
