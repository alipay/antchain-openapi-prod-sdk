// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    public class QueryCustomerWxleadlinkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("cust_no")]
        [Validation(Required=true)]
        public string CustNo { get; set; }

        // 案件号
        [NameInMap("case_code")]
        [Validation(Required=true)]
        public string CaseCode { get; set; }

        // AES加密手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 产品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 约定固定值-一般是对应平台的缩写
        [NameInMap("create_by")]
        [Validation(Required=true)]
        public string CreateBy { get; set; }

    }

}
