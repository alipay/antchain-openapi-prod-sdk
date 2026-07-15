// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 新建合约服务
    public class ContractCreateReq : TeaModel {
        // 链ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>284f75bc-8069-443f-9d46-4576bb15f210</para>
        /// </summary>
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 合约模板标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>cme2023072511571851e2f3</para>
        /// </summary>
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 合约名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资产合约</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
