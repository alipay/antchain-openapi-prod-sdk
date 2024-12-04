// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // ETC车辆信息
    public class EtcVehicleInfo : TeaModel {
        // 车辆id
        [NameInMap("vehicle_id")]
        [Validation(Required=true)]
        public string VehicleId { get; set; }

        // etc申请单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // etc平台扣款协议号
        [NameInMap("biz_agreement_no")]
        [Validation(Required=true)]
        public string BizAgreementNo { get; set; }

        // etc申请单状态
        // ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 用户ETC设备OBU号，当order_status为SUCCESS_ACTIVATE及以后状态时，必选
        [NameInMap("device_no")]
        [Validation(Required=false)]
        public string DeviceNo { get; set; }

        // 代扣签约状态，当传入waybill_no且匹配到对应运单时，deduct_sign_status必选
        // 待签约: WAIT_SIGN
        // 已签约: SIGNED
        // 已解约: UNSIGN
        [NameInMap("deduct_sign_status")]
        [Validation(Required=false)]
        public string DeductSignStatus { get; set; }

        // 设备首次激活时间
        [NameInMap("first_actived_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FirstActivedTime { get; set; }

        // 合约到期时间
        [NameInMap("service_exp")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ServiceExp { get; set; }

        // etc设备状态，USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
        [NameInMap("device_status_detail")]
        [Validation(Required=false)]
        public string DeviceStatusDetail { get; set; }

        // 设备状态触发的具体时间
        [NameInMap("device_biz_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeviceBizTime { get; set; }

    }

}
