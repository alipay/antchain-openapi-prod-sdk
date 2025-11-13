// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商家履约信息
    public class MerchantOrderFulfillmentInfo : TeaModel {
        // 还款期数
        [NameInMap("term_index")]
        [Validation(Required=false)]
        public long? TermIndex { get; set; }

        // 订单用户租期编号
        [NameInMap("lease_term_index")]
        [Validation(Required=false)]
        public long? LeaseTermIndex { get; set; }

        // 租期归还状态
        [NameInMap("rental_return_state")]
        [Validation(Required=false)]
        public string RentalReturnState { get; set; }

        // 还款方式
        [NameInMap("return_way")]
        [Validation(Required=false)]
        public string ReturnWay { get; set; }

        // 支付类型
        [NameInMap("pay_type")]
        [Validation(Required=false)]
        public string PayType { get; set; }

        // 实际到账金额
        [NameInMap("total_money")]
        [Validation(Required=false)]
        public long? TotalMoney { get; set; }

        // 实际还款时间(yyyy-MM-dd HH:mm:ss)
        [NameInMap("return_time")]
        [Validation(Required=false)]
        public string ReturnTime { get; set; }

        // 外部交易流水号
        [NameInMap("return_voucher_serial")]
        [Validation(Required=false)]
        public string ReturnVoucherSerial { get; set; }

        // 支付宝交易流水号
        [NameInMap("alipay_trade_no")]
        [Validation(Required=false)]
        public string AlipayTradeNo { get; set; }

        // 资方公司名称
        [NameInMap("fund_company_name")]
        [Validation(Required=false)]
        public string FundCompanyName { get; set; }

        // 支付描述
        [NameInMap("payment_description")]
        [Validation(Required=false)]
        public string PaymentDescription { get; set; }

    }

}
