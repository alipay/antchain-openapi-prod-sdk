// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 数据授权服务数据对象结构体
    public class DataEntity : TeaModel {
        // 授权状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>AUTHORIZED</para>
        /// </summary>
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public string AuthStatus { get; set; }

        // 业务系统唯一标示
        /// <summary>
        /// <b>Example:</b>
        /// <para>76a0e716164848168dc726460042ee25</para>
        /// </summary>
        [NameInMap("biz_uid")]
        [Validation(Required=false, MaxLength=64)]
        public string BizUid { get; set; }

        // 区块链ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>8c777cf9a71b660233215b6337dca78d</para>
        /// </summary>
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 数据类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>TABLE,FILE...</para>
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=true, MaxLength=32)]
        public string Category { get; set; }

        // 数据ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("data_id")]
        [Validation(Required=true, MaxLength=100)]
        public string DataId { get; set; }

        // 数据模型ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>DATA_MODEL_Q23</para>
        /// </summary>
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // 扩展信息，标准JSON格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;strategy&quot;:&quot;test”}</para>
        /// </summary>
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 数据名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>testdata</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 数据所有者ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("owner_id")]
        [Validation(Required=true, MaxLength=100)]
        public string OwnerId { get; set; }

        // 流程节点信息
        [NameInMap("process_template")]
        [Validation(Required=false)]
        public List<ProcessNode> ProcessTemplate { get; set; }

        // 数据状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACTIVE,DELETED...</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false, MaxLength=16)]
        public string Status { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1595574776000</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592810480442</para>
        /// </summary>
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

        // DID doc里的公开信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("public_info")]
        [Validation(Required=false)]
        public string PublicInfo { get; set; }

    }

}
