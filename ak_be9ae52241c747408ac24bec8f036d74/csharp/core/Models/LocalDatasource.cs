// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 用于描述数据源的元信息
    public class LocalDatasource : TeaModel {
        // 数据源id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 数据源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 数据源描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 当前数据源是否支持写入
        [NameInMap("writable")]
        [Validation(Required=false)]
        public bool? Writable { get; set; }

        // 用于描述数据源类型的枚举。
        // 示例如下：
        // MYSQL,
        // DB2,
        // SQLSERVER,
        // ORACLE,
        // HIVE2,
        // ODPS
        // 
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 用于描述数据源的连接信息，为描述连接信息的数据对象转化为的json字符串，与type指定的数据源类型必须一一对应。
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
