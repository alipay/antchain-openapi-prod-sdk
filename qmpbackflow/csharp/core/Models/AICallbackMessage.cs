// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // ai外呼回调详情
    public class AICallbackMessage : TeaModel {
        // 批次号
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 用户标签
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

        // 外呼id
        [NameInMap("call_id")]
        [Validation(Required=true)]
        public string CallId { get; set; }

        // 外呼的话术模板Id
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public long? TemplateId { get; set; }

        // 外呼状态编码
        [NameInMap("status_code")]
        [Validation(Required=true)]
        public long? StatusCode { get; set; }

        // 外呼状态描述
        [NameInMap("status_description")]
        [Validation(Required=true)]
        public string StatusDescription { get; set; }

        // 导入时间
        [NameInMap("import_time")]
        [Validation(Required=true)]
        public string ImportTime { get; set; }

        // 开始通话时间
        [NameInMap("call_begin_time")]
        [Validation(Required=true)]
        public string CallBeginTime { get; set; }

        // 振铃时长, 单位毫秒
        [NameInMap("ring_time")]
        [Validation(Required=true)]
        public long? RingTime { get; set; }

        // 接通时间
        [NameInMap("answer_time")]
        [Validation(Required=true)]
        public string AnswerTime { get; set; }

        // AI通话时长,单位s
        [NameInMap("speaking_duration")]
        [Validation(Required=true)]
        public long? SpeakingDuration { get; set; }

        // 挂断时间
        [NameInMap("hangup_time")]
        [Validation(Required=true)]
        public string HangupTime { get; set; }

        // 对话轮次
        [NameInMap("speaking_turns")]
        [Validation(Required=true)]
        public long? SpeakingTurns { get; set; }

        // 意向标签
        [NameInMap("intent_tag")]
        [Validation(Required=true)]
        public string IntentTag { get; set; }

        // 意向说明
        [NameInMap("intent_description")]
        [Validation(Required=true)]
        public string IntentDescription { get; set; }

        // 个性标签
        [NameInMap("individual_tag")]
        [Validation(Required=true)]
        public string IndividualTag { get; set; }

        // 回复关键词
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public string Keywords { get; set; }

        // 对话录音
        [NameInMap("chat_record")]
        [Validation(Required=false)]
        public string ChatRecord { get; set; }

        // 参数值
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

    }

}
