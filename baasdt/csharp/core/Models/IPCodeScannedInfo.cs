// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 正版码被扫描或领取的信息
    public class IPCodeScannedInfo : TeaModel {
        // 正版码ID
        [NameInMap("ip_code")]
        [Validation(Required=true)]
        public string IpCode { get; set; }

        // 正版码所在批次已申请的正版码总数
        [NameInMap("batch_used_count")]
        [Validation(Required=false)]
        public long? BatchUsedCount { get; set; }

        // 用户的ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户的名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户头像地址
        [NameInMap("avatar")]
        [Validation(Required=true)]
        public string Avatar { get; set; }

        // 用户的手机号
        [NameInMap("phone_number")]
        [Validation(Required=false)]
        public string PhoneNumber { get; set; }

        // 用户的位置信息
        [NameInMap("gps")]
        [Validation(Required=false)]
        public string Gps { get; set; }

        // 领取正版码的交易哈希
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 领取正版码交易所在的区块高度
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 处理时间(毫秒时间戳)
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // IP ID
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 正版码商品信息配置列表
        [NameInMap("goods_info_list")]
        [Validation(Required=false)]
        public List<IPCodeGoodsInfo> GoodsInfoList { get; set; }

        // 正版码资源位配置信息列表
        [NameInMap("ad_info_list")]
        [Validation(Required=false)]
        public List<IPCodeAdvertisingInfo> AdInfoList { get; set; }

        // ip版权方信息
        [NameInMap("ipowner_info")]
        [Validation(Required=false)]
        public IPCodeIpOwnerInfo IpownerInfo { get; set; }

        // 0:未配置, 1:配置成功可展示, 4:已经失效, 9:下架【本期不实现】
        [NameInMap("ip_code_status")]
        [Validation(Required=false)]
        public long? IpCodeStatus { get; set; }

        // 额外功能，包括是否允许收藏等
        [NameInMap("features")]
        [Validation(Required=false)]
        public List<long?> Features { get; set; }

        // 核验次数，配置生效后的核验次数统计
        [NameInMap("check_counts")]
        [Validation(Required=false)]
        public long? CheckCounts { get; set; }

        // 正版码关联的I IP信息
        [NameInMap("ip_info")]
        [Validation(Required=false)]
        public IPCodeIpGoodInfo IpInfo { get; set; }

        // UNI码
        [NameInMap("uni_code")]
        [Validation(Required=false)]
        public string UniCode { get; set; }

        // 正版码配置附加信息，信息内容由调用方自定义
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 收藏时间(UNIX时间戳)0表示未被收藏
        [NameInMap("receive_time")]
        [Validation(Required=false)]
        public long? ReceiveTime { get; set; }

        // 同一批次存在失效UNI码的场景下,指示更新后的下标
        [NameInMap("fixed_index")]
        [Validation(Required=false)]
        public long? FixedIndex { get; set; }

        // 同一批次存在失效UNI码的场景下,指示更新后的总量
        [NameInMap("fixed_count")]
        [Validation(Required=false)]
        public long? FixedCount { get; set; }

        // 小龙坎有限公司
        [NameInMap("account_external_name")]
        [Validation(Required=false)]
        public string AccountExternalName { get; set; }

        // 码失效时间（毫秒时间戳）
        [NameInMap("disabled_date")]
        [Validation(Required=false)]
        public long? DisabledDate { get; set; }

        // 核验记录清空时间戳
        [NameInMap("check_empty_time")]
        [Validation(Required=false)]
        public long? CheckEmptyTime { get; set; }

        // 同一批次已被领取的数量
        [NameInMap("receive_count")]
        [Validation(Required=false)]
        public long? ReceiveCount { get; set; }

    }

}
