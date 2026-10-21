// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    // 召回出参明细
    public class RecallDataDetail : TeaModel {
        // 文件名
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省电力交易细则</para>
        /// </summary>
        [NameInMap("docname")]
        [Validation(Required=false)]
        public string Docname { get; set; }

        // 片段内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省交易细则</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 重排得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.2</para>
        /// </summary>
        [NameInMap("rerankscore")]
        [Validation(Required=false)]
        public long? Rerankscore { get; set; }

        // 重排位次
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rerankrank")]
        [Validation(Required=false)]
        public long? Rerankrank { get; set; }

        // 综合得分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=false)]
        public long? Score { get; set; }

        // chunk标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省交易细则</para>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 知识库id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("knowledgebaseids")]
        [Validation(Required=false)]
        public string Knowledgebaseids { get; set; }

        // official 官方知识库、custom个人知识库
        /// <summary>
        /// <b>Example:</b>
        /// <para>official</para>
        /// </summary>
        [NameInMap("knowledgebasetag")]
        [Validation(Required=false)]
        public string Knowledgebasetag { get; set; }

    }

}
