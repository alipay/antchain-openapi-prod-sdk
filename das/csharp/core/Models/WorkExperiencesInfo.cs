// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 工作经历信息
    public class WorkExperiencesInfo : TeaModel {
        // 工作开始日期
        [NameInMap("work_start_time")]
        [Validation(Required=false)]
        public long? WorkStartTime { get; set; }

        // 工作结束日期
        [NameInMap("work_end_time")]
        [Validation(Required=false)]
        public long? WorkEndTime { get; set; }

        // 公司名称
        [NameInMap("company_name")]
        [Validation(Required=false, MaxLength=128)]
        public string CompanyName { get; set; }

        // 工作描述
        [NameInMap("work_desc")]
        [Validation(Required=false, MaxLength=1024)]
        public string WorkDesc { get; set; }

        // 职业
        [NameInMap("job_name")]
        [Validation(Required=false, MaxLength=128)]
        public string JobName { get; set; }

        // 行业名称
        [NameInMap("profession_name")]
        [Validation(Required=false, MaxLength=128)]
        public string ProfessionName { get; set; }

    }

}
