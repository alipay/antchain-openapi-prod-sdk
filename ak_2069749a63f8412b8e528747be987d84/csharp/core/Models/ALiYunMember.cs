// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2069749a63f8412b8e528747be987d84.Models
{
    // 阿里云联盟成员信息
    public class ALiYunMember : TeaModel {
        // 加入时间
        [NameInMap("join_time")]
        [Validation(Required=false)]
        public long? JoinTime { get; set; }

        // 成员id
        [NameInMap("member_id")]
        [Validation(Required=false)]
        public string MemberId { get; set; }

        // 成员名称
        [NameInMap("member_name")]
        [Validation(Required=false)]
        public string MemberName { get; set; }

        // 角色
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
