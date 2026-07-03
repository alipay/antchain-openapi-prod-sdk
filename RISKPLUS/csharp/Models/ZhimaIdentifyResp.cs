// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 芝麻四要素认证接口
    public class ZhimaIdentifyResp : TeaModel {
        // 唯一ID，接口正常的话有此字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZM201505190ad422641448624704506270407</para>
        /// </summary>
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 带参数的回调地址，接口正常的话有此字段
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&sign=dsgdsfhgdsfh">http://zmmcportal.stable.zhimaxy.net/index.htm?biz_content=%7B%22biz_no%22%3A%225f491814480fafe7dc0779a1c452c9f7%22%7D&amp;sign=dsgdsfhgdsfh</a></para>
        /// </summary>
        [NameInMap("certify_url")]
        [Validation(Required=false)]
        public string CertifyUrl { get; set; }

        // 蚂蚁调用芝麻的错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK</para>
        /// </summary>
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // 蚂蚁调用芝麻的结果描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>Success/Invalid Arguments</para>
        /// </summary>
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        // 蚂蚁调用芝麻的错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>isv.invalid-app-id</para>
        /// </summary>
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 蚂蚁调用芝麻信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>无效的AppID参数</para>
        /// </summary>
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
