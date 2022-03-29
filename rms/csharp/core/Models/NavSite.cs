// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // NavSite
    public class NavSite : TeaModel {
        // site
        [NameInMap("site")]
        [Validation(Required=true)]
        public Site Site { get; set; }

        // nav_tenants
        [NameInMap("nav_tenants")]
        [Validation(Required=true)]
        public List<NavTenant> NavTenants { get; set; }

    }

}
