// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 物流运单信息详情结构体
    public class OrderInfo : TeaModel {
        // 运单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 船名
        [NameInMap("ship_name")]
        [Validation(Required=true)]
        public string ShipName { get; set; }

        // 航次
        [NameInMap("voyage_no")]
        [Validation(Required=true)]
        public string VoyageNo { get; set; }

        // 起始地
        [NameInMap("original_place")]
        [Validation(Required=true)]
        public string OriginalPlace { get; set; }

        // 目的地
        [NameInMap("dest_place")]
        [Validation(Required=true)]
        public string DestPlace { get; set; }

        // 离港时间
        [NameInMap("leave_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LeaveDate { get; set; }

        // 预计到港时间
        [NameInMap("est_arri_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EstArriDate { get; set; }

        // 实际到港时间
        [NameInMap("actual_arri_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ActualArriDate { get; set; }

        // 运单重量
        [NameInMap("waybill_weight")]
        [Validation(Required=true)]
        public string WaybillWeight { get; set; }

        // 船运箱子详情列表
        [NameInMap("cargo_tank_list")]
        [Validation(Required=true)]
        public List<CargoTank> CargoTankList { get; set; }

        // 委托人信息
        [NameInMap("grantor_info")]
        [Validation(Required=true)]
        public List<string> GrantorInfo { get; set; }

        // 收货人信息
        [NameInMap("consignee_info")]
        [Validation(Required=true)]
        public List<string> ConsigneeInfo { get; set; }

        // 运单附件
        [NameInMap("attachment")]
        [Validation(Required=true)]
        public string Attachment { get; set; }

        // 物流状态:
        // 1-->已离开港口;
        // 2-->已到达港口;
        [NameInMap("logistics_status")]
        [Validation(Required=true)]
        public long? LogisticsStatus { get; set; }

    }

}
