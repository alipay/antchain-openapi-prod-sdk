// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾外呼记录
    public class CommonRobotCallDetail : TeaModel {
        // 客户请求时的透传字段
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 成功触达：OK；未触达：AI_ROBOT_CALL_REQUEST_NOT_EXIST
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // 外呼号码
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 呼叫次数
        [NameInMap("current_call_times")]
        [Validation(Required=true)]
        public long? CurrentCallTimes { get; set; }

        // 号码模版
        [NameInMap("key_template")]
        [Validation(Required=true)]
        public string KeyTemplate { get; set; }

        // 导入号码时返回的批次号
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 2001:批量-预测外呼，2002:批量-AI外呼-不转人工，2003:批量-AI外呼-接通转人工，2004: 批量-AI外呼-智能转人工,2005:批量-语音通知
        [NameInMap("call_type")]
        [Validation(Required=true)]
        public long? CallType { get; set; }

        // 用户自定义标签
        [NameInMap("tag")]
        [Validation(Required=false)]
        public string Tag { get; set; }

        // 外呼id
        [NameInMap("call_id")]
        [Validation(Required=true)]
        public string CallId { get; set; }

        // 外呼任务编号
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public long? TaskId { get; set; }

        // AI话术ID
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

        // 转人工状态编码
        [NameInMap("transfer_status_code")]
        [Validation(Required=true)]
        public long? TransferStatusCode { get; set; }

        // 转人工状态
        [NameInMap("transfer_status")]
        [Validation(Required=true)]
        public string TransferStatus { get; set; }

        // 分配坐席ID
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public long? AgentId { get; set; }

        // 坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
        [NameInMap("agent_tag")]
        [Validation(Required=false)]
        public string AgentTag { get; set; }

        // 坐席分机号
        [NameInMap("agent_extension")]
        [Validation(Required=false)]
        public string AgentExtension { get; set; }

        // 导入时间
        [NameInMap("import_time")]
        [Validation(Required=true)]
        public string ImportTime { get; set; }

        // 开始通话时间
        [NameInMap("call_begin_time")]
        [Validation(Required=true)]
        public string CallBeginTime { get; set; }

        // 振铃时长，单位ms
        [NameInMap("ring_time")]
        [Validation(Required=true)]
        public long? RingTime { get; set; }

        // 接通时间
        [NameInMap("answer_time")]
        [Validation(Required=false)]
        public string AnswerTime { get; set; }

        // 通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        [NameInMap("speaking_time")]
        [Validation(Required=true)]
        public string SpeakingTime { get; set; }

        // 通话时长，单位：秒
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

        // 人工通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        [NameInMap("agent_speaking_time")]
        [Validation(Required=true)]
        public string AgentSpeakingTime { get; set; }

        // 人工通话时长，单位：秒
        [NameInMap("agent_speaking_duration")]
        [Validation(Required=true)]
        public long? AgentSpeakingDuration { get; set; }

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
        [Validation(Required=false)]
        public string IndividualTag { get; set; }

        // 回复关键词
        [NameInMap("keywords")]
        [Validation(Required=false)]
        public string Keywords { get; set; }

        // 挂机方式，AI挂机1，坐席挂机2，客户挂机3
        [NameInMap("hungup_type")]
        [Validation(Required=true)]
        public long? HungupType { get; set; }

        // 挂机短信，可选值：1、2
        // 1:发送，2:不发送
        [NameInMap("sms")]
        [Validation(Required=true)]
        public string Sms { get; set; }

        // 对话录音，URL，可以为空
        [NameInMap("chat_record")]
        [Validation(Required=false)]
        public string ChatRecord { get; set; }

        // 聊天记录，可以为空
        [NameInMap("chats")]
        [Validation(Required=false)]
        public string Chats { get; set; }

        // 可选值：0、1
        // 0:不添加，1:添加
        [NameInMap("add_wx")]
        [Validation(Required=false)]
        public long? AddWx { get; set; }

        // 加微进度，可选值：已申请、加微成功
        [NameInMap("add_wx_status")]
        [Validation(Required=false)]
        public string AddWxStatus { get; set; }

        // 是否接通重呼，可选值：0、1
        // 0正常外呼，1接通重呼
        [NameInMap("answer_recall")]
        [Validation(Required=true)]
        public long? AnswerRecall { get; set; }

        // 导入号码时的参数值
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 导入号码时的业务参数值，原样返回
        [NameInMap("biz_properties")]
        [Validation(Required=false)]
        public string BizProperties { get; set; }

        // 拦截原因：当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截
        [NameInMap("intercept_reason")]
        [Validation(Required=false)]
        public string InterceptReason { get; set; }

    }

}
