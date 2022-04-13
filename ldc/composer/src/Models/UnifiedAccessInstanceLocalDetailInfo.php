<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAccessInstanceLocalDetailInfo extends Model
{
    // 所属集群名称
    /**
     * @example name
     *
     * @var string
     */
    public $clusterName;

    // 所在可用区，即AZ信息
    /**
     * @example AZ001
     *
     * @var string
     */
    public $dataCenter;

    // local实例详细信息显示，包含错误状态信息等
    /**
     * @example 详细信息
     *
     * @var string
     */
    public $messageDetails;

    // local实例状态描述：创建中、创建成功、创建失败
    /**
     * @example 创建中
     *
     * @var string
     */
    public $status;

    // vip信息
    /**
     * @example 1.1.1.1
     *
     * @var string
     */
    public $vip;

    // http entry的状态
    /**
     * @example {"backendPort": 4001, "nodePort": 34567}
     *
     * @var HttpEntryStatus
     */
    public $httpEntryStatus;

    // https entry的状态
    /**
     * @example ["backendPort": 4002, "nodePort": 34588]
     *
     * @var HttpsEntryStatus
     */
    public $httpsEntryStatus;
    protected $_name = [
        'clusterName'      => 'cluster_name',
        'dataCenter'       => 'data_center',
        'messageDetails'   => 'message_details',
        'status'           => 'status',
        'vip'              => 'vip',
        'httpEntryStatus'  => 'http_entry_status',
        'httpsEntryStatus' => 'https_entry_status',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('dataCenter', $this->dataCenter, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('vip', $this->vip, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->dataCenter) {
            $res['data_center'] = $this->dataCenter;
        }
        if (null !== $this->messageDetails) {
            $res['message_details'] = $this->messageDetails;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vip) {
            $res['vip'] = $this->vip;
        }
        if (null !== $this->httpEntryStatus) {
            $res['http_entry_status'] = null !== $this->httpEntryStatus ? $this->httpEntryStatus->toMap() : null;
        }
        if (null !== $this->httpsEntryStatus) {
            $res['https_entry_status'] = null !== $this->httpsEntryStatus ? $this->httpsEntryStatus->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAccessInstanceLocalDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['data_center'])) {
            $model->dataCenter = $map['data_center'];
        }
        if (isset($map['message_details'])) {
            $model->messageDetails = $map['message_details'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['vip'])) {
            $model->vip = $map['vip'];
        }
        if (isset($map['http_entry_status'])) {
            $model->httpEntryStatus = HttpEntryStatus::fromMap($map['http_entry_status']);
        }
        if (isset($map['https_entry_status'])) {
            $model->httpsEntryStatus = HttpsEntryStatus::fromMap($map['https_entry_status']);
        }

        return $model;
    }
}
