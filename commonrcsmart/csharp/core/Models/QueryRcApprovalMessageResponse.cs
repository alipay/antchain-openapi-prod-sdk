// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMONRCSMART.Models
{
    public class QueryRcApprovalMessageResponse : TeaModel {
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

        // 审核结果基类
        [NameInMap("rc_smart_response")]
        [Validation(Required=false)]
        public RcSmartResponse RcSmartResponse { get; set; }

        // 通用版文本审核结果
        [NameInMap("result_vo")]
        [Validation(Required=false)]
        public MessageApprovalResultVO ResultVo { get; set; }

        // 审核结果页
        [NameInMap("page_url")]
        [Validation(Required=false)]
        public string PageUrl { get; set; }

    }

}
