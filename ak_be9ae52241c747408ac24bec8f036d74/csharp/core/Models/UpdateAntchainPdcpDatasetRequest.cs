// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class UpdateAntchainPdcpDatasetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 采用数据源配置进行登记时的数据源 id，非必填，不填则不更新
        // 如果填写了本参数，则可不填写datasourceType和connConfig
        // 如果填写了本参数，将优先采用本参数指定的datasource配置
        [NameInMap("datasource_id")]
        [Validation(Required=false)]
        public string DatasourceId { get; set; }

        // 待更新的数据集 id，必填
        [NameInMap("dataset_id")]
        [Validation(Required=true)]
        public string DatasetId { get; set; }

        // 数据集数据源类型，非必填，不填则不更新。
        // 如果填写了datasourceId，则可不传本参数，填写了本参数也将被忽略。
        // 如果未填写datasourceId，则必须同时填写本参数和connConfig参数。
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

        // 更新后的数据集名称，非必填，不填则不更新
        [NameInMap("name")]
        [Validation(Required=false, MaxLength=50)]
        public string Name { get; set; }

        // 更新后的数据集描述，非必填，不填则不更新
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=200)]
        public string Description { get; set; }

        // 数据集数据源连接信息转化的json字符串，非必填，不填则不更新。
        // 如果填写了datasourceId，则可不传本参数，填写本参数也将被忽略。
        // 如果未填写datasourceId，则必须同时填写本参数和datasourceType参数。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
        // MYSQL -> MysqlConnConfig,
        // ORACLE -> OracleConnConfig,
        // SQLSERVER -> SqlServerConnConfig,
        // DB2 -> DbTwoConnConfig,
        // HIVE2 -> HiveTwoConnConfig,
        // ODPS -> OdpsConnConfig
        [NameInMap("conn_config")]
        [Validation(Required=false)]
        public string ConnConfig { get; set; }

        // 数据集位置信息转化的json字符串，如数据表名称等，非必填，不填则不更新。
        // 如果填写了datasourceId，则本参数必填且根据 datasourceId 对应的数据源类型进行解析。
        // 如果未填写datasourceId且填写了 connConfig，则本参数必填且根据datasourceType进行解析。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应信息如下：
        // MYSQL -> MysqlLocationConfig,
        // ORACLE -> OracleLocationConfig,
        // SQLSERVER -> SqlServerLocationConfig,
        // DB2 -> DbTwoLocationConfig,
        // HIVE2 -> HiveTwoLocationConfig,
        // ODPS -> OdpsLocationConfig
        [NameInMap("location_config")]
        [Validation(Required=false)]
        public string LocationConfig { get; set; }

        // 数据集格式类型，非必填，不填则不更新，如果填写，则format_config也必须填写。
        // 示例：TABLE
        [NameInMap("format_type")]
        [Validation(Required=false)]
        public string FormatType { get; set; }

        // 数据集数据源格式信息，如 csv 分隔符，数据库主键名称等，非必填，不填则不更新
        // 如果填写，则formatType也必须填写
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系如下：
        // 数据表 -> TableFormatConfig，
        [NameInMap("format_config")]
        [Validation(Required=false)]
        public string FormatConfig { get; set; }

    }

}
