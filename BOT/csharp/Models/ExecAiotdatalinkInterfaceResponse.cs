// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecAiotdatalinkInterfaceResponse : TeaModel {
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

        // 返回状态码，200 成功 其他失败
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 返回描述信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 返回 data 数据， json 格式字符串，根据 api 接口不同，返回的数据会不同
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
