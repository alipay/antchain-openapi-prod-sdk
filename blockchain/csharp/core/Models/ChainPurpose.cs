// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链用途申报结构体
    public class ChainPurpose : TeaModel {
        // 用途id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 用途key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 用途内容
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 用途申报时间
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // 用途申报状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 简短描述开关
        [NameInMap("item")]
        [Validation(Required=false)]
        public bool? Item { get; set; }

        // 详细描述开关
        [NameInMap("extend")]
        [Validation(Required=false)]
        public bool? Extend { get; set; }

        // 用途申报简短描述
        [NameInMap("purpose_item")]
        [Validation(Required=false)]
        public string PurposeItem { get; set; }

    }

}
