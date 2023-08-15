// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class AuthItagAntitagAcmResponse : TeaModel {
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

        // 消息ID
        [NameInMap("reqmsgid")]
        [Validation(Required=false)]
        public string Reqmsgid { get; set; }

        // 结果码
        [NameInMap("resultcode")]
        [Validation(Required=false)]
        public string Resultcode { get; set; }

        // 结果消息
        [NameInMap("resultmsg")]
        [Validation(Required=false)]
        public string Resultmsg { get; set; }

        // 用户ID
        [NameInMap("userid")]
        [Validation(Required=false)]
        public string Userid { get; set; }

        // 授权码
        [NameInMap("accesstoken")]
        [Validation(Required=false)]
        public string Accesstoken { get; set; }

    }

}
