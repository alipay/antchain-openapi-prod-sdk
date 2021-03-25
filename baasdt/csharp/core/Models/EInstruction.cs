// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 权益流水
    public class EInstruction : TeaModel {
        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 资产的汇率
        [NameInMap("asset_rate")]
        [Validation(Required=true)]
        public string AssetRate { get; set; }

        // 资产扣减数量(单位:个)
        [NameInMap("deduct_asset_amount")]
        [Validation(Required=true)]
        public string DeductAssetAmount { get; set; }

        // 扣减商户备付金授信额(单位:元)
        [NameInMap("deduct_credit_amount")]
        [Validation(Required=true)]
        public string DeductCreditAmount { get; set; }

        // 扣减商户备付金余额(单位:元)
        [NameInMap("deduct_debit_amount")]
        [Validation(Required=true)]
        public string DeductDebitAmount { get; set; }

        // 被扣减备付金的租户ID
        [NameInMap("deduct_tenant_id")]
        [Validation(Required=true)]
        public string DeductTenantId { get; set; }

        // 权益ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 权益名称
        [NameInMap("equity_name")]
        [Validation(Required=true)]
        public string EquityName { get; set; }

        // 权益对用户价格(单位:元)
        [NameInMap("equity_price")]
        [Validation(Required=true)]
        public string EquityPrice { get; set; }

        // 权益面值(单位:元)
        [NameInMap("equity_value")]
        [Validation(Required=true)]
        public string EquityValue { get; set; }

        // 附言Deliver/Complete/OutOfStore/WriteOff)
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 发起操作的租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 业务交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 对换单流水状态：
        // 0        // 权益兑换单创建
        // 1        // 权益兑换单接单
        // 2        // 权益兑换单发货
        // 3        // 权益兑换单确认收货
        // 4        // 权益兑换单缺货
        // 5        // 权益兑换单核销
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 权益归属租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 交易时间戳
        [NameInMap("time_stamp")]
        [Validation(Required=true)]
        public long? TimeStamp { get; set; }

        // 兑换类型(商户身份/用户身份)
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 用户身份兑换/商户兑换的受益用户
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 版本（之前版本为0，不收取手续费，之后版本为1，收取手续费）
        [NameInMap("instruction_version")]
        [Validation(Required=true)]
        public long? InstructionVersion { get; set; }

        // 收取手续费的金融云租户ID
        [NameInMap("commission_tenant_id")]
        [Validation(Required=true)]
        public string CommissionTenantId { get; set; }

        // 手续费(单位:元)
        [NameInMap("instruction_commission")]
        [Validation(Required=true)]
        public string InstructionCommission { get; set; }

        // 手续费扣减商户备付金余额(单位:元)
        [NameInMap("deduct_debit_commission")]
        [Validation(Required=true)]
        public string DeductDebitCommission { get; set; }

        // 手续费扣减商户备付金授信额(单位:元)
        [NameInMap("deduct_credit_commission")]
        [Validation(Required=true)]
        public string DeductCreditCommission { get; set; }

        // 资产手续费扣减数量(单位:个)
        [NameInMap("deduct_asset_commission")]
        [Validation(Required=true)]
        public string DeductAssetCommission { get; set; }

        // 手续费率
        [NameInMap("commission_rate")]
        [Validation(Required=true)]
        public string CommissionRate { get; set; }

        // 手续费id
        [NameInMap("commission_id")]
        [Validation(Required=true)]
        public string CommissionId { get; set; }

        // 手续费子id
        [NameInMap("commission_sub_id")]
        [Validation(Required=true)]
        public string CommissionSubId { get; set; }

        // 手续费状态（0:未提现，1:已提现）
        [NameInMap("commission_status")]
        [Validation(Required=true)]
        public long? CommissionStatus { get; set; }

        // 是否收取手续费
        [NameInMap("commission_charged")]
        [Validation(Required=true)]
        public long? CommissionCharged { get; set; }

    }

}
