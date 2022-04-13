<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NetworkInfo extends Model
{
    // networt description
    /**
     * @example 虚拟私有云网络
     *
     * @var string
     */
    public $description;
    protected $_name = [
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NetworkInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
