// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 溯源信息中的一项记录。
    public class Item : TeaModel {
        // 溯源项的具体内容
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 扩展信息 ，json格式
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 溯源项的键值
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 溯源项的中文标题 
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 内容类型 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
