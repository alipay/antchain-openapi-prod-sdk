// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateThingsdidDidResponse : TeaModel {
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

        // 更新的实体DID，等于输入
        [NameInMap("thing_did")]
        [Validation(Required=false)]
        public string ThingDid { get; set; }

        // 异步执行标识，true代表已经完成执行，false代表异步返回，需要轮询nonce代表的交易
        [NameInMap("executed")]
        [Validation(Required=false)]
        public bool? Executed { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

    }

}
