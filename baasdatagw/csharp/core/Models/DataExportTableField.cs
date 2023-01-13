// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据导出映射关系
    public class DataExportTableField : TeaModel {
        // 列名称
        [NameInMap("column_name")]
        [Validation(Required=false)]
        public string ColumnName { get; set; }

        // 事件中字段提取的 jq 表达式
        [NameInMap("field")]
        [Validation(Required=false)]
        public string Field { get; set; }

        // 列类型
        [NameInMap("column_type")]
        [Validation(Required=false)]
        public string ColumnType { get; set; }

        // 列大小
        [NameInMap("column_size")]
        [Validation(Required=false)]
        public long? ColumnSize { get; set; }

        // 列描述
        [NameInMap("column_description")]
        [Validation(Required=false)]
        public string ColumnDescription { get; set; }

    }

}
