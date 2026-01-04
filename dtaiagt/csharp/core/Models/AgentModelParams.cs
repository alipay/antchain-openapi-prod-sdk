// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情-Agent模型配置表
    // 
    public class AgentModelParams : TeaModel {
        // 模型类型 AgentModelTypeEnum - DECISION: 决策模型 - GENERATE: 生成模型 - E2E: 端到端模型 - RAG: 检索生成模型
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 模型版本 {model}/{version}#{adapter}
        // 
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 生成策略预设配置 AgentModelPresetEnum - FLEXIBLE: 灵活 - NORMAL: 正常 - STRICT: 严格
        // 
        [NameInMap("preset_index")]
        [Validation(Required=true)]
        public string PresetIndex { get; set; }

        // temperature 浮点类型
        // 
        [NameInMap("temperature")]
        [Validation(Required=true)]
        public string Temperature { get; set; }

        // top_k
        [NameInMap("top_k")]
        [Validation(Required=true)]
        public long? TopK { get; set; }

        // top_p 浮点类型
        [NameInMap("top_p")]
        [Validation(Required=true)]
        public string TopP { get; set; }

        // doSample
        [NameInMap("do_sample")]
        [Validation(Required=true)]
        public bool? DoSample { get; set; }

        // beam_width
        [NameInMap("beam_width")]
        [Validation(Required=true)]
        public long? BeamWidth { get; set; }

        // 最大输出长度
        // 
        [NameInMap("max_out_token")]
        [Validation(Required=true)]
        public long? MaxOutToken { get; set; }

        // 是否为支持 function call 的模型
        // 
        [NameInMap("function_call")]
        [Validation(Required=true)]
        public bool? FunctionCall { get; set; }

        // 自定义推理服务url
        // 
        [NameInMap("custom_url")]
        [Validation(Required=true)]
        public string CustomUrl { get; set; }

        // 是否平台官方模型
        // 
        [NameInMap("bailing_official")]
        [Validation(Required=true)]
        public bool? BailingOfficial { get; set; }

    }

}
