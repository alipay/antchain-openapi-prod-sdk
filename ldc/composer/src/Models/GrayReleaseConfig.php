<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GrayReleaseConfig extends Model
{
    // 加到流量上的灰度标签
    /**
     * @example gray1
     *
     * @var string
     */
    public $grayLabel;

    // 提供南北流量网关服务的类型
    /**
     * @example sofa, spanner
     *
     * @var string
     */
    public $provider;

    // 给流量添加灰度label的策略，可选byWeight或者byRule
    // 在byWeight模式下，会按照用户指定的比例，给进入的流量加上灰度标签
    // 在byRule模式下，会按照用户指定的规则（条件），给进入的流量加上灰度标签。
    /**
     * @example byWeight, byRule
     *
     * @var string
     */
    public $labelApplyPolicy;

    // 给进入的流量添加灰度label的比例，仅当label_apply_policy为byWeight时生效
    /**
     * @example 20
     *
     * @var int
     */
    public $weight;

    // 给进入的流量添加灰度label的规则，仅当label_apply_policy为byRule时生效
    /**
     * @example {}
     *
     * @var GrayLabelApplyRule
     */
    public $rule;

    // 在各部署单元期望部署的pod个数，若应用服务当前不部署在其中的部署单元，则该不会在该部署单元上为应用进行部署
    /**
     * @example [{}]
     *
     * @var ReplicaCount[]
     */
    public $scaleReplicas;
    protected $_name = [
        'grayLabel'        => 'gray_label',
        'provider'         => 'provider',
        'labelApplyPolicy' => 'label_apply_policy',
        'weight'           => 'weight',
        'rule'             => 'rule',
        'scaleReplicas'    => 'scale_replicas',
    ];

    public function validate()
    {
        Model::validateRequired('grayLabel', $this->grayLabel, true);
        Model::validateRequired('provider', $this->provider, true);
        Model::validateRequired('labelApplyPolicy', $this->labelApplyPolicy, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->grayLabel) {
            $res['gray_label'] = $this->grayLabel;
        }
        if (null !== $this->provider) {
            $res['provider'] = $this->provider;
        }
        if (null !== $this->labelApplyPolicy) {
            $res['label_apply_policy'] = $this->labelApplyPolicy;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->rule) {
            $res['rule'] = null !== $this->rule ? $this->rule->toMap() : null;
        }
        if (null !== $this->scaleReplicas) {
            $res['scale_replicas'] = [];
            if (null !== $this->scaleReplicas && \is_array($this->scaleReplicas)) {
                $n = 0;
                foreach ($this->scaleReplicas as $item) {
                    $res['scale_replicas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayReleaseConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gray_label'])) {
            $model->grayLabel = $map['gray_label'];
        }
        if (isset($map['provider'])) {
            $model->provider = $map['provider'];
        }
        if (isset($map['label_apply_policy'])) {
            $model->labelApplyPolicy = $map['label_apply_policy'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['rule'])) {
            $model->rule = GrayLabelApplyRule::fromMap($map['rule']);
        }
        if (isset($map['scale_replicas'])) {
            if (!empty($map['scale_replicas'])) {
                $model->scaleReplicas = [];
                $n                    = 0;
                foreach ($map['scale_replicas'] as $item) {
                    $model->scaleReplicas[$n++] = null !== $item ? ReplicaCount::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
