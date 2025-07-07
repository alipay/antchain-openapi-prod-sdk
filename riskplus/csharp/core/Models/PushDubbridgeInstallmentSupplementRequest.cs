// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushDubbridgeInstallmentSupplementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号：request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 业务类型：1-现金贷；2-分期付
        // 
        [NameInMap("prod_type")]
        [Validation(Required=true)]
        public string ProdType { get; set; }

        // 资产方用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 资产方购物订单号，如二轮车/摩托车订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 材料场景：2-支用前、3-支用后
        [NameInMap("file_scene")]
        [Validation(Required=false)]
        public string FileScene { get; set; }

        // 材料列表
        [NameInMap("file_list")]
        [Validation(Required=false)]
        public List<SupplementFile> FileList { get; set; }

        // 门店信息
        [NameInMap("store_info")]
        [Validation(Required=false)]
        public StoreInfo StoreInfo { get; set; }

        // 订单车辆信息
        [NameInMap("vehicle_info")]
        [Validation(Required=false)]
        public VehicleInfo VehicleInfo { get; set; }

        // 补充信息
        [NameInMap("additional")]
        [Validation(Required=false)]
        public Additional Additional { get; set; }

    }

}
