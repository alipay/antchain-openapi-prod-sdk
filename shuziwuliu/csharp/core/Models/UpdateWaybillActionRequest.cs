// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateWaybillActionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作类型，以下二选一填写：运单起运、运输完成
        [NameInMap("operate_action")]
        [Validation(Required=true)]
        public string OperateAction { get; set; }

        // 运单起运或运输完成的时间，要求为13位毫秒级时间戳
        [NameInMap("operate_action_time")]
        [Validation(Required=true)]
        public long? OperateActionTime { get; set; }

        // 客户系统内运单编号
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

        // 3plDid，一般为合同乙方的链上数字身份
        [NameInMap("third_party_logistics_did")]
        [Validation(Required=true)]
        public string ThirdPartyLogisticsDid { get; set; }

    }

}
