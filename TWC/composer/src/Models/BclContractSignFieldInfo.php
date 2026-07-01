<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclContractSignFieldInfo extends Model
{
    // 签署流程id
    /**
     * @example 8dfg0h80sg8sd0fa45b9cvb79
     *
     * @var string
     */
    public $flowId;

    // 文件id
    /**
     * @example 9dfgsh7da89g7adfgh
     *
     * @var string
     */
    public $contractFileId;

    // 签署人id
    /**
     * @example b9sc0bn9sffs
     *
     * @var string
     */
    public $contractUserId;

    // 签署页码
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // x坐标
    /**
     * @example 11.11
     *
     * @var string
     */
    public $posX;

    // y坐标
    /**
     * @example 22.22
     *
     * @var string
     */
    public $posY;

    // 签署类型，AUTO-自动，HAND-手动
    /**
     * @example AUTO
     *
     * @var string
     */
    public $signType;

    // 签署区类型，
    // 单页签署: SINGLE_PAGE，
    // 骑缝签署: RIDE_SEAM，
    // 默认 SINGLE_PAGE
    /**
     * @example SINGLE_PAGE
     *
     * @var string
     */
    public $signFieldType;

    // 是否添加签署时间
    // 不添加: false 添加: true ， 默认false, 商家不支持指定日期坐标
    /**
     * @example true, false
     *
     * @var bool
     */
    public $addSignDate;

    // 签章日期字体大小,默认12 商家签署区不支持
    /**
     * @example 12
     *
     * @var int
     */
    public $signDateFontSize;

    // 签章日期格式，yyyy年MM月dd日 商家签署区不支持
    /**
     * @example yyyy年MM月dd日
     *
     * @var string
     */
    public $signDateFormat;

    // 签章日期页码信息
    /**
     * @example 1
     *
     * @var int
     */
    public $signDatePosPage;

    // 签章日期x坐标
    /**
     * @example 11.11
     *
     * @var string
     */
    public $signDatePosX;

    // 签章日期y坐标
    /**
     * @example 22.22
     *
     * @var string
     */
    public $signDatePosY;
    protected $_name = [
        'flowId'           => 'flow_id',
        'contractFileId'   => 'contract_file_id',
        'contractUserId'   => 'contract_user_id',
        'posPage'          => 'pos_page',
        'posX'             => 'pos_x',
        'posY'             => 'pos_y',
        'signType'         => 'sign_type',
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->contractFileId) {
            $res['contract_file_id'] = $this->contractFileId;
        }
        if (null !== $this->contractUserId) {
            $res['contract_user_id'] = $this->contractUserId;
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
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
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
     * @return BclContractSignFieldInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['contract_file_id'])) {
            $model->contractFileId = $map['contract_file_id'];
        }
        if (isset($map['contract_user_id'])) {
            $model->contractUserId = $map['contract_user_id'];
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
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
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
