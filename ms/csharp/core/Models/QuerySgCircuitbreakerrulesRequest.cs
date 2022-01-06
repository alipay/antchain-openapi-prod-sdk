// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QuerySgCircuitbreakerrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务资源id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 排序规则，JSON字符串,，数组形式
        [NameInMap("orders")]
        [Validation(Required=false)]
        public string Orders { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 当前页
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

    }

}
