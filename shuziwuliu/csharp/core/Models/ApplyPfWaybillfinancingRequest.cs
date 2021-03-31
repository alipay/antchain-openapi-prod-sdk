// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyPfWaybillfinancingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 承运商did
        [NameInMap("carrier_did")]
        [Validation(Required=true, MaxLength=80)]
        public string CarrierDid { get; set; }

        // 融资支用金额；总长度最长15位，保留2位小数，四舍五入
        [NameInMap("financing_amount")]
        [Validation(Required=true)]
        public string FinancingAmount { get; set; }

        // 支用币种，支持 CNY,USD
        [NameInMap("financing_currency")]
        [Validation(Required=true)]
        public string FinancingCurrency { get; set; }

        // 融资授信主体公司分布式数字身份
        [NameInMap("financing_subject_did")]
        [Validation(Required=true, MaxLength=80)]
        public string FinancingSubjectDid { get; set; }

        // 贷款期限，值为2~6，单位为月
        [NameInMap("loan_term")]
        [Validation(Required=true, MaxLength=6)]
        public string LoanTerm { get; set; }

        // 收款方开户行总行联行号
        [NameInMap("payee_bank_number")]
        [Validation(Required=true, MaxLength=32)]
        public string PayeeBankNumber { get; set; }

        // 收款方开户行名称
        [NameInMap("payee_bcb")]
        [Validation(Required=true, MaxLength=200)]
        public string PayeeBcb { get; set; }

        // 收款方开户行银行卡号
        [NameInMap("payee_bcb_card_no")]
        [Validation(Required=true)]
        public string PayeeBcbCardNo { get; set; }

        // 收款方证件号
        // 
        // 
        [NameInMap("payee_id_number")]
        [Validation(Required=true, MaxLength=40)]
        public string PayeeIdNumber { get; set; }

        // 收款方证件类型
        [NameInMap("payee_id_type")]
        [Validation(Required=true, MaxLength=5)]
        public string PayeeIdType { get; set; }

        // 收款方名称
        [NameInMap("payee_name")]
        [Validation(Required=true, MaxLength=200)]
        public string PayeeName { get; set; }

        // 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2 
        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

        // 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
        [NameInMap("request_no")]
        [Validation(Required=true, MaxLength=23)]
        public string RequestNo { get; set; }

        // 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
        [NameInMap("signature")]
        [Validation(Required=false, MaxLength=800)]
        public string Signature { get; set; }

        // 转账附言
        // 1: 工资、奖金收入
        // 2：稿费、演出费等劳务收入
        // 3：债券、期货、信托等投资的本金和收益
        // 4：个人债券或产权转让收益
        // 该字段建议填写 2
        [NameInMap("transfer_postscript")]
        [Validation(Required=true, MaxLength=3)]
        public string TransferPostscript { get; set; }

        // 凭证类型，支持 WAYBILL,PAYABLE
        [NameInMap("voucher_category")]
        [Validation(Required=true)]
        public string VoucherCategory { get; set; }

        // 支用凭证ids，支持多个，逗号隔开；
        [NameInMap("voucher_ids")]
        [Validation(Required=true, MaxLength=2000)]
        public string VoucherIds { get; set; }

        // 8位发票号，支持多个，逗号分隔
        [NameInMap("voucher_invoice_codes")]
        [Validation(Required=false, MaxLength=800)]
        public string VoucherInvoiceCodes { get; set; }

        // 提款确认书hash
        [NameInMap("confirmation_hash")]
        [Validation(Required=false)]
        public string ConfirmationHash { get; set; }

        // 提款确认书 osskey
        [NameInMap("confirmation_oss_key")]
        [Validation(Required=false)]
        public string ConfirmationOssKey { get; set; }

        // 签名公钥
        [NameInMap("signature_pub_key")]
        [Validation(Required=false)]
        public string SignaturePubKey { get; set; }

        // 网银操作员账号
        // 
        // 
        [NameInMap("online_bank_operator_account")]
        [Validation(Required=false)]
        public string OnlineBankOperatorAccount { get; set; }

    }

}
