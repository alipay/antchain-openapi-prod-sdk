// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XSiteExport : TeaModel {
        //  
        [NameInMap("dashboards")]
        [Validation(Required=false)]
        public List<XDashboardQuery> Dashboards { get; set; }

        //  
        [NameInMap("datasources")]
        [Validation(Required=false)]
        public List<XDatasourceQuery> Datasources { get; set; }

        // alert uuids
        [NameInMap("alerts")]
        [Validation(Required=false)]
        public List<string> Alerts { get; set; }

    }

}
