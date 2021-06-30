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

    }

}
