// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerMerchantpayexpandResponse : TeaModel {
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

        // 审核列表
        [NameInMap("audit_infos")]
        [Validation(Required=false)]
        public List<AuditInfo> AuditInfos { get; set; }

        // 进件流水号
        [NameInMap("pay_expand_id")]
        [Validation(Required=false)]
        public string PayExpandId { get; set; }

        // 进件模式 DIRECT(直连进件) AGENT(代理进件)
        [NameInMap("expand_mode")]
        [Validation(Required=false)]
        public string ExpandMode { get; set; }

        // INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
        [NameInMap("expand_status")]
        [Validation(Required=false)]
        public string ExpandStatus { get; set; }

        // 进件失败描述
        [NameInMap("expand_fail_reason")]
        [Validation(Required=false)]
        public string ExpandFailReason { get; set; }

        // 是否展示客服信息登记入口
        [NameInMap("show_customer_service_banner")]
        [Validation(Required=false)]
        public bool? ShowCustomerServiceBanner { get; set; }

        // 是否直付通进件已成功
        // 用于前端判断进件成功之后用户修改操作
        [NameInMap("zft_expand_successful")]
        [Validation(Required=false)]
        public bool? ZftExpandSuccessful { get; set; }

    }

}
