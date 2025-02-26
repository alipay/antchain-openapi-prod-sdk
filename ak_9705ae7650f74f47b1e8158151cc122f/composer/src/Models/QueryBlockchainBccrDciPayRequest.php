<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainBccrDciPayRequest extends Model
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

    // 数登申请id
    /**
     * @var string
     */
    public $digitalRegisterId;

    // 废弃待删除
    /**
     * @var string
     */
    public $dciUserId;

    // 废弃待删除
    /**
     * @var string
     */
    public $dciContentId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'digitalRegisterId' => 'digital_register_id',
        'dciUserId'         => 'dci_user_id',
        'dciContentId'      => 'dci_content_id',
    ];

    public function validate()
    {
        Model::validateRequired('digitalRegisterId', $this->digitalRegisterId, true);
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
        if (null !== $this->digitalRegisterId) {
            $res['digital_register_id'] = $this->digitalRegisterId;
        }
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->dciContentId) {
            $res['dci_content_id'] = $this->dciContentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainBccrDciPayRequest
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
        if (isset($map['digital_register_id'])) {
            $model->digitalRegisterId = $map['digital_register_id'];
        }
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['dci_content_id'])) {
            $model->dciContentId = $map['dci_content_id'];
        }

        return $model;
    }
}
