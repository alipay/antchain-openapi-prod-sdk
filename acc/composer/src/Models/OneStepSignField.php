<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class OneStepSignField extends Model
{
    // accountId
    /**
     * @example accountId
     *
     * @var string
     */
    public $accountId;

    // file_id
    /**
     * @example file_id
     *
     * @var string
     */
    public $fileId;

    // order
    /**
     * @example order
     *
     * @var int
     */
    public $order;

    // posPage
    /**
     * @example posPage
     *
     * @var string
     */
    public $posPage;

    // posX
    /**
     * @example posX
     *
     * @var string
     */
    public $posX;

    // posY
    /**
     * @example posY
     *
     * @var string
     */
    public $posY;

    // sealId
    /**
     * @example sealId
     *
     * @var string
     */
    public $sealId;

    // sign_date_bean_type
    /**
     * @example sign_date_bean_type
     *
     * @var int
     */
    public $signDateBeanType;

    // sign_date_font_size
    /**
     * @example sign_date_font_size
     *
     * @var int
     */
    public $signDateFontSize;

    // sign_date_format
    /**
     * @example sign_date_format
     *
     * @var string
     */
    public $signDateFormat;

    // sign_date_pos_page
    /**
     * @example sign_date_pos_page
     *
     * @var int
     */
    public $signDatePosPage;

    // sign_date_pos_x
    /**
     * @example sign_date_pos_x
     *
     * @var string
     */
    public $signDatePosX;

    /**
     * @example
     *
     * @var string
     */
    public $signDatePosY;

    // signType
    /**
     * @example signType
     *
     * @var int
     */
    public $signType;

    // third_order_no
    /**
     * @example third_order_no
     *
     * @var string
     */
    public $thirdOrderNo;

    // width
    /**
     * @example width
     *
     * @var string
     */
    public $width;

    // auto_execute
    /**
     * @example auto_execute
     *
     * @var bool
     */
    public $autoExecute;
    protected $_name = [
        'accountId'        => 'account_id',
        'fileId'           => 'file_id',
        'order'            => 'order',
        'posPage'          => 'pos_page',
        'posX'             => 'pos_x',
        'posY'             => 'pos_y',
        'sealId'           => 'seal_id',
        'signDateBeanType' => 'sign_date_bean_type',
        'signDateFontSize' => 'sign_date_font_size',
        'signDateFormat'   => 'sign_date_format',
        'signDatePosPage'  => 'sign_date_pos_page',
        'signDatePosX'     => 'sign_date_pos_x',
        'signDatePosY'     => 'sign_date_pos_y',
        'signType'         => 'sign_type',
        'thirdOrderNo'     => 'third_order_no',
        'width'            => 'width',
        'autoExecute'      => 'auto_execute',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posX', $this->posX, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->posPage) {
            $res['pos_page'] = $this->posPage;
        }
        if (null !== $this->posX) {
            $res['pos_x'] = $this->posX;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->signDateBeanType) {
            $res['sign_date_bean_type'] = $this->signDateBeanType;
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
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }
        if (null !== $this->thirdOrderNo) {
            $res['third_order_no'] = $this->thirdOrderNo;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->autoExecute) {
            $res['auto_execute'] = $this->autoExecute;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OneStepSignField
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['pos_page'])) {
            $model->posPage = $map['pos_page'];
        }
        if (isset($map['pos_x'])) {
            $model->posX = $map['pos_x'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['sign_date_bean_type'])) {
            $model->signDateBeanType = $map['sign_date_bean_type'];
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
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }
        if (isset($map['third_order_no'])) {
            $model->thirdOrderNo = $map['third_order_no'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['auto_execute'])) {
            $model->autoExecute = $map['auto_execute'];
        }

        return $model;
    }
}
