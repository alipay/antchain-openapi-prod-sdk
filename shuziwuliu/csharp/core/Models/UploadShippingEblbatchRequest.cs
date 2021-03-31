// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadShippingEblbatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 代理人did
        [NameInMap("agent_did")]
        [Validation(Required=false)]
        public string AgentDid { get; set; }

        // 是否为代理操作
        [NameInMap("agent_flag")]
        [Validation(Required=true)]
        public bool? AgentFlag { get; set; }

        // 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
        [NameInMap("batch_no")]
        [Validation(Required=true)]
        public string BatchNo { get; set; }

        // 船公司名称
        [NameInMap("carrier_name")]
        [Validation(Required=true)]
        public string CarrierName { get; set; }

        // 收货人did
        [NameInMap("consignee_did")]
        [Validation(Required=true)]
        public string ConsigneeDid { get; set; }

        // 电子提单类型
        [NameInMap("ebl_category")]
        [Validation(Required=true)]
        public string EblCategory { get; set; }

        // 批次下的提单明细
        // 
        // 
        [NameInMap("ebl_details")]
        [Validation(Required=true)]
        public List<EblDetail> EblDetails { get; set; }

        // 议付行did
        [NameInMap("negotiating_bank_did")]
        [Validation(Required=true)]
        public string NegotiatingBankDid { get; set; }

        // 托运人did
        [NameInMap("shipper_did")]
        [Validation(Required=true)]
        public string ShipperDid { get; set; }

    }

}
