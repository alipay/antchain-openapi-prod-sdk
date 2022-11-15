// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class GetDomesticTrademarklogoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集ID
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 商标注册证号
        [NameInMap("tm_reg_num")]
        [Validation(Required=true)]
        public string TmRegNum { get; set; }

        // 商标类别
        [NameInMap("tm_form_type")]
        [Validation(Required=true)]
        public string TmFormType { get; set; }

    }

}
