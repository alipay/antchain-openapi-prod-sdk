// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class CreateAntchainPdcpDatasetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集名称，必填
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=50)]
        public string Name { get; set; }

        // 数据集描述，非必填
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=200)]
        public string Description { get; set; }

        // 采用数据源配置进行登记时的数据源 id
        // 如果填写了本参数，则可不填写datasourceType和connConfig
        // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
        [NameInMap("datasource_id")]
        [Validation(Required=false)]
        public string DatasourceId { get; set; }

        // 数据集数据源类型。
        // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
        // 如果未填写datasourceId，则必须同时填写本参数和 connConfig参数。
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

        // 数据集所属数据源连接信息，与数据源类型一一对应。
        // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
        // 如果未填写 datasourceId，则必须同时填写本参数和datasourceType参数。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体对应关系如下：
        // MYSQL -> MysqlConnConfig,
        // ORACLE -> OracleConnConfig,
        // SQLSERVER -> SqlServerConnConfig,
        // DB2 -> DbTwoConnConfig,
        // HIVE2 -> HiveTwoConnConfig,
        // ODPS -> OdpsConnConfig
        [NameInMap("conn_config")]
        [Validation(Required=false)]
        public string ConnConfig { get; set; }

        // 数据集位置信息的对象转化成的json字符串，如数据表名称等。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
        // MYSQL -> MysqlLocationConfig,
        // ORACLE -> OracleLocationConfig,
        // SQLSERVER -> SqlServerLocationConfig,
        // DB2 -> DbTwoLocationConfig,
        // HIVE2 -> HiveTwoLocationConfig,
        // ODPS -> OdpsLocationConfig
        [NameInMap("location_config")]
        [Validation(Required=true)]
        public string LocationConfig { get; set; }

        // 数据集格式类型。
        // 示例如下：
        // TABLE
        [NameInMap("format_type")]
        [Validation(Required=true)]
        public string FormatType { get; set; }

        // 数据集格式信息转化成的json字符串，如 csv 分隔符，数据库主键名称等，必须与数据源类型一一对应。
        // 具体的对应关系如下：
        // 数据表 -> TableFormatConfig
        [NameInMap("format_config")]
        [Validation(Required=true)]
        public string FormatConfig { get; set; }

        // 数据集 schema 类型。
        // 示例如下：
        // STRUCTURED_DATA
        [NameInMap("schema_type")]
        [Validation(Required=true)]
        public string SchemaType { get; set; }

        // 结构化数据 schema
        // schemaType为STRUCTURED_DATA时必填
        [NameInMap("structured_data_schema")]
        [Validation(Required=false)]
        public StructuredDataSchema StructuredDataSchema { get; set; }

    }

}
