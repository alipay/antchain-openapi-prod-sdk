// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 联系人详情
    public class DockingPeopleInfo : TeaModel {
        // 名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 手机号
        [NameInMap("mobile_phone")]
        [Validation(Required=true)]
        public string MobilePhone { get; set; }

        // 职位
        [NameInMap("position")]
        [Validation(Required=true)]
        public string Position { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 钉钉号
        [NameInMap("ding_ding")]
        [Validation(Required=false)]
        public string DingDing { get; set; }

        // 座机
        [NameInMap("tele_phone")]
        [Validation(Required=false)]
        public string TelePhone { get; set; }

    }

}
