// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权明细详情
    public class AuthorizationDetail : TeaModel {
        // 授权凭证ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>vc:private:0000:7bd647663cec087bc424941ad35cb588e96f38c2dcb512442410596c02e8ef681595560495530110</para>
        /// </summary>
        [NameInMap("authority_cert_id")]
        [Validation(Required=true)]
        public string AuthorityCertId { get; set; }

        // 授权ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>8c777cf9a71b660233215b6337dca78d66e10f25feca50a2761c09df7d4d0506</para>
        /// </summary>
        [NameInMap("authorization_id")]
        [Validation(Required=false)]
        public string AuthorizationId { get; set; }

        // 区块号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1324</para>
        /// </summary>
        [NameInMap("block_num")]
        [Validation(Required=true)]
        public long? BlockNum { get; set; }

        // 过期时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592810480442</para>
        /// </summary>
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 授权时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1595574776000</para>
        /// </summary>
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
        /// <summary>
        /// <b>Example:</b>
        /// <para>d4dbde485203ed445b59fa7cf7976ecc56cf7494cca2d0185c1cac130463ac91</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 资产所有者
        [NameInMap("owner")]
        [Validation(Required=true)]
        public Participant Owner { get; set; }

    }

}
