// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class BatchqueryIpSellerRequest : TeaModel {
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

        // 不同的平台标识
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

        // 账户链上ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 1 版权方，2 商户
        [NameInMap("role")]
        [Validation(Required=false)]
        public long? Role { get; set; }

        // 联系人名称
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系人电话
        [NameInMap("contact_mobile")]
        [Validation(Required=false)]
        public string ContactMobile { get; set; }

        // 账户状态列表
        [NameInMap("status_list")]
        [Validation(Required=false)]
        public List<long?> StatusList { get; set; }

        // 排序
        [NameInMap("sort_order")]
        [Validation(Required=false)]
        public string SortOrder { get; set; }

        // 筛选更新时间范围，开始区间
        [NameInMap("create_start_time")]
        [Validation(Required=false)]
        public long? CreateStartTime { get; set; }

        // 筛选更新时间范围，结束区间
        [NameInMap("create_end_time")]
        [Validation(Required=false)]
        public long? CreateEndTime { get; set; }

        // 版权方的用户名称
        [NameInMap("external_user_name")]
        [Validation(Required=false)]
        public string ExternalUserName { get; set; }

    }

}
