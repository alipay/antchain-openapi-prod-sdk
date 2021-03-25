// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 资产
    public class Asset : TeaModel {
        // 资产管理员ID
        [NameInMap("admin_id")]
        [Validation(Required=true)]
        public string AdminId { get; set; }

        // 资产附属信息
        [NameInMap("asset_ext_info")]
        [Validation(Required=true)]
        public AssetExtInfo AssetExtInfo { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 资产名称
        [NameInMap("asset_name")]
        [Validation(Required=true)]
        public string AssetName { get; set; }

        // 资产汇率
        [NameInMap("asset_rate")]
        [Validation(Required=true)]
        public string AssetRate { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 发行账户余额
        [NameInMap("issue_account_balance")]
        [Validation(Required=true)]
        public string IssueAccountBalance { get; set; }

        // 过期回收账户余额
        [NameInMap("overdue_recovery_account_balance")]
        [Validation(Required=true)]
        public string OverdueRecoveryAccountBalance { get; set; }

        // 支付收款账户余额
        [NameInMap("receive_payment_account_balance")]
        [Validation(Required=true)]
        public string ReceivePaymentAccountBalance { get; set; }

        // 中继账户余额
        [NameInMap("relay_account_balance")]
        [Validation(Required=true)]
        public string RelayAccountBalance { get; set; }

        // 资产状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 资产总发行量
        [NameInMap("total_issue_balance")]
        [Validation(Required=true)]
        public string TotalIssueBalance { get; set; }

    }

}
