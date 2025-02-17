<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryIcmInvoicecontinuedRequest extends Model
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

    // 租户号
    /**
     * @var string
     */
    public $appId;

    // 授权类型
    /**
     * @var string
     */
    public $authType;

    // 纳税人识别号
    /**
     * @var string
     */
    public $nsrsbh;

    // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
    /**
     * @var string
     */
    public $requestId;

    // 数据通知地址接口 ，用于数据采集完毕后通知该接口如何取发票数据，也可以通过后台指定配置
    /**
     * @var string
     */
    public $callbackUrl;

    // 贷款期限，格式:yyyy-MM-dd，不晚于当前时间，包含贷款截止日期当天
    /**
     * @var string
     */
    public $creditTerm;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'authType'          => 'auth_type',
        'nsrsbh'            => 'nsrsbh',
        'requestId'         => 'request_id',
        'callbackUrl'       => 'callback_url',
        'creditTerm'        => 'credit_term',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('nsrsbh', $this->nsrsbh, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('creditTerm', $this->creditTerm, true);
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
        if (null !== $this->nsrsbh) {
            $res['nsrsbh'] = $this->nsrsbh;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->creditTerm) {
            $res['credit_term'] = $this->creditTerm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIcmInvoicecontinuedRequest
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
        if (isset($map['nsrsbh'])) {
            $model->nsrsbh = $map['nsrsbh'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['credit_term'])) {
            $model->creditTerm = $map['credit_term'];
        }

        return $model;
    }
}
