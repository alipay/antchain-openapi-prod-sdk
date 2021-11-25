// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractImplRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同编号,(确定是哪个合同的收付款，需要唯一标识id)
        [NameInMap("contract_info_code")]
        [Validation(Required=true)]
        public string ContractInfoCode { get; set; }

        // 收付款id
        [NameInMap("contract_impl_id")]
        [Validation(Required=true)]
        public long? ContractImplId { get; set; }

        // 付款方统一社会信用代码
        [NameInMap("party_a_bidder_code")]
        [Validation(Required=true)]
        public string PartyABidderCode { get; set; }

        // 付款方审核人Did
        [NameInMap("party_a_audit_did")]
        [Validation(Required=true)]
        public string PartyAAuditDid { get; set; }

        // 付款方名称	
        [NameInMap("party_a_name")]
        [Validation(Required=true)]
        public string PartyAName { get; set; }

        // 收款方统一社会信用代码
        [NameInMap("party_b_bidder_code")]
        [Validation(Required=true)]
        public string PartyBBidderCode { get; set; }

        // 收款方审核人Did
        [NameInMap("party_b_audit_did")]
        [Validation(Required=false)]
        public string PartyBAuditDid { get; set; }

        // 收款方名称
        [NameInMap("party_b_name")]
        [Validation(Required=true)]
        public string PartyBName { get; set; }

        // 拨付金额
        [NameInMap("pay_money")]
        [Validation(Required=true)]
        public string PayMoney { get; set; }

        // 金额币种代码
        [NameInMap("price_currency")]
        [Validation(Required=true)]
        public string PriceCurrency { get; set; }

        // 金额单位
        [NameInMap("price_unit")]
        [Validation(Required=true)]
        public string PriceUnit { get; set; }

        // 支付说明
        [NameInMap("remarks")]
        [Validation(Required=true)]
        public string Remarks { get; set; }

        // 款项类型
        [NameInMap("payment_type")]
        [Validation(Required=true)]
        public string PaymentType { get; set; }

        // 拨付时间
        [NameInMap("pay_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayTime { get; set; }

        // 创建人Did
        [NameInMap("created_did")]
        [Validation(Required=true)]
        public string CreatedDid { get; set; }

        // 付款凭证文件(文件Id)
        [NameInMap("file")]
        [Validation(Required=true)]
        public string File { get; set; }

        // 数据时间戳
        [NameInMap("data_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DataTimestamp { get; set; }

    }

}
