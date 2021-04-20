// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class ExecEventReportResponse : TeaModel {
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

        // 事件唯一标识
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 事件状态，REPORTED：已上报，PROCESSING：处理中，PROCESSED： 处理完毕，NEED_RETRY：需要重试，EVENT_NOT_SUPPORTED：项目暂不支持该事件
        [NameInMap("event_status")]
        [Validation(Required=false)]
        public string EventStatus { get; set; }

        // token状态，TOKEN_SUCCESS：token发放成功，TOKEN_PROCESSING：token发放中，TOKEN_FAILED：token发放失败，NO_NEED_ALLOCATION：无需发放
        [NameInMap("token_status")]
        [Validation(Required=false)]
        public string TokenStatus { get; set; }

        // 购买者/访问者获得token数量
        [NameInMap("token_amount")]
        [Validation(Required=false)]
        public long? TokenAmount { get; set; }

        // 提示信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 分享人获得token数
        [NameInMap("parent_token_amount")]
        [Validation(Required=false)]
        public long? ParentTokenAmount { get; set; }

    }

}
