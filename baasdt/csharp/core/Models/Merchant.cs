// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商户
    public class Merchant : TeaModel {
        // 商户管理员ID
        [NameInMap("admin_id")]
        [Validation(Required=true)]
        public string AdminId { get; set; }

        // 商户描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 商户分布式身份ID
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 资金管理员ID
        [NameInMap("fund_manager_id")]
        [Validation(Required=true)]
        public string FundManagerId { get; set; }

        // 是否可以发行资产
        [NameInMap("is_asset_issuer")]
        [Validation(Required=true)]
        public bool? IsAssetIssuer { get; set; }

        // 是否可以采购权益
        [NameInMap("is_equity_consumer")]
        [Validation(Required=true)]
        public bool? IsEquityConsumer { get; set; }

        // 是否可以发行权益
        [NameInMap("is_equity_provider")]
        [Validation(Required=true)]
        public bool? IsEquityProvider { get; set; }

        // 备付金数据
        [NameInMap("provision")]
        [Validation(Required=true)]
        public Provision Provision { get; set; }

        // 商户状态: 0可用, 1下线, 2冻结
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户的损益账户
        [NameInMap("profit_loss_balance")]
        [Validation(Required=true)]
        public string ProfitLossBalance { get; set; }

    }

}
