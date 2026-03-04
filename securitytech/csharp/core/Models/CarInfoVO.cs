// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 车辆信息列表
    public class CarInfoVO : TeaModel {
        // 车辆型号
        [NameInMap("car_model")]
        [Validation(Required=true)]
        public string CarModel { get; set; }

        // 车辆颜色
        [NameInMap("car_color")]
        [Validation(Required=true)]
        public string CarColor { get; set; }

        // 车型编号
        [NameInMap("model_no")]
        [Validation(Required=true)]
        public string ModelNo { get; set; }

        // 车架号
        [NameInMap("frame_no")]
        [Validation(Required=true)]
        public string FrameNo { get; set; }

        // 设备ID
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // tagId
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 品牌ID
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 协议类型
        [NameInMap("protocol_type")]
        [Validation(Required=true)]
        public string ProtocolType { get; set; }

    }

}
