// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // dci作品发表信息
    public class DciPublicationInfo : TeaModel {
        // 作品发表状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>PUBLISHED</para>
        /// </summary>
        [NameInMap("publication_status")]
        [Validation(Required=true)]
        public string PublicationStatus { get; set; }

        // 首次发表日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd</para>
        /// </summary>
        [NameInMap("first_publication_date")]
        [Validation(Required=true)]
        public string FirstPublicationDate { get; set; }

        // 首次发表地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州</para>
        /// </summary>
        [NameInMap("first_publication_place")]
        [Validation(Required=false)]
        public string FirstPublicationPlace { get; set; }

        // 首次发表地点地区编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>110101</para>
        /// </summary>
        [NameInMap("first_publication_code")]
        [Validation(Required=true)]
        public string FirstPublicationCode { get; set; }

    }

}
