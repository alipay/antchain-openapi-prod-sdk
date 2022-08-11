<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_3d5ac8b5948b43e7a7b8f62c44a6880f\Models;

use AlibabaCloud\Tea\Model;

class ArSignField extends Model
{
    // 签署页
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // 签署区x坐标
    /**
     * @example 158.72531
     *
     * @var string
     */
    public $posX;

    // 签署区y坐标
    /**
     * @example 431.05658
     *
     * @var string
     */
    public $posY;

    // 签署日期签署页
    /**
     * @example 1
     *
     * @var string
     */
    public $signDatePosPage;

    // 签署日期的签署坐标x
    /**
     * @example 158.7251
     *
     * @var string
     */
    public $signDatePosX;

    // 签署日期签署坐标y
    /**
     * @example 431.0565
     *
     * @var string
     */
    public $signDatePosY;
    protected $_name = [
        'posPage'         => 'pos_page',
        'posX'            => 'pos_x',
        'posY'            => 'pos_y',
        'signDatePosPage' => 'sign_date_pos_page',
        'signDatePosX'    => 'sign_date_pos_x',
        'signDatePosY'    => 'sign_date_pos_y',
    ];

    public function validate()
    {
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
        if (null !== $this->signDatePosPage) {
            $res['sign_date_pos_page'] = $this->signDatePosPage;
        }
        if (null !== $this->signDatePosX) {
            $res['sign_date_pos_x'] = $this->signDatePosX;
        }
        if (null !== $this->signDatePosY) {
            $res['sign_date_pos_y'] = $this->signDatePosY;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ArSignField
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
        if (isset($map['sign_date_pos_page'])) {
            $model->signDatePosPage = $map['sign_date_pos_page'];
        }
        if (isset($map['sign_date_pos_x'])) {
            $model->signDatePosX = $map['sign_date_pos_x'];
        }
        if (isset($map['sign_date_pos_y'])) {
            $model->signDatePosY = $map['sign_date_pos_y'];
        }

        return $model;
    }
}
