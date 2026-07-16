// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 文本域（组件）
    public class TemplateTextAreaComponent : TeaModel {
        // 模板编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>T20240505151148001384</para>
        /// </summary>
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 模版版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("template_version")]
        [Validation(Required=true)]
        public string TemplateVersion { get; set; }

        // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>INPUT</para>
        /// </summary>
        [NameInMap("component_type")]
        [Validation(Required=true)]
        public string ComponentType { get; set; }

        // 组件名称（占位符）
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司名称</para>
        /// </summary>
        [NameInMap("component_name")]
        [Validation(Required=true)]
        public string ComponentName { get; set; }

        // 是否必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 预估文本行数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("line")]
        [Validation(Required=false)]
        public long? Line { get; set; }

        // 多行文本域名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>公司地址</para>
        /// </summary>
        [NameInMap("multi_name")]
        [Validation(Required=true)]
        public string MultiName { get; set; }

        // 前端传入的文本域映射字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>CP20250721172015013576</para>
        /// </summary>
        [NameInMap("pre_element_code")]
        [Validation(Required=true)]
        public string PreElementCode { get; set; }

    }

}
