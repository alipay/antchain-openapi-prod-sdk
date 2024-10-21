// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class SyncAcpartnerProjectResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 租户code：用于数据和功能隔离
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public long? ProjectId { get; set; }

        // 外部业务单据号
        [NameInMap("out_business_no")]
        [Validation(Required=true)]
        public string OutBusinessNo { get; set; }

        // 支出配置单结果列表
        [NameInMap("expenditure_quotation_items")]
        [Validation(Required=true)]
        public List<ExpenditureQuotationItemResult> ExpenditureQuotationItems { get; set; }

        // 结果码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
