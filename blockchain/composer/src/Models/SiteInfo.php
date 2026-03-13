<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SiteInfo extends Model
{
    // 网站类型
    /**
     * @example 06
     *
     * @var string
     */
    public $siteType;

    // 站点地址
    /**
     * @example https://open.alipay.com
     *
     * @var string
     */
    public $siteUrl;

    // 站点名称
    /**
     * @example XXX网站
     *
     * @var string
     */
    public $siteName;

    // 小程序 appId
    /**
     * @example 2021004105652035
     *
     * @var string
     */
    public $tinyAppId;
    protected $_name = [
        'siteType'  => 'site_type',
        'siteUrl'   => 'site_url',
        'siteName'  => 'site_name',
        'tinyAppId' => 'tiny_app_id',
    ];

    public function validate()
    {
        Model::validateRequired('siteType', $this->siteType, true);
        Model::validateRequired('siteUrl', $this->siteUrl, true);
        Model::validateRequired('siteName', $this->siteName, true);
        Model::validateRequired('tinyAppId', $this->tinyAppId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
        }
        if (null !== $this->siteUrl) {
            $res['site_url'] = $this->siteUrl;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->tinyAppId) {
            $res['tiny_app_id'] = $this->tinyAppId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SiteInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['site_type'])) {
            $model->siteType = $map['site_type'];
        }
        if (isset($map['site_url'])) {
            $model->siteUrl = $map['site_url'];
        }
        if (isset($map['site_name'])) {
            $model->siteName = $map['site_name'];
        }
        if (isset($map['tiny_app_id'])) {
            $model->tinyAppId = $map['tiny_app_id'];
        }

        return $model;
    }
}
