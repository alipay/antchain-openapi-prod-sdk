// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 自动进件订单信息
    public class LeaseOrderInfo : TeaModel {
        // 出租方平台名称
        [NameInMap("lessor_platform_name")]
        [Validation(Required=false)]
        public string LessorPlatformName { get; set; }

        // 订单号
        [NameInMap("order_number")]
        [Validation(Required=true)]
        public string OrderNumber { get; set; }

        // 合同编号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 合同名称
        [NameInMap("contract_name")]
        [Validation(Required=false)]
        public string ContractName { get; set; }

        // 订单商品信息列表
        [NameInMap("order_items")]
        [Validation(Required=true)]
        public List<OrderItem> OrderItems { get; set; }

        // 设备及配件总价（单位元）
        [NameInMap("total_device_price")]
        [Validation(Required=true)]
        public string TotalDevicePrice { get; set; }

        // 押金金额（单位元）
        [NameInMap("deposit_amount")]
        [Validation(Required=true)]
        public string DepositAmount { get; set; }

        // 免押金额
        [NameInMap("free_deposit")]
        [Validation(Required=true)]
        public string FreeDeposit { get; set; }

        // 签约时间
        [NameInMap("sign_time")]
        [Validation(Required=true)]
        public string SignTime { get; set; }

        // 租期起始时间
        [NameInMap("lease_start_time")]
        [Validation(Required=true)]
        public string LeaseStartTime { get; set; }

        // 租期结束时间
        [NameInMap("lease_end_time")]
        [Validation(Required=true)]
        public string LeaseEndTime { get; set; }

        // 买断金额计算公式
        [NameInMap("buyout_amount_formula_calc")]
        [Validation(Required=true)]
        public string BuyoutAmountFormulaCalc { get; set; }

        // 首付款（单位元）
        [NameInMap("pay_in_advance")]
        [Validation(Required=true)]
        public string PayInAdvance { get; set; }

    }

}
