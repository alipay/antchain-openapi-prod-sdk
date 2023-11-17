// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class PagequeryAntchainPdcpDatasetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所属的数据源id，非必填
        [NameInMap("datasource_id")]
        [Validation(Required=false)]
        public string DatasourceId { get; set; }

        // 所属的数据源类型，非必填。
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

        // 分页页数,不允许为空
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 分页大小，不允许为空
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
