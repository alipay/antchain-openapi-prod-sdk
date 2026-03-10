// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeCreditLxResponse : TeaModel {
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

        // 天枢客户编号
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 额度授信申请编号
        [NameInMap("credit_no")]
        [Validation(Required=false)]
        public string CreditNo { get; set; }

        // 授信审核状态，
        // 0. 授信成功
        // 1. 授信失败
        // 2. 授信中
        [NameInMap("audit_state")]
        [Validation(Required=false)]
        public long? AuditState { get; set; }

        // 业务处理描述信息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 业务错误码，
        // 无异常=0 ，不同异常，返回不同的code
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

    }

}
