// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateNotificationConfigRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // cloud web url
        [NameInMap("cloud_web_url")]
        [Validation(Required=false)]
        public string CloudWebUrl { get; set; }

        // 是否开启
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // modified_version
        [NameInMap("modified_version")]
        [Validation(Required=false)]
        public long? ModifiedVersion { get; set; }

        // 接受者
        [NameInMap("receivers")]
        [Validation(Required=false)]
        public List<string> Receivers { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
