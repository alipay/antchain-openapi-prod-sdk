// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class NotifyPullstrategyChargeorderinfoResponse : TeaModel {
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

        // 返回参数密文
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 返回消息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 返回值
        [NameInMap("ret")]
        [Validation(Required=false)]
        public long? Ret { get; set; }

        // 签名，原文为ret+msg+data密文
        [NameInMap("sig")]
        [Validation(Required=false)]
        public string Sig { get; set; }

    }

}
