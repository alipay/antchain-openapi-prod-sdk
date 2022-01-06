// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 鉴权规则项
    public class AuthRuleItem : TeaModel {
        // 所属的鉴权规则id
        [NameInMap("auth_rule_id")]
        [Validation(Required=false)]
        public long? AuthRuleId { get; set; }

        // 枚举类型
        // SYSTEM 表示系统内置字段
        // CUSTOM 表示用户自定义字段
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 匹配字段
        [NameInMap("field")]
        [Validation(Required=true)]
        public string Field { get; set; }

        // 操作符，通过 FormConfig 可以获取支持所有的操作符
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 匹配的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
