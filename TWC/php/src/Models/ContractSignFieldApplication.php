<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractSignFieldApplication extends Model {
    protected $_name = [
        'addSignTime' => 'add_sign_time',
        'authorizedAccountId' => 'authorized_account_id',
        'fileId' => 'file_id',
        'order' => 'order',
        'posPage' => 'pos_page',
        'posX' => 'pos_x',
        'posY' => 'pos_y',
        'sealId' => 'seal_id',
        'thirdOrderNo' => 'third_order_no',
        'width' => 'width',
    ];
    public function validate() {}
    public function toMap() {
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
     * @return ContractSignFieldApplication
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['add_sign_time'])){
            $model->addSignTime = $map['add_sign_time'];
        }
        if(isset($map['authorized_account_id'])){
            $model->authorizedAccountId = $map['authorized_account_id'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['order'])){
            $model->order = $map['order'];
        }
        if(isset($map['pos_page'])){
            $model->posPage = $map['pos_page'];
        }
        if(isset($map['pos_x'])){
            $model->posX = $map['pos_x'];
        }
        if(isset($map['pos_y'])){
            $model->posY = $map['pos_y'];
        }
        if(isset($map['seal_id'])){
            $model->sealId = $map['seal_id'];
        }
        if(isset($map['third_order_no'])){
            $model->thirdOrderNo = $map['third_order_no'];
        }
        if(isset($map['width'])){
            $model->width = $map['width'];
        }
        return $model;
    }
    // 是否添加签署时间戳，默认不添加，时间格式如"2019-03-11 10:12:12"
    /**
     * @example true, false
     * @var bool
     */
    public $addSignTime;

    // 签约主体账号标识， 将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
    /**
     * @example 2c7de24aff3340f5b944ebac49545b8e
     * @var string
     */
    public $authorizedAccountId;

    // 电子合同文件ID
    /**
     * @example fe7df2f477d649c18ebcfdfffeba253d
     * @var string
     */
    public $fileId;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * @example 1
     * @var int
     */
    public $order;

    // 页码信息
    /**
     * @example 1
     * @var string
     */
    public $posPage;

    // x坐标转为字符串的值，默认空
    /**
     * @example 158.72531
     * @var string
     */
    public $posX;

    // y坐标转为字符串的值
    /**
     * @example 431.05658
     * @var string
     */
    public $posY;

    // 印章id ，如不传，则采用账号下的默认印章
    /**
     * @example bcd7ffd9-5caf-4342-bd1c-02257229ccd5
     * @var string
     */
    public $sealId;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    /**
     * @example someordernumber
     * @var string
     */
    public $thirdOrderNo;

    // 签署区宽，默认印章宽度
    /**
     * @example 1
     * @var string
     */
    public $width;

}
