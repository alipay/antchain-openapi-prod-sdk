<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubheRouterFundrouterRequest extends Model
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

    // 身份证号(md5加密32位)
    /**
     * @var string
     */
    public $cardNo;

    // 手机号（MD5加密，32位）
    /**
     * @var string
     */
    public $mobile;

    // 客户姓名
    /**
     * @var string
     */
    public $customName;

    // 合作方产品编号
    /**
     * @var string
     */
    public $prodNo;

    // 渠道类型
    /**
     * @var string
     */
    public $channelType;

    // 客户类型
    /**
     * @var string
     */
    public $customType;

    // 导流平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 流量名称
    /**
     * @var string
     */
    public $trafficSourceName;

    // 广告位标志
    /**
     * @var string
     */
    public $trafficAdId;

    // 预留
    /**
     * @var string
     */
    public $trafficMktId;

    // 预留
    /**
     * @var string
     */
    public $clickId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cardNo'            => 'card_no',
        'mobile'            => 'mobile',
        'customName'        => 'custom_name',
        'prodNo'            => 'prod_no',
        'channelType'       => 'channel_type',
        'customType'        => 'custom_type',
        'trafficPlatform'   => 'traffic_platform',
        'trafficSourceName' => 'traffic_source_name',
        'trafficAdId'       => 'traffic_ad_id',
        'trafficMktId'      => 'traffic_mkt_id',
        'clickId'           => 'click_id',
    ];

    public function validate()
    {
        Model::validateRequired('cardNo', $this->cardNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('customName', $this->customName, true);
        Model::validateRequired('prodNo', $this->prodNo, true);
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
        if (null !== $this->cardNo) {
            $res['card_no'] = $this->cardNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->prodNo) {
            $res['prod_no'] = $this->prodNo;
        }
        if (null !== $this->channelType) {
            $res['channel_type'] = $this->channelType;
        }
        if (null !== $this->customType) {
            $res['custom_type'] = $this->customType;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->trafficSourceName) {
            $res['traffic_source_name'] = $this->trafficSourceName;
        }
        if (null !== $this->trafficAdId) {
            $res['traffic_ad_id'] = $this->trafficAdId;
        }
        if (null !== $this->trafficMktId) {
            $res['traffic_mkt_id'] = $this->trafficMktId;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubheRouterFundrouterRequest
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
        if (isset($map['card_no'])) {
            $model->cardNo = $map['card_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['prod_no'])) {
            $model->prodNo = $map['prod_no'];
        }
        if (isset($map['channel_type'])) {
            $model->channelType = $map['channel_type'];
        }
        if (isset($map['custom_type'])) {
            $model->customType = $map['custom_type'];
        }
        if (isset($map['traffic_platform'])) {
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if (isset($map['traffic_source_name'])) {
            $model->trafficSourceName = $map['traffic_source_name'];
        }
        if (isset($map['traffic_ad_id'])) {
            $model->trafficAdId = $map['traffic_ad_id'];
        }
        if (isset($map['traffic_mkt_id'])) {
            $model->trafficMktId = $map['traffic_mkt_id'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }

        return $model;
    }
}
