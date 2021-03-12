// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationParticipantPageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信用代码编号
        [NameInMap("credit_number")]
        [Validation(Required=false)]
        public string CreditNumber { get; set; }

        // 参与方名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 角色
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 账户名称
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

    }

}
