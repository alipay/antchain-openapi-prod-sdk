// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 签署信息
    public class SignInfo : TeaModel {
        // 签署人
        [NameInMap("signer")]
        [Validation(Required=true)]
        public EntityBasicInfo Signer { get; set; }

        // 签署类型，可选值：SINGLE_PAGE、CROSS_PAGE
        [NameInMap("sign_type")]
        [Validation(Required=true)]
        public string SignType { get; set; }

        // 签署页码
        [NameInMap("sign_page")]
        [Validation(Required=true)]
        public long? SignPage { get; set; }

        // 签署x坐标
        [NameInMap("sign_position_x")]
        [Validation(Required=true)]
        public string SignPositionX { get; set; }

        // 签署y坐标
        [NameInMap("sign_position_y")]
        [Validation(Required=true)]
        public string SignPositionY { get; set; }

    }

}
