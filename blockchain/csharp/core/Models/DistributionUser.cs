// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 分销会员用户信息
    public class DistributionUser : TeaModel {
        // 用户创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 用户手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 用户唯一标识
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
