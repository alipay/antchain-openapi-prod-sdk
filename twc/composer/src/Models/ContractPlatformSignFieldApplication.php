<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractPlatformSignFieldApplication extends Model
{
    // 文件file id
    /**
     * @example fe7df2f477d649c18ebcfdfffeba253d
     *
     * @var string
     */
    public $fileId;

    // 签署顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * @example 1
     *
     * @var int
     */
    public $order;

    // 印章id， 仅限企业公章，暂不支持指定企业法定代表人印章 ，如不传，则采用账号下的默认印章
    /**
     * @example bcd7ffd9-5caf-4342-bd1c-02257229ccd5
     *
     * @var string
     */
    public $sealId;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    /**
     * @example
     *
     * @var string
     */
    public $thirdOrderNo;

    // 页码信息，当签署区signType为2时, 页码可以'-'分割, 其他情况只能是数字
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // x坐标，默认空
    /**
     * @example 158.72531
     *
     * @var string
     */
    public $posX;

    // y坐标
    /**
     * @example 431.05658
     *
     * @var string
     */
    public $posY;

    // 签署区宽，默认印章宽度
    /**
     * @example 1
     *
     * @var string
     */
    public $width;

    // 是否添加签署时间戳， 默认不添加，默认格式 yyyy-MM-dd HH : mm : ss
    /**
     * @example true, false
     *
     * @var bool
     */
    public $addSignTime;

    // 签署类型， 1-单页签署，2-骑缝签署，默认1
    /**
     * @example 1
     *
     * @var int
     */
    public $signType;
    protected $_name = [
        'fileId'       => 'file_id',
        'order'        => 'order',
        'sealId'       => 'seal_id',
        'thirdOrderNo' => 'third_order_no',
        'posPage'      => 'pos_page',
        'posX'         => 'pos_x',
        'posY'         => 'pos_y',
        'width'        => 'width',
        'addSignTime'  => 'add_sign_time',
        'signType'     => 'sign_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->sealId) {
            $res['seal_id'] = $this->sealId;
        }
        if (null !== $this->thirdOrderNo) {
            $res['third_order_no'] = $this->thirdOrderNo;
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
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->addSignTime) {
            $res['add_sign_time'] = $this->addSignTime;
        }
        if (null !== $this->signType) {
            $res['sign_type'] = $this->signType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractPlatformSignFieldApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['seal_id'])) {
            $model->sealId = $map['seal_id'];
        }
        if (isset($map['third_order_no'])) {
            $model->thirdOrderNo = $map['third_order_no'];
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
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }
        if (isset($map['add_sign_time'])) {
            $model->addSignTime = $map['add_sign_time'];
        }
        if (isset($map['sign_type'])) {
            $model->signType = $map['sign_type'];
        }

        return $model;
    }
}
