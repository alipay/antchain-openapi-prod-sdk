<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CaSystemCrossPageRequest extends Model
{
    // 签署开始页码
    /**
     * @example
     *
     * @var int
     */
    public $posPageStart;

    // 签署结束页码
    /**
     * @example
     *
     * @var int
     */
    public $posPageEnd;

    // 签署区位置横坐标
    /**
     * @example
     *
     * @var int
     */
    public $posX;

    // 签署区位置纵坐标
    /**
     * @example
     *
     * @var int
     */
    public $posY;

    // 用印次数
    /**
     * @example
     *
     * @var int
     */
    public $sealTimes;

    // 是否采取系统默认骑缝章用印规则
    /**
     * @example true, false
     *
     * @var bool
     */
    public $defaultCrossPageRule;

    // 默认骑缝章页数
    /**
     * @example
     *
     * @var int
     */
    public $defaultCrossPage;
    protected $_name = [
        'posPageStart'         => 'pos_page_start',
        'posPageEnd'           => 'pos_page_end',
        'posX'                 => 'pos_x',
        'posY'                 => 'pos_y',
        'sealTimes'            => 'seal_times',
        'defaultCrossPageRule' => 'default_cross_page_rule',
        'defaultCrossPage'     => 'default_cross_page',
    ];

    public function validate()
    {
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
        if (null !== $this->sealTimes) {
            $res['seal_times'] = $this->sealTimes;
        }
        if (null !== $this->defaultCrossPageRule) {
            $res['default_cross_page_rule'] = $this->defaultCrossPageRule;
        }
        if (null !== $this->defaultCrossPage) {
            $res['default_cross_page'] = $this->defaultCrossPage;
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
        if (isset($map['seal_times'])) {
            $model->sealTimes = $map['seal_times'];
        }
        if (isset($map['default_cross_page_rule'])) {
            $model->defaultCrossPageRule = $map['default_cross_page_rule'];
        }
        if (isset($map['default_cross_page'])) {
            $model->defaultCrossPage = $map['default_cross_page'];
        }

        return $model;
    }
}
