// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票邮寄信息
    public class InvoiceMailInfo : TeaModel {
        // PID，指定发票邮寄地址归属的PID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("pid")]
        [Validation(Required=true)]
        public string Pid { get; set; }

        // 联系人名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 国家
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国</para>
        /// </summary>
        [NameInMap("country")]
        [Validation(Required=true)]
        public string Country { get; set; }

        // 收件人邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:715680094@qq.com">715680094@qq.com</a></para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 联系人电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>17797768851</para>
        /// </summary>
        [NameInMap("telephone")]
        [Validation(Required=false)]
        public string Telephone { get; set; }

        // 省份
        /// <summary>
        /// <b>Example:</b>
        /// <para>河南</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 城市
        /// <summary>
        /// <b>Example:</b>
        /// <para>郑州</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 区/县
        /// <summary>
        /// <b>Example:</b>
        /// <para>金水区</para>
        /// </summary>
        [NameInMap("county_district")]
        [Validation(Required=false)]
        public string CountyDistrict { get; set; }

        // 街道
        /// <summary>
        /// <b>Example:</b>
        /// <para>良秀路街道</para>
        /// </summary>
        [NameInMap("street")]
        [Validation(Required=false)]
        public string Street { get; set; }

        // 详细地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>良秀路180号</para>
        /// </summary>
        [NameInMap("detail_address")]
        [Validation(Required=false)]
        public string DetailAddress { get; set; }

        // BD邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:715680093@qq.com">715680093@qq.com</a></para>
        /// </summary>
        [NameInMap("bd_email")]
        [Validation(Required=false)]
        public string BdEmail { get; set; }

    }

}
