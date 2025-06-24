// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class ClickAdDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 广告主id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public long? AccountId { get; set; }

        // 渠道，支持TENCENT
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 曝光/点击明细json string,曝光数据{\"impression_id\":\"dfhufhuifah\",\"impression_time\":1586437361}
        // 点击数据{\"click_id\":\"dfhufaffhuifah\,"\"click_time\":1586437361}
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 点击-CLICK，曝光-IMPRESSION
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

    }

}
