// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 列配置
    public class ColumnConfig : TeaModel {
        // 别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 转化类型
        [NameInMap("cast_type")]
        [Validation(Required=false)]
        public string CastType { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 列类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 当前字段 可转化成的类型选项
        [NameInMap("cast_type_options")]
        [Validation(Required=false)]
        public List<string> CastTypeOptions { get; set; }

    }

}
