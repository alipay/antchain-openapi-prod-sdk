<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OneStepSignField extends Model
{
    // 签署操作人个人账号标识，即操作本次签署的个人
    /**
     * @example 2c7de24aff3340f5b944ebac49545b8e
     *
     * @var string
     */
    public $accountId;

    // 电子合同文件ID
    /**
     * @example fe7df2f477d649c18ebcfdfffeba253d
     *
     * @var string
     */
    public $fileId;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * @example
     *
     * @var int
     */
    public $order;

    // 页码信息：当签署区signType为2时, 页码可以_-_分割, 例如1到15页，填"1-15"； 其他情况只能是数字；不指定xy坐标签署区可不填写
    /**
     * @example 1
     *
     * @var string
     */
    public $posPage;

    // x坐标
    /**
     * @example 1.1
     *
     * @var string
     */
    public $posX;

    // y坐标
    /**
     * @example 1.1
     *
     * @var string
     */
    public $posY;

    // 印章id
    /**
     * @example bcd7ffd9-5caf-4342-bd1c-02257229ccd5
     *
     * @var string
     */
    public $sealId;

    // 是否需要添加签署日期，0-禁止 1-必须 2-不限制，默认0
    /**
     * @example 0
     *
     * @var int
     */
    public $signDateBeanType;

    // 签章日期字体大小,默认12
    /**
     * @example 1
     *
     * @var int
     */
    public $signDateFontSize;

    // 签章日期格式，yyyy年MM月dd日
    /**
     * @example yyyy年MM月dd日
     *
     * @var string
     */
    public $signDateFormat;

    // 页码信息，当signDateBeanType为1时，代表签署的印章必须展示签署日期，默认放在印章正下方，签署人可拖拽日期到当前页面的其他位置，如果发起方指定签署位置的同时，需要同时指定日期盖章位置，则需传入日期盖章页码（与印章页码相同），在传入X\Y坐标即可。
    /**
     * @example 1
     *
     * @var int
     */
    public $signDatePosPage;

    // 签章日期x坐标，默认0
    /**
     * @example 0
     *
     * @var string
     */
    public $signDatePosX;

    // 签章日期y坐标，默认0
    /**
     * @example 0
     *
     * @var string
     */
    public $signDatePosY;

    // 签署类型，1-单页签署，2-骑缝签署，默认1
    /**
     * @example 1
     *
     * @var int
     */
    public $signType;

    // 第三方业务流水号id，保证相同签署人、相同签约主体、相同签署顺序的任务，对应的第三方业务流水id唯一，默认空
    /**
     * @example someordernumber
     *
     * @var string
     */
    public $thirdOrderNo;

    // 签署区宽，默认印章宽度
    /**
     * @example 100.0
     *
     * @var string
     */
    public $width;

    // 是否自动执行签署，默认false，false-手动签署，true-自动签署
    /**
     * @example true, false
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
