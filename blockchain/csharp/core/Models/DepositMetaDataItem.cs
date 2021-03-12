// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 结构化存证类型
    public class DepositMetaDataItem : TeaModel {
        // 结构化存证时该item的描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 结构化存证该数据字段的唯一索引
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 结构化存证时该item的类型
        // 0 text
        // 1 encrypt text
        // 2 txHash
        // 3 image url
        // 4 vedio url
        // 5 map url
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 结构化数据存证时，该item的值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
