<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAccountMappingRequest extends Model
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

    // 映射账户详细信息
    /**
     * @var AccountMap
     */
    public $account;

    // 扩展信息
    /**
     * @var string
     */
    public $extension;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'account'           => 'account',
        'extension'         => 'extension',
    ];

    public function validate()
    {
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('extension', $this->extension, true);
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
        if (null !== $this->account) {
            $res['account'] = null !== $this->account ? $this->account->toMap() : null;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAccountMappingRequest
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
        if (isset($map['account'])) {
            $model->account = AccountMap::fromMap($map['account']);
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }

        return $model;
    }
}
