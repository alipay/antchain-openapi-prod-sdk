// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BatchqueryIpApprovalRequest : TeaModel {
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

        // ip名称，支持模糊匹配
        [NameInMap("ip_name")]
        [Validation(Required=false)]
        public string IpName { get; set; }

        // IP_id
        [NameInMap("ip_id")]
        [Validation(Required=false)]
        public string IpId { get; set; }

        // ip审批状态 0待审批，1 审批通过，2 审批拒绝
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public long? ApprovalStatus { get; set; }

        // 分页
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 分页
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // ip类型
        [NameInMap("ip_type")]
        [Validation(Required=false)]
        public string IpType { get; set; }

        // 受众人群
        [NameInMap("audience_group")]
        [Validation(Required=false)]
        public string AudienceGroup { get; set; }

        // 创建时间段起始
        [NameInMap("create_begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateBeginTime { get; set; }

        // 创建时间段结束
        [NameInMap("create_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateEndTime { get; set; }

        // 商品的链上租户id
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 是否需要按照创建时间倒序排序
        [NameInMap("is_create_time_sort_desc")]
        [Validation(Required=true)]
        public bool? IsCreateTimeSortDesc { get; set; }

        // 渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=false)]
        public string ChannelName { get; set; }

    }

}
