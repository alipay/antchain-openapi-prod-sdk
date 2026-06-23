// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class CancelAntcloudTradeComboRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 套餐订单ID
        [NameInMap("combo_order_id")]
        [Validation(Required=true)]
        public string ComboOrderId { get; set; }

        // 租户ID，用于校验订单归属和操作权限
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
