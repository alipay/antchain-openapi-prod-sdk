// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CreateAlarmwebhookRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作区名
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // web hook 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // web hook http url
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // web hook http method
        [NameInMap("http_method")]
        [Validation(Required=true)]
        public string HttpMethod { get; set; }

        // web hook http headers
        [NameInMap("headers")]
        [Validation(Required=false)]
        public List<KeySet> Headers { get; set; }

        // web hook http params
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<KeySet> Params { get; set; }

        // 配置项（timeOut，retryCount）
        [NameInMap("config")]
        [Validation(Required=false)]
        public List<KeySet> Config { get; set; }

        // body_template
        [NameInMap("body_template")]
        [Validation(Required=false)]
        public string BodyTemplate { get; set; }

        // scope_global
        [NameInMap("scope_global")]
        [Validation(Required=true)]
        public bool? ScopeGlobal { get; set; }

        // 当前workspace有效，还是当前租户有效
        [NameInMap("valid_scope")]
        [Validation(Required=true)]
        public long? ValidScope { get; set; }

    }

}
