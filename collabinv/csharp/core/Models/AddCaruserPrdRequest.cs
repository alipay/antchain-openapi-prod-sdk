// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class AddCaruserPrdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务的id
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public List<string> BusinessId { get; set; }

        // 数据的唯一code
        [NameInMap("data_uniqlo_code")]
        [Validation(Required=true)]
        public string DataUniqloCode { get; set; }

        // 批次数据编号
        [NameInMap("dat_phase_code")]
        [Validation(Required=true)]
        public string DatPhaseCode { get; set; }

        // 批次的数据量
        [NameInMap("data_num")]
        [Validation(Required=true)]
        public long? DataNum { get; set; }

        // 业务类型
        [NameInMap("business_type")]
        [Validation(Required=true)]
        public string BusinessType { get; set; }

    }

}
