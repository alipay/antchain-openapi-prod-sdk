<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSystemCrossPageRequest extends Model
{
    // 签署页码
    /**
     * @example 1
     *
     * @var int
     */
    public $posPageStart;

    // 结束页码（供骑缝章使用）
    /**
     * @example 3
     *
     * @var int
     */
    public $posPageEnd;

    // 签署区位置横坐标
    /**
     * @example 200
     *
     * @var int
     */
    public $posX;

    // 签署区位置纵坐标
    /**
     * @example 300
     *
     * @var int
     */
    public $posY;
    protected $_name = [
        'posPageStart' => 'pos_page_start',
        'posPageEnd'   => 'pos_page_end',
        'posX'         => 'pos_x',
        'posY'         => 'pos_y',
    ];

    public function validate()
    {
        Model::validateRequired('posPageStart', $this->posPageStart, true);
        Model::validateRequired('posPageEnd', $this->posPageEnd, true);
        Model::validateRequired('posX', $this->posX, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->posPageStart) {
            $res['pos_page_start'] = $this->posPageStart;
        }
        if (null !== $this->posPageEnd) {
            $res['pos_page_end'] = $this->posPageEnd;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSystemCrossPageRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pos_page_start'])) {
            $model->posPageStart = $map['pos_page_start'];
        }
        if (isset($map['pos_page_end'])) {
            $model->posPageEnd = $map['pos_page_end'];
        }
        if (isset($map['pos_x'])) {
            $model->posX = $map['pos_x'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }

        return $model;
    }
}
