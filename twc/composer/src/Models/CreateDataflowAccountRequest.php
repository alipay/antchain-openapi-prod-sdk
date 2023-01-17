<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateDataflowAccountRequest extends Model
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

    // 链上账号名称，真实名称会在前加租户ID
    /**
     * @var string
     */
    public $thirdPartyAccountId;

    // 账户密钥算法
    /**
     * @var string
     */
    public $keyAlgorithm;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'thirdPartyAccountId' => 'third_party_account_id',
        'keyAlgorithm'        => 'key_algorithm',
    ];

    public function validate()
    {
        Model::validateRequired('thirdPartyAccountId', $this->thirdPartyAccountId, true);
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
        if (null !== $this->thirdPartyAccountId) {
            $res['third_party_account_id'] = $this->thirdPartyAccountId;
        }
        if (null !== $this->keyAlgorithm) {
            $res['key_algorithm'] = $this->keyAlgorithm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDataflowAccountRequest
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
        if (isset($map['third_party_account_id'])) {
            $model->thirdPartyAccountId = $map['third_party_account_id'];
        }
        if (isset($map['key_algorithm'])) {
            $model->keyAlgorithm = $map['key_algorithm'];
        }

        return $model;
    }
}
