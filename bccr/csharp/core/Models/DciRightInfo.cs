// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // dci权利信息
    public class DciRightInfo : TeaModel {
        // 作品权利范围
        [NameInMap("right_scope")]
        [Validation(Required=true)]
        public string RightScope { get; set; }

        // 权利取得方式
        [NameInMap("right_obtain_way")]
        [Validation(Required=true)]
        public string RightObtainWay { get; set; }

        // 权利归属方式
        [NameInMap("ownership_way")]
        [Validation(Required=true)]
        public string OwnershipWay { get; set; }

    }

}
