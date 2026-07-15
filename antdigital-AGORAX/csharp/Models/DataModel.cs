// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权服务数据模型结构体
    public class DataModel : TeaModel {
        // 业务系统唯一标示
        /// <summary>
        /// <b>Example:</b>
        /// <para>3fc223617da9a17a4d7792ef0c3f57bd176ec</para>
        /// </summary>
        [NameInMap("biz_uid")]
        [Validation(Required=false)]
        public string BizUid { get; set; }

        // 空间ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>space1</para>
        /// </summary>
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1595574776000</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 数据模型描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一个描述信息</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模型字段详细信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;organization&quot;:&quot;test&quot;,&quot;company&quot;:&quot;test&quot;}</para>
        /// </summary>
        [NameInMap("field_detail")]
        [Validation(Required=true)]
        public string FieldDetail { get; set; }

        // 数据模型业务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>model_company_data</para>
        /// </summary>
        [NameInMap("model_biz_id")]
        [Validation(Required=false)]
        public string ModelBizId { get; set; }

        // 数据模型ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>DATA_MODEL_123</para>
        /// </summary>
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 数据模型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>税务信息模型</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 提交人
        [NameInMap("submitter")]
        [Validation(Required=true)]
        public Participant Submitter { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1595574776000</para>
        /// </summary>
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACTIVE</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
