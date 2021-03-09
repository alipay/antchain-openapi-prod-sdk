// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // staragent info
    public class StarAgentInfo : TeaModel {
        // computer serial number
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // ip list
        [NameInMap("ip_list")]
        [Validation(Required=false)]
        public string IpList { get; set; }

        // 状态取值：RUNNING，ERROR，REGISTER，NOFIND
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
