<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Deployment extends Model
{
    // Standard object metadata.
    //
    /**
     * @example
     *
     * @var ObjectMeta
     */
    public $metadata;

    // Specification of the desired behavior of the Deployment.
    //
    /**
     * @example
     *
     * @var DeploymentSpec
     */
    public $spec;

    // Most recently observed status of the Deployment.
    //
    /**
     * @example
     *
     * @var DeploymentStatus
     */
    public $status;
    protected $_name = [
        'metadata' => 'metadata',
        'spec'     => 'spec',
        'status'   => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('metadata', $this->metadata, true);
        Model::validateRequired('spec', $this->spec, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Deployment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metadata'])) {
            $model->metadata = ObjectMeta::fromMap($map['metadata']);
        }
        if (isset($map['spec'])) {
            $model->spec = DeploymentSpec::fromMap($map['spec']);
        }
        if (isset($map['status'])) {
            $model->status = DeploymentStatus::fromMap($map['status']);
        }

        return $model;
    }
}
