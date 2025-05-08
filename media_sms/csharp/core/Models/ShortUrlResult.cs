// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 短链结果
    public class ShortUrlResult : TeaModel {
        // 短链创建时的标记字符串，可以用该字段关联短链的发送目标
        [NameInMap("cust_flag")]
        [Validation(Required=true)]
        public string CustFlag { get; set; }

        // 卡片模板的动参字符串
        [NameInMap("dync_param")]
        [Validation(Required=true)]
        public string DyncParam { get; set; }

        // 短链链接
        [NameInMap("aim_url")]
        [Validation(Required=true)]
        public string AimUrl { get; set; }

        // 短链码
        [NameInMap("aim_code")]
        [Validation(Required=true)]
        public string AimCode { get; set; }

        // 0:短链申请成功，非 0:短链申请失败
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // 短链申请失败原因
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 支持该短链的厂商
        [NameInMap("factorys")]
        [Validation(Required=true)]
        public List<string> Factorys { get; set; }

    }

}
