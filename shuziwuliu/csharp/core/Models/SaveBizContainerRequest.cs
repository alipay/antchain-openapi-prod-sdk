// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizContainerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 订舱单号
        // 
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

        // 集装箱ID
        [NameInMap("container_id")]
        [Validation(Required=true)]
        public string ContainerId { get; set; }

        // 箱号 业务必填
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

        //  箱型  业务必填
        [NameInMap("container_type")]
        [Validation(Required=false)]
        public string ContainerType { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 货物列表
        [NameInMap("goods_list")]
        [Validation(Required=false)]
        public List<ContainerGoodsParam> GoodsList { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 封铅号
        [NameInMap("seal_no")]
        [Validation(Required=false)]
        public string SealNo { get; set; }

        // 是否SOC
        [NameInMap("soc_flag")]
        [Validation(Required=false)]
        public string SocFlag { get; set; }

        // 特殊字段无要求非必填
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
