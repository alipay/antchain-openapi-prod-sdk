// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 插件信息（I-0133）
    public class OpenApiPluginInfo : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        // 枚举:DEVICE,CLOUD,KNOWLEDGE_BASE,MCP,SKILL
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 枚举:OFFICIAL,CUSTOM
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>测试产品</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>示例说明</para>
        /// </summary>
        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

        // 插件公开参数JSON Schema，不含Header值；JSON对象字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("parameter_definitions")]
        [Validation(Required=false)]
        public string ParameterDefinitions { get; set; }

    }

}
