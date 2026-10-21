// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    // 知识库列表数据详情
    public class TreeDetailResponse : TeaModel {
        // 知识库名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>知识库名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 知识库id
        /// <summary>
        /// <b>Example:</b>
        /// <para>tree_1231</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 知识库描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>知识库描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 当前最新版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>V2026.08.1</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 当前激活的版本号，未激活任何版本时为 null
        /// <summary>
        /// <b>Example:</b>
        /// <para>V2026.08.1</para>
        /// </summary>
        [NameInMap("activeversion")]
        [Validation(Required=false)]
        public string Activeversion { get; set; }

        // 官方知识库数据为 "official",否则 null
        /// <summary>
        /// <b>Example:</b>
        /// <para>null</para>
        /// </summary>
        [NameInMap("tenanttag")]
        [Validation(Required=false)]
        public string Tenanttag { get; set; }

    }

}
