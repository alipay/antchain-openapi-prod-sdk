// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 核酸信息
    public class NucleicAcidInfo : TeaModel {
        // 检测类型
        [NameInMap("report_type")]
        [Validation(Required=false)]
        public string ReportType { get; set; }

        // 检测结果
        [NameInMap("report_result")]
        [Validation(Required=false)]
        public string ReportResult { get; set; }

        // 检测机构
        [NameInMap("report_organization")]
        [Validation(Required=false)]
        public string ReportOrganization { get; set; }

        // 检测时间戳(单位: ms)
        [NameInMap("report_timestamp")]
        [Validation(Required=false)]
        public long? ReportTimestamp { get; set; }

    }

}
