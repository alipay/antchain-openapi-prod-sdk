// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 本次申请中每一类证据的数量明细
    public class NotaryFeeEvidTypeData : TeaModel {
        // 证据类型描述
        [NameInMap("evid_type_desc")]
        [Validation(Required=true)]
        public string EvidTypeDesc { get; set; }

        // 证据分类及数量详情
        [NameInMap("evid_type_detail")]
        [Validation(Required=true)]
        public string EvidTypeDetail { get; set; }

    }

}
