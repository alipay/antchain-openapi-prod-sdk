// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 运输信息
    public class TransportActiveData : TeaModel {
        // 运输方式编码
        [NameInMap("transport_code")]
        [Validation(Required=true)]
        public string TransportCode { get; set; }

        // 运输设备
        [NameInMap("equipment")]
        [Validation(Required=true)]
        public string Equipment { get; set; }

        // 运输里程
        [NameInMap("distance")]
        [Validation(Required=true)]
        public string Distance { get; set; }

        // 是否空载
        [NameInMap("is_empty_load")]
        [Validation(Required=false)]
        public bool? IsEmptyLoad { get; set; }

    }

}
