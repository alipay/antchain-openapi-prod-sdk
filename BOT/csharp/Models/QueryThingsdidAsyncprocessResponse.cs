// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryThingsdidAsyncprocessResponse : TeaModel {
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

        // 需要查询的实体Did，可为空
        [NameInMap("thing_did")]
        [Validation(Required=false)]
        public string ThingDid { get; set; }

        // 随机数, 用以标识智能合约执行的索引，等于输入
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

        // 交易执行当前状态，原始文本，和async_code, async_subcode匹配，将来可能会删除此字段
        [NameInMap("async_status")]
        [Validation(Required=false)]
        public string AsyncStatus { get; set; }

        // 从智能合约执行返回的结果编码，200成功，其他参考相应文档
        [NameInMap("async_code")]
        [Validation(Required=false)]
        public string AsyncCode { get; set; }

        // 可为空，代表async_code信息不能表示完整语义时的子结果码
        [NameInMap("async_subcode")]
        [Validation(Required=false)]
        public string AsyncSubcode { get; set; }

    }

}
