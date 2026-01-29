// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 分账关系页对象
    public class RelationPage : TeaModel {
        // 分账关系id
        [NameInMap("relation_id")]
        [Validation(Required=true)]
        public string RelationId { get; set; }

        // 分账公司名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 分账公司名称统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 审核状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 商户公司统一社会信用代码
        [NameInMap("subject_merchant_id")]
        [Validation(Required=true)]
        public string SubjectMerchantId { get; set; }

        // 商户公司名称
        [NameInMap("subject_company_name")]
        [Validation(Required=true)]
        public string SubjectCompanyName { get; set; }

        // 支付渠道
        // ALIPAY
        // JDPAY
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

    }

}
