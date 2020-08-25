<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractFlowSigner extends Model {
    protected $_name = [
        'signerAccountId' => 'signer_account_id',
        'signerAuthorizedAccountId' => 'signer_authorized_account_id',
        'signerAuthorizedAccountName' => 'signer_authorized_account_name',
        'signerAuthorizedAccountRealName' => 'signer_authorized_account_real_name',
        'signerAuthorizedAccountType' => 'signer_authorized_account_type',
        'signerName' => 'signer_name',
        'signerRealName' => 'signer_real_name',
        'signOrder' => 'sign_order',
        'signStatus' => 'sign_status',
        'thirdOrderNo' => 'third_order_no',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->signerAccountId) {
            $res['signer_account_id'] = $this->signerAccountId;
        }
        if (null !== $this->signerAuthorizedAccountId) {
            $res['signer_authorized_account_id'] = $this->signerAuthorizedAccountId;
        }
        if (null !== $this->signerAuthorizedAccountName) {
            $res['signer_authorized_account_name'] = $this->signerAuthorizedAccountName;
        }
        if (null !== $this->signerAuthorizedAccountRealName) {
            $res['signer_authorized_account_real_name'] = $this->signerAuthorizedAccountRealName;
        }
        if (null !== $this->signerAuthorizedAccountType) {
            $res['signer_authorized_account_type'] = $this->signerAuthorizedAccountType;
        }
        if (null !== $this->signerName) {
            $res['signer_name'] = $this->signerName;
        }
        if (null !== $this->signerRealName) {
            $res['signer_real_name'] = $this->signerRealName;
        }
        if (null !== $this->signOrder) {
            $res['sign_order'] = $this->signOrder;
        }
        if (null !== $this->signStatus) {
            $res['sign_status'] = $this->signStatus;
        }
        if (null !== $this->thirdOrderNo) {
            $res['third_order_no'] = $this->thirdOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContractFlowSigner
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['signer_account_id'])){
            $model->signerAccountId = $map['signer_account_id'];
        }
        if(isset($map['signer_authorized_account_id'])){
            $model->signerAuthorizedAccountId = $map['signer_authorized_account_id'];
        }
        if(isset($map['signer_authorized_account_name'])){
            $model->signerAuthorizedAccountName = $map['signer_authorized_account_name'];
        }
        if(isset($map['signer_authorized_account_real_name'])){
            $model->signerAuthorizedAccountRealName = $map['signer_authorized_account_real_name'];
        }
        if(isset($map['signer_authorized_account_type'])){
            $model->signerAuthorizedAccountType = $map['signer_authorized_account_type'];
        }
        if(isset($map['signer_name'])){
            $model->signerName = $map['signer_name'];
        }
        if(isset($map['signer_real_name'])){
            $model->signerRealName = $map['signer_real_name'];
        }
        if(isset($map['sign_order'])){
            $model->signOrder = $map['sign_order'];
        }
        if(isset($map['sign_status'])){
            $model->signStatus = $map['sign_status'];
        }
        if(isset($map['third_order_no'])){
            $model->thirdOrderNo = $map['third_order_no'];
        }
        return $model;
    }
    // 签署人账号id
    /**
     * @example 24c93459216945468fdf1d899c521910
     * @var string
     */
    public $signerAccountId;

    // 签约主体的账号id（个人/企业）；如签署人本签署，则返回签署人账号id；如签署人代机构签署，则返回机构账号id
    /**
     * @example 2c7de24aff3340f5b944ebac49545b8e
     * @var string
     */
    public $signerAuthorizedAccountId;

    // 签约主体名称
    /**
     * @example 深圳天谷信息科技有限公司
     * @var string
     */
    public $signerAuthorizedAccountName;

    // 签署主体是否已实名
    /**
     * @example true, false
     * @var bool
     */
    public $signerAuthorizedAccountRealName;

    // 签署主体类型, 0-个人, 1-机构
    /**
     * @example 1
     * @var int
     */
    public $signerAuthorizedAccountType;

    // 签署人名称
    /**
     * @example 孙中
     * @var string
     */
    public $signerName;

    // 签署人是否已实名
    /**
     * @example true, false
     * @var bool
     */
    public $signerRealName;

    // 签署顺序
    /**
     * @example 1
     * @var int
     */
    public $signOrder;

    // 签署状态, 0-待签, 1-未签, 2-已签 3-待审批 4-拒签
    /**
     * @example 1
     * @var int
     */
    public $signStatus;

    // 本次签署任务对应指定的第三方业务流水号id，当存在多个第三方业务流水号id时，返回多个，并逗号隔开
    /**
     * @example  
     * @var string
     */
    public $thirdOrderNo;

}
