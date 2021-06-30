// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的重点信息
    public class IpEmphasisInfo : TeaModel {
        // ip的链上id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // ip的描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // ip类型
        [NameInMap("ip_type")]
        [Validation(Required=true)]
        public string IpType { get; set; }

        // 受众群体（6位数字） 对应c
        [NameInMap("audience_group")]
        [Validation(Required=true)]
        public string AudienceGroup { get; set; }

        // 主图
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 上架状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 归属的账户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 创建日期
        [NameInMap("create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // ip名字
        [NameInMap("ip_name")]
        [Validation(Required=true)]
        public string IpName { get; set; }

        // 商户名称
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 浏览量
        [NameInMap("pv")]
        [Validation(Required=false)]
        public long? Pv { get; set; }

        // 最近一次上下架时间
        [NameInMap("last_state_change_time")]
        [Validation(Required=false)]
        public long? LastStateChangeTime { get; set; }

        // ip的创建渠道，按照查询参数返回
        [NameInMap("creater_channel")]
        [Validation(Required=false)]
        public string CreaterChannel { get; set; }

    }

}
