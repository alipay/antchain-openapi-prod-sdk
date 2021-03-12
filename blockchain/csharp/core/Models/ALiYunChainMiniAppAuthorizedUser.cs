// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链小程序用户权限信息
    public class ALiYunChainMiniAppAuthorizedUser : TeaModel {
        // phone
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // gmt_authorized
        [NameInMap("gmt_authorized")]
        [Validation(Required=false)]
        public string GmtAuthorized { get; set; }

    }

}
