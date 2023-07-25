<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class SignatoryInfo extends Model
{
    // 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // x坐标
    /**
     * @example 111.11
     *
     * @var string
     */
    public $posX;

    // y坐标
    /**
     * @example 111.11
     *
     * @var string
     */
    public $posY;

    // 签署区宽 (默认为100)
    /**
     * @example 100
     *
     * @var string
     */
    public $width;
    protected $_name = [
        'posPage' => 'pos_page',
        'posX'    => 'pos_x',
        'posY'    => 'pos_y',
        'width'   => 'width',
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
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignatoryInfo
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
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }

        return $model;
    }
}
