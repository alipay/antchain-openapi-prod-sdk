// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class QueryQueryFirmfinancialResponse : TeaModel {
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

        // 是否成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 结果码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 结果消息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 财报状态(true已上传，false未上传)
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // 查询结果
        [NameInMap("account_result")]
        [Validation(Required=false)]
        public List<FileInfo> AccountResult { get; set; }

    }

}
