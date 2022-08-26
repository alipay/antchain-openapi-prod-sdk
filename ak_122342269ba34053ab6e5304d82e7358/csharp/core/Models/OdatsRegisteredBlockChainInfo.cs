// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // Odats中注册的区块链信息
    public class OdatsRegisteredBlockChainInfo : TeaModel {
        // 区块链id
        [NameInMap("blockchain_id")]
        [Validation(Required=true)]
        public string BlockchainId { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 链域名
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // 注册时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 链注册状态
        // INIT, INIT_FAILED, REGISTRING, REGISTERED, REGISTRATION_FAILED
        [NameInMap("reg_status")]
        [Validation(Required=true)]
        public string RegStatus { get; set; }

        // 链类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
