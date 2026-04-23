// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SMARTPROMOTION.Models
{
    // 资产包履约计划分配明细
    public class AssetPackagePlanAllocateDetail : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 类型
        // PERFORMANCE 履约
        // ASSET_PACKAGE_EXCESS 资产包超额
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 用户还款期数
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 用户还款时间yyyy-MM-dd
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public string PayDay { get; set; }

        // 用户还款金额，单位为分
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public long? PayAmount { get; set; }

        // 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
        [NameInMap("divide_ratio")]
        [Validation(Required=false)]
        public string DivideRatio { get; set; }

        // 商户履约分账金额
        [NameInMap("divide_amount")]
        [Validation(Required=false)]
        public long? DivideAmount { get; set; }

    }

}
