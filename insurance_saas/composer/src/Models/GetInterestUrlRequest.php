<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetInterestUrlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 权益申请编号，重新提交需要不一样
    /**
     * @var string
     */
    public $rightApplyNo;

    //
    // 申请额度，最多保留小数点后两位，单位元
    /**
     * @var string
     */
    public $applyLimitAmount;

    //
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

    // 权益产品编码，暂时固定
    /**
     * @var string
     */
    public $productCode;

    // 用户姓名 明文
    /**
     * @var string
     */
    public $tbrName;

    // 用户手机号，明文
    /**
     * @var string
     */
    public $tbrPhone;

    // 用户身份证，明文
    /**
     * @var string
     */
    public $tbrIdCard;

    // 场景方信息,JSON字符串
    /**
     * @var string
     */
    public $sceneInfo;

    // 权益版本
    /**
     * @var string
     */
    public $interestVersion;

    // 产品信息
    /**
     * @var string
     */
    public $productInfo;
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
        'sceneInfo'        => 'scene_info',
        'interestVersion'  => 'interest_version',
        'productInfo'      => 'product_info',
    ];

    public function validate()
    {
        Model::validateRequired('rightApplyNo', $this->rightApplyNo, true);
        Model::validateRequired('applyLimitAmount', $this->applyLimitAmount, true);
        Model::validateRequired('dataLicensor', $this->dataLicensor, true);
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
        if (null !== $this->sceneInfo) {
            $res['scene_info'] = $this->sceneInfo;
        }
        if (null !== $this->interestVersion) {
            $res['interest_version'] = $this->interestVersion;
        }
        if (null !== $this->productInfo) {
            $res['product_info'] = $this->productInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInterestUrlRequest
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
        if (isset($map['scene_info'])) {
            $model->sceneInfo = $map['scene_info'];
        }
        if (isset($map['interest_version'])) {
            $model->interestVersion = $map['interest_version'];
        }
        if (isset($map['product_info'])) {
            $model->productInfo = $map['product_info'];
        }

        return $model;
    }
}
