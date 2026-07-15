// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 基础车辆信息
    public class BasicCarInfo : TeaModel {
        // 车牌号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>京Axxxxx</para>
        /// </summary>
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 车架号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 发动机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("engine_no")]
        [Validation(Required=true)]
        public string EngineNo { get; set; }

        // 初登日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-12-21</para>
        /// </summary>
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 车辆型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 营运性质
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("use_nature_code")]
        [Validation(Required=true)]
        public string UseNatureCode { get; set; }

        // 是否抵押
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("mortgage")]
        [Validation(Required=false)]
        public bool? Mortgage { get; set; }

    }

}
