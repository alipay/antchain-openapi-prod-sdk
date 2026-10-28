// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // mcp协议字段信息
    public class McpInfo : TeaModel {
        // mcp名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>mcp名字</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 协议类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>streamable_http / sse /stadio</para>
        /// </summary>
        [NameInMap("transport")]
        [Validation(Required=true)]
        public string Transport { get; set; }

        // 协议地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>协议地址</para>
        /// </summary>
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        // json
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("headers")]
        [Validation(Required=false)]
        public string Headers { get; set; }

        // mcp_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>mcp_id</para>
        /// </summary>
        [NameInMap("mcp_id")]
        [Validation(Required=true)]
        public string McpId { get; set; }

        // 工具名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("tools")]
        [Validation(Required=false)]
        public List<string> Tools { get; set; }

    }

}
