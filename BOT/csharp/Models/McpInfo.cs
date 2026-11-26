// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // Agent MCP 工具服务配置：含工具白名单与审批声明（R2 授权流，approval_* 三字段缺省走服务端 fail-closed 安全缺省）
    public class McpInfo : TeaModel {
        // mcp名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 协议类型：STREAM_HTTP / SSE / STDIO（大小写不敏感）
        /// <summary>
        /// <b>Example:</b>
        /// <para>STREAM_HTTP</para>
        /// </summary>
        [NameInMap("transport")]
        [Validation(Required=true)]
        public string Transport { get; set; }

        // 协议地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        // 请求头键值对 JSON 字符串，可含鉴权密钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("headers")]
        [Validation(Required=false)]
        public string Headers { get; set; }

        // mcp 幂等标识（agent.detail 回传值，编辑复用）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("mcp_id")]
        [Validation(Required=true)]
        public string McpId { get; set; }

        // 工具名白名单：只列出的工具暴露给 LLM，至少 1 个
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("tools")]
        [Validation(Required=false)]
        public List<string> Tools { get; set; }

        // 该 MCP 的工具默认是否需要用户审批确认（R2 授权流）；缺省按服务端安全缺省 true
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("approval_required")]
        [Validation(Required=false)]
        public bool? ApprovalRequired { get; set; }

        // 免审批工具名名单：无需用户确认直接执行；缺省空（全部按 approval_required 判定）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("approval_exempt_tools")]
        [Validation(Required=false)]
        public List<string> ApprovalExemptTools { get; set; }

        // 审批交互开关：true 时需审批工具经 INTERACTION_REQUIRED→DECIDE 用户确认；false 时需审批工具不派发（fail-closed）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("approval_enabled")]
        [Validation(Required=false)]
        public bool? ApprovalEnabled { get; set; }

    }

}
