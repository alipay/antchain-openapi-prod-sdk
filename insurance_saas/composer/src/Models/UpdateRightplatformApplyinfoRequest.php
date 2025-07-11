<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateRightplatformApplyinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 申请权益编号
    /**
     * @var string
     */
    public $rightApplyNo;

    // 申请额度
    /**
     * @var string
     */
    public $applyLimitAmount;

    // 申请额度状态
    /**
     * @var string
     */
    public $applyStatus;

    // 投保信息，json字符串
    /**
     * @var string
     */
    public $applyInfo;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'        => 'auth_token',
        'rightApplyNo'     => 'right_apply_no',
        'applyLimitAmount' => 'apply_limit_amount',
        'applyStatus'      => 'apply_status',
        'applyInfo'        => 'apply_info',
        'productCode'      => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('rightApplyNo', $this->rightApplyNo, true);
        Model::validateRequired('applyLimitAmount', $this->applyLimitAmount, true);
        Model::validateRequired('applyStatus', $this->applyStatus, true);
        Model::validateRequired('applyInfo', $this->applyInfo, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->rightApplyNo) {
            $res['right_apply_no'] = $this->rightApplyNo;
        }
        if (null !== $this->applyLimitAmount) {
            $res['apply_limit_amount'] = $this->applyLimitAmount;
        }
        if (null !== $this->applyStatus) {
            $res['apply_status'] = $this->applyStatus;
        }
        if (null !== $this->applyInfo) {
            $res['apply_info'] = $this->applyInfo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateRightplatformApplyinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['right_apply_no'])) {
            $model->rightApplyNo = $map['right_apply_no'];
        }
        if (isset($map['apply_limit_amount'])) {
            $model->applyLimitAmount = $map['apply_limit_amount'];
        }
        if (isset($map['apply_status'])) {
            $model->applyStatus = $map['apply_status'];
        }
        if (isset($map['apply_info'])) {
            $model->applyInfo = $map['apply_info'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
