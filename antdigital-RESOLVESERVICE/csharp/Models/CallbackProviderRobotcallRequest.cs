// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    public class CallbackProviderRobotcallRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // AI任务中的外呼编号
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 外呼号码
        [NameInMap("number")]
        [Validation(Required=false)]
        public string Number { get; set; }

        // 外呼号码MD5
        [NameInMap("number_md5")]
        [Validation(Required=false)]
        public string NumberMd5 { get; set; }

        // 导入号码返回的批次号
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 1001：坐席-人工外呼，
        // 1002：坐席-AI外呼-不转人工，
        // 1003：坐席-AI外呼-接通转人工，
        // 1004：坐席-AI外呼-智能转人工；
        // 2001:批量-预测外呼，
        // 2002:批量-AI外呼-不转人工，
        // 2003:批量-AI外呼-接通转人工，
        // 2004: 批量-AI外呼-智能转人工,
        // 2005:批量-语音通知,
        // 3001:视频外呼
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

        // 系统中的任务编号，若外呼类型为坐席主动外呼，则此处返回坐席ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public long? TaskId { get; set; }

        // 任务的名称
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // 外呼的话术模版ID
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public long? TemplateId { get; set; }

        // 话术模版名称
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 外呼状态编码
        [NameInMap("status_code")]
        [Validation(Required=true)]
        public long? StatusCode { get; set; }

        // 外呼状态，如"已接听"
        [NameInMap("status_description")]
        [Validation(Required=true)]
        public string StatusDescription { get; set; }

        // 转人工状态编码
        [NameInMap("transfer_status_code")]
        [Validation(Required=true)]
        public long? TransferStatusCode { get; set; }

        // 转人工状态，可以为空
        [NameInMap("transfer_status")]
        [Validation(Required=false)]
        public string TransferStatus { get; set; }

        // 分配坐席id
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public long? AgentId { get; set; }

        // 建议填写坐席在贵司业务系统唯一标识，用于查询对应agentId；可以为空。
        [NameInMap("agent_tag")]
        [Validation(Required=false)]
        public string AgentTag { get; set; }

        // 坐席分机号
        [NameInMap("agent_extension")]
        [Validation(Required=false)]
        public string AgentExtension { get; set; }

        // 导入时间，格式:2019-01-09 14:14:19
        [NameInMap("import_time")]
        [Validation(Required=true)]
        public string ImportTime { get; set; }

        // 开始拨号时间，格式：2019-01-09 14:14:19
        [NameInMap("call_begin_time")]
        [Validation(Required=true)]
        public string CallBeginTime { get; set; }

        // 振铃时长，单位毫秒
        [NameInMap("ring_time")]
        [Validation(Required=true)]
        public long? RingTime { get; set; }

        // 通话接通时间，格式：2019-01-09 14:14:19
        [NameInMap("answer_time")]
        [Validation(Required=false)]
        public string AnswerTime { get; set; }

        // AI通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        [NameInMap("speaking_time")]
        [Validation(Required=true)]
        public string SpeakingTime { get; set; }

        // AI通话时长，单位：秒
        [NameInMap("speaking_duration")]
        [Validation(Required=true)]
        public long? SpeakingDuration { get; set; }

        // 通话挂断时间，格式：2019-01-09 14:14:19
        [NameInMap("hangup_time")]
        [Validation(Required=true)]
        public string HangupTime { get; set; }

        // 对话轮次
        [NameInMap("speaking_turns")]
        [Validation(Required=true)]
        public string SpeakingTurns { get; set; }

        // 坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒
        [NameInMap("agent_speaking_time")]
        [Validation(Required=true)]
        public string AgentSpeakingTime { get; set; }

        // 坐席通话时长，单位：秒
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

        // 回复关键字
        [NameInMap("keywords")]
        [Validation(Required=false)]
        public string Keywords { get; set; }

        // AI挂机1，坐席挂机2，客户挂机3
        [NameInMap("hangup_type")]
        [Validation(Required=true)]
        public long? HangupType { get; set; }

        // 挂机短信,1:发送 2:不发送
        [NameInMap("sms")]
        [Validation(Required=true)]
        public string Sms { get; set; }

        // 挂机WhatsApp
        [NameInMap("wa")]
        [Validation(Required=true)]
        public string Wa { get; set; }

        // 对话录音，URL，可以为空。录音异步上传，业务高峰可能会出现请求404的情况，可以稍后再重试获取。
        [NameInMap("chat_record")]
        [Validation(Required=false)]
        public string ChatRecord { get; set; }

        // 对话记录,[{"fromNumber":"0","content": "你好，请问您是王小帅吗？","createTime": "2019-01-09 14:14:19"},{"fromNumber":"7945bd83237335e5376ff44d62e4f0ae","content":"嗯","createTime": "2019-01-09 14:14:20"}]
        [NameInMap("chats")]
        [Validation(Required=false)]
        public string Chats { get; set; }

        // 加微信，0:不添加，1:添加
        [NameInMap("add_wx")]
        [Validation(Required=false)]
        public long? AddWx { get; set; }

        // 可选值：已申请、加微成功
        [NameInMap("add_wx_status")]
        [Validation(Required=false)]
        public string AddWxStatus { get; set; }

        // 是否接通重呼,0正常外呼，1接通重呼
        [NameInMap("answer_recall")]
        [Validation(Required=true)]
        public long? AnswerRecall { get; set; }

        // 导入号码时的参数值
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 当状态为已拦截时，可选值：
        // 黑名单拦截
        // 灰名单拦截
        // 异常号码拦截
        [NameInMap("intercept_reason")]
        [Validation(Required=false)]
        public string InterceptReason { get; set; }

        // 企业id
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public long? CompanyId { get; set; }

        // 线路返回的sip编码code
        [NameInMap("sip_code")]
        [Validation(Required=false)]
        public long? SipCode { get; set; }

        // 指的是触发转人工的时间点，格式如：2019-01-09 14:14:19
        [NameInMap("transfer_time")]
        [Validation(Required=false)]
        public string TransferTime { get; set; }

        // 触发转人工时，坐席组的ID
        [NameInMap("seats_group_id")]
        [Validation(Required=false)]
        public long? SeatsGroupId { get; set; }

        // 触发转人工时，坐席组的名称
        [NameInMap("seats_group_name")]
        [Validation(Required=false)]
        public string SeatsGroupName { get; set; }

        // 线路通话时长,单位为毫秒，实际计费需向上取整转换为秒
        [NameInMap("bill")]
        [Validation(Required=false)]
        public long? Bill { get; set; }

        // 外呼回调时可透传的信息内容，可以为空
        [NameInMap("channel_tag")]
        [Validation(Required=false)]
        public string ChannelTag { get; set; }

    }

}
