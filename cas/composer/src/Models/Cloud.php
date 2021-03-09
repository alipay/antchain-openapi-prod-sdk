<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class Cloud extends Model
{
    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // platforms
    /**
     * @example
     *
     * @var CloudPlatform[]
     */
    public $platforms;
    protected $_name = [
        'id'        => 'id',
        'identity'  => 'identity',
        'name'      => 'name',
        'platforms' => 'platforms',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->platforms) {
            $res['platforms'] = [];
            if (null !== $this->platforms && \is_array($this->platforms)) {
                $n = 0;
                foreach ($this->platforms as $item) {
                    $res['platforms'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cloud
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['platforms'])) {
            if (!empty($map['platforms'])) {
                $model->platforms = [];
                $n                = 0;
                foreach ($map['platforms'] as $item) {
                    $model->platforms[$n++] = null !== $item ? CloudPlatform::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
