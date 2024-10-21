// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 密钥信息
    public class KeyInfo : TeaModel {
        // 密钥ID
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

        // 密钥名称
        [NameInMap("key_name")]
        [Validation(Required=true)]
        public string KeyName { get; set; }

        // 密钥地址
        [NameInMap("key_address")]
        [Validation(Required=true)]
        public string KeyAddress { get; set; }

        // 密钥类型(MINT：发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
        [NameInMap("key_type")]
        [Validation(Required=true)]
        public string KeyType { get; set; }

    }

}
