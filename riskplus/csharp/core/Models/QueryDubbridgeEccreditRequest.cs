// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeEccreditRequest : TeaModel {
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

        // 外部申请编号 third_apply_no、apply_no必填其一)
        [NameInMap("third_apply_no")]
        [Validation(Required=false)]
        public string ThirdApplyNo { get; set; }

        // 银行审批流水号 third_apply_no、apply_no必填其一)
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 企业名称 客户企业的工商注册名称，有企业信息则必输
        [NameInMap("ent_name")]
        [Validation(Required=true)]
        public string EntName { get; set; }

        // 企业证件号码 客户企业的统一社会信用代码，有企业信息则必输
        [NameInMap("ent_id_no")]
        [Validation(Required=false)]
        public string EntIdNo { get; set; }

    }

}
