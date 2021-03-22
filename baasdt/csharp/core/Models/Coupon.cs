// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 电子券详细信息
    public class Coupon : TeaModel {
        // 绑定时间戳（毫秒）
        [NameInMap("bind_time")]
        [Validation(Required=true)]
        public long? BindTime { get; set; }

        // 绑定电子券的哈希
        [NameInMap("bind_tx_hash")]
        [Validation(Required=true)]
        public string BindTxHash { get; set; }

        // 电子券理论上应处于的状态（比如电子券已过期）
        [NameInMap("cal_status")]
        [Validation(Required=true)]
        public long? CalStatus { get; set; }

        // 激活时间戳（毫秒）
        [NameInMap("charge_time")]
        [Validation(Required=true)]
        public long? ChargeTime { get; set; }

        // 激活码
        [NameInMap("coupon_code")]
        [Validation(Required=true)]
        public string CouponCode { get; set; }

        // 激活码附加信息
        [NameInMap("coupon_ext_code")]
        [Validation(Required=true)]
        public string CouponExtCode { get; set; }

        // 电子券ID
        [NameInMap("coupon_id")]
        [Validation(Required=true)]
        public string CouponId { get; set; }

        // 电子券名称
        [NameInMap("coupon_name")]
        [Validation(Required=true)]
        public string CouponName { get; set; }

        // 创建时间戳（毫秒）
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 创建电子券的哈希
        [NameInMap("create_tx_hash")]
        [Validation(Required=true)]
        public string CreateTxHash { get; set; }

        // 脱敏用户ID
        [NameInMap("desensitized_uid")]
        [Validation(Required=true)]
        public string DesensitizedUid { get; set; }

        // 扩展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 最后一次操作时间戳（毫秒）
        [NameInMap("last_time")]
        [Validation(Required=true)]
        public long? LastTime { get; set; }

        // 最后一次操作的交易哈希
        [NameInMap("last_tx_hash")]
        [Validation(Required=true)]
        public string LastTxHash { get; set; }

        // 电子券公钥。椭圆曲线密码学 Secp256k1曲线的公钥，长度64字节，十六进制128位。
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 调子券信息查询次数
        [NameInMap("query_count")]
        [Validation(Required=true)]
        public long? QueryCount { get; set; }

        // 最后一次查询时间戳（毫秒）
        [NameInMap("query_time")]
        [Validation(Required=true)]
        public long? QueryTime { get; set; }

        // 最近一次查询的交易哈希
        [NameInMap("query_tx_hash")]
        [Validation(Required=true)]
        public string QueryTxHash { get; set; }

        // 风控状态：0 启用，1 禁用
        [NameInMap("risk_status")]
        [Validation(Required=true)]
        public long? RiskStatus { get; set; }

        // 电子券状态：
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 用户公钥
        [NameInMap("uid_public_key")]
        [Validation(Required=true)]
        public string UidPublicKey { get; set; }

        // 有效开始时间（毫秒时间戳）
        [NameInMap("valid_after")]
        [Validation(Required=true)]
        public long? ValidAfter { get; set; }

        // 有效结束时间（毫秒时间戳）
        [NameInMap("valid_before")]
        [Validation(Required=true)]
        public long? ValidBefore { get; set; }

        // 价值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 电子券版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

        // 电子券激活交易哈希
        [NameInMap("charge_tx_hash")]
        [Validation(Required=true)]
        public string ChargeTxHash { get; set; }

        // 记名电子券持有者账户
        [NameInMap("holder_user_account")]
        [Validation(Required=true)]
        public string HolderUserAccount { get; set; }

    }

}
