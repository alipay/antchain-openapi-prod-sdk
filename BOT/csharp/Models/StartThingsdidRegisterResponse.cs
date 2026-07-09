// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StartThingsdidRegisterResponse : TeaModel {
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

        // 代表本操作是否是异步调用
        // true: 执行完全，非异步操作
        // false: 异步执行，需要根据nonce轮训状态
        [NameInMap("executed")]
        [Validation(Required=false)]
        public bool? Executed { get; set; }

        // 代表唯一交易ID，等于输入参数同名字段
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

        // 注册成功返回的实体身份DID
        [NameInMap("thing_did")]
        [Validation(Required=false)]
        public string ThingDid { get; set; }

    }

}
