<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractPlatformSignField extends Model
{
    // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
    /**
     * @example true, false
     *
     * @var bool
     */
    public $addSignTime;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * @example 1
     *
     * @var int
     */
    public $order;

    // 页码信息，当签署区signType为2时, 页码可以_-_分割, 其他情况只能是数字
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // x坐标转为字符串的值，默认空
    /**
     * @example 158.72531
     *
     * @var string
     */
    public $posX;

    // y坐标转为字符串的值
    /**
     * @example 431.05658
     *
     * @var string
     */
    public $posY;

    // 印章id ，如不传，则采用账号下的默认印章
    /**
     * @example bcd7ffd9-5caf-4342-bd1c-02257229ccd5
     *
     * @var string
     */
    public $sealId;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    /**
     * @example someordernumber
     *
     * @var string
     */
    public $thirdOrderNo;

    // 签署区宽，默认印章宽度
    /**
     * @example 1
     *
     * @var string
     */
    public $width;
    protected $_name = [
        'addSignTime'  => 'add_sign_time',
        'order'        => 'order',
        'posPage'      => 'pos_page',
        'posX'         => 'pos_x',
        'posY'         => 'pos_y',
        'sealId'       => 'seal_id',
        'thirdOrderNo' => 'third_order_no',
        'width'        => 'width',
    ];

    public function validate()
    {
        Model::validateRequired('posPage', $this->posPage, true);
        Model::validateRequired('posY', $this->posY, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->addSignTime) {
            $res['add_sign_time'] = $this->addSignTime;
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
        if (null !== $this->thirdOrderNo) {
            $res['third_order_no'] = $this->thirdOrderNo;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractPlatformSignField
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['add_sign_time'])) {
            $model->addSignTime = $map['add_sign_time'];
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
        if (isset($map['third_order_no'])) {
            $model->thirdOrderNo = $map['third_order_no'];
        }
        if (isset($map['width'])) {
            $model->width = $map['width'];
        }

        return $model;
    }
}
