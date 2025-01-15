// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 线索信息请求
    public class ClueInformationReq : TeaModel {
        // 线索标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 线索跟进人  工号
        [NameInMap("created_user_nick")]
        [Validation(Required=true)]
        public string CreatedUserNick { get; set; }

        // 线索描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 业务线
        [NameInMap("biz_line")]
        [Validation(Required=true)]
        public string BizLine { get; set; }

        // 客户地址
        [NameInMap("customer_location")]
        [Validation(Required=true)]
        public string CustomerLocation { get; set; }

        // 公司联系人
        [NameInMap("corporate_contacts")]
        [Validation(Required=false)]
        public List<CorporateContacts> CorporateContacts { get; set; }

        // 客户所在行业
        [NameInMap("customer_industry")]
        [Validation(Required=true)]
        public string CustomerIndustry { get; set; }

        // 客户营收规模
        [NameInMap("revenue_scale")]
        [Validation(Required=false)]
        public string RevenueScale { get; set; }

        // 社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=false)]
        public string SocialCreditCode { get; set; }

        // 线索来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
