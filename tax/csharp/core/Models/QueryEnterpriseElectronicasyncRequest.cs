// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryEnterpriseElectronicasyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权类型，401
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 调用机构编码
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 本次调用id
        [NameInMap("biz_unique_id")]
        [Validation(Required=true)]
        public string BizUniqueId { get; set; }

        // 身份id，统一社会信用编码or其他
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 授权单号，使用授权接口返回的orderNo
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 地区行政编码
        [NameInMap("area_code")]
        [Validation(Required=true)]
        public string AreaCode { get; set; }

    }

}
