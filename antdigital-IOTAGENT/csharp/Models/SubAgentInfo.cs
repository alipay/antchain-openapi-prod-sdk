// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 子智能体详情
    public class SubAgentInfo : TeaModel {
        // 智能体ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>智能体ID</para>
        /// </summary>
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 智能体名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>碳矩阵智能体</para>
        /// </summary>
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 模型提供方
        /// <summary>
        /// <b>Example:</b>
        /// <para>aliyun</para>
        /// </summary>
        [NameInMap("model_provider")]
        [Validation(Required=true)]
        public string ModelProvider { get; set; }

        // 模型
        /// <summary>
        /// <b>Example:</b>
        /// <para>qwen-plus</para>
        /// </summary>
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // skill信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("skills")]
        [Validation(Required=true)]
        public List<SkillInfo> Skills { get; set; }

        // mcp功能
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("mcps")]
        [Validation(Required=true)]
        public List<McpInfo> Mcps { get; set; }

        // 实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>实例id</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
