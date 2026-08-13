// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIOSPRODUCT.Models
{
    public class QueryGwdefaultChatstreamResponse : TeaModel {
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

        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 整体成功标志，默认 true
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 固定chat_result
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 查询 ID；多为空串
        [NameInMap("query_id")]
        [Validation(Required=false)]
        public string QueryId { get; set; }

        // true=流式中间批次；false=收尾批次
        [NameInMap("has_stream")]
        [Validation(Required=false)]
        public bool? HasStream { get; set; }

        // 正文流
        [NameInMap("chat_list")]
        [Validation(Required=false)]
        public string ChatList { get; set; }

        // 推荐问题（SUG），仅收尾批次非空
        [NameInMap("sug_list")]
        [Validation(Required=false)]
        public string SugList { get; set; }

        // 全量引用（REF），仅收尾批次非空
        [NameInMap("ref_list")]
        [Validation(Required=false)]
        public string RefList { get; set; }

        // 页脚卡片（FOOTER_CARD 已改写为 CARD），仅收尾批次非空
        [NameInMap("footer_list")]
        [Validation(Required=false)]
        public string FooterList { get; set; }

        // token/耗时信息；仅携带 callbackInfo 的批次才有
        [NameInMap("call_back_info")]
        [Validation(Required=false)]
        public string CallBackInfo { get; set; }

    }

}
