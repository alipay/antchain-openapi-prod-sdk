// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 套餐基本信息
    public class ComboDTO : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 套餐名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>套餐名称xxx</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 套餐描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>套餐描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 套餐状态 DRAFT("DRAFT", "草稿"), ONLINE("ONLINE", "已上架"),OFFLINE("OFFLINE", "已下架");
        /// <summary>
        /// <b>Example:</b>
        /// <para>DRAFT</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 套餐编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>C00250884</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 套餐唯一版本号，模板变更时更新
        /// <summary>
        /// <b>Example:</b>
        /// <para>CV00252581</para>
        /// </summary>
        [NameInMap("vid")]
        [Validation(Required=false)]
        public string Vid { get; set; }

        // 父版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1232456</para>
        /// </summary>
        [NameInMap("parent_vid")]
        [Validation(Required=false)]
        public string ParentVid { get; set; }

        // 扩展配置
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("extends_config")]
        [Validation(Required=false)]
        public string ExtendsConfig { get; set; }

        // 创建人
        /// <summary>
        /// <b>Example:</b>
        /// <para>012111</para>
        /// </summary>
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 修改人
        /// <summary>
        /// <b>Example:</b>
        /// <para>0121111</para>
        /// </summary>
        [NameInMap("modify")]
        [Validation(Required=false)]
        public string Modify { get; set; }

        // 审批流程ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123212312</para>
        /// </summary>
        [NameInMap("audit_process_id")]
        [Validation(Required=false)]
        public string AuditProcessId { get; set; }

        // 审批状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>PASS</para>
        /// </summary>
        [NameInMap("audit_status")]
        [Validation(Required=false)]
        public string AuditStatus { get; set; }

        // 合同ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20883519xxxxxxxx</para>
        /// </summary>
        [NameInMap("quotation_id")]
        [Validation(Required=false)]
        public string QuotationId { get; set; }

        // 项目ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>102876</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 其他扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("extends_info")]
        [Validation(Required=false)]
        public string ExtendsInfo { get; set; }

    }

}
