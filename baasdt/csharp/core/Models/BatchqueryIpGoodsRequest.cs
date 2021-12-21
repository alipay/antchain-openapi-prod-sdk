// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BatchqueryIpGoodsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础信息
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 商品id
        [NameInMap("ip_id")]
        [Validation(Required=false)]
        public string IpId { get; set; }

        // ip名称，支持模糊匹配
        [NameInMap("ip_name")]
        [Validation(Required=false)]
        public string IpName { get; set; }

        // 商品状态（0:待上架，1:上架，2:下架）
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // ip的上架渠道
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 分页索引
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // ip商品归属方的链上id
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // Ip类型
        [NameInMap("ip_type")]
        [Validation(Required=false)]
        public string IpType { get; set; }

        // 受众人群
        [NameInMap("audience_group")]
        [Validation(Required=false)]
        public string AudienceGroup { get; set; }

        // 上架日期开始时间
        [NameInMap("create_begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateBeginTime { get; set; }

        // 创建的结束日期
        [NameInMap("create_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateEndTime { get; set; }

        // 是否需要按照创建时间倒序排序
        [NameInMap("is_create_time_sort_desc")]
        [Validation(Required=true)]
        public bool? IsCreateTimeSortDesc { get; set; }

        // 是否需要按照pv排序（0:不需要，1:正序，2:倒序），默认按照pv倒序
        [NameInMap("is_sort_by_pv")]
        [Validation(Required=false)]
        public long? IsSortByPv { get; set; }

        // 是否需要按照最近上下架时间排序（0:不需要，1:正序，2:倒序），默认按照倒序
        [NameInMap("is_sort_by_status_change")]
        [Validation(Required=false)]
        public long? IsSortByStatusChange { get; set; }

        // 是否需要返回创建渠道，为空默认不返回
        [NameInMap("query_creater_channel")]
        [Validation(Required=false)]
        public bool? QueryCreaterChannel { get; set; }

        // 保底金区间，0：0；1：10万以下；2:10-30万；3:30-50万；4:50万以上
        [NameInMap("guarantee_range")]
        [Validation(Required=false)]
        public long? GuaranteeRange { get; set; }

    }

}
