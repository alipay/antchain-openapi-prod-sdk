<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaCellRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // cells
    /**
     * @var TraasCellDto[]
     */
    public $cells;
    protected $_name = [
        'authToken' => 'auth_token',
        'cells'     => 'cells',
    ];

    public function validate()
    {
        Model::validateRequired('cells', $this->cells, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cells) {
            $res['cells'] = [];
            if (null !== $this->cells && \is_array($this->cells)) {
                $n = 0;
                foreach ($this->cells as $item) {
                    $res['cells'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaCellRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = [];
                $n            = 0;
                foreach ($map['cells'] as $item) {
                    $model->cells[$n++] = null !== $item ? TraasCellDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
