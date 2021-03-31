// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewMasterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 托运订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // master提单号或House提单号
        [NameInMap("master_bl_no")]
        [Validation(Required=true)]
        public string MasterBlNo { get; set; }

        // 提单类型  master/house  
        // 
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 提单签发单位 [业务必填]
        // 
        // 
        [NameInMap("sign_unit_name")]
        [Validation(Required=false)]
        public string SignUnitName { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 发货人 [业务必填]
        [NameInMap("shipper")]
        [Validation(Required=false)]
        public string Shipper { get; set; }

        // 出口人 [业务必填]
        // 
        // 
        [NameInMap("consignee")]
        [Validation(Required=false)]
        public string Consignee { get; set; }

        // 船公司 [业务必填]
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 船名 [业务必填]
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次 [业务必填]
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

        // 起运港 [业务必填]
        [NameInMap("loading_port")]
        [Validation(Required=false)]
        public string LoadingPort { get; set; }

        // 卸货港 [业务必填]
        [NameInMap("discharge_port")]
        [Validation(Required=false)]
        public string DischargePort { get; set; }

        // 目的地 [业务必填]
        [NameInMap("delivery_place")]
        [Validation(Required=false)]
        public string DeliveryPlace { get; set; }

        // 开船时间 (秒时间戳)
        [NameInMap("on_board_date")]
        [Validation(Required=false)]
        public long? OnBoardDate { get; set; }

        // 船状态 ATA （已到港） ，ATD （已离港 ），UNATD （未离港）
        [NameInMap("on_board_status")]
        [Validation(Required=false)]
        public string OnBoardStatus { get; set; }

        // 订舱单号列表 [业务必填]
        [NameInMap("booking_info_list")]
        [Validation(Required=false)]
        public List<BookingNoInfo> BookingInfoList { get; set; }

        // 集装箱信息 [业务必填]
        [NameInMap("container_info_list")]
        [Validation(Required=false)]
        public List<ContainerInfo> ContainerInfoList { get; set; }

        // 货物列表
        // 
        // 
        [NameInMap("goods_info_list")]
        [Validation(Required=false)]
        public List<GoodsInfo> GoodsInfoList { get; set; }

    }

}
