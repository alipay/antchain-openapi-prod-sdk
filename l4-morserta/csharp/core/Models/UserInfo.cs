// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    // 用户/设备标识
    public class UserInfo : TeaModel {
        // Android 设备填写，imei原值
        [NameInMap("original_imei")]
        [Validation(Required=false)]
        public string OriginalImei { get; set; }

        // Android 设备填写，imei md5值
        [NameInMap("md5_imei")]
        [Validation(Required=false)]
        public string Md5Imei { get; set; }

        // Android 设备填写,android_id原值 
        [NameInMap("original_android_id")]
        [Validation(Required=false)]
        public string OriginalAndroidId { get; set; }

        // Android 设备填写, md5 后的 android_id 设备号
        [NameInMap("md5_android_id")]
        [Validation(Required=false)]
        public string Md5AndroidId { get; set; }

        // Android 设备填写，oaid原值
        [NameInMap("original_oaid")]
        [Validation(Required=false)]
        public string OriginalOaid { get; set; }

        // Android 设备填写，oaid MD5值
        [NameInMap("md5_oaid")]
        [Validation(Required=false)]
        public string Md5Oaid { get; set; }

        // iOS 设备填写, idfa原值
        [NameInMap("original_idfa")]
        [Validation(Required=false)]
        public string OriginalIdfa { get; set; }

        // iOS 设备填写, idfa md5值
        [NameInMap("md5_idfa")]
        [Validation(Required=false)]
        public string Md5Idfa { get; set; }

        // 客户电话原值
        [NameInMap("original_phone")]
        [Validation(Required=false)]
        public string OriginalPhone { get; set; }

        // md5后的电话号码
        [NameInMap("md5_phone")]
        [Validation(Required=false)]
        public string Md5Phone { get; set; }

        // 客户联系方式的sha256
        [NameInMap("sha256_phone")]
        [Validation(Required=false)]
        public string Sha256Phone { get; set; }

        // iOS 设备填写,中国广告协会互联网广告标
        [NameInMap("caid")]
        [Validation(Required=false)]
        public string Caid { get; set; }

        // IOS设备填写，caid版本
        [NameInMap("caid_version")]
        [Validation(Required=false)]
        public string CaidVersion { get; set; }

        // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值
        [NameInMap("wechat_openid")]
        [Validation(Required=false)]
        public string WechatOpenid { get; set; }

        // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值
        [NameInMap("wechat_unionid")]
        [Validation(Required=false)]
        public string WechatUnionid { get; set; }

        // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID
        [NameInMap("wechat_app_id")]
        [Validation(Required=false)]
        public string WechatAppId { get; set; }

    }

}
