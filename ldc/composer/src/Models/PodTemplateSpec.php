<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodTemplateSpec extends Model
{
    // k8s Standard object_s metadata.
    /**
     * @example
     *
     * @var ObjectMeta
     */
    public $metadata;

    // Specification of the desired behavior of the pod.
    /**
     * @example
     *
     * @var PodSpec
     */
    public $spec;
    protected $_name = [
        'metadata' => 'metadata',
        'spec'     => 'spec',
    ];

    public function validate()
    {
        Model::validateRequired('metadata', $this->metadata, true);
        Model::validateRequired('spec', $this->spec, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metadata) {
            $res['metadata'] = null !== $this->metadata ? $this->metadata->toMap() : null;
        }
        if (null !== $this->spec) {
            $res['spec'] = null !== $this->spec ? $this->spec->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodTemplateSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metadata'])) {
            $model->metadata = ObjectMeta::fromMap($map['metadata']);
        }
        if (isset($map['spec'])) {
            $model->spec = PodSpec::fromMap($map['spec']);
        }

        return $model;
    }
}
