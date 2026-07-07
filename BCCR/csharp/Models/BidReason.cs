// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 申办事由
    public class BidReason : TeaModel {
        // 事由类别ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        // 分类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>维权/合同纠纷</para>
        /// </summary>
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一个描述</para>
        /// </summary>
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 文件上传描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一个文件上传描述</para>
        /// </summary>
        [NameInMap("file_upload_desc")]
        [Validation(Required=true)]
        public string FileUploadDesc { get; set; }

        // 排序
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rank")]
        [Validation(Required=true)]
        public long? Rank { get; set; }

        // 是否必须上传证明文件
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_need_testify_file")]
        [Validation(Required=true)]
        public bool? IsNeedTestifyFile { get; set; }

        // reasonArray
        [NameInMap("reason_array")]
        [Validation(Required=true)]
        public List<Reason> ReasonArray { get; set; }

    }

}
