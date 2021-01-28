// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文件模板中的输入项组件
    public class ContractTemplateStructComponent : TeaModel {
        // 填充字体,默认1，1-宋体，2-新宋体,4-黑体，5-楷体
        [NameInMap("font")]
        [Validation(Required=false)]
        public long? Font { get; set; }

        // 填充字体大小,默认12
        [NameInMap("font_size")]
        [Validation(Required=false)]
        public string FontSize { get; set; }

        // 输入项组件高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 输入项组件id，使用时可用id填充，为空时表示添加，不为空时表示修改
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 模板下输入项组件唯一标识，使用模板时也可用根据key值填充
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 输入项组件显示名称
        [NameInMap("label")]
        [Validation(Required=false)]
        public string Label { get; set; }

        // 输入项组件type=2,type=3时填充格式校验规则;数字格式如：#,#00.0# 日期格式如： yyyy-MM-dd
        [NameInMap("limit")]
        [Validation(Required=false)]
        public string Limit { get; set; }

        // 页码
        [NameInMap("page")]
        [Validation(Required=false)]
        public long? Page { get; set; }

        // 是否必填，默认true
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

        // 字体颜色，默认#000000黑色
        [NameInMap("text_color")]
        [Validation(Required=false)]
        public string TextColor { get; set; }

        // 输入项组件类型，1-文本，2-数字,3-日期，6-签约区
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 输入项组件宽度
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // x轴坐标，左下角为原点
        [NameInMap("x")]
        [Validation(Required=false)]
        public string X { get; set; }

        // y轴坐标，左下角为原点
        [NameInMap("y")]
        [Validation(Required=false)]
        public string Y { get; set; }

    }

}
