// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyPfConfirmationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求号
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 客户号
        [NameInMap("client_no")]
        [Validation(Required=true)]
        public string ClientNo { get; set; }

        // 融资主体did
        [NameInMap("financing_subject_did")]
        [Validation(Required=true)]
        public string FinancingSubjectDid { get; set; }

        // 借款人证件类型
        [NameInMap("borrower_card_type")]
        [Validation(Required=true)]
        public string BorrowerCardType { get; set; }

        // 借款人证件号码
        // 
        // 
        [NameInMap("borrower_card_no")]
        [Validation(Required=true)]
        public string BorrowerCardNo { get; set; }

        // 融资金额
        // 
        // 
        [NameInMap("financing_amount")]
        [Validation(Required=true)]
        public string FinancingAmount { get; set; }

        // 支用币种
        // 
        // 
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 贷款期限（月）
        [NameInMap("loan_term")]
        [Validation(Required=true)]
        public string LoanTerm { get; set; }

        // 收款方开户行总行联行号
        // 
        // 
        [NameInMap("payee_bank_union_number")]
        [Validation(Required=true)]
        public string PayeeBankUnionNumber { get; set; }

        // 收款方开户行名称
        // 
        // 
        [NameInMap("payee_bank_name")]
        [Validation(Required=true)]
        public string PayeeBankName { get; set; }

        // 收款方户名
        // 
        // 
        [NameInMap("payee_name")]
        [Validation(Required=true)]
        public string PayeeName { get; set; }

        // 收款方银行卡账号
        // 
        // 
        [NameInMap("payee_bank_no")]
        [Validation(Required=true)]
        public string PayeeBankNo { get; set; }

        // 收款人证件类型
        // 
        // 
        [NameInMap("payee_card_type")]
        [Validation(Required=false)]
        public string PayeeCardType { get; set; }

        // 收款人证件号码
        // 
        // 
        [NameInMap("payee_card_no")]
        [Validation(Required=false)]
        public string PayeeCardNo { get; set; }

        // 贷款用途
        // 
        // 
        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

        // 附言
        [NameInMap("postscript")]
        [Validation(Required=false)]
        public string Postscript { get; set; }

    }

}
