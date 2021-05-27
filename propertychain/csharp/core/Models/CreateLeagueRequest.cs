// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateLeagueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链标识
        [NameInMap("blockchain_d")]
        [Validation(Required=true)]
        public string BlockchainD { get; set; }

        // 评论
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 联盟名称
        [NameInMap("league_name")]
        [Validation(Required=true)]
        public string LeagueName { get; set; }

        // 用户标识
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
