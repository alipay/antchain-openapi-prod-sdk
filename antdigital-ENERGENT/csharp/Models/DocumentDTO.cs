// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    // 文档DTO
    public class DocumentDTO : TeaModel {
        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 文件名
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231</para>
        /// </summary>
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public string FileSize { get; set; }

        // 文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>pdf</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // 文件地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件地址</para>
        /// </summary>
        [NameInMap("oss_url")]
        [Validation(Required=false)]
        public string OssUrl { get; set; }

        // md5
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231</para>
        /// </summary>
        [NameInMap("md5")]
        [Validation(Required=false)]
        public string Md5 { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-01-01 00:00:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-01-01 00:00:00</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 文件提供方
        /// <summary>
        /// <b>Example:</b>
        /// <para>oss</para>
        /// </summary>
        [NameInMap("oss_provider")]
        [Validation(Required=false)]
        public string OssProvider { get; set; }

        // 向量库映射ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>向量库映射ID</para>
        /// </summary>
        [NameInMap("vector_store_map_id")]
        [Validation(Required=false)]
        public string VectorStoreMapId { get; set; }

    }

}
