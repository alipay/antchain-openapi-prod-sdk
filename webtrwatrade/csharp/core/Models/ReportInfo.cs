// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 项目报告
    public class ReportInfo : TeaModel {
        // 项目报告ID
        [NameInMap("report_id")]
        [Validation(Required=true)]
        public string ReportId { get; set; }

        // 项目报告名
        [NameInMap("report_name")]
        [Validation(Required=true)]
        public string ReportName { get; set; }

        // 报告文件ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 项目报告创建时间戳
        [NameInMap("gmt_created")]
        [Validation(Required=true)]
        public long? GmtCreated { get; set; }

    }

}
