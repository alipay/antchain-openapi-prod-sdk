// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 地址标签信息
    public class ChainInsightAddressLabel : TeaModel {
        // 链上账户或者合约地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 账户或者合约的真实名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 用户定义的地址描述信息
        [NameInMap("comments")]
        [Validation(Required=false)]
        public string Comments { get; set; }

        // 合约/账户地址的标签信息
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<MapEntry> Labels { get; set; }

    }

}
