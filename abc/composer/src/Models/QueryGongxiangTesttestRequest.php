<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class QueryGongxiangTesttestRequest extends Model
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

    // 验证
    /**
     * @var string
     */
    public $character1;

    // 用于验证
    /**
     * @var int
     */
    public $character2;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'character1'        => 'character1',
        'character2'        => 'character2',
    ];

    public function validate()
    {
        Model::validateRequired('character1', $this->character1, true);
        Model::validateRequired('character2', $this->character2, true);
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
        if (null !== $this->character1) {
            $res['character1'] = $this->character1;
        }
        if (null !== $this->character2) {
            $res['character2'] = $this->character2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGongxiangTesttestRequest
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
        if (isset($map['character1'])) {
            $model->character1 = $map['character1'];
        }
        if (isset($map['character2'])) {
            $model->character2 = $map['character2'];
        }

        return $model;
    }
}
