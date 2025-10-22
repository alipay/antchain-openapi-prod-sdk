<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryCarloanUsersRequest extends Model
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

    // 用户匹配数据
    /**
     * @var CarUserMatch[]
     */
    public $userMatch;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userMatch'         => 'user_match',
    ];

    public function validate()
    {
        Model::validateRequired('userMatch', $this->userMatch, true);
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
        if (null !== $this->userMatch) {
            $res['user_match'] = [];
            if (null !== $this->userMatch && \is_array($this->userMatch)) {
                $n = 0;
                foreach ($this->userMatch as $item) {
                    $res['user_match'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryCarloanUsersRequest
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
        if (isset($map['user_match'])) {
            if (!empty($map['user_match'])) {
                $model->userMatch = [];
                $n                = 0;
                foreach ($map['user_match'] as $item) {
                    $model->userMatch[$n++] = null !== $item ? CarUserMatch::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
