// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryThingsdidDidResponse : TeaModel {
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

        // 查询请求返回结构体的数组列表，每一个元素对应一个did
        [NameInMap("did_base_query_resp")]
        [Validation(Required=false)]
        public List<DidBaseQueryResp> DidBaseQueryResp { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

    }

}
