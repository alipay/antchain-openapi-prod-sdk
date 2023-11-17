// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class UpdateAntchainPdcpDatasourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待更新的数据源 id，必填
        [NameInMap("datasource_id")]
        [Validation(Required=true)]
        public string DatasourceId { get; set; }

        // 更新后的数据源名称，非必填，不填则不更新
        [NameInMap("name")]
        [Validation(Required=false, MaxLength=50)]
        public string Name { get; set; }

        // 更新后的数据源描述，非必填，不填则不更新
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=200)]
        public string Description { get; set; }

        // 数据源是否可写，非必填，不填则不更新
        [NameInMap("writable")]
        [Validation(Required=false)]
        public bool? Writable { get; set; }

        // 数据源连接参数，非必填，不填则不更新，注意必须与此数据源创建时的类型一致。
        // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
        // MYSQL -> MysqlConnConfig,
        // ORACLE -> OracleConnConfig,
        // SQLSERVER -> SqlServerConnConfig,
        // DB2 -> DbTwoConnConfig,
        // HIVE2 -> HiveTwoConnConfig,
        // ODPS -> OdpsConnConfig
        [NameInMap("conn_config")]
        [Validation(Required=false)]
        public string ConnConfig { get; set; }

    }

}
