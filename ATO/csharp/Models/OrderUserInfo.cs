// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单用户信息
    public class OrderUserInfo : TeaModel {
        // 承租人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 承租人手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345678912</para>
        /// </summary>
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

        // 地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>四川成都</para>
        /// </summary>
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 支付宝账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088123456789</para>
        /// </summary>
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

        // 租赁类别
        // 1:个人用户
        // 2:企业用户
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lessee_type")]
        [Validation(Required=false)]
        public long? LesseeType { get; set; }

        // 承租人身份证
        /// <summary>
        /// <b>Example:</b>
        /// <para>6102384935948594</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
