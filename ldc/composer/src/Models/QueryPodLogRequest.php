<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryPodLogRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群名称
    /**
     * @var string
     */
    public $cluster;

    // 容器名称
    // The container for which to stream logs. Defaults to only container if there is one container in the pod. (optional)
    /**
     * @var string
     */
    public $containerName;

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // pod名称
    /**
     * @var string
     */
    public $podName;

    // A relative time in seconds before the current time from which to show logs. If this value precedes the time a pod was started, only logs since the pod start will be returned. If this value is in the future, no logs will be returned. Only one of sinceSeconds or sinceTime may be specified. (optional)
    /**
     * @var int
     */
    public $sinceSeconds;

    // the number of lines from the end of the logs to show
    /**
     * @var int
     */
    public $tailLines;

    // If true, add an RFC3339 or RFC3339Nano timestamp at the beginning of every line of log output. Defaults to false. (optional)
    /**
     * @var bool
     */
    public $timestamps;

    // cluster对应的aks中minion cluster的id
    /**
     * @var string
     */
    public $minionClusterId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'cluster'         => 'cluster',
        'containerName'   => 'container_name',
        'namespace'       => 'namespace',
        'podName'         => 'pod_name',
        'sinceSeconds'    => 'since_seconds',
        'tailLines'       => 'tail_lines',
        'timestamps'      => 'timestamps',
        'minionClusterId' => 'minion_cluster_id',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('podName', $this->podName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->containerName) {
            $res['container_name'] = $this->containerName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->podName) {
            $res['pod_name'] = $this->podName;
        }
        if (null !== $this->sinceSeconds) {
            $res['since_seconds'] = $this->sinceSeconds;
        }
        if (null !== $this->tailLines) {
            $res['tail_lines'] = $this->tailLines;
        }
        if (null !== $this->timestamps) {
            $res['timestamps'] = $this->timestamps;
        }
        if (null !== $this->minionClusterId) {
            $res['minion_cluster_id'] = $this->minionClusterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPodLogRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['container_name'])) {
            $model->containerName = $map['container_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['pod_name'])) {
            $model->podName = $map['pod_name'];
        }
        if (isset($map['since_seconds'])) {
            $model->sinceSeconds = $map['since_seconds'];
        }
        if (isset($map['tail_lines'])) {
            $model->tailLines = $map['tail_lines'];
        }
        if (isset($map['timestamps'])) {
            $model->timestamps = $map['timestamps'];
        }
        if (isset($map['minion_cluster_id'])) {
            $model->minionClusterId = $map['minion_cluster_id'];
        }

        return $model;
    }
}
