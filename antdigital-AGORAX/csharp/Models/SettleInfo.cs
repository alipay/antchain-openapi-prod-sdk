// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 描述结算信息
    public class SettleInfo : TeaModel {
        // 结算详细信息
        [NameInMap("settle_detail_infos")]
        [Validation(Required=true)]
        public List<SettleDetailInfo> SettleDetailInfos { get; set; }

    }

}
