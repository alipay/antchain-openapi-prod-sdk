<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XDashboardCRULResponseCURequest extends Model
{
    // API版本
    /**
     * @example v2
     *
     * @var string
     */
    public $apiVersion;

    // Dashboard元数据信息
    /**
     * @example
     *
     * @var XResource
     */
    public $metadata;

    // Dashboard配置JSON字符串。
    // Dashboard目录不需要填写
    /**
     * @example {"xxx":xxx}
     *
     * @var string
     */
    public $config;
    protected $_name = [
        'apiVersion' => 'api_version',
        'metadata'   => 'metadata',
        'config'     => 'config',
    ];

    public function validate()
    {
        Model::validateRequired('metadata', $this->metadata, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->metadata) {
            $res['metadata'] = null !== $this->metadata ? $this->metadata->toMap() : null;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XDashboardCRULResponseCURequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }
        if (isset($map['metadata'])) {
            $model->metadata = XResource::fromMap($map['metadata']);
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }

        return $model;
    }
}
