// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class CheckSpProductOrderparameterResponse : TeaModel {
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

        // 参数校验结果，PASS 通过，UNPASS 不通过
        [NameInMap("check_status")]
        [Validation(Required=false)]
        public string CheckStatus { get; set; }

        // 参数校验不通过的提示信息
        [NameInMap("check_msg")]
        [Validation(Required=false)]
        public string CheckMsg { get; set; }

    }

}
