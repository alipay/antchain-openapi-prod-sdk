// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BatchqueryIpApprovalandchannelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础信息
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // ip的名字
        [NameInMap("ip_name")]
        [Validation(Required=false)]
        public string IpName { get; set; }

        // ip的id
        [NameInMap("ip_id")]
        [Validation(Required=false)]
        public string IpId { get; set; }

        // 审批状态
        [NameInMap("approval_status")]
        [Validation(Required=false)]
        public long? ApprovalStatus { get; set; }

        // ip类型
        [NameInMap("ip_type")]
        [Validation(Required=false)]
        public string IpType { get; set; }

        // 受众人群
        [NameInMap("audience_group")]
        [Validation(Required=false)]
        public string AudienceGroup { get; set; }

        // 归属账户
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 是否需要按照创建时间倒序排序
        // 
        [NameInMap("is_create_time_sort_desc")]
        [Validation(Required=true)]
        public bool? IsCreateTimeSortDesc { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 分页索引
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 开始时间 
        [NameInMap("create_begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateBeginTime { get; set; }

        // 结束时间
        [NameInMap("create_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateEndTime { get; set; }

    }

}
