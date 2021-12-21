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
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 登记人信息存证交易HASH
        [NameInMap("register_person_tx_hash")]
        [Validation(Required=false)]
        public string RegisterPersonTxHash { get; set; }

    }

}
