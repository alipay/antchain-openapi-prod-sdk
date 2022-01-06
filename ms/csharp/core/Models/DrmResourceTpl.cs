// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // Tpl类型资源列表
    public class DrmResourceTpl : TeaModel {
        // app name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 资源属性列表
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public List<DrmAttribute> Attributes { get; set; }

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
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 资源域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 资源类路径
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

    }

}
