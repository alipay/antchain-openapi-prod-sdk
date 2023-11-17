// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class PagequeryAntchainPdcpDatasourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源名称，筛选用，非必填
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 数据源类型，筛选用，非必填。
        // 示例如下：
        // MYSQL,
        // DB2,
        // SQLSERVER,
        // ORACLE,
        // HIVE2,
        // OSS,
        // MINIO
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 数据源是否可写，筛选用，非必填
        [NameInMap("writable")]
        [Validation(Required=false)]
        public bool? Writable { get; set; }

        // 分页页数，必填
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 分页大小，必填
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
