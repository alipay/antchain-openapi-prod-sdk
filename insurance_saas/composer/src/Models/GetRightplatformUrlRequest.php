<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetRightplatformUrlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 权益申请编号
    /**
     * @var string
     */
    public $rightApplyNo;

    // 申请额度，最多保留小数点后两位
    /**
     * @var string
     */
    public $applyLimitAmount;

    // 数据授权方名称
    /**
     * @var string
     */
    public $dataLicensor;

    // 回调场景方地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 用户姓名 加密后传输
    /**
     * @var string
     */
    public $tbrName;

    // 用户手机号，加密 && 脱敏传输
    /**
     * @var string
     */
    public $tbrPhone;

    // 身份证， 加密 && 脱敏传输
    /**
     * @var string
     */
    public $tbrIdCard;
    protected $_name = [
        'authToken'        => 'auth_token',
        'rightApplyNo'     => 'right_apply_no',
        'applyLimitAmount' => 'apply_limit_amount',
        'dataLicensor'     => 'data_licensor',
        'callbackUrl'      => 'callback_url',
        'productCode'      => 'product_code',
        'tbrName'          => 'tbr_name',
        'tbrPhone'         => 'tbr_phone',
        'tbrIdCard'        => 'tbr_id_card',
    ];

    public function validate()
    {
        Model::validateRequired('rightApplyNo', $this->rightApplyNo, true);
        Model::validateRequired('applyLimitAmount', $this->applyLimitAmount, true);
        Model::validateRequired('dataLicensor', $this->dataLicensor, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tbrName', $this->tbrName, true);
        Model::validateRequired('tbrPhone', $this->tbrPhone, true);
        Model::validateRequired('tbrIdCard', $this->tbrIdCard, true);
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
        if (null !== $this->dataLicensor) {
            $res['data_licensor'] = $this->dataLicensor;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->tbrName) {
            $res['tbr_name'] = $this->tbrName;
        }
        if (null !== $this->tbrPhone) {
            $res['tbr_phone'] = $this->tbrPhone;
        }
        if (null !== $this->tbrIdCard) {
            $res['tbr_id_card'] = $this->tbrIdCard;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRightplatformUrlRequest
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
        if (isset($map['data_licensor'])) {
            $model->dataLicensor = $map['data_licensor'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['tbr_name'])) {
            $model->tbrName = $map['tbr_name'];
        }
        if (isset($map['tbr_phone'])) {
            $model->tbrPhone = $map['tbr_phone'];
        }
        if (isset($map['tbr_id_card'])) {
            $model->tbrIdCard = $map['tbr_id_card'];
        }

        return $model;
    }
}
