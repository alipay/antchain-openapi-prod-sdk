// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AllSgCircuitbreakerrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名称，数组形式
        [NameInMap("app_names")]
        [Validation(Required=false)]
        public string AppNames { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 租户id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 排序规则，JSON字符串
        [NameInMap("orders")]
        [Validation(Required=false)]
        public string Orders { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 规则名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前页
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

    }

}
