// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-图片
    public class MaoImages : TeaModel {
        // 营业执照
        /// <summary>
        /// <b>Example:</b>
        /// <para>营业执照</para>
        /// </summary>
        [NameInMap("business_license")]
        [Validation(Required=true)]
        public string BusinessLicense { get; set; }

        // 门头照
        /// <summary>
        /// <b>Example:</b>
        /// <para>门头照</para>
        /// </summary>
        [NameInMap("storefront")]
        [Validation(Required=false)]
        public string Storefront { get; set; }

        // 环境照
        /// <summary>
        /// <b>Example:</b>
        /// <para>环境照</para>
        /// </summary>
        [NameInMap("environment")]
        [Validation(Required=false)]
        public string Environment { get; set; }

        // 前台照
        /// <summary>
        /// <b>Example:</b>
        /// <para>前台照</para>
        /// </summary>
        [NameInMap("front_desk")]
        [Validation(Required=false)]
        public string FrontDesk { get; set; }

        // 法人身份证人像面
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人身份证人像面</para>
        /// </summary>
        [NameInMap("id_card_front")]
        [Validation(Required=false)]
        public string IdCardFront { get; set; }

        // 法人身份证国徽面
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人身份证国徽面</para>
        /// </summary>
        [NameInMap("id_card_back")]
        [Validation(Required=false)]
        public string IdCardBack { get; set; }

    }

}
