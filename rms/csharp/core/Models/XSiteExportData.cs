// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XSiteExportData : TeaModel {
        //  
        [NameInMap("dashboards")]
        [Validation(Required=false)]
        public List<XDashboardCRULResponseCURequest> Dashboards { get; set; }

        //  
        [NameInMap("datasources")]
        [Validation(Required=false)]
        public List<XDatasourceCRULResponseCURequest> Datasources { get; set; }

        //  
        [NameInMap("alerts")]
        [Validation(Required=false)]
        public List<UnifiedAlarmRuleVO> Alerts { get; set; }

        //  
        [NameInMap("stats")]
        [Validation(Required=false)]
        public XSiteExportStats Stats { get; set; }

        // 自定义告警的BASE64编码
        [NameInMap("alarm_rules_v2_custom")]
        [Validation(Required=false)]
        public string AlarmRulesV2Custom { get; set; }

    }

}
