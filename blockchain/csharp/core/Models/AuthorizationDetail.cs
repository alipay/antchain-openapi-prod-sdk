// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权明细详情
    public class AuthorizationDetail : TeaModel {
        // 授权凭证ID
        [NameInMap("authority_cert_id")]
        [Validation(Required=true)]
        public string AuthorityCertId { get; set; }

        // 授权ID
        [NameInMap("authorization_id")]
        [Validation(Required=false)]
        public string AuthorizationId { get; set; }

        // 区块号
        [NameInMap("block_num")]
        [Validation(Required=true)]
        public long? BlockNum { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 授权时间
        [NameInMap("issuance_time")]
        [Validation(Required=true)]
        public long? IssuanceTime { get; set; }

        // 授权人
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public Participant Issuer { get; set; }

        // 被授权人
        [NameInMap("subject")]
        [Validation(Required=true)]
        public Participant Subject { get; set; }

        // 哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 资产所有者
        [NameInMap("owner")]
        [Validation(Required=true)]
        public Participant Owner { get; set; }

    }

}
