// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryGdFlowResponse : TeaModel {
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

        // 返回消息
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 返回编码，值为10000表示成功，其余值表示失败
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 随机返回id
        [NameInMap("request_link_id")]
        [Validation(Required=false)]
        public string RequestLinkId { get; set; }

        // 返回数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public GdCustomerInfo Data { get; set; }

    }

}
