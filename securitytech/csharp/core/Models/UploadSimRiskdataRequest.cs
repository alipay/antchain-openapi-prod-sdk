// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class UploadSimRiskdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 登录态token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 上报类型
        [NameInMap("upload_type")]
        [Validation(Required=true)]
        public string UploadType { get; set; }

        // 智能中控id
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 中控照片，base64后的图象数据
        [NameInMap("tuid_photo")]
        [Validation(Required=false)]
        public string TuidPhoto { get; set; }

        // 车架号
        [NameInMap("frame_no")]
        [Validation(Required=false)]
        public string FrameNo { get; set; }

        // 车架号照片，base64后的图象数据
        [NameInMap("frame_no_photo")]
        [Validation(Required=false)]
        public string FrameNoPhoto { get; set; }

        // 人车合影（销售+用户），base64后的图象数据
        [NameInMap("group_photo")]
        [Validation(Required=false)]
        public string GroupPhoto { get; set; }

        // 单据照片（发票/收据），base64后的图象数据
        [NameInMap("bill_photo")]
        [Validation(Required=false)]
        public string BillPhoto { get; set; }

        // 上牌照片，base64后的图象数据
        [NameInMap("license_plate_photo")]
        [Validation(Required=false)]
        public string LicensePlatePhoto { get; set; }

        // 订单ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

    }

}
