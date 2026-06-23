// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 主键规则配置
    public class PrimaryKeyGenRule : TeaModel {
        // 规则code
        /// <summary>
        /// <b>Example:</b>
        /// <para>test;instance</para>
        /// </summary>
        [NameInMap("rule_code")]
        [Validation(Required=false)]
        public string RuleCode { get; set; }

        // 规则名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>主键规则</para>
        /// </summary>
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // 规则englishName
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("english_name")]
        [Validation(Required=false)]
        public string EnglishName { get; set; }

        // 规则包括的fiel列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>field1,field2,field3</para>
        /// </summary>
        [NameInMap("primary_keys")]
        [Validation(Required=false)]
        public string PrimaryKeys { get; set; }

    }

}
