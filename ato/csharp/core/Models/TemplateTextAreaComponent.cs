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
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 模版版本号
        [NameInMap("template_version")]
        [Validation(Required=true)]
        public string TemplateVersion { get; set; }

        // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
        [NameInMap("component_type")]
        [Validation(Required=true)]
        public string ComponentType { get; set; }

        // 组件名称（占位符）
        [NameInMap("component_name")]
        [Validation(Required=true)]
        public string ComponentName { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 预估文本行数
        [NameInMap("line")]
        [Validation(Required=false)]
        public long? Line { get; set; }

        // 多行文本域名称
        [NameInMap("multi_name")]
        [Validation(Required=true)]
        public string MultiName { get; set; }

        // 前端传入的文本域映射字段
        [NameInMap("pre_element_code")]
        [Validation(Required=true)]
        public string PreElementCode { get; set; }

    }

}
