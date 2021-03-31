// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBizHouseblRequest : TeaModel {
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

        // 订舱单
        [NameInMap("bl_booking_params")]
        [Validation(Required=false)]
        public List<HouseBlBookingParam> BlBookingParams { get; set; }

        // 提单签发单位
        [NameInMap("bl_issuing_agency")]
        [Validation(Required=false)]
        public string BlIssuingAgency { get; set; }

        // 提单要求
        [NameInMap("bl_request")]
        [Validation(Required=false)]
        public string BlRequest { get; set; }

        // 提单类型
        [NameInMap("bl_type")]
        [Validation(Required=false)]
        public string BlType { get; set; }

        // 船公司 业务必填
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 收货人 业务必填	
        // 
        [NameInMap("consignee")]
        [Validation(Required=false)]
        public string Consignee { get; set; }

        // 集装箱列表 业务必填	
        // 
        [NameInMap("container_params")]
        [Validation(Required=false)]
        public List<HouseBlContainerParam> ContainerParams { get; set; }

        // 约号
        [NameInMap("contract")]
        [Validation(Required=false)]
        public string Contract { get; set; }

        // 目的地  业务必填	
        // 
        [NameInMap("delivery_place")]
        [Validation(Required=false)]
        public string DeliveryPlace { get; set; }

        // 运输条款
        [NameInMap("delivery_terms")]
        [Validation(Required=false)]
        public string DeliveryTerms { get; set; }

        // 卸货港 业务必填	
        // 
        [NameInMap("discharge_port")]
        [Validation(Required=false)]
        public string DischargePort { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 运费
        [NameInMap("freight")]
        [Validation(Required=false)]
        public string Freight { get; set; }

        // 货物列表 业务必填	
        // 
        [NameInMap("goods_params")]
        [Validation(Required=false)]
        public List<HouseBlGoodsParam> GoodsParams { get; set; }

        // house提单号
        [NameInMap("house_bl_no")]
        [Validation(Required=true)]
        public string HouseBlNo { get; set; }

        // 出单日期 
        [NameInMap("issue_date")]
        [Validation(Required=false)]
        public long? IssueDate { get; set; }

        // 放单地点
        [NameInMap("issue_place")]
        [Validation(Required=false)]
        public string IssuePlace { get; set; }

        // 起运港 业务必填	
        // 
        [NameInMap("loading_port")]
        [Validation(Required=false)]
        public string LoadingPort { get; set; }

        // master提单号
        [NameInMap("master_bl_no")]
        [Validation(Required=false)]
        public string MasterBlNo { get; set; }

        // 裝卸方式 
        [NameInMap("movement")]
        [Validation(Required=false)]
        public string Movement { get; set; }

        // 通知方
        [NameInMap("notify_party")]
        [Validation(Required=false)]
        public string NotifyParty { get; set; }

        // 开船日期
        [NameInMap("on_board_date")]
        [Validation(Required=false)]
        public long? OnBoardDate { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 付费方式 业务必填	
        // 
        [NameInMap("payment_terms")]
        [Validation(Required=false)]
        public string PaymentTerms { get; set; }

        // 其他
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 发货人 业务必填	
        // 
        [NameInMap("shipper")]
        [Validation(Required=false)]
        public string Shipper { get; set; }

        // 运输方式
        [NameInMap("transportation")]
        [Validation(Required=false)]
        public string Transportation { get; set; }

        // 航名 业务必填
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次 业务必填
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

    }

}
