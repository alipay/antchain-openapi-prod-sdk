// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerNoticeResponse : TeaModel {
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

        // 通知标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 通知内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 通知创建时间
        [NameInMap("notic_create_time")]
        [Validation(Required=false)]
        public string NoticCreateTime { get; set; }

    }

}
