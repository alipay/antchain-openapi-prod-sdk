<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_3d5ac8b5948b43e7a7b8f62c44a6880f\Models;

use AlibabaCloud\Tea\Model;

class StartBlockchainArecRcpMgRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 待签署的合同列表
    /**
     * @var Agreement[]
     */
    public $agreements;

    // 材料清单列表
    /**
     * @var Archive[]
     */
    public $archives;

    // 合同变量和值的全集，Map<String,String>的json格式
    /**
     * @var string
     */
    public $arVarValueJson;

    // 银行编号
    /**
     * @var string
     */
    public $bankNo;

    // 借款人
    /**
     * @var Person
     */
    public $borrower;

    // 扩展字段
    /**
     * @var string
     */
    public $extendJson;

    // 抵押房产
    /**
     * @var House
     */
    public $house;

    // 婚姻状况,比如：MARRIED=已婚
    /**
     * @var string
     */
    public $maritalStatus;

    // 外部业务单号，银行提供
    /**
     * @var string
     */
    public $outBizNo;

    // 登记设立原因，比如：LOAN=借贷
    /**
     * @var string
     */
    public $regReason;

    // 登记设立原因备注
    /**
     * @var string
     */
    public $regReasonRemark;

    // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
    /**
     * @var string
     */
    public $regRights;

    // 登记类型，比如：FIRST_REG=首次登记
    /**
     * @var string
     */
    public $regType;

    // 配偶
    /**
     * @var Person
     */
    public $spouse;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agreements'        => 'agreements',
        'archives'          => 'archives',
        'arVarValueJson'    => 'ar_var_value_json',
        'bankNo'            => 'bank_no',
        'borrower'          => 'borrower',
        'extendJson'        => 'extend_json',
        'house'             => 'house',
        'maritalStatus'     => 'marital_status',
        'outBizNo'          => 'out_biz_no',
        'regReason'         => 'reg_reason',
        'regReasonRemark'   => 'reg_reason_remark',
        'regRights'         => 'reg_rights',
        'regType'           => 'reg_type',
        'spouse'            => 'spouse',
    ];

    public function validate()
    {
        Model::validateRequired('agreements', $this->agreements, true);
        Model::validateRequired('arVarValueJson', $this->arVarValueJson, true);
        Model::validateRequired('bankNo', $this->bankNo, true);
        Model::validateRequired('borrower', $this->borrower, true);
        Model::validateRequired('house', $this->house, true);
        Model::validateRequired('maritalStatus', $this->maritalStatus, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('regReason', $this->regReason, true);
        Model::validateRequired('regRights', $this->regRights, true);
        Model::validateRequired('regType', $this->regType, true);
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
        if (null !== $this->arVarValueJson) {
            $res['ar_var_value_json'] = $this->arVarValueJson;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->borrower) {
            $res['borrower'] = null !== $this->borrower ? $this->borrower->toMap() : null;
        }
        if (null !== $this->extendJson) {
            $res['extend_json'] = $this->extendJson;
        }
        if (null !== $this->house) {
            $res['house'] = null !== $this->house ? $this->house->toMap() : null;
        }
        if (null !== $this->maritalStatus) {
            $res['marital_status'] = $this->maritalStatus;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->regReason) {
            $res['reg_reason'] = $this->regReason;
        }
        if (null !== $this->regReasonRemark) {
            $res['reg_reason_remark'] = $this->regReasonRemark;
        }
        if (null !== $this->regRights) {
            $res['reg_rights'] = $this->regRights;
        }
        if (null !== $this->regType) {
            $res['reg_type'] = $this->regType;
        }
        if (null !== $this->spouse) {
            $res['spouse'] = null !== $this->spouse ? $this->spouse->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartBlockchainArecRcpMgRequest
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
        if (isset($map['ar_var_value_json'])) {
            $model->arVarValueJson = $map['ar_var_value_json'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['borrower'])) {
            $model->borrower = Person::fromMap($map['borrower']);
        }
        if (isset($map['extend_json'])) {
            $model->extendJson = $map['extend_json'];
        }
        if (isset($map['house'])) {
            $model->house = House::fromMap($map['house']);
        }
        if (isset($map['marital_status'])) {
            $model->maritalStatus = $map['marital_status'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['reg_reason'])) {
            $model->regReason = $map['reg_reason'];
        }
        if (isset($map['reg_reason_remark'])) {
            $model->regReasonRemark = $map['reg_reason_remark'];
        }
        if (isset($map['reg_rights'])) {
            $model->regRights = $map['reg_rights'];
        }
        if (isset($map['reg_type'])) {
            $model->regType = $map['reg_type'];
        }
        if (isset($map['spouse'])) {
            $model->spouse = Person::fromMap($map['spouse']);
        }

        return $model;
    }
}
