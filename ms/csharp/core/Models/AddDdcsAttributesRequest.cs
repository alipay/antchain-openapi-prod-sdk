// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDdcsAttributesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 属性名称
        [NameInMap("attribute_name")]
        [Validation(Required=true)]
        public string AttributeName { get; set; }

        // 属性描述信息
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 环境实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 所属的资源自增长 ID
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public long? ResourceId { get; set; }

    }

}
