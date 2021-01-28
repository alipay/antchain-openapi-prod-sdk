// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SaveJointconstraintRecordRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 收款账户
        [NameInMap("beneficiary_account_code")]
        [Validation(Required=false)]
        public string BeneficiaryAccountCode { get; set; }

        // 收款账户类型
        // 
        // 1：支付宝
        [NameInMap("beneficiary_account_type")]
        [Validation(Required=false)]
        public long? BeneficiaryAccountType { get; set; }

        // 应收方证件号码
        // 
        // 
        [NameInMap("beneficiary_cert_number")]
        [Validation(Required=true)]
        public string BeneficiaryCertNumber { get; set; }

        // 应收方证件类型
        // 
        // 0：统一社会信用代码
        // 
        // 1：身份证号码
        [NameInMap("beneficiary_cert_type")]
        [Validation(Required=true)]
        public long? BeneficiaryCertType { get; set; }

        // 	
        // 应收方类型
        // 
        // 0：企业
        // 
        // 1：个人
        [NameInMap("beneficiary_type")]
        [Validation(Required=true)]
        public long? BeneficiaryType { get; set; }

        // 合同编号
        [NameInMap("contract_code")]
        [Validation(Required=true)]
        public string ContractCode { get; set; }

        // 合同履行记录标签
        [NameInMap("contract_fulfillment_code")]
        [Validation(Required=true)]
        public string ContractFulfillmentCode { get; set; }

        // 合同名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同存证哈希
        [NameInMap("contract_txhash")]
        [Validation(Required=true)]
        public string ContractTxhash { get; set; }

        // 商户端合同链接
        // 
        // 从智能合同小程序中跳转至商户端查看合同内容链接
        [NameInMap("external_url")]
        [Validation(Required=false)]
        public string ExternalUrl { get; set; }

        // 所属行业，来自合同
        // 
        // 
        [NameInMap("industry_code")]
        [Validation(Required=false)]
        public string IndustryCode { get; set; }

        // 已付金额
        // 
        // 
        [NameInMap("paid_amount")]
        [Validation(Required=false)]
        public string PaidAmount { get; set; }

        // 支付凭据
        // 
        // 
        [NameInMap("paid_proof")]
        [Validation(Required=false)]
        public string PaidProof { get; set; }

        // 付款时间
        // 
        // 
        [NameInMap("paid_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PaidTime { get; set; }

        // 付款账户
        // 
        // 
        [NameInMap("payer_account_code")]
        [Validation(Required=false)]
        public string PayerAccountCode { get; set; }

        // 	
        // 付款账户类型
        // 
        // 1：支付宝
        [NameInMap("payer_account_type")]
        [Validation(Required=false)]
        public long? PayerAccountType { get; set; }

        // 应付方证件号码
        // 
        // 
        [NameInMap("payer_cert_number")]
        [Validation(Required=true)]
        public string PayerCertNumber { get; set; }

        // 应付方证件类型
        // 
        // 0：统一社会信用代码
        // 
        // 1：身份证号码
        [NameInMap("payer_cert_type")]
        [Validation(Required=true)]
        public long? PayerCertType { get; set; }

        // 应付方类型
        // 
        // 0：企业
        // 
        // 1：个人
        [NameInMap("payer_type")]
        [Validation(Required=true)]
        public long? PayerType { get; set; }

        // 履约标的金额
        // 
        // 
        [NameInMap("payment_amount")]
        [Validation(Required=true)]
        public string PaymentAmount { get; set; }

        // 履约宽限期，单位：天
        // 
        // 
        [NameInMap("payment_date_buffer")]
        [Validation(Required=false)]
        public long? PaymentDateBuffer { get; set; }

        // 目标履约日期
        // 
        // 
        [NameInMap("payment_deadline")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PaymentDeadline { get; set; }

    }

}
