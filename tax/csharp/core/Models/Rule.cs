// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 规则
    public class Rule : TeaModel {
        // 字段值的类型，常见有 string | number| boolean | _array_
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // type 为 string 类型时，表示字符串长度；number 类型时表示确定数字； array 类型时表示数组长度
        [NameInMap("len")]
        [Validation(Required=true)]
        public long? Len { get; set; }

        // type 为 string 类型时，表示字符串最大长度；number 类型时表示最大值；array 类型时表示数组最大长度
        [NameInMap("max")]
        [Validation(Required=true)]
        public long? Max { get; set; }

        // type 为 string 类型时，表示字符串最小长度；number 类型时表示最小值；array 类型时表示数组最小长度
        [NameInMap("min")]
        [Validation(Required=true)]
        public long? Min { get; set; }

        // 校验出错时显示的错误消息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 正则表达式,
        [NameInMap("reg_pattern")]
        [Validation(Required=true)]
        public string RegPattern { get; set; }

    }

}
