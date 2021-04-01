// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidAgentChallengeresponseResponse : TeaModel {
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

        // {
        //   ''challenge":xxxx, //待签名的明文
        //   “expired”：xxxx,//签名有效时间
        //   “sign”：xxxx，//对上述字段进行的签名
        // }
        [NameInMap("sign_data")]
        [Validation(Required=false)]
        public string SignData { get; set; }

    }

}
