// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻经营地址
    public class MaoOperateAddress : TeaModel {
        // 省
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("province")]
        [Validation(Required=true)]
        public MaoDistrictCode Province { get; set; }

        // 市
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("city")]
        [Validation(Required=true)]
        public MaoDistrictCode City { get; set; }

        // 区
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("district")]
        [Validation(Required=true)]
        public MaoDistrictCode District { get; set; }

        // 详细地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>详细地址</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>经度</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>纬度</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

    }

}
