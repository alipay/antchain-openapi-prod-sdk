// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSaleschannelResponse : TeaModel {
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

        // 渠道code
        [NameInMap("channel_code")]
        [Validation(Required=false)]
        public string ChannelCode { get; set; }

        // 渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=false)]
        public string ChannelName { get; set; }

        // 	
        // 渠道链接
        [NameInMap("channel_link")]
        [Validation(Required=false)]
        public string ChannelLink { get; set; }

        // 渠道级别
        [NameInMap("channel_level")]
        [Validation(Required=false)]
        public long? ChannelLevel { get; set; }

        // 子渠道列表，JSONArray
        [NameInMap("child_channel_list")]
        [Validation(Required=false)]
        public string ChildChannelList { get; set; }

    }

}
