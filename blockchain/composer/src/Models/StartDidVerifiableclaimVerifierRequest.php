<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidVerifiableclaimVerifierRequest extends Model
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

    // 用于零知识证明类型的可验证声明的验证。index是对应于完整VC的一个json字符串，其中key值保持和原始VC一致，value如果是1表示verificate_claim对应key携带的是对应field的原始值，而如果Key的value是0表示verificate_claim对应key携带的是对应field的merkle root值。
    /**
     * @var string
     */
    public $indexs;

    // 可验证声明
    /**
     * @var string
     */
    public $verifiableClaim;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'indexs'            => 'indexs',
        'verifiableClaim'   => 'verifiable_claim',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('verifiableClaim', $this->verifiableClaim, true);
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
        if (null !== $this->indexs) {
            $res['indexs'] = $this->indexs;
        }
        if (null !== $this->verifiableClaim) {
            $res['verifiable_claim'] = $this->verifiableClaim;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidVerifiableclaimVerifierRequest
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
        if (isset($map['indexs'])) {
            $model->indexs = $map['indexs'];
        }
        if (isset($map['verifiable_claim'])) {
            $model->verifiableClaim = $map['verifiable_claim'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
