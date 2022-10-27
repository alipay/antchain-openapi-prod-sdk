// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 机构代码查询结果
    public class InstCodeResult : TeaModel {
        // 机构编码
        // 
        [NameInMap("channel_member_code")]
        [Validation(Required=false)]
        public string ChannelMemberCode { get; set; }

        // 机构网点联行号
        // 
        [NameInMap("channel_official_number")]
        [Validation(Required=false)]
        public string ChannelOfficialNumber { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
