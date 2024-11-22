<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SiteInfo extends Model
{
    // 小程序id
    /**
     * @example 123456789
     *
     * @var string
     */
    public $tinyAppId;

    // 站点名称
    /**
     * @example 站点名称
     *
     * @var string
     */
    public $siteName;

    //
    // 截图照片
    /**
     * @example c6c0c7a1-b9d5-4e5d-b9d4-9eed39f00e65.jpg
     *
     * @var FileInfo
     */
    public $screenshotFile;

    // 站点地址
    /**
     * @example https://open.alipay.com
     *
     * @var string
     */
    public $siteUrl;

    // 站点类型
    // 网站: 01
    // APP: 02
    // 服务窗: 03
    // 公众号: 04
    // 其他: 05
    // 支付宝小程序: 06
    // 手机网站/H5: 07
    /**
     * @example 02
     *
     * @var string
     */
    public $siteType;
    protected $_name = [
        'tinyAppId'      => 'tiny_app_id',
        'siteName'       => 'site_name',
        'screenshotFile' => 'screenshot_file',
        'siteUrl'        => 'site_url',
        'siteType'       => 'site_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tinyAppId) {
            $res['tiny_app_id'] = $this->tinyAppId;
        }
        if (null !== $this->siteName) {
            $res['site_name'] = $this->siteName;
        }
        if (null !== $this->screenshotFile) {
            $res['screenshot_file'] = null !== $this->screenshotFile ? $this->screenshotFile->toMap() : null;
        }
        if (null !== $this->siteUrl) {
            $res['site_url'] = $this->siteUrl;
        }
        if (null !== $this->siteType) {
            $res['site_type'] = $this->siteType;
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
        if (isset($map['tiny_app_id'])) {
            $model->tinyAppId = $map['tiny_app_id'];
        }
        if (isset($map['site_name'])) {
            $model->siteName = $map['site_name'];
        }
        if (isset($map['screenshot_file'])) {
            $model->screenshotFile = FileInfo::fromMap($map['screenshot_file']);
        }
        if (isset($map['site_url'])) {
            $model->siteUrl = $map['site_url'];
        }
        if (isset($map['site_type'])) {
            $model->siteType = $map['site_type'];
        }

        return $model;
    }
}
