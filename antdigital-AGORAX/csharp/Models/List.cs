// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 发券记录列表
    public class List : TeaModel {
        // 记录ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1100034</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 活动ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1100001911234</para>
        /// </summary>
        [NameInMap("activity_id")]
        [Validation(Required=false)]
        public string ActivityId { get; set; }

        // 活动名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx面馆活动</para>
        /// </summary>
        [NameInMap("activity_name")]
        [Validation(Required=false)]
        public string ActivityName { get; set; }

        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088000098761234</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 业务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>110001011234</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("record_source")]
        [Validation(Required=false)]
        public string RecordSource { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm:ss</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm:ss</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

    }

}
