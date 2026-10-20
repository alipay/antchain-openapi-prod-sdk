// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 智能体信息
    public class AgentInfo : TeaModel {
        // 智能体id
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344556778899</para>
        /// </summary>
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 智能体名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>碳矩阵智能体</para>
        /// </summary>
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 系统提示词
        /// <summary>
        /// <b>Example:</b>
        /// <para>你是碳矩阵智能助手</para>
        /// </summary>
        [NameInMap("system_prompt")]
        [Validation(Required=true)]
        public string SystemPrompt { get; set; }

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
        /// <para>11223344556778899</para>
        /// </summary>
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // skills信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("skills")]
        [Validation(Required=true)]
        public List<SkillInfo> Skills { get; set; }

        // mcp信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("mcps")]
        [Validation(Required=true)]
        public List<McpInfo> Mcps { get; set; }

        // 子智能体id
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("sub_agents")]
        [Validation(Required=false)]
        public List<string> SubAgents { get; set; }

        // 子智能体详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("sub_agent_info_list")]
        [Validation(Required=false)]
        public List<SubAgentInfo> SubAgentInfoList { get; set; }

        // 实例id
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344556778899</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
