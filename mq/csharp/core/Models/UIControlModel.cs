// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 前端UI展示的模型
    public class UIControlModel : TeaModel {
        // 展示给用户查看的描述。
        [NameInMap("display")]
        [Validation(Required=true)]
        public string Display { get; set; }

        // 提示信息，参照Tooltip
        [NameInMap("hint")]
        [Validation(Required=false)]
        public string Hint { get; set; }

        // 控件名称，也是控件绑定的数据 key
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 如果本控件是 select 或者 radio 选择框类型，本数组是 所有 选项的具体信息。
        [NameInMap("options")]
        [Validation(Required=false)]
        public List<UIOptionModel> Options { get; set; }

        // input控件独有字段，代表输入框的place holder
        [NameInMap("place_holder")]
        [Validation(Required=false)]
        public string PlaceHolder { get; set; }

        // 该控件的value是否是必须的
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 本控件的值必须满足的规则，例如input，那么可能输入的文本必须满足全英文等；以正则表达式的形式。
        [NameInMap("rule")]
        [Validation(Required=false)]
        public string Rule { get; set; }

        // 当 用户输入的 值与 rule不符合时，提醒用户出错的备注。
        [NameInMap("rule_remark")]
        [Validation(Required=false)]
        public string RuleRemark { get; set; }

        // 控件的类型；支持 Select、Radio、Input、DatePicking
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 本控件是否未联动控件，联动控件是否展示 与 union_control和union_value 相关，当联动的父控件union_control的值为union_value时，本控件才可见。
        [NameInMap("union")]
        [Validation(Required=true)]
        public bool? Union { get; set; }

        // 联动的控件名称，即name
        [NameInMap("union_control")]
        [Validation(Required=false)]
        public string UnionControl { get; set; }

        // 当联动空间union_control的值是本字段的值时，本联动控件可以展示。
        [NameInMap("union_value")]
        [Validation(Required=false)]
        public string UnionValue { get; set; }

        // 本控件对应的值；如果是input，那么就是输入的值；如果是select/radio，那就是选项的值；如果是option，那么就是自己本身的枚举值。
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 该控件的值是否可以修改
        [NameInMap("immutable")]
        [Validation(Required=true)]
        public bool? Immutable { get; set; }

    }

}
