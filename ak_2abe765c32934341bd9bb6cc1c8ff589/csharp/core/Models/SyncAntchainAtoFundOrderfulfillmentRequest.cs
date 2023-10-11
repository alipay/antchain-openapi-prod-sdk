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
        [Validation(Required=true, MaxLength=50)]
        public string MerchantTenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 租期编号
        [NameInMap("lease_term_index")]
        [Validation(Required=true)]
        public long? LeaseTermIndex { get; set; }

        // 租金归还状态，
        // 1.足额归还
        // 2.部分归还
        // 3.未归还，
        // 4退租,
        // 5该订单整个生命周期已完结
        [NameInMap("rental_return_state")]
        [Validation(Required=true)]
        public long? RentalReturnState { get; set; }

        // 租金归还金额,精确到分，即1234表示12.34元
        [NameInMap("rental_money")]
        [Validation(Required=true)]
        public long? RentalMoney { get; set; }

        // 归还时间，格式为"2019-07-31 12:00:00"
        [NameInMap("return_time")]
        [Validation(Required=true)]
        public string ReturnTime { get; set; }

        // 归还方式，
        // 1.预授权代扣
        // 2.支付宝代扣
        // 3.主动还款
        // 4.其他
        // 5.网商直付通
        // 6.网商委托代扣
        [NameInMap("return_way")]
        [Validation(Required=true)]
        public long? ReturnWay { get; set; }

        // 还款凭证类型，
        // 1.支付宝
        // 2.平台代收（客户主动还款）
        // 3.其他
        // 6.网商银行
        [NameInMap("return_voucher_type")]
        [Validation(Required=true)]
        public long? ReturnVoucherType { get; set; }

        // 还款凭证编号，不超过128字符，1.支付宝流水号
        [NameInMap("return_voucher_serial")]
        [Validation(Required=true, MaxLength=128)]
        public string ReturnVoucherSerial { get; set; }

        // 手续费，如通过预授权、代扣的方式规划，必填，单位为分
        // 1234代表12.34元
        [NameInMap("charge")]
        [Validation(Required=true)]
        public long? Charge { get; set; }

        // 剩余归还期数
        [NameInMap("remain_term")]
        [Validation(Required=true)]
        public long? RemainTerm { get; set; }

    }

}
