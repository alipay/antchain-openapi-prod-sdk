// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class PushLicenceMeterdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品Code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 商品code
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 规格
        [NameInMap("spec_code")]
        [Validation(Required=false)]
        public string SpecCode { get; set; }

        // 实例ID, 如果是SOFA产品，则表示SOFA的实例ID。
        // 如果不传则认为是当前环境的总使用量；
        // 如果传了则认为是特定instanceId内的使用量
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 用户id 
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 原始计量数据，KV结构。
        // 每一对KV 对应一个计量项及其值；Key 为计量项Code，value为其具体的值。比如，某产品有TPS 和节点数两个计量项。
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 用量发生的时间
        [NameInMap("gmt_meter")]
        [Validation(Required=true)]
        public string GmtMeter { get; set; }

    }

}
