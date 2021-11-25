<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignFieldApplication extends Model
{
    // add_sign_time
    /**
     * @example true, false
     *
     * @var bool
     */
    public $addSignTime;

    // authorized_account_id
    /**
     * @example authorized_account_id
     *
     * @var string
     */
    public $authorizedAccountId;

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
     * @var string
     */
    public $order;

    // pos_page
    /**
     * @example pos_page
     *
     * @var string
     */
    public $posPage;

    // pos_x
    /**
     * @example pos_x
     *
     * @var string
     */
    public $posX;

    // seal_id
    /**
     * @example seal_id
     *
     * @var string
     */
    public $sealId;

    // third_order_no
    /**
     * @example third_order_no
     *
     * @var string
     */
    public $thirdOrderNo;

    // pos_y
    /**
     * @example pos_y
     *
     * @var string
     */
    public $posY;

    // width
    /**
     * @example width
     *
     * @var string
     */
    public $width;

    // signType
    /**
     * @example signType
     *
     * @var int
     */
    public $signType;
    protected $_name = [
        'addSignTime'         => 'add_sign_time',
        'authorizedAccountId' => 'authorized_account_id',
        'fileId'              => 'file_id',
        'order'               => 'order',
        'posPage'             => 'pos_page',
        'posX'                => 'pos_x',
        'sealId'              => 'seal_id',
        'thirdOrderNo'        => 'third_order_no',
        'posY'                => 'pos_y',
        'width'               => 'width',
        'signType'            => 'sign_type',
    ];

    public function validate()
    {
        Model::validateRequired('authorizedAccountId', $this->authorizedAccountId, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posX', $this->posX, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->addSignTime) {
            $res['add_sign_time'] = $this->addSignTime;
        }
        if (null !== $this->authorizedAccountId) {
            $res['authorized_account_id'] = $this->authorizedAccountId;
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
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->thirdOrderNo) {
            $res['third_order_no'] = $this->thirdOrderNo;
        }
        if (null !== $this->posY) {
            $res['pos_y'] = $this->posY;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractSignFieldApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['add_sign_time'])) {
            $model->addSignTime = $map['add_sign_time'];
        }
        if (isset($map['authorized_account_id'])) {
            $model->authorizedAccountId = $map['authorized_account_id'];
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
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['third_order_no'])) {
            $model->thirdOrderNo = $map['third_order_no'];
        }
        if (isset($map['pos_y'])) {
            $model->posY = $map['pos_y'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }

        return $model;
    }
}
