// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDdcsResourcesRequest : TeaModel {
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

        // 系统字段：环境实例 ID
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 资源类所属的域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 资源 ID，类似于配置文件的文件名
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

    }

}
