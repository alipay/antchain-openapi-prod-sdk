<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class System extends Model
{
    // 系统的代码commit
    /**
     * @example 2s8sudis
     *
     * @var string
     */
    public $commitId;

    // 管理的环境列表
    /**
     * @example
     *
     * @var Env[]
     */
    public $envs;

    // 支持的OpenAPI列表
    /**
     * @example
     *
     * @var OpenAPI[]
     */
    public $openApis;

    // 云游的产品版本号, 该值可能为空
    /**
     * @example 2.6.1
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'commitId' => 'commit_id',
        'envs'     => 'envs',
        'openApis' => 'open_apis',
        'version'  => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('commitId', $this->commitId, true);
        Model::validateRequired('envs', $this->envs, true);
        Model::validateRequired('openApis', $this->openApis, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commitId) {
            $res['commit_id'] = $this->commitId;
        }
        if (null !== $this->envs) {
            $res['envs'] = [];
            if (null !== $this->envs && \is_array($this->envs)) {
                $n = 0;
                foreach ($this->envs as $item) {
                    $res['envs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->openApis) {
            $res['open_apis'] = [];
            if (null !== $this->openApis && \is_array($this->openApis)) {
                $n = 0;
                foreach ($this->openApis as $item) {
                    $res['open_apis'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return System
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['commit_id'])) {
            $model->commitId = $map['commit_id'];
        }
        if (isset($map['envs'])) {
            if (!empty($map['envs'])) {
                $model->envs = [];
                $n           = 0;
                foreach ($map['envs'] as $item) {
                    $model->envs[$n++] = null !== $item ? Env::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['open_apis'])) {
            if (!empty($map['open_apis'])) {
                $model->openApis = [];
                $n               = 0;
                foreach ($map['open_apis'] as $item) {
                    $model->openApis[$n++] = null !== $item ? OpenAPI::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
