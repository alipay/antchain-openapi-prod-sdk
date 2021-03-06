// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetBashcmdResultResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 错误信息。内容为指令无法下发到机器上的详细原因
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // 执行结束时间
        [NameInMap("finish_time")]
        [Validation(Required=false)]
        public string FinishTime { get; set; }

        // 执行的结果
        [NameInMap("results")]
        [Validation(Required=false)]
        public List<SingleExecResult> Results { get; set; }

        // 执行开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 执行结果状态。取值列表：EXECUTING：执行中；SUCCESS：执行成功；FAILED：执行失败；IGNORED：已忽略；TIME_OUT：已超时
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
