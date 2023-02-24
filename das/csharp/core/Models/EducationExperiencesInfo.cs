// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 教育经历信息
    public class EducationExperiencesInfo : TeaModel {
        // 学历
        [NameInMap("degree")]
        [Validation(Required=false, MaxLength=32)]
        public string Degree { get; set; }

        // 受教育地点
        [NameInMap("location")]
        [Validation(Required=false, MaxLength=128)]
        public string Location { get; set; }

        // 学校名称
        [NameInMap("school_name")]
        [Validation(Required=false, MaxLength=128)]
        public string SchoolName { get; set; }

        // 教育状态
        [NameInMap("education_status")]
        [Validation(Required=false, MaxLength=128)]
        public string EducationStatus { get; set; }

        // 年
        [NameInMap("year")]
        [Validation(Required=false)]
        public long? Year { get; set; }

        // 月
        [NameInMap("month")]
        [Validation(Required=false)]
        public long? Month { get; set; }

    }

}
