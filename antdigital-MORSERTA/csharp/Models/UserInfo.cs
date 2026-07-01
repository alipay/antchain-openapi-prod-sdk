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
        /// <summary>
        /// <b>Example:</b>
        /// <para>Android 设备填写，imei原值</para>
        /// </summary>
        [NameInMap("original_imei")]
        [Validation(Required=false)]
        public string OriginalImei { get; set; }

        // Android 设备填写，imei md5值
        /// <summary>
        /// <b>Example:</b>
        /// <para>Android 设备填写，imei md5值</para>
        /// </summary>
        [NameInMap("md5_imei")]
        [Validation(Required=false)]
        public string Md5Imei { get; set; }

        // Android 设备填写,android_id原值 
        /// <summary>
        /// <b>Example:</b>
        /// <para>Android 设备填写,android_id原值 </para>
        /// </summary>
        [NameInMap("original_android_id")]
        [Validation(Required=false)]
        public string OriginalAndroidId { get; set; }

        // Android 设备填写, md5 后的 android_id 设备号
        /// <summary>
        /// <b>Example:</b>
        /// <para>Android 设备填写, md5 后的 android_id 设备号</para>
        /// </summary>
        [NameInMap("md5_android_id")]
        [Validation(Required=false)]
        public string Md5AndroidId { get; set; }

        // Android 设备填写，oaid原值
        /// <summary>
        /// <b>Example:</b>
        /// <para>Android 设备填写，oaid原值</para>
        /// </summary>
        [NameInMap("original_oaid")]
        [Validation(Required=false)]
        public string OriginalOaid { get; set; }

        // Android 设备填写，oaid MD5值
        /// <summary>
        /// <b>Example:</b>
        /// <para>Android 设备填写，oaid MD5值</para>
        /// </summary>
        [NameInMap("md5_oaid")]
        [Validation(Required=false)]
        public string Md5Oaid { get; set; }

        // iOS 设备填写, idfa原值
        /// <summary>
        /// <b>Example:</b>
        /// <para>iOS 设备填写, idfa原值</para>
        /// </summary>
        [NameInMap("original_idfa")]
        [Validation(Required=false)]
        public string OriginalIdfa { get; set; }

        // iOS 设备填写, idfa md5值
        /// <summary>
        /// <b>Example:</b>
        /// <para>iOS 设备填写, idfa md5值</para>
        /// </summary>
        [NameInMap("md5_idfa")]
        [Validation(Required=false)]
        public string Md5Idfa { get; set; }

        // 客户电话原值
        /// <summary>
        /// <b>Example:</b>
        /// <para>客户电话原值</para>
        /// </summary>
        [NameInMap("original_phone")]
        [Validation(Required=false)]
        public string OriginalPhone { get; set; }

        // md5后的电话号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>md5后的电话号码</para>
        /// </summary>
        [NameInMap("md5_phone")]
        [Validation(Required=false)]
        public string Md5Phone { get; set; }

        // 客户联系方式的sha256
        /// <summary>
        /// <b>Example:</b>
        /// <para>客户联系方式的sha256</para>
        /// </summary>
        [NameInMap("sha256_phone")]
        [Validation(Required=false)]
        public string Sha256Phone { get; set; }

        // iOS 设备填写,中国广告协会互联网广告标
        /// <summary>
        /// <b>Example:</b>
        /// <para>iOS 设备填写,中国广告协会互联网广告标</para>
        /// </summary>
        [NameInMap("caid")]
        [Validation(Required=false)]
        public string Caid { get; set; }

        // IOS设备填写，caid版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>IOS设备填写，caid版本</para>
        /// </summary>
        [NameInMap("caid_version")]
        [Validation(Required=false)]
        public string CaidVersion { get; set; }

        // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值
        /// <summary>
        /// <b>Example:</b>
        /// <para>仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 openid 保持原值</para>
        /// </summary>
        [NameInMap("wechat_openid")]
        [Validation(Required=false)]
        public string WechatOpenid { get; set; }

        // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值
        /// <summary>
        /// <b>Example:</b>
        /// <para>仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信 unionid 保持原值</para>
        /// </summary>
        [NameInMap("wechat_unionid")]
        [Validation(Required=false)]
        public string WechatUnionid { get; set; }

        // 仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID
        /// <summary>
        /// <b>Example:</b>
        /// <para>仅腾讯渠道下，WECHAT, WECHAT_MINI_PROGRAM, WECHAT_MINI_GAME投放时传递，微信分配的 APPID</para>
        /// </summary>
        [NameInMap("wechat_app_id")]
        [Validation(Required=false)]
        public string WechatAppId { get; set; }

    }

}
