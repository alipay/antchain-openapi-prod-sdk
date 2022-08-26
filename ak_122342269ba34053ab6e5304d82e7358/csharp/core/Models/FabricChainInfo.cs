// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 返回fabric chain info的信息
    public class FabricChainInfo : TeaModel {
        // 区块链id	
        // 
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 链域名
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 链注册状态INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
        [NameInMap("reg_status")]
        [Validation(Required=false)]
        public string RegStatus { get; set; }

        // 区块链类型：MYCHAIN_010, FABRIC_14
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
