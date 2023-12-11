// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryAilegalAnswerResponse : TeaModel {
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

        // 返回问题id，全局唯一
        [NameInMap("question_id")]
        [Validation(Required=false)]
        public string QuestionId { get; set; }

        // 问题答案
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 是否支持反馈(true 是,false 否)
        [NameInMap("can_feedback")]
        [Validation(Required=false)]
        public bool? CanFeedback { get; set; }

        // 是否回答结束(true 是,false 否)
        [NameInMap("end")]
        [Validation(Required=false)]
        public bool? End { get; set; }

    }

}
