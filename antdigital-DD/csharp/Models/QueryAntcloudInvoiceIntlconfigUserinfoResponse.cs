// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class QueryAntcloudInvoiceIntlconfigUserinfoResponse : TeaModel {
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

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 纳税人类型，国际商户为03
        [NameInMap("tax_payer_qualification")]
        [Validation(Required=false)]
        public string TaxPayerQualification { get; set; }

        // 公司名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 国家地区
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // 国家地区编号，如CN
        [NameInMap("country_code")]
        [Validation(Required=false)]
        public string CountryCode { get; set; }

        // 公司地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系人邮箱
        [NameInMap("contact_email")]
        [Validation(Required=false)]
        public string ContactEmail { get; set; }

        // 联系人电话
        [NameInMap("contact_tel")]
        [Validation(Required=false)]
        public string ContactTel { get; set; }

    }

}
