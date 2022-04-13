<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FederatedDeployment extends Model
{
    // Standard object metadata.
    //
    /**
     * @example
     *
     * @var ObjectMeta
     */
    public $metadata;

    // Federated Deployment Override
    /**
     * @example
     *
     * @var FedDeploymentClusterOverride[]
     */
    public $overrides;

    // Federated Deployment Template
    /**
     * @example
     *
     * @var Deployment
     */
    public $template;

    // 联邦无状态工作负载状态
    /**
     * @example
     *
     * @var FederatedDeploymentStatus
     */
    public $status;
    protected $_name = [
        'metadata'  => 'metadata',
        'overrides' => 'overrides',
        'template'  => 'template',
        'status'    => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('metadata', $this->metadata, true);
        Model::validateRequired('overrides', $this->overrides, true);
        Model::validateRequired('template', $this->template, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metadata) {
            $res['metadata'] = null !== $this->metadata ? $this->metadata->toMap() : null;
        }
        if (null !== $this->overrides) {
            $res['overrides'] = [];
            if (null !== $this->overrides && \is_array($this->overrides)) {
                $n = 0;
                foreach ($this->overrides as $item) {
                    $res['overrides'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->template) {
            $res['template'] = null !== $this->template ? $this->template->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FederatedDeployment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metadata'])) {
            $model->metadata = ObjectMeta::fromMap($map['metadata']);
        }
        if (isset($map['overrides'])) {
            if (!empty($map['overrides'])) {
                $model->overrides = [];
                $n                = 0;
                foreach ($map['overrides'] as $item) {
                    $model->overrides[$n++] = null !== $item ? FedDeploymentClusterOverride::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['template'])) {
            $model->template = Deployment::fromMap($map['template']);
        }
        if (isset($map['status'])) {
            $model->status = FederatedDeploymentStatus::fromMap($map['status']);
        }

        return $model;
    }
}
