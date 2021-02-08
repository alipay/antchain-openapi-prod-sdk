<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class SiteInfo extends Model {
    protected $_name = [
        'siteType' => 'site_type',
        'siteName' => 'site_name',
        'siteUrl' => 'site_url',
    ];
    public function validate() {
        Model::validateRequired('siteType', $this->siteType, true);
        Model::validateRequired('siteUrl', $this->siteUrl, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->siteUrl) {
            $res['site_url'] = $this->siteUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SiteInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['site_type'])){
            $model->siteType = $map['site_type'];
        }
        if(isset($map['site_name'])){
            $model->siteName = $map['site_name'];
        }
        if(isset($map['site_url'])){
            $model->siteUrl = $map['site_url'];
        }
        return $model;
    }
    // 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
    /**
     * @example 01
     * @var string
     */
    public $siteType;

    // 站点名称
    /**
     * @example 支付宝中国
     * @var string
     */
    public $siteName;

    // 站点地址
    /**
     * @example www.alipay.com
     * @var string
     */
    public $siteUrl;

}
