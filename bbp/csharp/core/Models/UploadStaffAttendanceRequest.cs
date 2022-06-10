// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class UploadStaffAttendanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 考勤信息
        [NameInMap("attendance")]
        [Validation(Required=true)]
        public Attendance Attendance { get; set; }

        // uuid就行
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

    }

}
