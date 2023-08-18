<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclSignField extends Model
{
    // 页码信息：当签署区sign_type为RIDE_SEAM时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字；
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // 页面签署位置x坐标
    // 非负数，小数位最多两位x坐标
    // sign_type：SINGLE_PAGE 必填
    // sign_type：RIDE_SEAM  无需填写
    /**
     * @example 101.12
     *
     * @var string
     */
    public $posX;

    // 页面签署位置y坐标
    // 非负数，小数位最多两位，y坐标
    /**
     * @example 111.21
     *
     * @var string
     */
    public $posY;

    // 签署类型
    // 1.单页签署: SINGLE_PAGE
    // 2.骑缝签署: RIDE_SEAM
    // 默认：SINGLE_PAGE
    /**
     * @example SINGLE_PAGE
     *
     * @var string
     */
    public $signFieldType;

    // 是否添加签署时间
    // 1.不添加: false
    // 2.添加: true
    // 默认：false
    /**
     * @example false
     *
     * @var bool
     */
    public $addSignDate;

    // 签章日期字体大小
    // 默认12，范围10-20
    // 商家签署区不支持
    /**
     * @example 12
     *
     * @var int
     */
    public $signDateFontSize;

    // 签章日期格式
    // yyyy年MM月dd日（默认值） yyyy-MM-dd
    // yyyy/MM/dd
    // yyyy-MM-dd HH:mm:ss
    // 商家签署区不支持
    /**
     * @example 2023年12月11日
     *
     * @var string
     */
    public $signDateFormat;

    // 页码信息
    // 当add_sign_date为true时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可
    // 商家签署区不支持
    /**
     * @example 1
     *
     * @var int
     */
    public $signDatePosPage;

    // 页面签章日期x坐标
    // 非负数，小数位最多两位，默认0
    // 商家签署区不支持
    /**
     * @example 112.12
     *
     * @var string
     */
    public $signDatePosX;

    // 页面签章日期y坐标
    // 非负数，小数位最多两位，默认0
    // 商家签署区不支持
    /**
     * @example 101.23
     *
     * @var string
     */
    public $signDatePosY;
    protected $_name = [
        'posPage'          => 'pos_page',
        'posX'             => 'pos_x',
        'posY'             => 'pos_y',
        'signFieldType'    => 'sign_field_type',
        'addSignDate'      => 'add_sign_date',
        'signDateFontSize' => 'sign_date_font_size',
        'signDateFormat'   => 'sign_date_format',
        'signDatePosPage'  => 'sign_date_pos_page',
        'signDatePosX'     => 'sign_date_pos_x',
        'signDatePosY'     => 'sign_date_pos_y',
    ];

    public function validate()
    {
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posY', $this->posY, true);
        Model::validateRequired('signFieldType', $this->signFieldType, true);
        Model::validateMaxLength('posPage', $this->posPage, 8);
        Model::validateMaxLength('posX', $this->posX, 8);
        Model::validateMaxLength('posY', $this->posY, 8);
        Model::validateMaxLength('signFieldType', $this->signFieldType, 16);
        Model::validateMaxLength('signDateFormat', $this->signDateFormat, 32);
        Model::validateMaxLength('signDatePosX', $this->signDatePosX, 8);
        Model::validateMaxLength('signDatePosY', $this->signDatePosY, 8);
        Model::validateMaximum('signDateFontSize', $this->signDateFontSize, 20);
        Model::validateMinimum('signDateFontSize', $this->signDateFontSize, 10);
        Model::validateMinimum('signDatePosPage', $this->signDatePosPage, 1);
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
        if (null !== $this->signFieldType) {
            $res['sign_field_type'] = $this->signFieldType;
        }
        if (null !== $this->addSignDate) {
            $res['add_sign_date'] = $this->addSignDate;
        }
        if (null !== $this->signDateFontSize) {
            $res['sign_date_font_size'] = $this->signDateFontSize;
        }
        if (null !== $this->signDateFormat) {
            $res['sign_date_format'] = $this->signDateFormat;
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
     * @return BclSignField
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
        if (isset($map['sign_field_type'])) {
            $model->signFieldType = $map['sign_field_type'];
        }
        if (isset($map['add_sign_date'])) {
            $model->addSignDate = $map['add_sign_date'];
        }
        if (isset($map['sign_date_font_size'])) {
            $model->signDateFontSize = $map['sign_date_font_size'];
        }
        if (isset($map['sign_date_format'])) {
            $model->signDateFormat = $map['sign_date_format'];
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
