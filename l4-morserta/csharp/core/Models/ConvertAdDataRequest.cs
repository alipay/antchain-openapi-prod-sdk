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
        [Validation(Required=false)]
        public string DeviceOsType { get; set; }

        // 设备ID（imei或idfa的加密值）
        [NameInMap("muid")]
        [Validation(Required=false)]
        public string Muid { get; set; }

        // 点击ID
        [NameInMap("click_id")]
        [Validation(Required=true)]
        public string ClickId { get; set; }

        // 点击时间
        [NameInMap("click_time")]
        [Validation(Required=false)]
        public long? ClickTime { get; set; }

        // 曝光时间
        [NameInMap("impression_time")]
        [Validation(Required=false)]
        public long? ImpressionTime { get; set; }

        // 手机号MD5
        [NameInMap("mobile_md5")]
        [Validation(Required=false)]
        public string MobileMd5 { get; set; }

        // 区分投放渠道来源weixin\youlianghui\chuanshanjia\douyin
        [NameInMap("platform")]
        [Validation(Required=false)]
        public string Platform { get; set; }

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

        // 首次支付保费(蚂蚁数科定义)，用户首次支付保险的费用。单位元
        [NameInMap("first_pay_amount")]
        [Validation(Required=false)]
        public string FirstPayAmount { get; set; }

        // 升级支付保费(蚂蚁数科定义)，用户支付后进行保险升级的支付费用。单位元
        [NameInMap("upgrade_pay_amount")]
        [Validation(Required=false)]
        public string UpgradePayAmount { get; set; }

        // 续费保费(蚂蚁数科定义)，用户M2进行保险续费的费用。
        [NameInMap("upgrade_renewval_amount")]
        [Validation(Required=false)]
        public string UpgradeRenewvalAmount { get; set; }

        // 行业
        [NameInMap("industry")]
        [Validation(Required=true)]
        public string Industry { get; set; }

        // 用户的借款金额
        [NameInMap("loan_amount")]
        [Validation(Required=false)]
        public string LoanAmount { get; set; }

        // 扩展json
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

    }

}
