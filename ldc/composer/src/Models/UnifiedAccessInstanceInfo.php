<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAccessInstanceInfo extends Model
{
    // 统一接入实例创建的时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 关联的Spanner逻辑集群名称，一个逻辑集群由很多个local集群组成
    /**
     * @example 00000000
     *
     * @var string
     */
    public $spannerCluster;

    // 关联的应用服务信息
    /**
     * @example
     *
     * @var UnifiedAccessInstanceContainerServiceInfo[]
     */
    public $unifiedAccessInstanceContainerServiceInfos;

    // https协议配置
    /**
     * @example
     *
     * @var HttpsEntry
     */
    public $unifiedAccessInstanceHttpsEntry;

    // http协议配置
    /**
     * @example
     *
     * @var HttpEntry
     */
    public $unifiedAccessInstanceHttpEntry;

    // 统一接入实例ID
    /**
     * @example id
     *
     * @var string
     */
    public $unifiedAccessInstanceId;

    // 本地集群详细信息
    /**
     * @example
     *
     * @var UnifiedAccessInstanceLocalDetailInfo[]
     */
    public $unifiedAccessInstanceLocalDetailInfos;

    // 统一接入实例详细信息显示，包含错误状态信息等
    /**
     * @example 详细信息
     *
     * @var string
     */
    public $unifiedAccessInstanceMessageDetails;

    // 统一接入实例名称
    /**
     * @example name
     *
     * @var string
     */
    public $unifiedAccessInstanceName;

    // 统一接入实例状态描述：创建中、创建成功、创建失败
    /**
     * @example 创建中
     *
     * @var string
     */
    public $unifiedAccessInstanceStatus;

    // 统一接入实例网络类型，内网（intranet），公网（internet）
    /**
     * @example intranet
     *
     * @var string
     */
    public $unifiedAccessInstanceType;

    // custom模式下，用户自定义entryId以及entryVip信息
    /**
     * @example {}
     *
     * @var EntrySettings
     */
    public $entrySettings;
    protected $_name = [
        'createdTime'                                => 'created_time',
        'spannerCluster'                             => 'spanner_cluster',
        'unifiedAccessInstanceContainerServiceInfos' => 'unified_access_instance_container_service_infos',
        'unifiedAccessInstanceHttpsEntry'            => 'unified_access_instance_https_entry',
        'unifiedAccessInstanceHttpEntry'             => 'unified_access_instance_http_entry',
        'unifiedAccessInstanceId'                    => 'unified_access_instance_id',
        'unifiedAccessInstanceLocalDetailInfos'      => 'unified_access_instance_local_detail_infos',
        'unifiedAccessInstanceMessageDetails'        => 'unified_access_instance_message_details',
        'unifiedAccessInstanceName'                  => 'unified_access_instance_name',
        'unifiedAccessInstanceStatus'                => 'unified_access_instance_status',
        'unifiedAccessInstanceType'                  => 'unified_access_instance_type',
        'entrySettings'                              => 'entry_settings',
    ];

    public function validate()
    {
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('spannerCluster', $this->spannerCluster, true);
        Model::validateRequired('unifiedAccessInstanceHttpEntry', $this->unifiedAccessInstanceHttpEntry, true);
        Model::validateRequired('unifiedAccessInstanceId', $this->unifiedAccessInstanceId, true);
        Model::validateRequired('unifiedAccessInstanceLocalDetailInfos', $this->unifiedAccessInstanceLocalDetailInfos, true);
        Model::validateRequired('unifiedAccessInstanceName', $this->unifiedAccessInstanceName, true);
        Model::validateRequired('unifiedAccessInstanceStatus', $this->unifiedAccessInstanceStatus, true);
        Model::validateRequired('unifiedAccessInstanceType', $this->unifiedAccessInstanceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->spannerCluster) {
            $res['spanner_cluster'] = $this->spannerCluster;
        }
        if (null !== $this->unifiedAccessInstanceContainerServiceInfos) {
            $res['unified_access_instance_container_service_infos'] = [];
            if (null !== $this->unifiedAccessInstanceContainerServiceInfos && \is_array($this->unifiedAccessInstanceContainerServiceInfos)) {
                $n = 0;
                foreach ($this->unifiedAccessInstanceContainerServiceInfos as $item) {
                    $res['unified_access_instance_container_service_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->unifiedAccessInstanceHttpsEntry) {
            $res['unified_access_instance_https_entry'] = null !== $this->unifiedAccessInstanceHttpsEntry ? $this->unifiedAccessInstanceHttpsEntry->toMap() : null;
        }
        if (null !== $this->unifiedAccessInstanceHttpEntry) {
            $res['unified_access_instance_http_entry'] = null !== $this->unifiedAccessInstanceHttpEntry ? $this->unifiedAccessInstanceHttpEntry->toMap() : null;
        }
        if (null !== $this->unifiedAccessInstanceId) {
            $res['unified_access_instance_id'] = $this->unifiedAccessInstanceId;
        }
        if (null !== $this->unifiedAccessInstanceLocalDetailInfos) {
            $res['unified_access_instance_local_detail_infos'] = [];
            if (null !== $this->unifiedAccessInstanceLocalDetailInfos && \is_array($this->unifiedAccessInstanceLocalDetailInfos)) {
                $n = 0;
                foreach ($this->unifiedAccessInstanceLocalDetailInfos as $item) {
                    $res['unified_access_instance_local_detail_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->unifiedAccessInstanceMessageDetails) {
            $res['unified_access_instance_message_details'] = $this->unifiedAccessInstanceMessageDetails;
        }
        if (null !== $this->unifiedAccessInstanceName) {
            $res['unified_access_instance_name'] = $this->unifiedAccessInstanceName;
        }
        if (null !== $this->unifiedAccessInstanceStatus) {
            $res['unified_access_instance_status'] = $this->unifiedAccessInstanceStatus;
        }
        if (null !== $this->unifiedAccessInstanceType) {
            $res['unified_access_instance_type'] = $this->unifiedAccessInstanceType;
        }
        if (null !== $this->entrySettings) {
            $res['entry_settings'] = null !== $this->entrySettings ? $this->entrySettings->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAccessInstanceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['spanner_cluster'])) {
            $model->spannerCluster = $map['spanner_cluster'];
        }
        if (isset($map['unified_access_instance_container_service_infos'])) {
            if (!empty($map['unified_access_instance_container_service_infos'])) {
                $model->unifiedAccessInstanceContainerServiceInfos = [];
                $n                                                 = 0;
                foreach ($map['unified_access_instance_container_service_infos'] as $item) {
                    $model->unifiedAccessInstanceContainerServiceInfos[$n++] = null !== $item ? UnifiedAccessInstanceContainerServiceInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['unified_access_instance_https_entry'])) {
            $model->unifiedAccessInstanceHttpsEntry = HttpsEntry::fromMap($map['unified_access_instance_https_entry']);
        }
        if (isset($map['unified_access_instance_http_entry'])) {
            $model->unifiedAccessInstanceHttpEntry = HttpEntry::fromMap($map['unified_access_instance_http_entry']);
        }
        if (isset($map['unified_access_instance_id'])) {
            $model->unifiedAccessInstanceId = $map['unified_access_instance_id'];
        }
        if (isset($map['unified_access_instance_local_detail_infos'])) {
            if (!empty($map['unified_access_instance_local_detail_infos'])) {
                $model->unifiedAccessInstanceLocalDetailInfos = [];
                $n                                            = 0;
                foreach ($map['unified_access_instance_local_detail_infos'] as $item) {
                    $model->unifiedAccessInstanceLocalDetailInfos[$n++] = null !== $item ? UnifiedAccessInstanceLocalDetailInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['unified_access_instance_message_details'])) {
            $model->unifiedAccessInstanceMessageDetails = $map['unified_access_instance_message_details'];
        }
        if (isset($map['unified_access_instance_name'])) {
            $model->unifiedAccessInstanceName = $map['unified_access_instance_name'];
        }
        if (isset($map['unified_access_instance_status'])) {
            $model->unifiedAccessInstanceStatus = $map['unified_access_instance_status'];
        }
        if (isset($map['unified_access_instance_type'])) {
            $model->unifiedAccessInstanceType = $map['unified_access_instance_type'];
        }
        if (isset($map['entry_settings'])) {
            $model->entrySettings = EntrySettings::fromMap($map['entry_settings']);
        }

        return $model;
    }
}
