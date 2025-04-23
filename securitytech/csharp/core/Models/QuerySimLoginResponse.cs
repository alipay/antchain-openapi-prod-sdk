// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QuerySimLoginResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 登录结果
        // NO_RESULT：暂无登录结果
        // EXPIRED：token过期
        // ACTIVATE_OK：激活成功，店长首次登录成功
        // LOGIN_OK：登录成功
        // USER_NOT_EXIST：用户不存在
        // STORE_NOT_ACTIVATED：门店未激活
        [NameInMap("login_result")]
        [Validation(Required=false)]
        public string LoginResult { get; set; }

        // 登录结果中文信息
        [NameInMap("login_msg")]
        [Validation(Required=false)]
        public string LoginMsg { get; set; }

        // 是否已经激活
        [NameInMap("activated")]
        [Validation(Required=false)]
        public bool? Activated { get; set; }

        // 激活时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("activate_time")]
        [Validation(Required=false)]
        public string ActivateTime { get; set; }

        // 登录/激活时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("login_time")]
        [Validation(Required=false)]
        public string LoginTime { get; set; }

        // 当前登录的门店信息
        [NameInMap("store_info")]
        [Validation(Required=false)]
        public SimStoreInfo StoreInfo { get; set; }

        // 当前登录的销售信息
        [NameInMap("sales_info")]
        [Validation(Required=false)]
        public SimSalesInfo SalesInfo { get; set; }

    }

}
