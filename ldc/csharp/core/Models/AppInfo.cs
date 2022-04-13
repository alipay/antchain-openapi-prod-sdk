// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用信息。
    public class AppInfo : TeaModel {
        // buildpack版本。
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 应用描述。
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 应用id。
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 应用名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用owner。
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 技术栈。
        [NameInMap("techstack_identity")]
        [Validation(Required=true)]
        public string TechstackIdentity { get; set; }

        // ownerId
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

    }

}
