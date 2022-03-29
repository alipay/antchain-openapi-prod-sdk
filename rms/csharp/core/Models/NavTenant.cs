// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // NavTenant
    public class NavTenant : TeaModel {
        // tenant
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public Tenant Tenant { get; set; }

        // view_power
        [NameInMap("view_power")]
        [Validation(Required=true)]
        public bool? ViewPower { get; set; }

        // nav_workspaces
        [NameInMap("nav_workspaces")]
        [Validation(Required=true)]
        public List<NavWorkspace> NavWorkspaces { get; set; }

        // nav_biz_domains
        [NameInMap("nav_biz_domains")]
        [Validation(Required=true)]
        public List<NavBizDomain> NavBizDomains { get; set; }

    }

}
