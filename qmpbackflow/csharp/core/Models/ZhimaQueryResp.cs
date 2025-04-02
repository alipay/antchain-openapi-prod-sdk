// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // zhima.customer.ep.identification.query
    // 在认证完成后,商户可以查询认证的状态和结果
    // 
    public class ZhimaQueryResp : TeaModel {
        // 认证的企业证件号
        [NameInMap("ep_cert_no")]
        [Validation(Required=false)]
        public string EpCertNo { get; set; }

        // 认证的企业名
        [NameInMap("ep_name")]
        [Validation(Required=false)]
        public string EpName { get; set; }

        // 认证不通过的错误码
        [NameInMap("failed_code")]
        [Validation(Required=false)]
        public string FailedCode { get; set; }

        // 认证是否通过，通过为true，不通过为false
        [NameInMap("passed")]
        [Validation(Required=false)]
        public string Passed { get; set; }

        //  10000是成功，其余是失败
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        //  
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        //  
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        //  
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
