// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class ModifySpProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        [NameInMap("order_no")]
        [Validation(Required=true, MaxLength=64)]
        public string OrderNo { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=20)]
        public string ProductCode { get; set; }

        // 产品实例Id
        [NameInMap("instance_id")]
        [Validation(Required=true, MaxLength=50)]
        public string InstanceId { get; set; }

        // 具体规格配置信息（JSON格式）会按照key进行排序
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        [NameInMap("access_code")]
        [Validation(Required=true, MaxLength=24)]
        public string AccessCode { get; set; }

        // 变配类型：
        // ONLY_SPECIFICATION只规格变配,
        // SPECIFICATION_AND_TIME 规格和时间同时变配
        [NameInMap("modify_type")]
        [Validation(Required=true, MaxLength=32)]
        public string ModifyType { get; set; }

        // 变配新的开始时间。格式为UTC时间。
        // modify_type是SPECIFICATION_AND_TIME时，必填
        [NameInMap("new_start_time")]
        [Validation(Required=false)]
        public string NewStartTime { get; set; }

        // 变配新的结束时间。格式为UTC时间.
        //  modify_type是SPECIFICATION_AND_TIME时，必填
        [NameInMap("new_end_time")]
        [Validation(Required=false)]
        public string NewEndTime { get; set; }

        // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等
        [NameInMap("business_data")]
        [Validation(Required=false)]
        public string BusinessData { get; set; }

        // 具体规格配置信息（JSON格式）会按照key进行排序。
        // 此字段传入的是变配前的老规格信息。
        [NameInMap("old_specification")]
        [Validation(Required=false)]
        public string OldSpecification { get; set; }

        // 具体规格配置信息（JSON格式）会按照key进行排序.
        // 传入新的规格信息，包括在新的规格中不存在，但是老的规格中有的kv。
        [NameInMap("new_specification")]
        [Validation(Required=false)]
        public string NewSpecification { get; set; }

    }

}
