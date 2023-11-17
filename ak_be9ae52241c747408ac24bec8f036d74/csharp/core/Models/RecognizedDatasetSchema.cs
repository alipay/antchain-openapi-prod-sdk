// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 推断出的数据集schema
    public class RecognizedDatasetSchema : TeaModel {
        // 数据集格式类型。
        // 示例如下：
        // TABLE,
        // CSV
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public string FormatType { get; set; }

        // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等。
        // 对应关系如下：
        // 数据表 -> TableFormatConfig，
        // CSV文件 -> CSVFormatConfig
        [NameInMap("format_config")]
        [Validation(Required=false)]
        public string FormatConfig { get; set; }

        // 数据集 schema 类型。
        [NameInMap("schema_type")]
        [Validation(Required=false)]
        public string SchemaType { get; set; }

        // 结构化数据 schema
        // schema_type为STRUCTURED_DATA时必填
        [NameInMap("structured_data_schema")]
        [Validation(Required=false)]
        public StructuredDataSchema StructuredDataSchema { get; set; }

    }

}
