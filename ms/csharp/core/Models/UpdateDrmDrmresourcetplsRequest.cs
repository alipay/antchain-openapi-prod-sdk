// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateDrmDrmresourcetplsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // app name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 资源属性列表
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public string Attributes { get; set; }

        // 描述
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // 所有单元中是否存在有特殊推送过值的单元
        [NameInMap("has_instance")]
        [Validation(Required=false)]
        public bool? HasInstance { get; set; }

        // drm资源id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 资源域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 资源类路径
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // tpl_id
        [NameInMap("tpl_id")]
        [Validation(Required=false)]
        public long? TplId { get; set; }

    }

}
