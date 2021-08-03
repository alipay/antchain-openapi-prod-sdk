// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 公积金中心省市列表
    public class TdmCpfProvinceVO : TeaModel {
        // 省编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 省名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 公积金中心列表
        [NameInMap("areas")]
        [Validation(Required=true)]
        public List<TdmCpfCitysVO> Areas { get; set; }

    }

}
