// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // zhima.customer.ep.identification.query
    // 在认证完成后,商户可以查询认证的状态和结果
    // 
    public class ZhimaQueryResp : TeaModel {
        // 认证的企业证件号
        /// <summary>
        /// <b>Example:</b>
        /// <para>91330000327827106L</para>
        /// </summary>
        [NameInMap("ep_cert_no")]
        [Validation(Required=false)]
        public string EpCertNo { get; set; }

        // 认证的企业名
        /// <summary>
        /// <b>Example:</b>
        /// <para>芝麻信用管理有限公司</para>
        /// </summary>
        [NameInMap("ep_name")]
        [Validation(Required=false)]
        public string EpName { get; set; }

        // 认证不通过的错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>BIZ_LICENSE_LEGAL_INFO_NO_MATCH</para>
        /// </summary>
        [NameInMap("failed_code")]
        [Validation(Required=false)]
        public string FailedCode { get; set; }

        // 认证是否通过，通过为true，不通过为false
        /// <summary>
        /// <b>Example:</b>
        /// <para>“true“,”false”</para>
        /// </summary>
        [NameInMap("passed")]
        [Validation(Required=false)]
        public string Passed { get; set; }

        //  10000是成功，其余是失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK/40002</para>
        /// </summary>
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        //  
        /// <summary>
        /// <b>Example:</b>
        /// <para>Success/Invalid Arguments</para>
        /// </summary>
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        //  
        /// <summary>
        /// <b>Example:</b>
        /// <para>isv.invalid-app-id</para>
        /// </summary>
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        //  
        /// <summary>
        /// <b>Example:</b>
        /// <para>无效的AppID参数</para>
        /// </summary>
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
