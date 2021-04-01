// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinancePayorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 确认到账时间
        [NameInMap("arrive_time")]
        [Validation(Required=true)]
        public long? ArriveTime { get; set; }

        // 关联银行流水号
        [NameInMap("bank_sn")]
        [Validation(Required=true)]
        public string BankSn { get; set; }

        // 付款金额
        [NameInMap("pay_amount")]
        [Validation(Required=true)]
        public string PayAmount { get; set; }

        // 付款方银行账号
        [NameInMap("pay_bank_card_no")]
        [Validation(Required=true)]
        public string PayBankCardNo { get; set; }

        // 付款方开户行
        [NameInMap("pay_bank_name")]
        [Validation(Required=true)]
        public string PayBankName { get; set; }

        // 付款方did
        [NameInMap("pay_did")]
        [Validation(Required=false)]
        public string PayDid { get; set; }

        // 付款方名称
        [NameInMap("pay_name")]
        [Validation(Required=true)]
        public string PayName { get; set; }

        // 付款时间戳
        [NameInMap("pay_time")]
        [Validation(Required=true)]
        public long? PayTime { get; set; }

        // 支付类型
        [NameInMap("pay_type_new")]
        [Validation(Required=true)]
        public string PayTypeNew { get; set; }

        // 支付方式
        [NameInMap("pay_way")]
        [Validation(Required=true)]
        public string PayWay { get; set; }

        // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=false)]
        public string PlatformDid { get; set; }

        // 支付订单ID
        [NameInMap("pos_info_id")]
        [Validation(Required=true)]
        public string PosInfoId { get; set; }

        // 实际付款方开户行
        [NameInMap("real_pay_bank")]
        [Validation(Required=true)]
        public string RealPayBank { get; set; }

        // 实际付款方银行账号
        [NameInMap("real_pay_bank_card_no")]
        [Validation(Required=true)]
        public string RealPayBankCardNo { get; set; }

        // 实际付款方名称
        [NameInMap("real_pay_name")]
        [Validation(Required=true)]
        public string RealPayName { get; set; }

        // 收款方银行账号
        [NameInMap("recv_bank_card_no")]
        [Validation(Required=true)]
        public string RecvBankCardNo { get; set; }

        // 收款方开户行
        [NameInMap("recv_bank_name")]
        [Validation(Required=true)]
        public string RecvBankName { get; set; }

        // 收款方did
        [NameInMap("recv_did")]
        [Validation(Required=false)]
        public string RecvDid { get; set; }

        // 收款方名称
        [NameInMap("recv_name")]
        [Validation(Required=true)]
        public string RecvName { get; set; }

        // 关联的运单ID
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

    }

}
