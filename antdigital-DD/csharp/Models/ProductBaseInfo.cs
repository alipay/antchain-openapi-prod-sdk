// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // Product基础信息，包含 code(产品码) ,name(产品名称),name_en(产品英文名)
    public class ProductBaseInfo : TeaModel {
        // 产品码，系统内部识别
        /// <summary>
        /// <b>Example:</b>
        /// <para>IIFS</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>票聚链-普惠金融服务</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品英文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>invoichain-finance</para>
        /// </summary>
        [NameInMap("name_en")]
        [Validation(Required=false)]
        public string NameEn { get; set; }

        // 产品短码，管理维度识别
        /// <summary>
        /// <b>Example:</b>
        /// <para>IIFS</para>
        /// </summary>
        [NameInMap("short_code")]
        [Validation(Required=true)]
        public string ShortCode { get; set; }

    }

}
