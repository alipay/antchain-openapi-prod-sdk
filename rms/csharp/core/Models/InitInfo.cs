// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // InitInfo
    public class InitInfo : TeaModel {
        // auth_url
        [NameInMap("auth_url")]
        [Validation(Required=true)]
        public string AuthUrl { get; set; }

        // user
        [NameInMap("user")]
        [Validation(Required=true)]
        public MonitorUser User { get; set; }

        // nav_head
        [NameInMap("nav_head")]
        [Validation(Required=true)]
        public NavContent NavHead { get; set; }

    }

}
