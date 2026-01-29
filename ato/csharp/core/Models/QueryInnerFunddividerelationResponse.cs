// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerFunddividerelationResponse : TeaModel {
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

        // 分账公司名称
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 分账主体企业统一社会信用代码
        [NameInMap("subject_merchant_id")]
        [Validation(Required=false)]
        public string SubjectMerchantId { get; set; }

        // 分账主体公司名称
        [NameInMap("subject_company_name")]
        [Validation(Required=false)]
        public string SubjectCompanyName { get; set; }

        // 分账对象统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 分账合同或协议
        [NameInMap("contract_files")]
        [Validation(Required=false)]
        public List<FileInfo> ContractFiles { get; set; }

        // 分账关系说明
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 分账方企业pid
        [NameInMap("alipay_pid")]
        [Validation(Required=false)]
        public string AlipayPid { get; set; }

        // 分账方企业支付宝账号
        [NameInMap("alipay_account")]
        [Validation(Required=false)]
        public string AlipayAccount { get; set; }

        // 审核列表
        [NameInMap("audit_infos")]
        [Validation(Required=false)]
        public List<AuditInfo> AuditInfos { get; set; }

        // INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
        [NameInMap("relation_status")]
        [Validation(Required=false)]
        public string RelationStatus { get; set; }

        // 分账关系绑定失败原因
        [NameInMap("relation_fail_reason")]
        [Validation(Required=false)]
        public string RelationFailReason { get; set; }

        // 支付渠道
        // ALIPAY(默认)
        // JDPAY
        [NameInMap("pay_channel")]
        [Validation(Required=false)]
        public string PayChannel { get; set; }

        // 分账方租户id
        [NameInMap("divide_tenant_id")]
        [Validation(Required=false)]
        public string DivideTenantId { get; set; }

    }

}
