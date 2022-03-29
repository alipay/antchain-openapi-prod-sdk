<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XMetricInfo extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $name;

    /**
     * @example
     *
     * @var string
     */
    public $description;

    /**
     * @example
     *
     * @var string
     */
    public $type;

    /**
     * @example
     *
     * @var string
     */
    public $unit;
    protected $_name = [
        'name'        => 'name',
        'description' => 'description',
        'type'        => 'type',
        'unit'        => 'unit',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMetricInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }

        return $model;
    }
}
