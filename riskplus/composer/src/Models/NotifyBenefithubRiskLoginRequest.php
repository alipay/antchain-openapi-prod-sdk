<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class NotifyBenefithubRiskLoginRequest extends Model
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

    // 平台码
    // 注：不同平台的平台码都是固定好的，如果传入的平台码有误会抛出平台码错误的信息
    /**
     * @var string
     */
    public $platformCode;

    // 用户id
    /**
     * @var string
     */
    public $userUniqueId;

    // 渠道、平台方推送的手机号
    /**
     * @var string
     */
    public $mobile;

    // 产品code必填，后续多产品时可以区分
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformCode'      => 'platform_code',
        'userUniqueId'      => 'user_unique_id',
        'mobile'            => 'mobile',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('platformCode', $this->platformCode, true);
        Model::validateRequired('userUniqueId', $this->userUniqueId, true);
        Model::validateRequired('mobile', $this->mobile, true);
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
        if (null !== $this->platformCode) {
            $res['platform_code'] = $this->platformCode;
        }
        if (null !== $this->userUniqueId) {
            $res['user_unique_id'] = $this->userUniqueId;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyBenefithubRiskLoginRequest
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
        if (isset($map['platform_code'])) {
            $model->platformCode = $map['platform_code'];
        }
        if (isset($map['user_unique_id'])) {
            $model->userUniqueId = $map['user_unique_id'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
