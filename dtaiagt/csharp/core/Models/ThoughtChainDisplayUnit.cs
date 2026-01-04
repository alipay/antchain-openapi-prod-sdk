// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话详情-思维链信息详情列表
    public class ThoughtChainDisplayUnit : TeaModel {
        // 思维链模块id
        // 
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 思维链模块状态：success or fail
        // 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 思维链模块额外信息
        // 
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        // 思维链模块耗时
        // 
        [NameInMap("latency")]
        [Validation(Required=true)]
        public long? Latency { get; set; }

        // 思维链模块时间戳 (思维链本身的时间戳)
        // 
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 思维链对应操作开始执行时间戳 (optional)
        // 
        [NameInMap("start_timestamp")]
        [Validation(Required=true)]
        public long? StartTimestamp { get; set; }

        // 思维链对应操作开始输出时间戳 (optional)
        // 
        [NameInMap("output_timestamp")]
        [Validation(Required=true)]
        public long? OutputTimestamp { get; set; }

        // 思维链对应操作结束执行时间戳 (optional)
        // 
        [NameInMap("end_timestamp")]
        [Validation(Required=true)]
        public long? EndTimestamp { get; set; }

        // 思维链对应过程总模型token耗费 (optional)
        // 
        [NameInMap("token_cost")]
        [Validation(Required=true)]
        public long? TokenCost { get; set; }

        // 思维链对应过程输入模型token耗费 (optional)
        // 
        [NameInMap("input_token_cost")]
        [Validation(Required=true)]
        public long? InputTokenCost { get; set; }

        // 思维链对应过程输出模型token耗费 (optional)
        // 
        [NameInMap("output_token_cost")]
        [Validation(Required=true)]
        public long? OutputTokenCost { get; set; }

        // 思维链模块显示名称
        // 
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 思维链模块是否为进行中阶段的输出
        // 
        [NameInMap("is_running")]
        [Validation(Required=true)]
        public bool? IsRunning { get; set; }

        // 思维链模块类型：DECISION or GENERATE
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 思维链模块子类型：content_search 知识查询 / llm 大模型 / tool 工具 / workflow 工作流 / end 结束 / parameter 参数处理
        // 
        [NameInMap("sub_type")]
        [Validation(Required=true)]
        public string SubType { get; set; }

        // 思维链模块子类型关联id。如果是工具，那就是 platform_api_plugin 表的 id；如果是工作流，那就是 platform_intent 表的 id
        // 
        [NameInMap("ref_resource_id")]
        [Validation(Required=true)]
        public long? RefResourceId { get; set; }

        // 思维链模块子类型关联code，一般是工具或工作流类型对应的code
        // 
        [NameInMap("ref_resource_code")]
        [Validation(Required=true)]
        public string RefResourceCode { get; set; }

        // 思维链模块子类型关联图标
        // 
        [NameInMap("ref_resource_icon")]
        [Validation(Required=true)]
        public string RefResourceIcon { get; set; }

        // 思维链模块子类型为工作流时的版本，仅当子类型为工作流时赋值
        // 
        [NameInMap("ref_workflow_build_version")]
        [Validation(Required=true)]
        public string RefWorkflowBuildVersion { get; set; }

        // 思维链模块子类型为工作流时的运行实例id，仅当子类型为工作流且 refWorkflowBuildVersion 以 NEW 开头时赋值
        // 
        [NameInMap("ref_workflow_runtime_instance_id")]
        [Validation(Required=true)]
        public string RefWorkflowRuntimeInstanceId { get; set; }

        // 思维链模块入参信息，JSON字符串格式
        // 
        [NameInMap("input_json_string")]
        [Validation(Required=true)]
        public string InputJsonString { get; set; }

        // 思维链模块出参信息，JSON字符串格式
        // 
        [NameInMap("output_json_string")]
        [Validation(Required=true)]
        public string OutputJsonString { get; set; }

        // 思维链模块额外消息信息 (如内置工具过程展现内容)，JSON字符串格式
        // 
        [NameInMap("extra_info_json_string")]
        [Validation(Required=true)]
        public string ExtraInfoJsonString { get; set; }

    }

}
