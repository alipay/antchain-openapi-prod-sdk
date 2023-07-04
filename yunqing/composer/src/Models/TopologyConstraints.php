<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class TopologyConstraints extends Model
{
    // 亲和性配置
    /**
     * @example
     *
     * @var AffinityConfig
     */
    public $affinity;

    // 反亲和性配置
    /**
     * @example
     *
     * @var AffinityConfig
     */
    public $antiAffinity;

    // sidecar应用列表
    /**
     * @example
     *
     * @var string[]
     */
    public $sidecars;
    protected $_name = [
        'affinity'     => 'affinity',
        'antiAffinity' => 'anti_affinity',
        'sidecars'     => 'sidecars',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->affinity) {
            $res['affinity'] = null !== $this->affinity ? $this->affinity->toMap() : null;
        }
        if (null !== $this->antiAffinity) {
            $res['anti_affinity'] = null !== $this->antiAffinity ? $this->antiAffinity->toMap() : null;
        }
        if (null !== $this->sidecars) {
            $res['sidecars'] = $this->sidecars;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TopologyConstraints
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['affinity'])) {
            $model->affinity = AffinityConfig::fromMap($map['affinity']);
        }
        if (isset($map['anti_affinity'])) {
            $model->antiAffinity = AffinityConfig::fromMap($map['anti_affinity']);
        }
        if (isset($map['sidecars'])) {
            if (!empty($map['sidecars'])) {
                $model->sidecars = $map['sidecars'];
            }
        }

        return $model;
    }
}
