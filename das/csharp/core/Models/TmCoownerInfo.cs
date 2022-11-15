// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 商标共有人信息
    public class TmCoownerInfo : TeaModel {
        // 共有人中文名称
        [NameInMap("coowner_name_cn")]
        [Validation(Required=false)]
        public string CoownerNameCn { get; set; }

        // 共有人中文地址
        [NameInMap("coowner_addr_cn")]
        [Validation(Required=false)]
        public string CoownerAddrCn { get; set; }

        // 共有人英文名称
        [NameInMap("coowner_name_en")]
        [Validation(Required=false)]
        public string CoownerNameEn { get; set; }

        // 共有人英文地址
        [NameInMap("coowner_addr_en")]
        [Validation(Required=false)]
        public string CoownerAddrEn { get; set; }

    }

}
