<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class CheckAntchainBbpVerifyRequest extends Model
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

    // 核身上下文id
    /**
     * @var string
     */
    public $verifyId;

    // 核身模块分组
    /**
     * @var string
     */
    public $group;

    // 核身动作：view-渲染，verify-校验，repeat-重新发送
    /**
     * @var string
     */
    public $productAction;

    // 业务id
    /**
     * @var string
     */
    public $bizId;

    // 核身产品码
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'verifyId'          => 'verify_id',
        'group'             => 'group',
        'productAction'     => 'product_action',
        'bizId'             => 'biz_id',
        'productCode'       => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('verifyId', $this->verifyId, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('productAction', $this->productAction, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->productAction) {
            $res['product_action'] = $this->productAction;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntchainBbpVerifyRequest
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
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['product_action'])) {
            $model->productAction = $map['product_action'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
