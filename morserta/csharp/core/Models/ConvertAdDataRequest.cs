// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class ConvertAdDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 广告主id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public long? AccountId { get; set; }

        // ios/android
        [NameInMap("device_os_type")]
        [Validation(Required=true)]
        public string DeviceOsType { get; set; }

        // 设备ID（imei或idfa的加密值）
        [NameInMap("muid")]
        [Validation(Required=true)]
        public string Muid { get; set; }

        // 点击ID
        [NameInMap("click_id")]
        [Validation(Required=true)]
        public string ClickId { get; set; }

        // 转化时间
        [NameInMap("conv_time")]
        [Validation(Required=true)]
        public long? ConvTime { get; set; }

        // 点击时间
        [NameInMap("click_time")]
        [Validation(Required=true)]
        public long? ClickTime { get; set; }

        // 曝光时间
        [NameInMap("impression_time")]
        [Validation(Required=true)]
        public string ImpressionTime { get; set; }

        // 投放日期年月日时分秒（准确到秒），格式为 yyyyMMddhhmmss
        [NameInMap("dt")]
        [Validation(Required=true)]
        public string Dt { get; set; }

        // 手机号MD5
        [NameInMap("mobile_md5")]
        [Validation(Required=true)]
        public string MobileMd5 { get; set; }

        // 是否提单标签0,1
        [NameInMap("label_submit")]
        [Validation(Required=true)]
        public long? LabelSubmit { get; set; }

        // 是否支付标签0,1
        [NameInMap("label_pay")]
        [Validation(Required=true)]
        public long? LabelPay { get; set; }

        // 是否升级标签0,1
        [NameInMap("label_up")]
        [Validation(Required=false)]
        public long? LabelUp { get; set; }

        // m2是否续期
        [NameInMap("label_m2_renewal")]
        [Validation(Required=true)]
        public long? LabelM2Renewal { get; set; }

        // 是否退保
        [NameInMap("label_surrender")]
        [Validation(Required=false)]
        public long? LabelSurrender { get; set; }

        // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
        [NameInMap("platform")]
        [Validation(Required=false)]
        public long? Platform { get; set; }

    }

}
