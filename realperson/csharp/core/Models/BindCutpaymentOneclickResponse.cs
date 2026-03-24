// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class BindCutpaymentOneclickResponse : TeaModel {
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

        // 跳转银行页面地址
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 渠道 ID
        [NameInMap("channel_id")]
        [Validation(Required=false)]
        public string ChannelId { get; set; }

        // 前端请求银行页面的请求方法
        [NameInMap("query_method")]
        [Validation(Required=false)]
        public string QueryMethod { get; set; }

        // 前端请求银行页面的请求参数key和vaule
        [NameInMap("query_value")]
        [Validation(Required=false)]
        public string QueryValue { get; set; }

    }

}
