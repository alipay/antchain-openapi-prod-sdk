<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SystemURL extends Model
{
    // 平台名称
    /**
     * @example auth
     *
     * @var string
     */
    public $platformName;

    // url
    /**
     * @example fee-api.cloud.alipay.com
     *
     * @var string
     */
    public $url;

    // 上线问配置
    /**
     * @example user=admin
     *
     * @var string
     */
    public $context;
    protected $_name = [
        'platformName' => 'platform_name',
        'url'          => 'url',
        'context'      => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('platformName', $this->platformName, true);
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platformName) {
            $res['platform_name'] = $this->platformName;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SystemURL
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platform_name'])) {
            $model->platformName = $map['platform_name'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }

        return $model;
    }
}
