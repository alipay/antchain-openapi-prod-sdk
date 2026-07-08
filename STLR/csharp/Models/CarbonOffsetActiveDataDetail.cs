// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳补偿活动数据详情
    public class CarbonOffsetActiveDataDetail : TeaModel {
        // 活动数据编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>AD1</para>
        /// </summary>
        [NameInMap("active_data_no")]
        [Validation(Required=true)]
        public string ActiveDataNo { get; set; }

        // 活动数据名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>行走里程数</para>
        /// </summary>
        [NameInMap("active_data_name")]
        [Validation(Required=false)]
        public string ActiveDataName { get; set; }

        // 活动数据单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>km</para>
        /// </summary>
        [NameInMap("active_data_unit")]
        [Validation(Required=false)]
        public string ActiveDataUnit { get; set; }

        // 活动数据描述文案
        /// <summary>
        /// <b>Example:</b>
        /// <para>描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 活动数据值
        /// <summary>
        /// <b>Example:</b>
        /// <para>22.22</para>
        /// </summary>
        [NameInMap("active_data_value")]
        [Validation(Required=true)]
        public string ActiveDataValue { get; set; }

    }

}
