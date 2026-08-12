// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 当前页操作员列表
    public class OperatorList : TeaModel {
        // 操作员 ID。
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 操作员姓名。
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("operator_name")]
        [Validation(Required=false)]
        public string OperatorName { get; set; }

        // 登录邮箱。
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 手机号。
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("cell_phone")]
        [Validation(Required=false)]
        public string CellPhone { get; set; }

        // 昵称。
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 操作员状态。
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
