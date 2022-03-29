// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateAlarmwebhookRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace_name
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // name
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

        // headers
        [NameInMap("headers")]
        [Validation(Required=false)]
        public List<KeySet> Headers { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=false)]
        public List<KeySet> Params { get; set; }

        // config
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

    }

}
