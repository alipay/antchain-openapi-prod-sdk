// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class CreateDasDatasourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=20)]
        public string Name { get; set; }

        // 数据源提供方
        [NameInMap("provider")]
        [Validation(Required=true, MaxLength=30)]
        public string Provider { get; set; }

        // 枚举值：ENTERPRISE、INDIVIDUAL
        [NameInMap("data_owner_type")]
        [Validation(Required=true)]
        public string DataOwnerType { get; set; }

        // 数据源接口定义
        [NameInMap("interface")]
        [Validation(Required=true)]
        public DataSourceInterface Interface { get; set; }

    }

}
