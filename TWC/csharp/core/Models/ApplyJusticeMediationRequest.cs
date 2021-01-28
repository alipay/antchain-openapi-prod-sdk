// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyJusticeMediationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构码 由蚂蚁分配
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 法院代码 由蚂蚁提供
        [NameInMap("court_code")]
        [Validation(Required=true)]
        public string CourtCode { get; set; }

        // 案件内容 JsonString 格式
        // {"agencyRelations":[{"litigantId":"","agencyId":"","authority":""}],"agents":[{"seqNo":"","entityPosition":0,"name":"","cardType":"","cardNo":"","mobile":"","email":"","relationShip":"","curAddress":"","firmName":"","identityFiles":[{"gdFileId":"","fileName":"","type":""}]}],"caseInfo":{"caseNumber":"","mediateOrganizationCode":"","actionCode":"","productCode":"","mediateType":"","amount":0,"fact":"","accuserAppeal":"","caseDescription":"","mediationFiles":[{"gdFileId":"","fileName":"","type":""}]},"litigants":{"legalPersons":[{"seqNo":"","entityPosition":0,"role":"","companyName":"","cardType":"","cardNo":"","legalPresentName":"","legalPresentCardType":"","legalPresentCardNo":"","legalPresentJob":"","legalPresentJobOther":"","contactName":"","contactMobile":"","contactEmail":"","companyAddress":"","emailAddress":"","identityFiles":[{"gdFileId":"","fileName":"","type":""}]}],"normalPersons":[{"seqNo":"","entityPosition":0,"role":"","name":"","cardType":"","cardNo":"","nation":"","curAddress":"","emailAddress":"","mobile":"","email":"","identityFiles":[{"gdFileId":"","fileName":"","type":""}]}]}}
        [NameInMap("case_body")]
        [Validation(Required=true)]
        public string CaseBody { get; set; }

    }

}
