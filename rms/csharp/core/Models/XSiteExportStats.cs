// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // stats
    public class XSiteExportStats : TeaModel {
        //  
        [NameInMap("alert")]
        [Validation(Required=false)]
        public long? Alert { get; set; }

        //  
        [NameInMap("alert_datasource")]
        [Validation(Required=false)]
        public long? AlertDatasource { get; set; }

        //  
        [NameInMap("dashboard")]
        [Validation(Required=false)]
        public long? Dashboard { get; set; }

        //  
        [NameInMap("dashboard_datasource")]
        [Validation(Required=false)]
        public long? DashboardDatasource { get; set; }

        //  
        [NameInMap("datasource")]
        [Validation(Required=false)]
        public long? Datasource { get; set; }

        // 通知对象的数量
        [NameInMap("alarm_subscriber_count")]
        [Validation(Required=false)]
        public long? AlarmSubscriberCount { get; set; }

    }

}
