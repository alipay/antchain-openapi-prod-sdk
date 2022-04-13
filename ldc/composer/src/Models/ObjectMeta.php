<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ObjectMeta extends Model
{
    // k8s meta annotation
    /**
     * @example
     *
     * @var Annotation[]
     */
    public $annotations;

    // 创建时间戳
    /**
     * @example 20190801
     *
     * @var string
     */
    public $creationTimestamp;

    // k8s meta labels
    /**
     * @example
     *
     * @var Label[]
     */
    public $labels;

    // 名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 命名空间
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;
    protected $_name = [
        'annotations'       => 'annotations',
        'creationTimestamp' => 'creation_timestamp',
        'labels'            => 'labels',
        'name'              => 'name',
        'namespace'         => 'namespace',
    ];

    public function validate()
    {
        Model::validatePattern('creationTimestamp', $this->creationTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('labels', $this->labels, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->annotations) {
            $res['annotations'] = [];
            if (null !== $this->annotations && \is_array($this->annotations)) {
                $n = 0;
                foreach ($this->annotations as $item) {
                    $res['annotations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->creationTimestamp) {
            $res['creation_timestamp'] = $this->creationTimestamp;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ObjectMeta
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['annotations'])) {
            if (!empty($map['annotations'])) {
                $model->annotations = [];
                $n                  = 0;
                foreach ($map['annotations'] as $item) {
                    $model->annotations[$n++] = null !== $item ? Annotation::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['creation_timestamp'])) {
            $model->creationTimestamp = $map['creation_timestamp'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }

        return $model;
    }
}
