// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 用于描述数据集的元信息
    public class LocalDataset : TeaModel {
        // 数据集id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 数据集名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 数据集描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 数据集所属的数据源 id
        [NameInMap("datasource_id")]
        [Validation(Required=false)]
        public string DatasourceId { get; set; }

        // 数据源类型。
        // 示例如下：
        // MYSQL,
        // DB2,
        // SQLSERVER,
        // ORACLE,
        // HIVE2,
        // ODPS
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

        // 数据源连接参数转化成的json字符串，必须与数据源类型一一对应。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
        // MYSQL -> MysqlConnConfig,
        // ORACLE -> OracleConnConfig,
        // SQLSERVER -> SqlServerConnConfig,
        // DB2 -> DbTwoConnConfig,
        // HIVE2 -> HiveTwoConnConfig,
        // ODPS -> OdpsConnConfig
        [NameInMap("datasource_conn_config")]
        [Validation(Required=false)]
        public string DatasourceConnConfig { get; set; }

        // 数据集在数据源中的位置信息转化成的json字符串，如数据表名称等，必须和数据源类型一一对应。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应关系如下：
        // MYSQL -> MysqlLocationConfig,
        // ORACLE -> OracleLocationConfig,
        // SQLSERVER -> SqlServerLocationConfig,
        // DB2 -> DbTwoLocationConfig,
        // HIVE2 -> HiveTwoLocationConfig,
        // ODPS -> OdpsLocationConfig
        [NameInMap("location_config")]
        [Validation(Required=false)]
        public string LocationConfig { get; set; }

        // 数据集格式类型。
        // 示例如下：
        // TABLE
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public string FormatType { get; set; }

        // 数据集格式信息，如 csv 分隔符，数据库主键名称等，与数据集类型一一对应。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，当前支持的类型展示如下：
        // 数据表 -> TableFormatConfig
        [NameInMap("format_config")]
        [Validation(Required=false)]
        public string FormatConfig { get; set; }

        // 数据集 schema 类型。
        // 示例如下：
        // STRUCTURED_DATA
        [NameInMap("schema_type")]
        [Validation(Required=false)]
        public string SchemaType { get; set; }

        // 结构化数据 schema，schema_type为STRUCTURED_DATA时必填
        [NameInMap("structured_data_schema")]
        [Validation(Required=false)]
        public StructuredDataSchema StructuredDataSchema { get; set; }

    }

}
