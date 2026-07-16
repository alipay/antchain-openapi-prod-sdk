// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerTenantindirectmainclassResponse : TeaModel {
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

        // 当前开通类目
        [NameInMap("current_indirect_main_class_list")]
        [Validation(Required=false)]
        public List<string> CurrentIndirectMainClassList { get; set; }

        // 开通说明
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 状态
        // INIT:初始化
        // AUDIT:审批中 
        // AUDIT_PASSED:审批通过
        // AUDIT_NOT_PASSED:审批不通过
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 审核拒绝原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 申请开通的类目
        [NameInMap("changing_indirect_main_class_list")]
        [Validation(Required=false)]
        public List<string> ChangingIndirectMainClassList { get; set; }

    }

}
