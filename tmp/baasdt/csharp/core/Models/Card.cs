// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 卡密信息
    public class Card : TeaModel {
        // 计算理论上应该变为的状态
        [NameInMap("cal_status")]
        [Validation(Required=true)]
        public long? CalStatus { get; set; }

        // 卡密ID
        [NameInMap("card_id")]
        [Validation(Required=true)]
        public string CardId { get; set; }

        // 充值时间
        [NameInMap("charge_time")]
        [Validation(Required=true)]
        public long? ChargeTime { get; set; }

        // 数量
        [NameInMap("count_of_min_unit")]
        [Validation(Required=true)]
        public long? CountOfMinUnit { get; set; }

        // 卡密创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 创建卡密时的交易hash
        [NameInMap("create_tx_hash")]
        [Validation(Required=true)]
        public string CreateTxHash { get; set; }

        // 脱敏手机信息
        [NameInMap("desensitized_uid")]
        [Validation(Required=true)]
        public string DesensitizedUid { get; set; }

        // 附加信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 最小单位数量
        [NameInMap("min_unit")]
        [Validation(Required=true)]
        public long? MinUnit { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 公钥信息
        [NameInMap("uid_public_key")]
        [Validation(Required=true)]
        public string UidPublicKey { get; set; }

        // 卡密在该时间后有效
        [NameInMap("valid_after")]
        [Validation(Required=true)]
        public long? ValidAfter { get; set; }

        // 卡密在该时间前有效
        [NameInMap("valid_before")]
        [Validation(Required=true)]
        public long? ValidBefore { get; set; }

        // 有效天数
        [NameInMap("valid_days")]
        [Validation(Required=true)]
        public long? ValidDays { get; set; }

        // 价值
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 卡密版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

    }

}
