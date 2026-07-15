// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 车辆用户信息
    public class CarUserInfo : TeaModel {
        // 唯一标识用户的id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>138xxxxxxx</para>
        /// </summary>
        [NameInMap("phone_num")]
        [Validation(Required=true)]
        public string PhoneNum { get; set; }

        // 城市编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000</para>
        /// </summary>
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("user_cert_name")]
        [Validation(Required=false)]
        public string UserCertName { get; set; }

        // 证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("user_cert_no")]
        [Validation(Required=false)]
        public string UserCertNo { get; set; }

        // 性别
        /// <summary>
        /// <b>Example:</b>
        /// <para>girl</para>
        /// </summary>
        [NameInMap("user_gender")]
        [Validation(Required=false)]
        public string UserGender { get; set; }

        // 昵称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("nick")]
        [Validation(Required=false)]
        public string Nick { get; set; }

    }

}
