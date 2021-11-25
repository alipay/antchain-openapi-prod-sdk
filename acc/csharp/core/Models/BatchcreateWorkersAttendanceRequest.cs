// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class BatchcreateWorkersAttendanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目编号
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 身份证号
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 农民工考勤信息
        [NameInMap("attendance_list")]
        [Validation(Required=true)]
        public List<WorkersCheckAttendance> AttendanceList { get; set; }

    }

}
