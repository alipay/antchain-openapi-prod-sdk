<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e24d1923d9dc43cc8cb90aeb2f35cc20\Models;

use AlibabaCloud\Tea\Model;

class QueryDemoGongxiangTestDemoRequest extends Model
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

    // 验证字符
    /**
     * @var string
     */
    public $character1;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'character1'        => 'character1',
    ];

    public function validate()
    {
        Model::validateRequired('character1', $this->character1, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDemoGongxiangTestDemoRequest
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

        return $model;
    }
}
