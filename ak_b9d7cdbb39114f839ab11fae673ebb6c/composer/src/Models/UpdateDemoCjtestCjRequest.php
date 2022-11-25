<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b9d7cdbb39114f839ab11fae673ebb6c\Models;

use AlibabaCloud\Tea\Model;

class UpdateDemoCjtestCjRequest extends Model
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

    // 测试参数
    /**
     * @var string
     */
    public $var1;

    // 测试参数2
    /**
     * @var string
     */
    public $var2;

    // 被授权机构did
    /**
     * @var string
     */
    public $subject;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'var1'              => 'var1',
        'var2'              => 'var2',
        'subject'           => 'subject',
    ];

    public function validate()
    {
        Model::validateRequired('var1', $this->var1, true);
        Model::validateRequired('var2', $this->var2, true);
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
        if (null !== $this->var1) {
            $res['var1'] = $this->var1;
        }
        if (null !== $this->var2) {
            $res['var2'] = $this->var2;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDemoCjtestCjRequest
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
        if (isset($map['var1'])) {
            $model->var1 = $map['var1'];
        }
        if (isset($map['var2'])) {
            $model->var2 = $map['var2'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }

        return $model;
    }
}
