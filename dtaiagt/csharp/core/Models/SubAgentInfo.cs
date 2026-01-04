// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情查询-隶属multi-agent的sub agents
    public class SubAgentInfo : TeaModel {
        // agent主键id
        // 
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // agent code
        // 
        [NameInMap("unique_code")]
        [Validation(Required=true)]
        public string UniqueCode { get; set; }

        // 场景描述
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 调用示例 话术
        // 
        [NameInMap("scripting")]
        [Validation(Required=true)]
        public List<string> Scripting { get; set; }

        // 是否默认展示
        // 
        [NameInMap("is_default")]
        [Validation(Required=true)]
        public bool? IsDefault { get; set; }

        // 实例id
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // edges 信息
        // 
        [NameInMap("edges")]
        [Validation(Required=true)]
        public List<MultiAgentEdge> Edges { get; set; }

        // 坐标信息
        // 
        [NameInMap("position")]
        [Validation(Required=true)]
        public DraftPosition Position { get; set; }

        // agent 来源类型
        // 
        [NameInMap("agent_source")]
        [Validation(Required=true)]
        public string AgentSource { get; set; }

    }

}
