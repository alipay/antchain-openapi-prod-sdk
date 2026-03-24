// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 身份四要素证件及户籍信息
    public class Residency : TeaModel {
        // 证件是否最新（1 最新、0非最新）
        [NameInMap("is_newest")]
        [Validation(Required=false)]
        public string IsNewest { get; set; }

        // 证件是否挂失（1 挂失、0非挂失）
        [NameInMap("is_losted")]
        [Validation(Required=false)]
        public string IsLosted { get; set; }

        // 证件是否过期（1 过期、0非过期）
        [NameInMap("is_expired")]
        [Validation(Required=false)]
        public string IsExpired { get; set; }

        // 户籍状态
        // 0 有效
        // 1 有效（户籍迁出，但未迁入）
        // 2 无效（死亡、失踪、迁出、服 兵役、出国境定居、消除重复登记人口、冻结户口、重载注销等）
        [NameInMap("residency_status")]
        [Validation(Required=false)]
        public string ResidencyStatus { get; set; }

    }

}
