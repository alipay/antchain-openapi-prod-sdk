// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateDdcsResourcesRequest : TeaModel {
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

        // 资源的属性信息，以 JSON 字符串格式传入
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public string Attributes { get; set; }

        // 资源描述信息
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 更新的资源自增长 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 系统字段：环境实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 资源搜索的域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 资源唯一标识
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 是否全量更新属性，默认为 false
        [NameInMap("update_attribute")]
        [Validation(Required=false)]
        public bool? UpdateAttribute { get; set; }

    }

}
