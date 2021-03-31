// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CancelInsurancepolicyZhonghuacaixianRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保单号，投保成功后返回的
        [NameInMap("pol_no")]
        [Validation(Required=true, MaxLength=60)]
        public string PolNo { get; set; }

        // 含税保费，精确到小数点后两位
        [NameInMap("pre_mium")]
        [Validation(Required=true)]
        public string PreMium { get; set; }

        // 全局唯一交易流水号
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=32)]
        public string TradeNo { get; set; }

    }

}
