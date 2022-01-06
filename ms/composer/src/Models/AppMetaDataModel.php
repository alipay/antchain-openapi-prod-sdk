<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AppMetaDataModel extends Model
{
    // 应用名
    /**
     * @example dsrconsole
     *
     * @var string
     */
    public $appName;

    // 应用打开链接
    /**
     * @example http://test=name
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'appName' => 'app_name',
        'url'     => 'url',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppMetaDataModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
