// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 新车信息
    public class NewCarInfo : TeaModel {
        // 车系
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx</para>
        /// </summary>
        [NameInMap("car_series")]
        [Validation(Required=true)]
        public string CarSeries { get; set; }

        // 金融方案
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("finaical_plan")]
        [Validation(Required=false)]
        public string FinaicalPlan { get; set; }

        // 车系id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("car_series_id")]
        [Validation(Required=false)]
        public string CarSeriesId { get; set; }

        // 请求提交唯一id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("submit_id")]
        [Validation(Required=false)]
        public string SubmitId { get; set; }

        // 预计购买时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("purcharse_time")]
        [Validation(Required=false)]
        public string PurcharseTime { get; set; }

        // 用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public CarUserInfo UserInfo { get; set; }

        // 懂车帝或者汽车之家
        /// <summary>
        /// <b>Example:</b>
        /// <para>DCD/QC</para>
        /// </summary>
        [NameInMap("match_source")]
        [Validation(Required=false)]
        public string MatchSource { get; set; }

        // 汽车之家车型id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("qc_car_series_id")]
        [Validation(Required=false)]
        public string QcCarSeriesId { get; set; }

    }

}
