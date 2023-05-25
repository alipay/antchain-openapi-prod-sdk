<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ClusterSecurityBrief extends Model
{
    // 集群id
    /**
     * @example cluster-id-000001
     *
     * @var string
     */
    public $clusterId;

    // 集群名
    /**
     * @example cluster_name_myname
     *
     * @var string
     */
    public $clusterName;

    // 防护状态
    /**
     * @example prot
     *
     * @var string
     */
    public $status;

    // 最后一次安全扫描时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastScan;

    // 风险数量
    /**
     * @example
     *
     * @var int
     */
    public $riskCnt;

    // 风险简报
    /**
     * @example "{}"
     *
     * @var ClusterSecurityComponentBrief[]
     */
    public $brief;

    // 扫描id
    /**
     * @example scanid
     *
     * @var string
     */
    public $scanId;
    protected $_name = [
        'clusterId'   => 'cluster_id',
        'clusterName' => 'cluster_name',
        'status'      => 'status',
        'lastScan'    => 'last_scan',
        'riskCnt'     => 'risk_cnt',
        'brief'       => 'brief',
        'scanId'      => 'scan_id',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('lastScan', $this->lastScan, true);
        Model::validateRequired('riskCnt', $this->riskCnt, true);
        Model::validateRequired('brief', $this->brief, true);
        Model::validatePattern('lastScan', $this->lastScan, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->lastScan) {
            $res['last_scan'] = $this->lastScan;
        }
        if (null !== $this->riskCnt) {
            $res['risk_cnt'] = $this->riskCnt;
        }
        if (null !== $this->brief) {
            $res['brief'] = [];
            if (null !== $this->brief && \is_array($this->brief)) {
                $n = 0;
                foreach ($this->brief as $item) {
                    $res['brief'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->scanId) {
            $res['scan_id'] = $this->scanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterSecurityBrief
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['last_scan'])) {
            $model->lastScan = $map['last_scan'];
        }
        if (isset($map['risk_cnt'])) {
            $model->riskCnt = $map['risk_cnt'];
        }
        if (isset($map['brief'])) {
            if (!empty($map['brief'])) {
                $model->brief = [];
                $n            = 0;
                foreach ($map['brief'] as $item) {
                    $model->brief[$n++] = null !== $item ? ClusterSecurityComponentBrief::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['scan_id'])) {
            $model->scanId = $map['scan_id'];
        }

        return $model;
    }
}
