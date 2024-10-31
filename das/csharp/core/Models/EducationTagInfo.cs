// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 教育标签信息
    public class EducationTagInfo : TeaModel {
        // 专业名称
        [NameInMap("major")]
        [Validation(Required=false)]
        public string Major { get; set; }

        // 学历等级代码
        [NameInMap("education_level")]
        [Validation(Required=false)]
        public string EducationLevel { get; set; }

        // 	
        // 毕业日期
        [NameInMap("graduation_date")]
        [Validation(Required=false)]
        public string GraduationDate { get; set; }

        // 学习形式
        [NameInMap("education_type")]
        [Validation(Required=false)]
        public string EducationType { get; set; }

        // 入学时间
        [NameInMap("admission_date")]
        [Validation(Required=false)]
        public string AdmissionDate { get; set; }

        // 学校类型
        [NameInMap("school_type")]
        [Validation(Required=false)]
        public string SchoolType { get; set; }

        // 学习形式字典code
        [NameInMap("education_type_code")]
        [Validation(Required=false)]
        public string EducationTypeCode { get; set; }

        // 学校名称
        [NameInMap("school_name")]
        [Validation(Required=false)]
        public string SchoolName { get; set; }

    }

}
