// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 节点配置信息数据结构
    public class NodeInfo : TeaModel {
        // 业务标签
        [NameInMap("biz_tag")]
        [Validation(Required=true)]
        public Output BizTag { get; set; }

        // 节点子类型
        [NameInMap("sub_type")]
        [Validation(Required=true)]
        public string SubType { get; set; }

        // 人工类型
        [NameInMap("transfer_target_type")]
        [Validation(Required=true)]
        public string TransferTargetType { get; set; }

        // 路由点
        [NameInMap("transfer_data")]
        [Validation(Required=true)]
        public string TransferData { get; set; }

        // 技能组
        [NameInMap("skill_group_no")]
        [Validation(Required=true)]
        public string SkillGroupNo { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 业务达成
        [NameInMap("biz_achieve")]
        [Validation(Required=true)]
        public bool? BizAchieve { get; set; }

        // 音色
        [NameInMap("voice_type")]
        [Validation(Required=true)]
        public string VoiceType { get; set; }

        // 模型类型
        [NameInMap("model_type")]
        [Validation(Required=true)]
        public string ModelType { get; set; }

        // 分类模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // llm意图识别列表配置
        [NameInMap("llm_labels")]
        [Validation(Required=true)]
        public List<string> LlmLabels { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 失败后重复次数
        [NameInMap("repeat_time")]
        [Validation(Required=true)]
        public long? RepeatTime { get; set; }

        // 是否允许重试话术打断
        [NameInMap("interruptable")]
        [Validation(Required=true)]
        public bool? Interruptable { get; set; }

        // sts配置
        [NameInMap("sts")]
        [Validation(Required=true)]
        public string Sts { get; set; }

        // appkey
        [NameInMap("appkey")]
        [Validation(Required=true)]
        public string Appkey { get; set; }

        // 交互组件后置
        [NameInMap("post_interaction_component")]
        [Validation(Required=true)]
        public bool? PostInteractionComponent { get; set; }

        // 话术选择策略
        [NameInMap("corpus_choose_strategy")]
        [Validation(Required=true)]
        public string CorpusChooseStrategy { get; set; }

        // 话术选择策略模型的地址
        [NameInMap("corpus_choose_model_url")]
        [Validation(Required=true)]
        public string CorpusChooseModelUrl { get; set; }

        // 话术选择策略模型类型
        [NameInMap("corpus_choose_model_type")]
        [Validation(Required=true)]
        public string CorpusChooseModelType { get; set; }

        // 全局意图
        [NameInMap("global_intention")]
        [Validation(Required=true)]
        public bool? GlobalIntention { get; set; }

        // 命中全局意图后需要播报的内容
        [NameInMap("global_intention_reply")]
        [Validation(Required=true)]
        public Output GlobalIntentionReply { get; set; }

        // 按键类型
        [NameInMap("button_type")]
        [Validation(Required=true)]
        public string ButtonType { get; set; }

        // 按键位数
        [NameInMap("button_digit")]
        [Validation(Required=true)]
        public long? ButtonDigit { get; set; }

        // 结束按键
        [NameInMap("button_terminator")]
        [Validation(Required=true)]
        public string ButtonTerminator { get; set; }

        // 收号超时时间
        [NameInMap("button_timeout")]
        [Validation(Required=true)]
        public long? ButtonTimeout { get; set; }

        // 收号校验规则
        [NameInMap("button_validator")]
        [Validation(Required=true)]
        public string ButtonValidator { get; set; }

        // 静态菜单配置
        [NameInMap("static_keys")]
        [Validation(Required=true)]
        public List<string> StaticKeys { get; set; }

        // 是否支持按键返回上一级
        [NameInMap("static_key_previous")]
        [Validation(Required=true)]
        public bool? StaticKeyPrevious { get; set; }

        // 是否支持按键重播
        [NameInMap("static_key_repeat")]
        [Validation(Required=true)]
        public bool? StaticKeyRepeat { get; set; }

        // 是否跳过用户输入的错误校验
        [NameInMap("static_key_skip_input_check")]
        [Validation(Required=true)]
        public bool? StaticKeySkipInputCheck { get; set; }

        // 只有客权的静态菜单开发
        [NameInMap("round")]
        [Validation(Required=true)]
        public bool? Round { get; set; }

        // 静态菜单语言
        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

        // 实例码
        [NameInMap("ie_instance_code")]
        [Validation(Required=true)]
        public string IeInstanceCode { get; set; }

        // 子流程ID
        [NameInMap("sub_flow_fe_id")]
        [Validation(Required=true)]
        public string SubFlowFeId { get; set; }

        // 动态子流程id值
        [NameInMap("sub_flow_dynamic_id")]
        [Validation(Required=true)]
        public string SubFlowDynamicId { get; set; }

        // 输入参数配置
        [NameInMap("sub_flow_input")]
        [Validation(Required=true)]
        public List<Input> SubFlowInput { get; set; }

        // 开始节点参数
        [NameInMap("start_params")]
        [Validation(Required=true)]
        public List<Input> StartParams { get; set; }

        // 和ouput中的interactionType保持一致
        [NameInMap("allow_interaction_types")]
        [Validation(Required=true)]
        public List<string> AllowInteractionTypes { get; set; }

        // 需要共享上下文的虚拟因子列表
        [NameInMap("share_factors")]
        [Validation(Required=true)]
        public List<Input> ShareFactors { get; set; }

    }

}
