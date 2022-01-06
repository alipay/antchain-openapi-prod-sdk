// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // Drm资源
    public class DrmResource : TeaModel {
        // appName
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 资源属性列表
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public List<DrmAttribute> Attributes { get; set; }

        // drm资源id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 描述字段
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 资源域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 资源域和应用名
        [NameInMap("resource_domain")]
        [Validation(Required=false)]
        public string ResourceDomain { get; set; }

        // 资源类路径
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 资源版本
        [NameInMap("resource_version")]
        [Validation(Required=false)]
        public string ResourceVersion { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
