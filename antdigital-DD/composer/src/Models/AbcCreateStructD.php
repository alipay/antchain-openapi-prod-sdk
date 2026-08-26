<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class AbcCreateStructD extends Model {
    protected $_name = [
        'applicationScene' => 'application_scene',
        'tinyAppId' => 'tiny_app_id',
        'siteName' => 'site_name',
        'sitUrl' => 'sit_url',
        'merchantName' => 'merchant_name',
        'merchantServiceName' => 'merchant_service_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->applicationScene) {
            $res['application_scene'] = $this->applicationScene;
        }
        if (null !== $this->tinyAppId) {
            $res['tiny_app_id'] = $this->tinyAppId;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->sitUrl) {
            $res['sit_url'] = $this->sitUrl;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->merchantServiceName) {
            $res['merchant_service_name'] = $this->merchantServiceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AbcCreateStructD
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['application_scene'])){
            $model->applicationScene = $map['application_scene'];
        }
        if(isset($map['tiny_app_id'])){
            $model->tinyAppId = $map['tiny_app_id'];
        }
        if(isset($map['site_name'])){
            $model->siteName = $map['site_name'];
        }
        if(isset($map['sit_url'])){
            $model->sitUrl = $map['sit_url'];
        }
        if(isset($map['merchant_name'])){
            $model->merchantName = $map['merchant_name'];
        }
        if(isset($map['merchant_service_name'])){
            $model->merchantServiceName = $map['merchant_service_name'];
        }
        return $model;
    }
    // 应用场景（payChannel =JDPAY仅支持MINI_APP） MINI_APP 小程序 APP 自有app ALL 两种都有
    /**
     * @example ALL
     * @var string
     */
    public $applicationScene;

    // 小程序id
    /**
     * @example 小程序id
     * @var string
     */
    public $tinyAppId;

    // 小程序名称
    /**
     * @example xx小程序
     * @var string
     */
    public $siteName;

    // 网站地址（pay_channel=ALIPAY必填）
    /**
     * @example http://asdasas.com
     * @var string
     */
    public $sitUrl;

    // 商户名称。（pay_channel=ALIPAY必填） 修改后的商户名称，将同步支付宝代扣签约页面字段展示
    /**
     * @example xx商户
     * @var string
     */
    public $merchantName;

    // 商户服务名称。（pay_channel=ALIPAY必填） 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
    /**
     * @example xx商户服务
     * @var string
     */
    public $merchantServiceName;

}
