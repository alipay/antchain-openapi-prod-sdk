<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class LogoDetail extends Model
{
    // 位置，Top、Left、Width、Height
    /**
     * @example
     *
     * @var int[]
     */
    public $location;

    // 类型
    /**
     * @example LOGO类型
     *
     * @var string
     */
    public $type;

    // 置信度
    /**
     * @example 置信度
     *
     * @var string
     */
    public $probability;
    protected $_name = [
        'location'    => 'location',
        'type'        => 'type',
        'probability' => 'probability',
    ];

    public function validate()
    {
        Model::validateRequired('location', $this->location, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('probability', $this->probability, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->probability) {
            $res['probability'] = $this->probability;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LogoDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location'])) {
            if (!empty($map['location'])) {
                $model->location = $map['location'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['probability'])) {
            $model->probability = $map['probability'];
        }

        return $model;
    }
}
