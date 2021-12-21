// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BatchqueryIpGoodsinterestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
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

        // ip等级
        [NameInMap("ip_level")]
        [Validation(Required=false)]
        public List<long?> IpLevel { get; set; }

        // ip类型
        [NameInMap("ip_type")]
        [Validation(Required=true)]
        public List<string> IpType { get; set; }

        // 受众人群
        [NameInMap("audience_group")]
        [Validation(Required=true)]
        public List<string> AudienceGroup { get; set; }

        // 是否需要按照创建时间倒序排序
        [NameInMap("is_create_time_sort_desc")]
        [Validation(Required=true)]
        public bool? IsCreateTimeSortDesc { get; set; }

        // 是否需要按照pv排序（0:不需要，1:正序，2:倒序），默认选1
        [NameInMap("is_sort_by_pv")]
        [Validation(Required=true)]
        public long? IsSortByPv { get; set; }

        // 保底金区间，0：0；1：10万以下；2:10-30万；3:30-50万；4:50万以上
        [NameInMap("guarantee_range")]
        [Validation(Required=false)]
        public List<string> GuaranteeRange { get; set; }

    }

}
