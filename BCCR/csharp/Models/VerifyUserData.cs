// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 核验用户信息
    public class VerifyUserData : TeaModel {
        // 证件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>李四</para>
        /// </summary>
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>IDENTITY_CARD</para>
        /// </summary>
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 登记人信息存证交易HASH
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("register_person_tx_hash")]
        [Validation(Required=false)]
        public string RegisterPersonTxHash { get; set; }

    }

}
