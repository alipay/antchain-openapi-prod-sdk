// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class RecognizeAntchainPdcpDatasetSchemaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 采用数据源配置进行登记时的数据源 id
        // 如果填写了本参数，则可不填写datasourceType和connConfig
        // 如果填写了本参数，将优先采用本参数指定的 datasource 配置
        [NameInMap("datasource_id")]
        [Validation(Required=false)]
        public string DatasourceId { get; set; }

        // 数据资产数据源类型
        // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略
        // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

        // 数据资产数据源连接信息，与数据源类型必须一一对应。
        // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
        // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，具体的对应信息如下：
        // MYSQL -> MysqlConnConfig,
        // ORACLE -> OracleConnConfig,
        // SQLSERVER -> SqlServerConnConfig,
        // DB2 -> DbTwoConnConfig,
        // HIVE2 -> HiveTwoConnConfig,
        // ODPS -> OdpsConnConfig
        [NameInMap("conn_config")]
        [Validation(Required=false)]
        public string ConnConfig { get; set; }

        // 数据集位置配置，如数据表名称等。
        // 如果填写了datasourceId，则根据datasourceId对应的数据源类型进行解析。
        // 如果未填写datasourceId，则根据datasourceType进行解析。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
        // MYSQL -> MysqlLocationConfig,
        // ORACLE -> OracleLocationConfig,
        // SQLSERVER -> SqlServerLocationConfig,
        // DB2 -> DbTwoLocationConfig,
        // HIVE2 -> HiveTwoLocationConfig,
        // ODPS -> OdpsLocationConfig
        [NameInMap("location_config")]
        [Validation(Required=true)]
        public string LocationConfig { get; set; }

        // 数据集格式类型，如TABLE。
        [NameInMap("format_type")]
        [Validation(Required=true)]
        public string FormatType { get; set; }

        // 数据集所属的数据源格式信息，如 csv 分隔符，数据库主键名称等。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
        // 数据表 -> TableFormatConfig，
        [NameInMap("format_config")]
        [Validation(Required=false)]
        public string FormatConfig { get; set; }

    }

}
