// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqConnectorconfigsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户名称
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 代表查询的配置 是source还是sink
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 是否是克隆模式
        [NameInMap("clone")]
        [Validation(Required=false)]
        public bool? Clone { get; set; }

    }

}
