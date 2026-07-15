// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 数据授权服务用户公钥结构体
    public class PublicKey : TeaModel {
        // 公钥颁发者ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("issuer_id")]
        [Validation(Required=true, MaxLength=100)]
        public string IssuerId { get; set; }

        // 公钥内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4+wjKcEXsFupLxM6WZohB702fTTsuw88bp7LKBskdWhDiZvpeIShOzZopg95psaFw==</para>
        /// </summary>
        [NameInMap("public_key_content")]
        [Validation(Required=true)]
        public string PublicKeyContent { get; set; }

        // 公钥接受者ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("recipient_id")]
        [Validation(Required=true, MaxLength=100)]
        public string RecipientId { get; set; }

    }

}
