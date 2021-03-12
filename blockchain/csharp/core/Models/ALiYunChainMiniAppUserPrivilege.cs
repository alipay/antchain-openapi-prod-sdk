// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链小程序用户权限查询
    public class ALiYunChainMiniAppUserPrivilege : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // q_r_code_type
        [NameInMap("q_r_code_type")]
        [Validation(Required=false)]
        public string QRCodeType { get; set; }

        // authorization_type
        [NameInMap("authorization_type")]
        [Validation(Required=false)]
        public string AuthorizationType { get; set; }

        // pagination
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

        // ALiYunChainMiniAppAuthorizedUser
        [NameInMap("authorized_user_list")]
        [Validation(Required=false)]
        public List<ALiYunChainMiniAppAuthorizedUser> AuthorizedUserList { get; set; }

    }

}
