// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class InitFaceauthZimResponse : TeaModel {
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

        // 预留扩展结果
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

        // 描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 协议
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // 返回码
        [NameInMap("ret_code")]
        [Validation(Required=false)]
        public string RetCode { get; set; }

        // 明细返回码
        [NameInMap("ret_code_sub")]
        [Validation(Required=false)]
        public string RetCodeSub { get; set; }

        // 明细返回码对应的文案
        [NameInMap("ret_message_sub")]
        [Validation(Required=false)]
        public string RetMessageSub { get; set; }

        // 实人认证id
        [NameInMap("zimi_id")]
        [Validation(Required=false)]
        public string ZimiId { get; set; }

    }

}
