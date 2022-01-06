// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QueryDdcsAttributesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 属性名称
        [NameInMap("attribute_name")]
        [Validation(Required=true)]
        public string AttributeName { get; set; }

        // 系统字段：环境实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 资源所属域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 资源 ID，类似于文件名
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

    }

}
