// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICONUMDECISION.Models
{
    public class ImportOrderResponse : TeaModel {
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

        // 是否受理成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public string Success { get; set; }

        // 平台批次号
        [NameInMap("batch_no")]
        [Validation(Required=false)]
        public string BatchNo { get; set; }

        // 同步段状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 失败原因码
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
