// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateUnionMemberRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // member_name
        [NameInMap("member_name")]
        [Validation(Required=true)]
        public string MemberName { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=true)]
        public string ConsortiumId { get; set; }

        // member_id
        [NameInMap("member_id")]
        [Validation(Required=true)]
        public string MemberId { get; set; }

    }

}
