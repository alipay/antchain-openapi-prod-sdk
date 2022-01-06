// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 不带 attribute 的资源
    public class DrmResourceWithoutAttributes : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 资源类描述
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 资源类所属的域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // Region.appName
        [NameInMap("resource_domain")]
        [Validation(Required=true)]
        public string ResourceDomain { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 资源版本号固定 3.0
        [NameInMap("resource_version")]
        [Validation(Required=true)]
        public string ResourceVersion { get; set; }

        // 资源类型，tpl 表示模板类型，normal 表示普通资源
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
