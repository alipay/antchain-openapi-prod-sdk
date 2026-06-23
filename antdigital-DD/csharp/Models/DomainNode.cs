// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计量节点
    public class DomainNode : TeaModel {
        // node字段
        // 目前可选枚举：CENTER, ODPS, MANUAL, SLS;
        //   也可以自定义
        /// <summary>
        /// <b>Example:</b>
        /// <para>CENTER</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // node英文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>node英文名称</para>
        /// </summary>
        [NameInMap("english_name")]
        [Validation(Required=false)]
        public string EnglishName { get; set; }

        // 中文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>中文名称</para>
        /// </summary>
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // 默认需要check
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("need_check")]
        [Validation(Required=false)]
        public bool? NeedCheck { get; set; }

        // 默认超时时间,单位:m
        [NameInMap("time_out")]
        [Validation(Required=false)]
        public long? TimeOut { get; set; }

        // 描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>描述</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>VALID</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
