<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryIcmInvoiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // ISV名称，用于标识合作的企业
    /**
     * @var string
     */
    public $appId;

    // 授权类型
    // 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
    /**
     * @var string
     */
    public $authType;

    // 数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
    //
    /**
     * @var string
     */
    public $callbackUrl;

    // java long型
    // 起始金额，当type=03（报销查询）时必填
    /**
     * @var int
     */
    public $endAmount;

    // 查询起始时间(当auth_type=02或者03时必填)
    // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
    // 最大查询范围为6.1-6.30
    /**
     * @var string
     */
    public $endDate;

    // 非必填，不填则查询所有类型发票
    // "01": "增值税专用发票"
    // "04": "增值税普通发票"
    // "10": "增值税电子普通发票"
    /**
     * @var string
     */
    public $invoiceType;

    // 查询的企业纳税人识别号
    /**
     * @var string
     */
    public $nsrsbh;

    // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
    /**
     * @var string
     */
    public $requestId;

    // java long型
    // 起始金额，当type=03（报销查询）时必填
    /**
     * @var int
     */
    public $startAmount;

    // 查询起始时间(当auth_type=02或者03时必填)
    // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
    // 最大查询范围为6.1-6.30
    /**
     * @var string
     */
    public $startDate;

    // 地区编码
    /**
     * @var string
     */
    public $cityCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'authType'          => 'auth_type',
        'callbackUrl'       => 'callback_url',
        'endAmount'         => 'end_amount',
        'endDate'           => 'end_date',
        'invoiceType'       => 'invoice_type',
        'nsrsbh'            => 'nsrsbh',
        'requestId'         => 'request_id',
        'startAmount'       => 'start_amount',
        'startDate'         => 'start_date',
        'cityCode'          => 'city_code',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('nsrsbh', $this->nsrsbh, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validatePattern('endDate', $this->endDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startDate', $this->startDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->endAmount) {
            $res['end_amount'] = $this->endAmount;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->nsrsbh) {
            $res['nsrsbh'] = $this->nsrsbh;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->startAmount) {
            $res['start_amount'] = $this->startAmount;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIcmInvoiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['end_amount'])) {
            $model->endAmount = $map['end_amount'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }
        if (isset($map['invoice_type'])) {
            $model->invoiceType = $map['invoice_type'];
        }
        if (isset($map['nsrsbh'])) {
            $model->nsrsbh = $map['nsrsbh'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['start_amount'])) {
            $model->startAmount = $map['start_amount'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }

        return $model;
    }
}
