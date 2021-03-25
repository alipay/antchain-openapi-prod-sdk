// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 创建电子券的参数
    public class CouponCreate : TeaModel {
        // 电子券批次ID
        [NameInMap("collection_id")]
        [Validation(Required=true)]
        public string CollectionId { get; set; }

        // 电子券价值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 电子券名称
        [NameInMap("coupon_name")]
        [Validation(Required=true)]
        public string CouponName { get; set; }

        // 用户脱敏ID
        [NameInMap("desensitized_uid")]
        [Validation(Required=false)]
        public string DesensitizedUid { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 持有者ID
        [NameInMap("holder_user_account")]
        [Validation(Required=false)]
        public string HolderUserAccount { get; set; }

        // 电子券公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 时区（暂时固定为GMT+8）
        [NameInMap("time_zone")]
        [Validation(Required=true)]
        public string TimeZone { get; set; }

        // 用户公钥
        [NameInMap("uid_public_key")]
        [Validation(Required=false)]
        public string UidPublicKey { get; set; }

        // 有效开始时间
        [NameInMap("valid_after")]
        [Validation(Required=true)]
        public long? ValidAfter { get; set; }

        // 有效结束时间
        [NameInMap("valid_before")]
        [Validation(Required=true)]
        public long? ValidBefore { get; set; }

    }

}
