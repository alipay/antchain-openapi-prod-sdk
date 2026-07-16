// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 模板组件（文本域）
    public class TemplateComponent : TeaModel {
        // 模板编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>T20240805190830044214</para>
        /// </summary>
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 组件（文本域）id
        /// <summary>
        /// <b>Example:</b>
        /// <para>CP20240521161730006569</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 组件（文本域）名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>companyName</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 组件（文本域）的唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("uk")]
        [Validation(Required=false)]
        public string Uk { get; set; }

        // 占位符，组件（文本域）的展示样式值
        /// <summary>
        /// <b>Example:</b>
        /// <para>【companyName】</para>
        /// </summary>
        [NameInMap("placeholder")]
        [Validation(Required=false)]
        public string Placeholder { get; set; }

        // 组件（文本域）是否可以编辑。取值：Y/N
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y</para>
        /// </summary>
        [NameInMap("enable_edit")]
        [Validation(Required=false)]
        public string EnableEdit { get; set; }

        // 是否必填，取值：Y/N
        /// <summary>
        /// <b>Example:</b>
        /// <para>N</para>
        /// </summary>
        [NameInMap("required")]
        [Validation(Required=false)]
        public string Required { get; set; }

        // 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>INPUT</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 组件（文本域）值
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx公司</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
