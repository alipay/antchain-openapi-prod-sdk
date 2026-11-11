// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 上下文占用分项明细（按 系统提示词/Skills/工具定义/对话 四类拆分，估算值，加总约等于 estimated_input_tokens）
    public class ContextBreakdown : TeaModel {
        // 系统提示词占用token数（估算）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("system_prompt")]
        [Validation(Required=false)]
        public long? SystemPrompt { get; set; }

        // Skill/插件提示词占用token数（估算）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("skills")]
        [Validation(Required=false)]
        public long? Skills { get; set; }

        // 工具定义占用token数（估算）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("tool_definitions")]
        [Validation(Required=false)]
        public long? ToolDefinitions { get; set; }

        // 对话历史占用token数（估算）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("conversation")]
        [Validation(Required=false)]
        public long? Conversation { get; set; }

    }

}
