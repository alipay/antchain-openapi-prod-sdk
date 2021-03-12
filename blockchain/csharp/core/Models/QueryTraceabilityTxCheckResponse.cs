// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryTraceabilityTxCheckResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 溯源项列表
        [NameInMap("items")]
        [Validation(Required=false)]
        public List<Item> Items { get; set; }

        // 提示信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 展现信息的副标题
        [NameInMap("sub_title")]
        [Validation(Required=false)]
        public string SubTitle { get; set; }

        // 显示查证结果的标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}
