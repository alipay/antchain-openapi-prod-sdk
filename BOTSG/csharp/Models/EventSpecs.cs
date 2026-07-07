// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    // 事件数据领域参数
    // 
    public class EventSpecs : TeaModel {
        // 物模型事件ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7084744398341955584</para>
        /// </summary>
        [NameInMap("event_model_id")]
        [Validation(Required=true)]
        public string EventModelId { get; set; }

        // 业务数据标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORDER</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 提交日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-08-15 </para>
        /// </summary>
        [NameInMap("submit_date")]
        [Validation(Required=false)]
        public string SubmitDate { get; set; }

        // 冗余字段，请忽略
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("return_hash")]
        [Validation(Required=false)]
        public bool? ReturnHash { get; set; }

        // 是否是补数据内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_repaired")]
        [Validation(Required=false)]
        public bool? IsRepaired { get; set; }

    }

}
