<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PhoneInfo extends Model
{
    // 颜色
    /**
     * @example 红色
     *
     * @var string
     */
    public $colour;

    // 色值
    /**
     * @example #BA0F2F
     *
     * @var string
     */
    public $colourNumber;

    // 内存大小
    /**
     * @example 128GB
     *
     * @var string
     */
    public $memory;
    protected $_name = [
        'colour'       => 'colour',
        'colourNumber' => 'colour_number',
        'memory'       => 'memory',
    ];

    public function validate()
    {
        Model::validateRequired('colour', $this->colour, true);
        Model::validateRequired('colourNumber', $this->colourNumber, true);
        Model::validateRequired('memory', $this->memory, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->colour) {
            $res['colour'] = $this->colour;
        }
        if (null !== $this->colourNumber) {
            $res['colour_number'] = $this->colourNumber;
        }
        if (null !== $this->memory) {
            $res['memory'] = $this->memory;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PhoneInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['colour'])) {
            $model->colour = $map['colour'];
        }
        if (isset($map['colour_number'])) {
            $model->colourNumber = $map['colour_number'];
        }
        if (isset($map['memory'])) {
            $model->memory = $map['memory'];
        }

        return $model;
    }
}
