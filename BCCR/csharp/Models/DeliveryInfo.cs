// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 收件人信息
    public class DeliveryInfo : TeaModel {
        // 收件人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一个姓名</para>
        /// </summary>
        [NameInMap("receive_name")]
        [Validation(Required=true)]
        public string ReceiveName { get; set; }

        // 联系电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>13000000000</para>
        /// </summary>
        [NameInMap("contact")]
        [Validation(Required=true)]
        public string Contact { get; set; }

        // 省（需要接收纸质文件时必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 市（需要接收纸质文件时必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 区（需要接收纸质文件时必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>西湖区</para>
        /// </summary>
        [NameInMap("area")]
        [Validation(Required=false)]
        public string Area { get; set; }

        // 详细地址（需要接收纸质文件时必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>黄龙时代广场</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 电子邮箱（需要接收电子文件时必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:xxx@xx.com">xxx@xx.com</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
