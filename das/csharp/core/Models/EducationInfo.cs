// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 教育学历信息
    public class EducationInfo : TeaModel {
        // 是否211院校
        [NameInMap("project211")]
        [Validation(Required=true)]
        public bool? Project211 { get; set; }

        // 是否985院校
        [NameInMap("project985")]
        [Validation(Required=true)]
        public bool? Project985 { get; set; }

        // 是否双一流院校
        [NameInMap("double_first_class")]
        [Validation(Required=true)]
        public bool? DoubleFirstClass { get; set; }

        // 专业
        [NameInMap("major")]
        [Validation(Required=true)]
        public string Major { get; set; }

        // 学历等级代码
        [NameInMap("education_level")]
        [Validation(Required=true)]
        public string EducationLevel { get; set; }

        // 毕业日期
        [NameInMap("graduation_date")]
        [Validation(Required=true)]
        public string GraduationDate { get; set; }

        // 学习形式
        [NameInMap("education_type")]
        [Validation(Required=true)]
        public string EducationType { get; set; }

    }

}
