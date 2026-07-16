// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerMerchantbasicinfoResponse : TeaModel {
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

        // 公司信息
        [NameInMap("company_info")]
        [Validation(Required=false)]
        public CompanyInfo CompanyInfo { get; set; }

        // 法人信息
        [NameInMap("legal_info")]
        [Validation(Required=false)]
        public LegalInfo LegalInfo { get; set; }

        // 应用信息
        [NameInMap("application_info")]
        [Validation(Required=false)]
        public ApplicationInfo ApplicationInfo { get; set; }

        // 审核信息
        [NameInMap("audit_infos")]
        [Validation(Required=false)]
        public List<AuditInfo> AuditInfos { get; set; }

        // 业务流水号id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // AUDIT 审核中
        // SUCCESS 成功
        // FAIL 失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 失败描述
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
