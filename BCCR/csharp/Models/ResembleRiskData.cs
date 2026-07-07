// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品相似识别结果
    public class ResembleRiskData : TeaModel {
        // 重复作品ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>重复作品ID</para>
        /// </summary>
        [NameInMap("work_id")]
        [Validation(Required=true)]
        public string WorkId { get; set; }

        // 相似作品的名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>相似作品的名称</para>
        /// </summary>
        [NameInMap("work_name")]
        [Validation(Required=false)]
        public string WorkName { get; set; }

        // 相似作品的类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>VIDEO</para>
        /// </summary>
        [NameInMap("work_type")]
        [Validation(Required=false)]
        public string WorkType { get; set; }

        // 相似值
        /// <summary>
        /// <b>Example:</b>
        /// <para>相似值</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

        // 相似作品下载凭证
        /// <summary>
        /// <b>Example:</b>
        /// <para>相似作品下载凭证</para>
        /// </summary>
        [NameInMap("work_file_id")]
        [Validation(Required=false)]
        public string WorkFileId { get; set; }

        // 相似明细
        [NameInMap("resemble_details")]
        [Validation(Required=false)]
        public List<ResembleDetail> ResembleDetails { get; set; }

    }

}
