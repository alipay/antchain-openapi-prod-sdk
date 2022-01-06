// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 鉴权规则配置项
    public class AuthRuleItemModelVO : TeaModel {
        // 所属鉴权规则id
        [NameInMap("auth_rule_id")]
        [Validation(Required=false)]
        public long? AuthRuleId { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 字段
        [NameInMap("field")]
        [Validation(Required=false)]
        public string Field { get; set; }

        // 操作方式
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // 匹配值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
