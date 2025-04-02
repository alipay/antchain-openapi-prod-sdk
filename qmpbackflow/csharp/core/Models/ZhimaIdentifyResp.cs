// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 芝麻四要素认证接口
    public class ZhimaIdentifyResp : TeaModel {
        // 唯一ID，接口正常的话有此字段
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 带参数的回调地址，接口正常的话有此字段
        [NameInMap("certify_url")]
        [Validation(Required=false)]
        public string CertifyUrl { get; set; }

        // 蚂蚁调用芝麻的错误码
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // 蚂蚁调用芝麻的结果描述
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        // 蚂蚁调用芝麻的错误码
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 蚂蚁调用芝麻信息
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
