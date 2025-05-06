// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetEmbedcardUrlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 险种编码
        [NameInMap("insurance_type_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceTypeCode { get; set; }

        // 保司编码
        [NameInMap("insurance_company_no")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceCompanyNo { get; set; }

        // 嵌入式产品编码
        [NameInMap("embed_product_code")]
        [Validation(Required=true, MaxLength=32)]
        public string EmbedProductCode { get; set; }

        // 是否需要询价
        [NameInMap("is_need_inquiry")]
        [Validation(Required=true)]
        public bool? IsNeedInquiry { get; set; }

        // 交易流水号，调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=128)]
        public string TradeNo { get; set; }

        // 方案名称
        [NameInMap("scheme_name")]
        [Validation(Required=true, MaxLength=32)]
        public string SchemeName { get; set; }

        // 投保人
        [NameInMap("applicant")]
        [Validation(Required=true)]
        public Applicant Applicant { get; set; }

        // 被保人
        [NameInMap("insured")]
        [Validation(Required=true)]
        public Insured Insured { get; set; }

        // 投保标的
        [NameInMap("subject_info")]
        [Validation(Required=true, MaxLength=1000)]
        public string SubjectInfo { get; set; }

    }

}
