// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用Owner信息
    public class Owner : TeaModel {
        // 应用Owner邮箱，云游资产使用。
        [NameInMap("owner_email")]
        [Validation(Required=false)]
        public string OwnerEmail { get; set; }

        // 应用Owner登陆名，云游资产使用。
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 应用Owner昵称，云游资产使用。
        [NameInMap("owner_nick_name")]
        [Validation(Required=false)]
        public string OwnerNickName { get; set; }

        // 应用Owner真实名称，云游资产使用。
        [NameInMap("owner_real_name")]
        [Validation(Required=false)]
        public string OwnerRealName { get; set; }

        // 应用Owner员工号，云游资产使用。
        [NameInMap("owner_staff_no")]
        [Validation(Required=false)]
        public string OwnerStaffNo { get; set; }

    }

}
