// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // NavContent
    public class NavContent : TeaModel {
        // hasw
        [NameInMap("hasw")]
        [Validation(Required=true)]
        public bool? Hasw { get; set; }

        // hast
        [NameInMap("hast")]
        [Validation(Required=true)]
        public bool? Hast { get; set; }

        // hasbiz
        [NameInMap("hasbiz")]
        [Validation(Required=true)]
        public bool? Hasbiz { get; set; }

        // nav_sites
        [NameInMap("nav_sites")]
        [Validation(Required=true)]
        public List<NavSite> NavSites { get; set; }

    }

}
