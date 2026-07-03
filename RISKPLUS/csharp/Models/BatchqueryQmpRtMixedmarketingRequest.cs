// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class BatchqueryQmpRtMixedmarketingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 圈客计划code列表
        [NameInMap("plan_codes")]
        [Validation(Required=true)]
        public List<string> PlanCodes { get; set; }

        // 计划集合code，对标圈客计划code列表，一般不可变
        [NameInMap("plan_set_code")]
        [Validation(Required=false)]
        public string PlanSetCode { get; set; }

        // 查询协议模版
        [NameInMap("query_template")]
        [Validation(Required=true)]
        public string QueryTemplate { get; set; }

        // 客群凭证和其他信息
        [NameInMap("customer_details")]
        [Validation(Required=true)]
        public List<CustomerInfo> CustomerDetails { get; set; }

        // 客群共用参数
        [NameInMap("public_properties")]
        [Validation(Required=false)]
        public string PublicProperties { get; set; }

        // 外部业务流水号
        [NameInMap("biz_serial_no")]
        [Validation(Required=true)]
        public string BizSerialNo { get; set; }

    }

}
