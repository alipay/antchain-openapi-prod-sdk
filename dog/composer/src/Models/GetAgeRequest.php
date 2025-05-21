<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DOG\Models;

use AlibabaCloud\Tea\Model;

class GetAgeRequest extends Model
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

    // 数组结构体
    /**
     * @var Dog[]
     */
    public $dog;

    // 狗狗的id
    /**
     * @var int
     */
    public $id;

    // 结构体
    /**
     * @var DogHome
     */
    public $home;

    // alipay
    /**
     * @var string
     */
    public $fileId;

    // test
    /**
     * @var string
     */
    public $test;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dog'               => 'dog',
        'id'                => 'id',
        'home'              => 'home',
        'fileId'            => 'file_id',
        'test'              => 'test',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('home', $this->home, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('test', $this->test, true);
        Model::validatePattern('fileId', $this->fileId, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->dog) {
            $res['dog'] = [];
            if (null !== $this->dog && \is_array($this->dog)) {
                $n = 0;
                foreach ($this->dog as $item) {
                    $res['dog'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->home) {
            $res['home'] = null !== $this->home ? $this->home->toMap() : null;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->test) {
            $res['test'] = $this->test;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAgeRequest
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
        if (isset($map['dog'])) {
            if (!empty($map['dog'])) {
                $model->dog = [];
                $n          = 0;
                foreach ($map['dog'] as $item) {
                    $model->dog[$n++] = null !== $item ? Dog::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['home'])) {
            $model->home = DogHome::fromMap($map['home']);
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['test'])) {
            $model->test = $map['test'];
        }

        return $model;
    }
}
