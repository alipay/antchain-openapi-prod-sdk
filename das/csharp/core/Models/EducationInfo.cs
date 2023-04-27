// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 教育学历信息
    public class EducationInfo : TeaModel {
        // 专业
        [NameInMap("major")]
        [Validation(Required=false)]
        public string Major { get; set; }

        // 学历等级代码
        [NameInMap("education_level")]
        [Validation(Required=false)]
        public string EducationLevel { get; set; }

        // 毕业日期
        [NameInMap("graduation_date")]
        [Validation(Required=false)]
        public string GraduationDate { get; set; }

        // 学习形式
        [NameInMap("education_type")]
        [Validation(Required=false)]
        public string EducationType { get; set; }

        // 学校层级
        [NameInMap("school_type")]
        [Validation(Required=false)]
        public string SchoolType { get; set; }

    }

}
