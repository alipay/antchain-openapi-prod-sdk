// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 资产附属信息
    public class AssetExtInfo : TeaModel {
        // 发放账户余额
        [NameInMap("dispense_balance")]
        [Validation(Required=true)]
        public string DispenseBalance { get; set; }

        // 发放账户归属租户ID
        [NameInMap("dispense_tenant_id")]
        [Validation(Required=true)]
        public string DispenseTenantId { get; set; }

        // 用户账户余额
        [NameInMap("user_credit_balance")]
        [Validation(Required=true)]
        public string UserCreditBalance { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
