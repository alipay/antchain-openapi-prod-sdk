// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeLoanLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用信审批申请编号
        [NameInMap("apply_id")]
        [Validation(Required=true)]
        public string ApplyId { get; set; }

        // 合作方代码
        [NameInMap("partner_code")]
        [Validation(Required=false)]
        public string PartnerCode { get; set; }

        // 授信编号
        [NameInMap("credit_no")]
        [Validation(Required=true)]
        public string CreditNo { get; set; }

        // 资产类型， 1：借钱（默认） 2：电商购物 3：乐花卡
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // 借款金额，单位：元
        [NameInMap("loan_principal")]
        [Validation(Required=true)]
        public long? LoanPrincipal { get; set; }

        // 借款期数，比如：1,2,3,6,9,12,15,18,24,36
        [NameInMap("loan_term")]
        [Validation(Required=true)]
        public long? LoanTerm { get; set; }

        // 申请贷款用途， 借钱（透传）：日常消费；运动健身；电商购物；生活开销；学习进修；学艺术班；技能培训 电商购物（默认）：电商购物 乐花卡（默认）：个人综合消费
        [NameInMap("loan_use")]
        [Validation(Required=true)]
        public string LoanUse { get; set; }

        // 银行卡绑定手机号
        [NameInMap("mobile_no")]
        [Validation(Required=true)]
        public string MobileNo { get; set; }

        // 借款人收款户名， 借钱业务：借款用户个人收款账户名 电商业务：打款到对公户，传对公户相关账号信息
        [NameInMap("debit_account_name")]
        [Validation(Required=true)]
        public string DebitAccountName { get; set; }

        // 收款人银行卡开户行， 借钱业务：借款用户个人账户开户行名称 电商业务：打款到对公户，传对公户相关账号信息
        [NameInMap("debit_open_account_bank")]
        [Validation(Required=true)]
        public string DebitOpenAccountBank { get; set; }

        // 收款人银行卡卡号， 借钱业务：借款用户个人账户卡号 电商业务：打款到对公户，传对公户相关账号信息
        [NameInMap("debit_account_no")]
        [Validation(Required=true)]
        public string DebitAccountNo { get; set; }

        // 收款卡联行号， 借钱业务：非必传 电商业务：打款到对公户，传对公户相关账号信息
        [NameInMap("debit_cnaps")]
        [Validation(Required=true)]
        public string DebitCnaps { get; set; }

        // 还款方式， 1-等额本息（默认） 2-等额本金 4-气球贷 10- 等本等息 13-先息后本
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

    }

}
