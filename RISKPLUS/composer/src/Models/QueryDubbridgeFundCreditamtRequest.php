<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeFundCreditamtRequest extends Model
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

    // 请求单号
    /**
     * @var string
     */
    public $requestId;

    // 业务类型
    /**
     * @var string
     */
    public $prodType;

    // 导流平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 流量来源名称
    /**
     * @var string
     */
    public $trafficSourceName;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 手机号加密类型
    /**
     * @var string
     */
    public $mobileType;

    // 身份证号
    /**
     * @var string
     */
    public $cardNo;

    // 身份证号加密类型
    /**
     * @var string
     */
    public $cardNoType;

    // 客户姓名
    /**
     * @var string
     */
    public $customerName;

    // 客户姓名加密类型
    /**
     * @var string
     */
    public $customNameType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'prodType'          => 'prod_type',
        'trafficPlatform'   => 'traffic_platform',
        'trafficSourceName' => 'traffic_source_name',
        'openId'            => 'open_id',
        'mobile'            => 'mobile',
        'mobileType'        => 'mobile_type',
        'cardNo'            => 'card_no',
        'cardNoType'        => 'card_no_type',
        'customerName'      => 'customer_name',
        'customNameType'    => 'custom_name_type',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('prodType', $this->prodType, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('mobileType', $this->mobileType, true);
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('cardNoType', $this->cardNoType, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('customNameType', $this->customNameType, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->trafficSourceName) {
            $res['traffic_source_name'] = $this->trafficSourceName;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->mobileType) {
            $res['mobile_type'] = $this->mobileType;
        }
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->cardNoType) {
            $res['card_no_type'] = $this->cardNoType;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->customNameType) {
            $res['custom_name_type'] = $this->customNameType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeFundCreditamtRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['traffic_source_name'])) {
            $model->trafficSourceName = $map['traffic_source_name'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['mobile_type'])) {
            $model->mobileType = $map['mobile_type'];
        }
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['card_no_type'])) {
            $model->cardNoType = $map['card_no_type'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['custom_name_type'])) {
            $model->customNameType = $map['custom_name_type'];
        }

        return $model;
    }
}
