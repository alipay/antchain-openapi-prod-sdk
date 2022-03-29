<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiSuite extends Model
{
    // 产品码
    /**
     * @example ABC
     *
     * @var string
     */
    public $providerId;

    // 套件版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $version;

    // 是否发布
    /**
     * @example true, false
     *
     * @var bool
     */
    public $released;

    // 版本号
    /**
     * @example test
     *
     * @var string
     */
    public $versionAlias;
    protected $_name = [
        'providerId'   => 'provider_id',
        'version'      => 'version',
        'released'     => 'released',
        'versionAlias' => 'version_alias',
    ];

    public function validate()
    {
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('version', $this->version, true);
        Model::validateRequired('released', $this->released, true);
        Model::validateRequired('versionAlias', $this->versionAlias, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->released) {
            $res['released'] = $this->released;
        }
        if (null !== $this->versionAlias) {
            $res['version_alias'] = $this->versionAlias;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiSuite
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['released'])) {
            $model->released = $map['released'];
        }
        if (isset($map['version_alias'])) {
            $model->versionAlias = $map['version_alias'];
        }

        return $model;
    }
}
