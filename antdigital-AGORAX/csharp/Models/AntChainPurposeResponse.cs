// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链用途申报结构体
    public class AntChainPurposeResponse : TeaModel {
        // 用户申报用途状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 已申报的用途，比如供应链金融
        /// <summary>
        /// <b>Example:</b>
        /// <para>已申报的用途，比如供应链金融</para>
        /// </summary>
        [NameInMap("purpose")]
        [Validation(Required=false)]
        public string Purpose { get; set; }

        // 申报时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>21-1-1</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 简短说明用途
        /// <summary>
        /// <b>Example:</b>
        /// <para>简短说明用途</para>
        /// </summary>
        [NameInMap("chain_purpose_item")]
        [Validation(Required=false)]
        public string ChainPurposeItem { get; set; }

        // 用途详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>用途详情</para>
        /// </summary>
        [NameInMap("chain_purpose_extend")]
        [Validation(Required=false)]
        public string ChainPurposeExtend { get; set; }

        // 申请用途列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[]</para>
        /// </summary>
        [NameInMap("record_list")]
        [Validation(Required=false)]
        public List<ChainPurpose> RecordList { get; set; }

    }

}
