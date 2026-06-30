// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetEmbedcardUrlResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 交易流水号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 险种编码
        [NameInMap("insurance_type_code")]
        [Validation(Required=false)]
        public string InsuranceTypeCode { get; set; }

        // 保司编码
        [NameInMap("insurance_company_no")]
        [Validation(Required=false)]
        public string InsuranceCompanyNo { get; set; }

        // 嵌入式产品编码
        [NameInMap("embed_product_code")]
        [Validation(Required=false)]
        public string EmbedProductCode { get; set; }

        // 嵌入式产品URL地址
        [NameInMap("embed_product_url")]
        [Validation(Required=false)]
        public string EmbedProductUrl { get; set; }

        // 方案名称
        [NameInMap("scheme_name")]
        [Validation(Required=false)]
        public string SchemeName { get; set; }

        // 保费
        [NameInMap("premium")]
        [Validation(Required=false)]
        public string Premium { get; set; }

        // 询价编码
        [NameInMap("inquiry_no")]
        [Validation(Required=false)]
        public string InquiryNo { get; set; }

    }

}
