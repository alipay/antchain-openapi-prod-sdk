// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class FillDubbridgeEccreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景码
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 外部申请编号 合作方调用时，生成唯一流水号
        [NameInMap("third_apply_no")]
        [Validation(Required=true)]
        public string ThirdApplyNo { get; set; }

        // biz_content
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public EcBizContend BizContent { get; set; }

    }

}
