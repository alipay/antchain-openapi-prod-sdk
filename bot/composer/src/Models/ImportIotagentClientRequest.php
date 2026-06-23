<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportIotagentClientRequest extends Model
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

    // 设备标识列表
    /**
     * @var string[]
     */
    public $uidList;

    // 设备pk
    /**
     * @var string
     */
    public $productKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'uidList'           => 'uid_list',
        'productKey'        => 'product_key',
    ];

    public function validate()
    {
        Model::validateRequired('uidList', $this->uidList, true);
        Model::validateRequired('productKey', $this->productKey, true);
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
        if (null !== $this->uidList) {
            $res['uid_list'] = $this->uidList;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIotagentClientRequest
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
        if (isset($map['uid_list'])) {
            if (!empty($map['uid_list'])) {
                $model->uidList = $map['uid_list'];
            }
        }
        if (isset($map['product_key'])) {
            $model->productKey = $map['product_key'];
        }

        return $model;
    }
}
