<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeploymentSpec extends Model
{
    // Minimum number of seconds for which a newly created pod should be ready without any of its container crashing
    /**
     * @example
     *
     * @var int
     */
    public $minReadySeconds;

    // Indicates that the deployment is paused.
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $paused;

    // he maximum time in seconds for a deployment to make progress before it is considered to be failed.
    /**
     * @example
     *
     * @var int
     */
    public $progressDeadlineSeconds;

    // Number of desired pods.
    /**
     * @example
     *
     * @var int
     */
    public $replicas;

    // The number of old ReplicaSets to retain to allow rollback.
    /**
     * @example
     *
     * @var int
     */
    public $revisionHistoryLimit;

    // Label selector for pods.
    /**
     * @example
     *
     * @var LabelSelector
     */
    public $selector;

    // The deployment strategy to use to replace existing pods with new ones.
    //
    /**
     * @example
     *
     * @var DeploymentStrategy
     */
    public $strategy;

    // Template describes the pods that will be created.
    /**
     * @example
     *
     * @var PodTemplateSpec
     */
    public $template;
    protected $_name = [
        'minReadySeconds'         => 'min_ready_seconds',
        'paused'                  => 'paused',
        'progressDeadlineSeconds' => 'progress_deadline_seconds',
        'replicas'                => 'replicas',
        'revisionHistoryLimit'    => 'revision_history_limit',
        'selector'                => 'selector',
        'strategy'                => 'strategy',
        'template'                => 'template',
    ];

    public function validate()
    {
        Model::validateRequired('replicas', $this->replicas, true);
        Model::validateRequired('template', $this->template, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->minReadySeconds) {
            $res['min_ready_seconds'] = $this->minReadySeconds;
        }
        if (null !== $this->paused) {
            $res['paused'] = $this->paused;
        }
        if (null !== $this->progressDeadlineSeconds) {
            $res['progress_deadline_seconds'] = $this->progressDeadlineSeconds;
        }
        if (null !== $this->replicas) {
            $res['replicas'] = $this->replicas;
        }
        if (null !== $this->revisionHistoryLimit) {
            $res['revision_history_limit'] = $this->revisionHistoryLimit;
        }
        if (null !== $this->selector) {
            $res['selector'] = null !== $this->selector ? $this->selector->toMap() : null;
        }
        if (null !== $this->strategy) {
            $res['strategy'] = null !== $this->strategy ? $this->strategy->toMap() : null;
        }
        if (null !== $this->template) {
            $res['template'] = null !== $this->template ? $this->template->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['min_ready_seconds'])) {
            $model->minReadySeconds = $map['min_ready_seconds'];
        }
        if (isset($map['paused'])) {
            $model->paused = $map['paused'];
        }
        if (isset($map['progress_deadline_seconds'])) {
            $model->progressDeadlineSeconds = $map['progress_deadline_seconds'];
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }
        if (isset($map['revision_history_limit'])) {
            $model->revisionHistoryLimit = $map['revision_history_limit'];
        }
        if (isset($map['selector'])) {
            $model->selector = LabelSelector::fromMap($map['selector']);
        }
        if (isset($map['strategy'])) {
            $model->strategy = DeploymentStrategy::fromMap($map['strategy']);
        }
        if (isset($map['template'])) {
            $model->template = PodTemplateSpec::fromMap($map['template']);
        }

        return $model;
    }
}
