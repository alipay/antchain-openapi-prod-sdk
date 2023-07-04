<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class Product extends Model
{
    // 数据库变更
    /**
     * @example
     *
     * @var DatabaseSchema[]
     */
    public $database;

    // 产品元信息
    /**
     * @example
     *
     * @var ProductMeta
     */
    public $meta;

    // 产品共享参数
    /**
     * @example
     *
     * @var Parameter[]
     */
    public $parameters;
    protected $_name = [
        'database'   => 'database',
        'meta'       => 'meta',
        'parameters' => 'parameters',
    ];

    public function validate()
    {
        Model::validateRequired('database', $this->database, true);
        Model::validateRequired('meta', $this->meta, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->database) {
            $res['database'] = [];
            if (null !== $this->database && \is_array($this->database)) {
                $n = 0;
                foreach ($this->database as $item) {
                    $res['database'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->meta) {
            $res['meta'] = null !== $this->meta ? $this->meta->toMap() : null;
        }
        if (null !== $this->parameters) {
            $res['parameters'] = [];
            if (null !== $this->parameters && \is_array($this->parameters)) {
                $n = 0;
                foreach ($this->parameters as $item) {
                    $res['parameters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Product
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['database'])) {
            if (!empty($map['database'])) {
                $model->database = [];
                $n               = 0;
                foreach ($map['database'] as $item) {
                    $model->database[$n++] = null !== $item ? DatabaseSchema::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['meta'])) {
            $model->meta = ProductMeta::fromMap($map['meta']);
        }
        if (isset($map['parameters'])) {
            if (!empty($map['parameters'])) {
                $model->parameters = [];
                $n                 = 0;
                foreach ($map['parameters'] as $item) {
                    $model->parameters[$n++] = null !== $item ? Parameter::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
