// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 组件
    public class Key : TeaModel {
        // 名称（key的中文名称）
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key_ { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // input, // 普通输入框
        // dropdownSelect, // 下拉选择
        // cardSelect, // 平铺选择
        // password, // 密码输入框，这个类型会包含忘记密码按钮
        // smsCode, // 手机验证码
        // qrcodeLogin, // 二维码登录
        // hiddenField,// 隐藏字段，页面上不显示，但是值会提交给后端
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 字段名称 例如：密码
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // 输入框的值类型，字符串还是数字，默认 string/number/paassword
        [NameInMap("input_type")]
        [Validation(Required=true)]
        public string InputType { get; set; }

        // 字段的初始值，类型要和前端提交的类型保持一致，且是可被 JSON 序列化的
        [NameInMap("initial_value")]
        [Validation(Required=true)]
        public string InitialValue { get; set; }

        // 占位符，比如”请输入密码“
        [NameInMap("placeholder")]
        [Validation(Required=true)]
        public string Placeholder { get; set; }

        // 是否为禁用状态，true 表示禁用，默认 false
        [NameInMap("disabled")]
        [Validation(Required=true)]
        public bool? Disabled { get; set; }

        // 表示输入框是否为只读状态（只读和禁用都不能输入，但是样式不一样，所以要注意区分，不要同时声明 disabled 和 readOnly，否则以 disabled 优先）
        [NameInMap("read_only")]
        [Validation(Required=true)]
        public string ReadOnly { get; set; }

        // 这个字段的提示说明文案
        [NameInMap("tooltip")]
        [Validation(Required=true)]
        public string Tooltip { get; set; }

        // 校验规则
        [NameInMap("rules")]
        [Validation(Required=true)]
        public List<Rule> Rules { get; set; }

        // 逻辑列表
        [NameInMap("logics")]
        [Validation(Required=true)]
        public List<Logic> Logics { get; set; }

        // 选择列表的可选值，只有 type 是 dropdownSelect、cardSelect 时才需要
        [NameInMap("select_options")]
        [Validation(Required=true)]
        public List<SelectOption> SelectOptions { get; set; }

        // 忘记密码元素
        [NameInMap("forget_meta")]
        [Validation(Required=true)]
        public ForgetMeta ForgetMeta { get; set; }

    }

}
