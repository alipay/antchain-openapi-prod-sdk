// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 驾驶证信息
    public class DriverLicenseInfo : TeaModel {
        // 性别
        [NameInMap("gender")]
        [Validation(Required=false)]
        public string Gender { get; set; }

        // 驾驶证发证日期,当前日期减去实际日期的天数所在区间
        [NameInMap("issue_date")]
        [Validation(Required=false)]
        public string IssueDate { get; set; }

        // 驾驶证有效终止日期
        [NameInMap("valid_end_date")]
        [Validation(Required=false)]
        public string ValidEndDate { get; set; }

        // 驾驶证有效起始日期
        [NameInMap("valid_start_date")]
        [Validation(Required=false)]
        public string ValidStartDate { get; set; }

        // 驾驶证状态，字典
        [NameInMap("driver_license_status")]
        [Validation(Required=false)]
        public string DriverLicenseStatus { get; set; }

        // 初次领证时间
        [NameInMap("first_issue_date")]
        [Validation(Required=false)]
        public string FirstIssueDate { get; set; }

        // 准驾车型，字典
        [NameInMap("allow_drive_car")]
        [Validation(Required=false)]
        public string AllowDriveCar { get; set; }

        // 驾驶证种类，字典
        [NameInMap("driver_license_type")]
        [Validation(Required=false)]
        public string DriverLicenseType { get; set; }

    }

}
