// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryContentriskInternalResponse : TeaModel {
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

        // 命中结果详情
        [NameInMap("hit_detect_items")]
        [Validation(Required=false)]
        public List<HitDetectItems> HitDetectItems { get; set; }

        // PASSED("数据识别通过，可以在网站上正常显示") REJECTED("被拒绝的数据，比如内容出现违禁词；不能出现在我们网站上")
        [NameInMap("result_action")]
        [Validation(Required=false)]
        public string ResultAction { get; set; }

    }

}
