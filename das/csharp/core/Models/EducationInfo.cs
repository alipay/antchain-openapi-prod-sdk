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

        // 是否211
        [NameInMap("project211")]
        [Validation(Required=false)]
        public bool? Project211 { get; set; }

        // 是否985
        [NameInMap("project985")]
        [Validation(Required=false)]
        public bool? Project985 { get; set; }

        // 是否双一流
        [NameInMap("double_first_class")]
        [Validation(Required=false)]
        public bool? DoubleFirstClass { get; set; }

    }

}
