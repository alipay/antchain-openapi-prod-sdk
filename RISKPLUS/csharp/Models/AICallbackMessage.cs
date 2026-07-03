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
        /// <summary>
        /// <b>Example:</b>
        /// <para>5de2ccbf87914544afb57a77e39ec023</para>
        /// </summary>
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 用户标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>阿松大</para>
        /// </summary>
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

        // 外呼id
        /// <summary>
        /// <b>Example:</b>
        /// <para>CALLID</para>
        /// </summary>
        [NameInMap("call_id")]
        [Validation(Required=true)]
        public string CallId { get; set; }

        // 外呼的话术模板Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>7</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public long? TemplateId { get; set; }

        // 外呼状态编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("status_code")]
        [Validation(Required=true)]
        public long? StatusCode { get; set; }

        // 外呼状态描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>已接听</para>
        /// </summary>
        [NameInMap("status_description")]
        [Validation(Required=true)]
        public string StatusDescription { get; set; }

        // 导入时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-11-23 14:47:06</para>
        /// </summary>
        [NameInMap("import_time")]
        [Validation(Required=true)]
        public string ImportTime { get; set; }

        // 开始通话时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-11-23 14:47:06</para>
        /// </summary>
        [NameInMap("call_begin_time")]
        [Validation(Required=true)]
        public string CallBeginTime { get; set; }

        // 振铃时长, 单位毫秒
        /// <summary>
        /// <b>Example:</b>
        /// <para>2000</para>
        /// </summary>
        [NameInMap("ring_time")]
        [Validation(Required=true)]
        public long? RingTime { get; set; }

        // 接通时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-01-09 14:14:19</para>
        /// </summary>
        [NameInMap("answer_time")]
        [Validation(Required=true)]
        public string AnswerTime { get; set; }

        // AI通话时长,单位s
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("speaking_duration")]
        [Validation(Required=true)]
        public long? SpeakingDuration { get; set; }

        // 挂断时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019-01-09 14:14:19</para>
        /// </summary>
        [NameInMap("hangup_time")]
        [Validation(Required=true)]
        public string HangupTime { get; set; }

        // 对话轮次
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("speaking_turns")]
        [Validation(Required=true)]
        public long? SpeakingTurns { get; set; }

        // 意向标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>C</para>
        /// </summary>
        [NameInMap("intent_tag")]
        [Validation(Required=true)]
        public string IntentTag { get; set; }

        // 意向说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>确认本人,未承诺还款</para>
        /// </summary>
        [NameInMap("intent_description")]
        [Validation(Required=true)]
        public string IntentDescription { get; set; }

        // 个性标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>a</para>
        /// </summary>
        [NameInMap("individual_tag")]
        [Validation(Required=true)]
        public string IndividualTag { get; set; }

        // 回复关键词
        /// <summary>
        /// <b>Example:</b>
        /// <para>利息</para>
        /// </summary>
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public string Keywords { get; set; }

        // 对话录音
        /// <summary>
        /// <b>Example:</b>
        /// <para>录音url</para>
        /// </summary>
        [NameInMap("chat_record")]
        [Validation(Required=false)]
        public string ChatRecord { get; set; }

        // 参数值
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;电话号码&quot;:&quot;13100000000&quot;}</para>
        /// </summary>
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

    }

}
