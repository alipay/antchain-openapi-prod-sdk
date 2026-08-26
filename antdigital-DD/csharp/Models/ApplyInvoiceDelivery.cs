// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 寄送信息
    public class ApplyInvoiceDelivery : TeaModel {
        // 寄送类型，如1表示快递，2表示email
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("delivery_type")]
        [Validation(Required=false)]
        public string DeliveryType { get; set; }

        // 开票人PID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088720671581149</para>
        /// </summary>
        [NameInMap("pid")]
        [Validation(Required=true)]
        public string Pid { get; set; }

        // 收件人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>收件人名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>13987654321</para>
        /// </summary>
        [NameInMap("telephone")]
        [Validation(Required=false)]
        public string Telephone { get; set; }

        // 国家
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国</para>
        /// </summary>
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // 省份
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 市
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 区县
        /// <summary>
        /// <b>Example:</b>
        /// <para>黄浦区</para>
        /// </summary>
        [NameInMap("county_district")]
        [Validation(Required=false)]
        public string CountyDistrict { get; set; }

        // 街道
        /// <summary>
        /// <b>Example:</b>
        /// <para>街道</para>
        /// </summary>
        [NameInMap("street")]
        [Validation(Required=false)]
        public string Street { get; set; }

        // 详细地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>外马路618号</para>
        /// </summary>
        [NameInMap("detail_address")]
        [Validation(Required=false)]
        public string DetailAddress { get; set; }

        // 收件人邮件
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:a@1.com">a@1.com</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
