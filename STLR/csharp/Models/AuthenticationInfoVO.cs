// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 授权信息
    public class AuthenticationInfoVO : TeaModel {
        // 授权记录编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>授权记录编码</para>
        /// </summary>
        [NameInMap("authentication_no")]
        [Validation(Required=true)]
        public string AuthenticationNo { get; set; }

        // 收取方did
        /// <summary>
        /// <b>Example:</b>
        /// <para>收取方did</para>
        /// </summary>
        [NameInMap("authorizer_did")]
        [Validation(Required=true)]
        public string AuthorizerDid { get; set; }

        // 授权方名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>授权方名称</para>
        /// </summary>
        [NameInMap("authorizer_name")]
        [Validation(Required=true)]
        public string AuthorizerName { get; set; }

        // 被授权方did
        /// <summary>
        /// <b>Example:</b>
        /// <para>被授权方did</para>
        /// </summary>
        [NameInMap("authorized_did")]
        [Validation(Required=true)]
        public string AuthorizedDid { get; set; }

        // 被授权方名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>被授权方名称</para>
        /// </summary>
        [NameInMap("authorized_name")]
        [Validation(Required=true)]
        public string AuthorizedName { get; set; }

        // 数据协作类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>数据协作类型</para>
        /// </summary>
        [NameInMap("data_transfer_type")]
        [Validation(Required=true)]
        public string DataTransferType { get; set; }

        // 授权详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("authentication_deetail")]
        [Validation(Required=true)]
        public string AuthenticationDeetail { get; set; }

        // 授权状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>Approved：审批通过   Approving：待审批 NotApproved：审批不通过 Cancelled: 取消授权</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
