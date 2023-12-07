<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class UpdateCjtestCjRequest extends Model
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

    // test
    /**
     * @var int
     */
    public $var3;

    // 111
    /**
     * @var string
     */
    public $var4;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'var1'              => 'var1',
        'var2'              => 'var2',
        'subject'           => 'subject',
        'var3'              => 'var3',
        'var4'              => 'var4',
    ];

    public function validate()
    {
        Model::validateRequired('var1', $this->var1, true);
        Model::validateRequired('var2', $this->var2, true);
        Model::validateRequired('var3', $this->var3, true);
        Model::validateRequired('var4', $this->var4, true);
        Model::validateMaximum('var3', $this->var3, 100);
        Model::validateMinimum('var3', $this->var3, 1);
        Model::validateMaxLength('var4', $this->var4, 200);
        Model::validateMinLength('var4', $this->var4, 2);
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
        if (null !== $this->var3) {
            $res['var3'] = $this->var3;
        }
        if (null !== $this->var4) {
            $res['var4'] = $this->var4;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCjtestCjRequest
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
        if (isset($map['var3'])) {
            $model->var3 = $map['var3'];
        }
        if (isset($map['var4'])) {
            $model->var4 = $map['var4'];
        }

        return $model;
    }
}
