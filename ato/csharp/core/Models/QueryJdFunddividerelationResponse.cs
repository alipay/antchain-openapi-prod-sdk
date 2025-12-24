// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryJdFunddividerelationResponse : TeaModel {
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

        // 商户公司名称
        [NameInMap("subject_company_name")]
        [Validation(Required=false)]
        public string SubjectCompanyName { get; set; }

        // 分账方租户8位id
        [NameInMap("divide_tenant_id")]
        [Validation(Required=false)]
        public string DivideTenantId { get; set; }

        // 分账公司社会信用代码
        [NameInMap("divide_merchant_id")]
        [Validation(Required=false)]
        public string DivideMerchantId { get; set; }

        // 分账方公司名称
        [NameInMap("divide_company_name")]
        [Validation(Required=false)]
        public string DivideCompanyName { get; set; }

        // AUDIT:审批中 
        // AUDIT_PASSED:审批通过
        // AUDIT_NOT_PASSED:审批不通过
        [NameInMap("relation_status")]
        [Validation(Required=false)]
        public string RelationStatus { get; set; }

        // 京东商户号
        [NameInMap("divide_jd_merchant_no")]
        [Validation(Required=false)]
        public string DivideJdMerchantNo { get; set; }

        // 分账关系说明
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 分账协议文件
        [NameInMap("contract_files")]
        [Validation(Required=false)]
        public List<FileInfo> ContractFiles { get; set; }

    }

}
