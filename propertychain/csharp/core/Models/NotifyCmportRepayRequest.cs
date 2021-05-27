// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class NotifyCmportRepayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台融资编号
        [NameInMap("financial_no")]
        [Validation(Required=true)]
        public string FinancialNo { get; set; }

        // 还款编号
        [NameInMap("repay_no")]
        [Validation(Required=true)]
        public string RepayNo { get; set; }

        // 融资企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 融资企业编码
        [NameInMap("company_code")]
        [Validation(Required=true)]
        public string CompanyCode { get; set; }

        // 产品编号
        [NameInMap("product_no")]
        [Validation(Required=true)]
        public string ProductNo { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 还款金额，一期一次性全部还款，加上利息
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 还款银行
        [NameInMap("repay_bank")]
        [Validation(Required=true)]
        public string RepayBank { get; set; }

        // 还款银行账号
        [NameInMap("repay_bank_account")]
        [Validation(Required=true)]
        public string RepayBankAccount { get; set; }

        //  融资状态:
        // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
        [NameInMap("financial_status")]
        [Validation(Required=true)]
        public long? FinancialStatus { get; set; }

        // 还款日期
        [NameInMap("repay_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RepayDate { get; set; }

        // 上链账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟id
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // Channel 名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

    }

}
