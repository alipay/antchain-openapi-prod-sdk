// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 密钥管理项目信息
    public class KeyProjectInfo : TeaModel {
        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // key使用类型
        // MINT：发行密钥
        // BURN：赎回密钥
        // TRANSFER：转账密钥
        // MANAGER：管理密钥
        [NameInMap("key_type")]
        [Validation(Required=true)]
        public string KeyType { get; set; }

        // 创建时间
        [NameInMap("gmt_created")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreated { get; set; }

    }

}
