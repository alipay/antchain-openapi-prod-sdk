// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 车辆基本信息
    public class CarInfo : TeaModel {
        // 车牌号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 车架号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx</para>
        /// </summary>
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 发动机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("engine_no")]
        [Validation(Required=true)]
        public string EngineNo { get; set; }

        // 
        // 注册日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 车型
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

    }

}
