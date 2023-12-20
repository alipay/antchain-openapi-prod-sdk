<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSystemMainBodyRequest extends Model
{
    // 签署页码
    /**
     * @example 1
     *
     * @var int
     */
    public $posPage;

    // 签署区位置横坐标
    /**
     * @example 200
     *
     * @var string
     */
    public $posX;

    // 签署区位置纵坐标
    /**
     * @example 300
     *
     * @var string
     */
    public $posY;
    protected $_name = [
        'posPage' => 'pos_page',
        'posX'    => 'pos_x',
        'posY'    => 'pos_y',
    ];

    public function validate()
    {
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posX', $this->posX, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->posPage) {
            $res['pos_page'] = $this->posPage;
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
     * @return CaSystemMainBodyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pos_page'])) {
            $model->posPage = $map['pos_page'];
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
