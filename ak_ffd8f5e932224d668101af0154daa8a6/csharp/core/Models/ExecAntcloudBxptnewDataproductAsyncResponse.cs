// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ffd8f5e932224d668101af0154daa8a6.Models
{
    public class ExecAntcloudBxptnewDataproductAsyncResponse : TeaModel {
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

        // 执行状态
        // RUNNING：执行中
        // SUCCESS：成功
        // FAIL：失败
        [NameInMap("exec_status")]
        [Validation(Required=false)]
        public string ExecStatus { get; set; }

    }

}
