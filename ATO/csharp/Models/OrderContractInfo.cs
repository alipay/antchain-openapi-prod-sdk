// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 订单电子合同信息对象
    public class OrderContractInfo : TeaModel {
        // 电子合同签署单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20240505151148001384</para>
        /// </summary>
        [NameInMap("sign_no")]
        [Validation(Required=false)]
        public string SignNo { get; set; }

        // 签署时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-11-12 00:00:00</para>
        /// </summary>
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 合同签署类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>lease</para>
        /// </summary>
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

        // 文件合同类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>lease</para>
        /// </summary>
        [NameInMap("agreement_type")]
        [Validation(Required=false)]
        public string AgreementType { get; set; }

        // 模板ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>T20240505151148001384</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 模板文件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>租赁合同</para>
        /// </summary>
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 合同文件下载地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>oss</para>
        /// </summary>
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

    }

}
