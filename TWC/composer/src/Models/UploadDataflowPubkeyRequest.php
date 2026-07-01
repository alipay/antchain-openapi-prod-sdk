<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UploadDataflowPubkeyRequest extends Model
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

    // 信封公钥内容
    /**
     * @var string
     */
    public $pubkey;

    // 存证方的租户ID
    /**
     * @var string
     */
    public $fromTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pubkey'            => 'pubkey',
        'fromTenant'        => 'from_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('pubkey', $this->pubkey, true);
        Model::validateRequired('fromTenant', $this->fromTenant, true);
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
        if (null !== $this->pubkey) {
            $res['pubkey'] = $this->pubkey;
        }
        if (null !== $this->fromTenant) {
            $res['from_tenant'] = $this->fromTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadDataflowPubkeyRequest
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
        if (isset($map['pubkey'])) {
            $model->pubkey = $map['pubkey'];
        }
        if (isset($map['from_tenant'])) {
            $model->fromTenant = $map['from_tenant'];
        }

        return $model;
    }
}
