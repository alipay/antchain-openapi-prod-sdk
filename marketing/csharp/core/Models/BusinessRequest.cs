// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 商机信息
    public class BusinessRequest : TeaModel {
        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 客户id
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 商机名称
        [NameInMap("business_name")]
        [Validation(Required=true)]
        public string BusinessName { get; set; }

        // 商机ID
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
        [NameInMap("business_status")]
        [Validation(Required=true)]
        public string BusinessStatus { get; set; }

        // 商机说明
        [NameInMap("business_explain")]
        [Validation(Required=false)]
        public string BusinessExplain { get; set; }

        // 线索来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 商机时间
        [NameInMap("business_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BusinessDate { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 创建人工号
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 创建人花名
        [NameInMap("creator_nick")]
        [Validation(Required=true)]
        public string CreatorNick { get; set; }

    }

}
