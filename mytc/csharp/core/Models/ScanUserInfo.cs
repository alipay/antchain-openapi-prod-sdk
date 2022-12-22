// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 用户扫码信息
    public class ScanUserInfo : TeaModel {
        // 用户昵称
        [NameInMap("nick")]
        [Validation(Required=true)]
        public string Nick { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=true)]
        public long? Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=true)]
        public long? Latitude { get; set; }

        // 用户来源
        [NameInMap("src_type")]
        [Validation(Required=true)]
        public string SrcType { get; set; }

        // 扫码时间
        [NameInMap("scan_time")]
        [Validation(Required=false)]
        public long? ScanTime { get; set; }

    }

}
