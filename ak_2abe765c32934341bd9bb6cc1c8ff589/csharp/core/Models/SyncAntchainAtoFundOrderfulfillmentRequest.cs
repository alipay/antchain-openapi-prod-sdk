// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class SyncAntchainAtoFundOrderfulfillmentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=49)]
        public string MerchantTenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=49)]
        public string OrderId { get; set; }

        // 租期编号
        [NameInMap("lease_term_index")]
        [Validation(Required=true)]
        public long? LeaseTermIndex { get; set; }

        // 剩余归还期数
        [NameInMap("remain_term")]
        [Validation(Required=true)]
        public long? RemainTerm { get; set; }

        // 总期数
        [NameInMap("total_term")]
        [Validation(Required=true)]
        public long? TotalTerm { get; set; }

        // 租金归还状态，
        // RETURN_FULL : 足额归还 【终态】
        // NOT_RETURN : 未归还
        // CANCEL : 取消 【终态】
        [NameInMap("rental_return_state")]
        [Validation(Required=true)]
        public string RentalReturnState { get; set; }

        // 租金归还金额,精确到分，即1234表示12.34元
        [NameInMap("rental_money")]
        [Validation(Required=true)]
        public long? RentalMoney { get; set; }

        // 罚息金额，分，1234表示12.34元
        [NameInMap("penalty_fee_money")]
        [Validation(Required=true)]
        public long? PenaltyFeeMoney { get; set; }

        // 总金额，单位分
        [NameInMap("total_money")]
        [Validation(Required=true)]
        public long? TotalMoney { get; set; }

        // 归还时间，格式为"2019-07-31 12:00:00"
        [NameInMap("return_time")]
        [Validation(Required=false)]
        public string ReturnTime { get; set; }

        // 归还方式，
        // ANTDIGITAL： 数科代扣
        // FUND : 资方代扣
        // BANK : 银行转账
        // WECHAT : 微信支付
        [NameInMap("return_way")]
        [Validation(Required=false)]
        public string ReturnWay { get; set; }

        // 还款凭证编号
        [NameInMap("return_voucher_serial")]
        [Validation(Required=false, MaxLength=127)]
        public string ReturnVoucherSerial { get; set; }

        // 银行名字
        [NameInMap("bank_name")]
        [Validation(Required=false, MaxLength=127)]
        public string BankName { get; set; }

    }

}
