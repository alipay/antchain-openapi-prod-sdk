<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ResemblePositionData extends Model
{
    // 起始位置
    /**
     * @example 0
     *
     * @var int
     */
    public $startPosition;

    // 结束位置
    /**
     * @example 1
     *
     * @var int
     */
    public $endPosition;
    protected $_name = [
        'startPosition' => 'start_position',
        'endPosition'   => 'end_position',
    ];

    public function validate()
    {
        Model::validateRequired('startPosition', $this->startPosition, true);
        Model::validateRequired('endPosition', $this->endPosition, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->startPosition) {
            $res['start_position'] = $this->startPosition;
        }
        if (null !== $this->endPosition) {
            $res['end_position'] = $this->endPosition;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResemblePositionData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['start_position'])) {
            $model->startPosition = $map['start_position'];
        }
        if (isset($map['end_position'])) {
            $model->endPosition = $map['end_position'];
        }

        return $model;
    }
}
