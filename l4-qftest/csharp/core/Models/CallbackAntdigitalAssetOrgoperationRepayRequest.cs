// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    public class CallbackAntdigitalAssetOrgoperationRepayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 还款编号
        [NameInMap("repay_record_no")]
        [Validation(Required=true)]
        public string RepayRecordNo { get; set; }

        // 还款处理状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 额外的信息
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 请求唯一id，最长32字符	
        // 
        [NameInMap("request_unique_id")]
        [Validation(Required=true)]
        public string RequestUniqueId { get; set; }

    }

}
