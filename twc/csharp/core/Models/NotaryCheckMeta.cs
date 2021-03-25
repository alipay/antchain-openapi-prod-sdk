// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 核验请求时对应的存证元数据
    public class NotaryCheckMeta : TeaModel {
        // 对应的法院编号
        [NameInMap("agency_code")]
        [Validation(Required=false)]
        public string AgencyCode { get; set; }

        // 哈希算法, notary_type 为 HASH 时此参数必填
        [NameInMap("hash_algorithm")]
        [Validation(Required=false)]
        public string HashAlgorithm { get; set; }

        // 存证内容
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 应用ID
        [NameInMap("application_code")]
        [Validation(Required=false)]
        public string ApplicationCode { get; set; }

    }

}
