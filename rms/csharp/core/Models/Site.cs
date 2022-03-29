// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Site
    public class Site : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // display_name
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // local
        [NameInMap("local")]
        [Validation(Required=true)]
        public string Local { get; set; }

        // domain
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // config
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        // url_preffix
        [NameInMap("url_preffix")]
        [Validation(Required=true)]
        public string UrlPreffix { get; set; }

        // readonly
        [NameInMap("readonly")]
        [Validation(Required=true)]
        public string Readonly { get; set; }

    }

}
