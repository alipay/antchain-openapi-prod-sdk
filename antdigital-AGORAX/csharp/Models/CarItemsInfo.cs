// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 车五项信息
    public class CarItemsInfo : TeaModel {
        // 车架号
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("vin")]
        [Validation(Required=false)]
        public string Vin { get; set; }

        // 发动机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("engine_no")]
        [Validation(Required=false)]
        public string EngineNo { get; set; }

        // 注册日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("register_date")]
        [Validation(Required=false)]
        public string RegisterDate { get; set; }

        // 品牌车型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("model_code")]
        [Validation(Required=false)]
        public string ModelCode { get; set; }

        // 营运性质
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX</para>
        /// </summary>
        [NameInMap("use_nature_code")]
        [Validation(Required=false)]
        public string UseNatureCode { get; set; }

    }

}
