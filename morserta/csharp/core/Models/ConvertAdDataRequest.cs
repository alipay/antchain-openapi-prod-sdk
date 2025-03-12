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

        // 点击时间
        [NameInMap("click_time")]
        [Validation(Required=true)]
        public long? ClickTime { get; set; }

        // 曝光时间
        [NameInMap("impression_time")]
        [Validation(Required=true)]
        public string ImpressionTime { get; set; }

        // 手机号MD5
        [NameInMap("mobile_md5")]
        [Validation(Required=true)]
        public string MobileMd5 { get; set; }

        // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
        [NameInMap("platform")]
        [Validation(Required=false)]
        public long? Platform { get; set; }

        // 事件类型，枚举值如下：
        // submit-提交表单
        // pay-付费
        // renewal-续费
        // m2_renewal-m2续期
        // surrender-退保
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 转化事件时间
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public long? EventTime { get; set; }

        // 设备oaid
        [NameInMap("oaid")]
        [Validation(Required=false)]
        public string Oaid { get; set; }

        // oaid_md5
        [NameInMap("oaid_md5")]
        [Validation(Required=false)]
        public string OaidMd5 { get; set; }

        // caid
        [NameInMap("caid")]
        [Validation(Required=false)]
        public string Caid { get; set; }

        // caid_md5
        [NameInMap("caid_md5")]
        [Validation(Required=false)]
        public string CaidMd5 { get; set; }

        // android_id
        [NameInMap("android_id")]
        [Validation(Required=false)]
        public string AndroidId { get; set; }

        // imei
        [NameInMap("imei")]
        [Validation(Required=false)]
        public string Imei { get; set; }

        // imei_md5
        [NameInMap("imei_md5")]
        [Validation(Required=false)]
        public string ImeiMd5 { get; set; }

        // idfa
        [NameInMap("idfa")]
        [Validation(Required=false)]
        public string Idfa { get; set; }

        // idfa_md5
        [NameInMap("idfa_md5")]
        [Validation(Required=false)]
        public string IdfaMd5 { get; set; }

    }

}
