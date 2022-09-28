// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendUmktCardsmsBatchResponse : TeaModel {
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

        // 卡片短信回执id
        [NameInMap("biz_card_id")]
        [Validation(Required=false)]
        public string BizCardId { get; set; }

        // 支持的手机号
        [NameInMap("media_mobiles")]
        [Validation(Required=false)]
        public string MediaMobiles { get; set; }

        // 不支持的手机号
        [NameInMap("not_media_mobiles")]
        [Validation(Required=false)]
        public string NotMediaMobiles { get; set; }

    }

}
