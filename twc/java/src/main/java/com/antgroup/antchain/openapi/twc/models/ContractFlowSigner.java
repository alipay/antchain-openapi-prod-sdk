// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractFlowSigner extends TeaModel {
    // 签署顺序
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sign_order")
    public Long signOrder;

    // 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sign_status")
    public Long signStatus;

    // 签署人账号id
    /**
     * <strong>example:</strong>
     * <p>24c93459216945468fdf1d899c521910</p>
     */
    @NameInMap("signer_account_id")
    public String signerAccountId;

    // 签署人名称
    /**
     * <strong>example:</strong>
     * <p>孙中</p>
     */
    @NameInMap("signer_name")
    public String signerName;

    // 签署人是否已实名
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("signer_real_name")
    public Boolean signerRealName;

    // 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
    /**
     * <strong>example:</strong>
     * <p>2c7de24aff3340f5b944ebac49545b8e</p>
     */
    @NameInMap("signer_authorized_account_id")
    public String signerAuthorizedAccountId;

    // 签约主体名称
    /**
     * <strong>example:</strong>
     * <p>深圳天谷信息科技有限公司</p>
     */
    @NameInMap("signer_authorized_account_name")
    public String signerAuthorizedAccountName;

    // 签署主体是否已实名
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("signer_authorized_account_real_name")
    public Boolean signerAuthorizedAccountRealName;

    // 签署主体类型, 0-个人, 1-机构
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("signer_authorized_account_type")
    public Long signerAuthorizedAccountType;

    // 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    public static ContractFlowSigner build(java.util.Map<String, ?> map) throws Exception {
        ContractFlowSigner self = new ContractFlowSigner();
        return TeaModel.build(map, self);
    }

    public ContractFlowSigner setSignOrder(Long signOrder) {
        this.signOrder = signOrder;
        return this;
    }
    public Long getSignOrder() {
        return this.signOrder;
    }

    public ContractFlowSigner setSignStatus(Long signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public Long getSignStatus() {
        return this.signStatus;
    }

    public ContractFlowSigner setSignerAccountId(String signerAccountId) {
        this.signerAccountId = signerAccountId;
        return this;
    }
    public String getSignerAccountId() {
        return this.signerAccountId;
    }

    public ContractFlowSigner setSignerName(String signerName) {
        this.signerName = signerName;
        return this;
    }
    public String getSignerName() {
        return this.signerName;
    }

    public ContractFlowSigner setSignerRealName(Boolean signerRealName) {
        this.signerRealName = signerRealName;
        return this;
    }
    public Boolean getSignerRealName() {
        return this.signerRealName;
    }

    public ContractFlowSigner setSignerAuthorizedAccountId(String signerAuthorizedAccountId) {
        this.signerAuthorizedAccountId = signerAuthorizedAccountId;
        return this;
    }
    public String getSignerAuthorizedAccountId() {
        return this.signerAuthorizedAccountId;
    }

    public ContractFlowSigner setSignerAuthorizedAccountName(String signerAuthorizedAccountName) {
        this.signerAuthorizedAccountName = signerAuthorizedAccountName;
        return this;
    }
    public String getSignerAuthorizedAccountName() {
        return this.signerAuthorizedAccountName;
    }

    public ContractFlowSigner setSignerAuthorizedAccountRealName(Boolean signerAuthorizedAccountRealName) {
        this.signerAuthorizedAccountRealName = signerAuthorizedAccountRealName;
        return this;
    }
    public Boolean getSignerAuthorizedAccountRealName() {
        return this.signerAuthorizedAccountRealName;
    }

    public ContractFlowSigner setSignerAuthorizedAccountType(Long signerAuthorizedAccountType) {
        this.signerAuthorizedAccountType = signerAuthorizedAccountType;
        return this;
    }
    public Long getSignerAuthorizedAccountType() {
        return this.signerAuthorizedAccountType;
    }

    public ContractFlowSigner setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

}
