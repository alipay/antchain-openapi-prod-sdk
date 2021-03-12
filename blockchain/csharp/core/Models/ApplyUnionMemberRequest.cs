// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyUnionMemberRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

        // 被邀请用户的bid
        [NameInMap("invite_bid")]
        [Validation(Required=false)]
        public string InviteBid { get; set; }

        // 被邀请的用户id
        [NameInMap("invite_user_id")]
        [Validation(Required=false)]
        public long? InviteUserId { get; set; }

        // 区域信息
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

    }

}
