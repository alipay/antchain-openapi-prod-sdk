// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // 用户匹配信息
    public class CarUserMatch : TeaModel {
        // 设备号或者手机号md5
        [NameInMap("match_id")]
        [Validation(Required=true)]
        public string MatchId { get; set; }

        // 需要匹配的id类型：手机号md5、安卓设备号md5、ios设备号md5
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

    }

}
