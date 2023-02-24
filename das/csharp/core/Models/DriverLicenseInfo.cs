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

        // 驾驶证发证日期
        [NameInMap("driveissuedate")]
        [Validation(Required=false)]
        public string Driveissuedate { get; set; }

        // 驾驶证有效终止日期，当前日期减去实际日期的天数所在区间
        [NameInMap("validdate")]
        [Validation(Required=false)]
        public string Validdate { get; set; }

        // 驾驶证有效起始日期
        [NameInMap("drivevalidstartdate")]
        [Validation(Required=false)]
        public string Drivevalidstartdate { get; set; }

        // 驾驶证状态字典
        [NameInMap("drivecardstatus")]
        [Validation(Required=false)]
        public string Drivecardstatus { get; set; }

        // 初次领证时间
        [NameInMap("firsissuedate")]
        [Validation(Required=false)]
        public string Firsissuedate { get; set; }

        // 准驾车型，字典
        [NameInMap("allowdrivecar")]
        [Validation(Required=false)]
        public string Allowdrivecar { get; set; }

        // 驾驶证种类，字典
        [NameInMap("drivelicensetype")]
        [Validation(Required=false)]
        public string Drivelicensetype { get; set; }

    }

}
