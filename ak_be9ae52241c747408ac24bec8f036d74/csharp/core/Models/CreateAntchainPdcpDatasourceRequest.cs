// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class CreateAntchainPdcpDatasourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源名称，必填，长度不超过50个字符
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=50)]
        public string Name { get; set; }

        // 数据源的描述，数据量，作用域等等。
        // 非必填，长度不超过200个字符。
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=200)]
        public string Description { get; set; }

        // 描述当前数据源是否支持写入。
        // true表示支持写入。
        [NameInMap("writable")]
        [Validation(Required=true)]
        public bool? Writable { get; set; }

        // 描述数据源类型的枚举，必填。
        // 示例如下：
        // MYSQL,
        // DB2,
        // SQLSERVER,
        // ORACLE,
        // HIVE2,
        // ODPS
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 数据源连接信息的对象体转化为的json字符串。
        // 要求连接信息的类型必须与type指定的一致。
        // 该参数请参考如下的对应结构体，定义好后转化成jsonstring，对应信息如下：
        // MYSQL -> MysqlConnConfig,
        // ORACLE -> OracleConnConfig,
        // SQLSERVER -> SqlServerConnConfig,
        // DB2 -> DbTwoConnConfig,
        // HIVE2 -> HiveTwoConnConfig,
        // ODPS -> OdpsConnConfig
        [NameInMap("conn_config")]
        [Validation(Required=true)]
        public string ConnConfig { get; set; }

    }

}
