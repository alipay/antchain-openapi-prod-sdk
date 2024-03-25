// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 其他过滤条件
    public class FieldCondition : TeaModel {
        // 字段名称
        [NameInMap("field_name")]
        [Validation(Required=true)]
        public string FieldName { get; set; }

        // 复杂查询下，嵌套子条件字段jsonPath
        [NameInMap("nest_field_path")]
        [Validation(Required=false)]
        public string NestFieldPath { get; set; }

        // 复杂查询下，嵌套子条件字段值
        [NameInMap("nest_field_value")]
        [Validation(Required=false)]
        public List<long?> NestFieldValue { get; set; }

        // 操作符
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 关键字	
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
