<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class StartRcpMgvtwoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 助贷平台
    /**
     * @var string
     */
    public $loanAssistPlatform;

    // 房产链内部银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 外部业务单号
    /**
     * @var string
     */
    public $outBizNo;

    // 借款人
    /**
     * @var Person
     */
    public $borrower;

    // 婚姻状况
    /**
     * @var string
     */
    public $maritalStatus;

    // 借款人配偶
    /**
     * @var Person
     */
    public $spouse;

    // 房产信息
    /**
     * @var House
     */
    public $house;

    // 待签合同列表
    /**
     * @var Agreement[]
     */
    public $agreements;

    // 客户签署合同过期时间
    /**
     * @var string
     */
    public $arExpireTime;

    // 抵押担保信息
    /**
     * @var MortGuaranteeInfo
     */
    public $mgOrderMortGuarantee;

    // 办理业务分支行
    /**
     * @var Bank
     */
    public $branchBank;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'loanAssistPlatform'   => 'loan_assist_platform',
        'bankNo'               => 'bank_no',
        'outBizNo'             => 'out_biz_no',
        'borrower'             => 'borrower',
        'maritalStatus'        => 'marital_status',
        'spouse'               => 'spouse',
        'house'                => 'house',
        'agreements'           => 'agreements',
        'arExpireTime'         => 'ar_expire_time',
        'mgOrderMortGuarantee' => 'mg_order_mort_guarantee',
        'branchBank'           => 'branch_bank',
    ];

    public function validate()
    {
        Model::validatePattern('arExpireTime', $this->arExpireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->loanAssistPlatform) {
            $res['loan_assist_platform'] = $this->loanAssistPlatform;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->borrower) {
            $res['borrower'] = null !== $this->borrower ? $this->borrower->toMap() : null;
        }
        if (null !== $this->maritalStatus) {
            $res['marital_status'] = $this->maritalStatus;
        }
        if (null !== $this->spouse) {
            $res['spouse'] = null !== $this->spouse ? $this->spouse->toMap() : null;
        }
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }
        if (null !== $this->agreements) {
            $res['agreements'] = [];
            if (null !== $this->agreements && \is_array($this->agreements)) {
                $n = 0;
                foreach ($this->agreements as $item) {
                    $res['agreements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->arExpireTime) {
            $res['ar_expire_time'] = $this->arExpireTime;
        }
        if (null !== $this->mgOrderMortGuarantee) {
            $res['mg_order_mort_guarantee'] = null !== $this->mgOrderMortGuarantee ? $this->mgOrderMortGuarantee->toMap() : null;
        }
        if (null !== $this->branchBank) {
            $res['branch_bank'] = null !== $this->branchBank ? $this->branchBank->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartRcpMgvtwoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['loan_assist_platform'])) {
            $model->loanAssistPlatform = $map['loan_assist_platform'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['borrower'])) {
            $model->borrower = Person::fromMap($map['borrower']);
        }
        if (isset($map['marital_status'])) {
            $model->maritalStatus = $map['marital_status'];
        }
        if (isset($map['spouse'])) {
            $model->spouse = Person::fromMap($map['spouse']);
        }
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }
        if (isset($map['agreements'])) {
            if (!empty($map['agreements'])) {
                $model->agreements = [];
                $n                 = 0;
                foreach ($map['agreements'] as $item) {
                    $model->agreements[$n++] = null !== $item ? Agreement::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ar_expire_time'])) {
            $model->arExpireTime = $map['ar_expire_time'];
        }
        if (isset($map['mg_order_mort_guarantee'])) {
            $model->mgOrderMortGuarantee = MortGuaranteeInfo::fromMap($map['mg_order_mort_guarantee']);
        }
        if (isset($map['branch_bank'])) {
            $model->branchBank = Bank::fromMap($map['branch_bank']);
        }

        return $model;
    }
}
