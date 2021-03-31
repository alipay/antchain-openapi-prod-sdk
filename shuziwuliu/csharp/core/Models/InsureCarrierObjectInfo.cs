// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 承运人责任险保险标的信息
    public class InsureCarrierObjectInfo : TeaModel {
        // 厂牌型号
        [NameInMap("cp_model")]
        [Validation(Required=true)]
        public string CpModel { get; set; }

        // 车架号
        [NameInMap("frame_no")]
        [Validation(Required=true)]
        public string FrameNo { get; set; }

        // 车牌号码
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 吨位
        [NameInMap("ton_nage")]
        [Validation(Required=true)]
        public string TonNage { get; set; }

        // 行驶证车主
        [NameInMap("driv_per")]
        [Validation(Required=true)]
        public string DrivPer { get; set; }

        // 运营证号
        [NameInMap("run_no")]
        [Validation(Required=true)]
        public string RunNo { get; set; }

        // 运输货物
        [NameInMap("ts_car_go")]
        [Validation(Required=true)]
        public string TsCarGo { get; set; }

    }

}
