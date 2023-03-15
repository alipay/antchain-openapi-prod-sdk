// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 学籍信息
    public class EducationStatus : TeaModel {
        // 是否211院校
        [NameInMap("project211")]
        [Validation(Required=false)]
        public bool? Project211 { get; set; }

        // 是否985院校 
        [NameInMap("project985")]
        [Validation(Required=false)]
        public bool? Project985 { get; set; }

        // boolean	是否双一流院校
        [NameInMap("double_first_class")]
        [Validation(Required=false)]
        public bool? DoubleFirstClass { get; set; }

        // 入学时间
        [NameInMap("admission_date")]
        [Validation(Required=false)]
        public string AdmissionDate { get; set; }

        // 学制，字典
        [NameInMap("educational_system")]
        [Validation(Required=false)]
        public string EducationalSystem { get; set; }

        // boolean	是否注册学籍
        [NameInMap("registered_student_status")]
        [Validation(Required=false)]
        public bool? RegisteredStudentStatus { get; set; }

    }

}
