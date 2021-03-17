<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class ConfirmRcpMgvtwoRequest extends Model
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

    // 房产链抵押单号
    /**
     * @var string
     */
    public $mgOrderNo;

    // 确认抵押结果，Y:继续抵押,N:终止抵押
    /**
     * @var string
     */
    public $result;

    // 终止抵押原因code
    /**
     * @var string
     */
    public $failCode;

    // 终止抵押原因desc
    /**
     * @var string
     */
    public $failDesc;

    // 借款人
    /**
     * @var Person
     */
    public $borrower;

    // 婚姻状况,MARRIED=已婚
    /**
     * @var string
     */
    public $maritalStatus;

    // 借款人配偶
    /**
     * @var Person
     */
    public $spouse;

    // 银行签署完成的合同列表
    /**
     * @var Agreement[]
     */
    public $agreements;

    // 确认抵押需要的影印材料列表
    /**
     * @var Archive[]
     */
    public $archives;

    // 登记权利类型，MORTGAGE_RIGHTS=抵押权
    /**
     * @var string
     */
    public $regRights;

    // 登记类型,FIRSTMAXGAGE_BIZTYPE=不动产抵押权首次登记(最高额抵押)
    /**
     * @var string
     */
    public $regType;

    // 登记设立原因,LOAN=借贷
    /**
     * @var string
     */
    public $regReason;

    // 登记设立原因备注
    /**
     * @var string
     */
    public $regReasonRemark;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'loanAssistPlatform' => 'loan_assist_platform',
        'bankNo'             => 'bank_no',
        'mgOrderNo'          => 'mg_order_no',
        'result'             => 'result',
        'failCode'           => 'fail_code',
        'failDesc'           => 'fail_desc',
        'borrower'           => 'borrower',
        'maritalStatus'      => 'marital_status',
        'spouse'             => 'spouse',
        'agreements'         => 'agreements',
        'archives'           => 'archives',
        'regRights'          => 'reg_rights',
        'regType'            => 'reg_type',
        'regReason'          => 'reg_reason',
        'regReasonRemark'    => 'reg_reason_remark',
    ];

    public function validate()
    {
        Model::validateRequired('loanAssistPlatform', $this->loanAssistPlatform, true);
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('mgOrderNo', $this->mgOrderNo, true);
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('borrower', $this->borrower, true);
        Model::validateRequired('maritalStatus', $this->maritalStatus, true);
        Model::validateRequired('agreements', $this->agreements, true);
        Model::validateRequired('archives', $this->archives, true);
        Model::validateRequired('regRights', $this->regRights, true);
        Model::validateRequired('regType', $this->regType, true);
        Model::validateRequired('regReason', $this->regReason, true);
        Model::validateRequired('regReasonRemark', $this->regReasonRemark, true);
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
        if (null !== $this->mgOrderNo) {
            $res['mg_order_no'] = $this->mgOrderNo;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->failCode) {
            $res['fail_code'] = $this->failCode;
        }
        if (null !== $this->failDesc) {
            $res['fail_desc'] = $this->failDesc;
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
        if (null !== $this->agreements) {
            $res['agreements'] = [];
            if (null !== $this->agreements && \is_array($this->agreements)) {
                $n = 0;
                foreach ($this->agreements as $item) {
                    $res['agreements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->archives) {
            $res['archives'] = [];
            if (null !== $this->archives && \is_array($this->archives)) {
                $n = 0;
                foreach ($this->archives as $item) {
                    $res['archives'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->regRights) {
            $res['reg_rights'] = $this->regRights;
        }
        if (null !== $this->regType) {
            $res['reg_type'] = $this->regType;
        }
        if (null !== $this->regReason) {
            $res['reg_reason'] = $this->regReason;
        }
        if (null !== $this->regReasonRemark) {
            $res['reg_reason_remark'] = $this->regReasonRemark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmRcpMgvtwoRequest
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
        if (isset($map['mg_order_no'])) {
            $model->mgOrderNo = $map['mg_order_no'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['fail_code'])) {
            $model->failCode = $map['fail_code'];
        }
        if (isset($map['fail_desc'])) {
            $model->failDesc = $map['fail_desc'];
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
        if (isset($map['agreements'])) {
            if (!empty($map['agreements'])) {
                $model->agreements = [];
                $n                 = 0;
                foreach ($map['agreements'] as $item) {
                    $model->agreements[$n++] = null !== $item ? Agreement::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['archives'])) {
            if (!empty($map['archives'])) {
                $model->archives = [];
                $n               = 0;
                foreach ($map['archives'] as $item) {
                    $model->archives[$n++] = null !== $item ? Archive::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['reg_rights'])) {
            $model->regRights = $map['reg_rights'];
        }
        if (isset($map['reg_type'])) {
            $model->regType = $map['reg_type'];
        }
        if (isset($map['reg_reason'])) {
            $model->regReason = $map['reg_reason'];
        }
        if (isset($map['reg_reason_remark'])) {
            $model->regReasonRemark = $map['reg_reason_remark'];
        }

        return $model;
    }
}
